import os
import pathlib
import time
from typing import Callable, TypeVar, Iterable

from main import VariableDict
from errors import _InnerCodeError, ProgramError
from utils import format_time


I = TypeVar("I")
O = TypeVar("O")
def _combine_function_with_kwargs(
        func: Callable[[I, ...], O] | Callable[[I], O],
        kwargs: dict | None) -> Callable[[I], O]:
    if kwargs is None:
        func: Callable[[I], O]
        return func
    else:
        kwargs: dict
        def inner(*args):
            return func(*args, **kwargs)
        return inner


T = TypeVar('T')
identity_function = lambda x: x
def _generate_true_executor(program_executor: Callable[[T, ...], VariableDict] | Callable[[T], VariableDict],
                            program_compiler: Callable[[list[str], ...], T] | Callable[[list[str]], T] = identity_function,
                            *,
                            program_executor_kwargs: dict | None = None,
                            program_compiler_kwargs: dict | None = None) -> Callable[[list[str]], VariableDict]:
    """Combines a program executor and a program compiler (and their keywords) into a single function that takes code and outputs the result of running it"""
    if program_executor_kwargs is None:
        program_executor_kwargs: dict = {}
    if program_compiler_kwargs is None:
        program_compiler_kwargs: dict = {}

    if program_compiler == identity_function:
        true_executor = _combine_function_with_kwargs(program_executor, program_executor_kwargs)
    else:
        def true_executor(code: list[str]) -> VariableDict:
            return _combine_function_with_kwargs(program_executor, program_executor_kwargs)(_combine_function_with_kwargs(program_compiler, program_compiler_kwargs)(code))
    return true_executor


def run_all_tests(program_executor: Callable[[T, ...], VariableDict] | Callable[[T], VariableDict],
                  program_compiler: Callable[[list[str], ...], T] | Callable[[list[str]], T] = identity_function,
                  *,
                  program_executor_kwargs: dict | None = None,
                  program_compiler_kwargs: dict | None = None,
                  skip_timeouts: bool = False,
                  valid_extensions: Iterable[str] | None = None,
                  test_file_location: str = "BB files/Testing") -> None:
    """Tests an executor (and, optionally, a compiler) on all the test files in a folder

    :param program_compiler: the function that converts the code in the test files into a format that program_executor can run. If none is provided, it simply passes the code directly to program_executor.
    :param program_executor: the function that executes the compiled code.
    :param program_executor_kwargs: an optional dict of keyword-arguments to pass to program_executor.
    :param program_compiler_kwargs: an optional dict of keyword-arguments to pass to program_compiler.
    :param skip_timeouts: a bool which, if True, skips any test file expected to cause a TimeoutError, to allow executors which do not implement a timeout to be tested. Defaults to False.
    :param valid_extensions: is an iterable of all file extensions to test, defaulting to {".bb"}.
    :param test_file_location: is the filepath for the test files, defaulting to BB files/Testing.
    """
    if valid_extensions is None:
        valid_extensions: Iterable[str] = {".bb"}
    true_executor = _generate_true_executor(program_executor, program_compiler, program_executor_kwargs=program_executor_kwargs, program_compiler_kwargs=program_compiler_kwargs)
    _run_all_tests(true_executor, skip_timeouts=skip_timeouts, valid_extensions=valid_extensions, test_file_location=test_file_location)

# def _run_all_tests(
#         program_executor: Callable[Concatenate[list[str], ...], VariableDict] = parse_code,
#         kwargs: dict[str, Any] = {"print_errors": False, "timeout": 3},
# ) -> None:
def _run_all_tests(
        program_executor: Callable[[list[str]], VariableDict],
        skip_timeouts: bool,
        valid_extensions: Iterable[str],
        test_file_location: str) -> None:
    for test_file in os.listdir(test_file_location):
        if pathlib.Path(test_file).suffix in valid_extensions:
            f = open(f"{test_file_location}/{test_file}")
            code = f.readlines()
            f.close()

            expected_result = code[-1]
            if skip_timeouts and expected_result.startswith("#error:TimeoutError"):
                continue

            print(test_file, end=": ")

            try:
                variables = program_executor(code)
            except _InnerCodeError as e:
                message = e.inner_exception.args[0]
                if "@" in expected_result:
                    result = f"#error:{type(e.inner_exception).__name__}@{e.line_number}"
                else:
                    result = f"#error:{type(e.inner_exception).__name__}"
            else:
                message = None
                result = f"#vars:{",".join(f"{var}={val}" for var, val in sorted(variables.items(), key=lambda x: x[0]))}"

            if result == expected_result:
                print("Passed")
            else:
                if message:
                    result += " " + message
                print(f"Failed. Got {result}")


def run_all_benchmarks(program_executor: Callable[[T, ...], VariableDict] | Callable[[T], VariableDict],
                       program_compiler: Callable[[list[str], ...], T] | Callable[[list[str]], T] = identity_function,
                       *,
                       program_executor_kwargs: dict | None = None,
                       program_compiler_kwargs: dict | None = None,
                       skip_timeouts: bool = False,
                       valid_extensions: Iterable[str] | None = None,
                       time_per_file: float = 1.0,
                       test_file_location: str = "BB files/Testing") -> None:
    """Benchmarks an executor (and, optionally, a compiler) on all the test files in a folder

    :param program_compiler: the function that converts the code in the test files into a format that program_executor can run. If none is provided, it simply passes the code directly to program_executor.
    :param program_executor: the function that executes the compiled code.
    :param program_executor_kwargs: an optional dict of keyword-arguments to pass to program_executor.
    :param program_compiler_kwargs: an optional dict of keyword-arguments to pass to program_compiler.
    :param skip_timeouts: a bool which, if True, skips any test file expected to cause a TimeoutError, to allow executors which do not implement a timeout to be tested. Defaults to False.
    :param valid_extensions: is an iterable of all file extensions to test, defaulting to {".bb"}.
    :param time_per_file: is how long (minimum) it should spend on each compilation/execution.
    :param test_file_location: is the filepath for the test files, defaulting to BB files/Testing.
    Note that program_compiler and program_executor must not raise errors during execution
    """
    if valid_extensions is None:
        valid_extensions: Iterable[str] = {".bb"}

    clean_executor = _combine_function_with_kwargs(program_executor, program_executor_kwargs)
    if program_compiler != identity_function:
        clean_compiler = _combine_function_with_kwargs(program_compiler, program_compiler_kwargs)
        _yes_compile_run_all_benchmarks(clean_executor, clean_compiler, time_per_file, skip_timeouts, valid_extensions, test_file_location)
    else:
        _no_compile_run_all_benchmarks(clean_executor, time_per_file, skip_timeouts, valid_extensions, test_file_location)



def _no_compile_run_all_benchmarks(program_executor: Callable[[list[str]], VariableDict],
                                   time_per_file: float,
                                   skip_timeouts: bool,
                                   valid_extensions: Iterable[str],
                                   test_file_location: str) -> None:
    for test_file in os.listdir(test_file_location):
        if pathlib.Path(test_file).suffix in valid_extensions:
            print(test_file, end=": ")
            f = open(f"{test_file_location}/{test_file}")
            code = f.readlines()
            f.close()
            if skip_timeouts and code[-1].startswith("#error:TimeoutError"):
                continue
            start_time = time.time()
            number = 0
            while time.time() - start_time < time_per_file:
                program_executor(code)
                number += 1
            print(f"{format_time((time.time() - start_time)/number)}")


def _yes_compile_run_all_benchmarks(program_executor: Callable[[T], VariableDict],
                                    program_compiler: Callable[[list[str]], T],
                                    time_per_file: float,
                                    skip_timeouts: bool,
                                    valid_extensions: Iterable[str],
                                    test_file_location):
    for test_file in os.listdir(test_file_location):
        if pathlib.Path(test_file).suffix in valid_extensions:
            f = open(f"{test_file_location}/{test_file}")
            code = f.readlines()
            f.close()
            if skip_timeouts and code[-1].startswith("#error:TimeoutError"):
                continue
            print(test_file, end=": ")

            try:
                start_time = time.time()
                number = 0
                while time.time() - start_time < time_per_file:
                    program_compiler(code)
                    number += 1
                print(f"{format_time((time.time() - start_time)/number)} compilation, ", end="")
            except ProgramError as e:
                print("Error during compilation: ", end="")
                if isinstance(e, _InnerCodeError):
                    print(f"{repr(e.inner_exception)} on line {e.line_number}: {e.line.replace("\n", "")}")
                else:
                    print(repr(e))
                continue

            compiled_code = program_compiler(code)
            try:
                start_time = time.time()
                number = 0
                while time.time() - start_time < time_per_file:
                    program_executor(compiled_code)
                    number += 1
                if number > 1:
                    print(f"{format_time((time.time() - start_time)/number)} execution")
                else:
                    print("timeout on execution")
            except ProgramError as e:
                print("Error during execution: ", end="")
                if isinstance(e, _InnerCodeError):
                    print(f"{repr(e.inner_exception)} on line {e.line_number}: {e.line}")
                else:
                    print(repr(e))


def _test_everything():
    # Compile aliases:
    from AliasGenerator import generate_aliases
    generate_aliases("")

    # Convert BBE tests to BB:
    import shutil
    from extended import compile_extended_file
    for file in os.listdir("BB files/Testing"):
        if file.endswith(".bb"):
            shutil.copy(f"BB files/Testing/{file}", f"BB files/De-extended Testing/{file}")
        elif file.endswith(".bbe"):
            try:
                compile_extended_file(f"BB files/Testing/{file}", f"BB files/De-extended Testing/{file[:-1]}")
            except:
                pass

    # Run the tests:
    from main import _do_test
    print("main:")
    _do_test()

    from extended import _do_test
    print("\n\nextended:")
    _do_test()

    from compiler import _do_test
    print("\n\ncompiler:")
    _do_test()


if __name__ == "__main__":
    _test_everything()
