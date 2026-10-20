import os
import pathlib
import sys
import traceback
from datetime import time
from types import CodeType

import marshal

# import multiprocessing

# import dill

from main import ProcessedLine, Command, VariableDict, _process_program
from testing_tools import run_all_tests, run_all_benchmarks
from errors import ProgramError, UndefinedVariableError, NegativeError, SyntacticalError, _InnerCodeError


# from utils import format_time


def _compile_code(code: list[ProcessedLine]) -> CodeType:
    """Converts BB code to compiled Python code"""
    python_code = []
    depth = 0
    for line in code:
        if not line:
            python_code.append("")
            continue
        command, variable_name = line
        match command:
            case Command.INCR:
                python_code.append(f"{"    " * depth}{variable_name} += 1")

            case Command.DECR:
                python_code.append(f"{"    " * depth}if {variable_name} == 0: raise NegativeError(f\"Tried to decrement '{variable_name}' however it was already 0\")")
                python_code.append(f"{"    " * depth}{variable_name} -= 1")

            case Command.CLEAR:
                python_code.append(f"{"    " * depth}{variable_name} = 0")

            case Command.PRINT:
                python_code.append(f"{"    " * depth}print({variable_name})")

            case Command.WHILE:
                python_code.append(f"{"    " * depth}while {variable_name} != 0:")
                depth += 1

            case Command.END:
                depth -= 1

            case _:
                raise ValueError(f"Unexpected Command {command}")

    return compile("\n".join(python_code), "<Compiled BB code>", "exec")


def compile_program_to_file(barebones_filepath: str, python_filepath: str | None = None) -> None:
    """Compiles a Bare Bones program to a compiled Python program

    The second argument, if provided, is the destination of the compiled program; otherwise, it will be in the same location as the BB program with the extension .pyc
    """
    if python_filepath is None:
        extended_filepath_directory, extended_filepath_full_name = os.path.split(barebones_filepath)
        extended_filepath_name = pathlib.Path(extended_filepath_full_name).stem
        python_filepath = os.path.join(extended_filepath_directory, f"{extended_filepath_name}.pyc")

    f = open(barebones_filepath)
    code = f.readlines()
    f.close()

    new_code = _compile_code(_process_program(code))

    pathlib.Path(python_filepath).parent.mkdir(parents=True, exist_ok=True)
    f = open(python_filepath, "wb")
    marshal.dump(new_code, f)
    f.close()


# class DillProcess(multiprocessing.Process):
#
#     def __init__(self, *args, **kwargs):
#         super().__init__(*args, **kwargs)
#         self._target = dill.dumps(self._target)  # Save the target function as bytes, using dill
#
#     def run(self):
#         if self._target:
#             self._target = dill.loads(self._target)    # Unpickle the target function before executing
#             self._target(*self._args, **self._kwargs)  # Execute the target function


def execute_code(code: str | list[str], *, discard_underscore_prefixed_variables: bool = False, print_errors: bool = True, loudness: int = 1) -> VariableDict:  # , timeout: float = float("inf")
    """Executes a BB program, via compiling it into Python

    `discard_underscore_prefixed_variables` determines if underscore-prefixed variables (such as those originating from BBE aliases) should be discarded from the results

    """
    # `timeout` determines after how long the program should be force stopped (defaults to never)
    # """

    # def get_result():
    #     try:
    #         python_code = _compile_code(_process_program(code))
    #         exec(python_code)
    #     except ProgramError as e:
    #         line_number_line = traceback.format_exc().splitlines()[-2]
    #         line_number = int(line_number_line[24:-13])  # '  File "<string>", line XYZ, in <module>'
    #         raise _InnerCodeError(e, line_number, python_code.splitlines()[line_number])
    #
    #     result = {k: v for k, v in locals().items() if k not in ["python_code", "code", "discard_underscore_prefixed_variables"]}
    #     if result and discard_underscore_prefixed_variables:
    #         return {k: v for k, v in result.items() if not k.startswith("_")}
    #     else:
    #         return result
    #
    # def timeoutable_get_result(return_dict):
    #     return_dict[0] = get_result()
    #
    # if timeout >= float("inf"):
    #     return get_result()
    # else:
    #     manager = multiprocessing.Manager()
    #     return_dict = manager.dict()
    #
    #     p = DillProcess(target=timeoutable_get_result, args=(return_dict, ))
    #     p.start()
    #     p.join(timeout)  # Waits until inner() finishes, or until timeout seconds have passed
    #
    #     if p.is_alive():
    #         # Timeout exceeded
    #         p.terminate()
    #         raise TimeoutError(f"The program exceeded the {format_time(timeout)} timeout")
    #     else:
    #         return return_dict[0]
    # try:
    #     python_code = _compile_code(_process_program(code))
    # except _InnerCodeError as e:
    #     inner_exception, line_number, line = e
    #     if not isinstance(inner_exception, SyntacticalError): raise

    try:
        compiled_code = _compile_code(_process_program(code))
    except _InnerCodeError as e:
        inner_exception, line_number, line = e.inner_exception, e.line_number, e.line
        if print_errors:
            if loudness >= 1:
                print(f"! Error on line {line_number}: {line}\n!     {repr(inner_exception)}")
            return {}
        else:
            raise e

    result = _execute_compiled_code(compiled_code, print_errors=print_errors, loudness=loudness)
    if result and discard_underscore_prefixed_variables:
        return {k: v for k, v in result.items() if not k.startswith("_")}
    else:
        return result


def _execute_compiled_code(code: CodeType, *, print_errors: bool = True, loudness: int = 1) -> VariableDict:
    result = {}
    try:
        exec(code, globals=globals(), locals=result)
    except _InnerCodeError as e:
        inner_exception, line_number, line = e.inner_exception, e.line_number, e.line
        if print_errors:
            if loudness >= 1:
                print(f"! Error on line {line_number}: {line}\n!     {repr(inner_exception)}")
        else:
            raise e
    except ProgramError as e:
        line_number_line = traceback.format_exc().splitlines()[-2]  # '  File "<string>", line XYZ, in <module>'
        if isinstance(code, str):
            code = code.splitlines()
        line = code[line_number]
        line_number = int(line_number_line[34:-13])
        if print_errors:
            if loudness >= 1:
                print(f"! Error on line {line_number}: {line}\n!     {repr(e)}")
        else:
            raise _InnerCodeError(e, line_number, line)

    # result = {k: v for k, v in locals().items() if k not in ["python_code", "code", "discard_underscore_prefixed_variables", "print_errors", "loudness"]}
    return result


def execute_file(filepath: str, *, discard_underscore_prefixed_variables: bool = False) -> VariableDict:
    """Opens a file and executes its contents

    All keyword-only arguments are the same as in execute_code; see its documentation for details"""
    f = open(filepath)
    file = f.read()
    f.close()
    return execute_code(file, discard_underscore_prefixed_variables=discard_underscore_prefixed_variables)


def execute_compiled_file(filepath: str) -> VariableDict:
    f = open(filepath, "rb")
    code = marshal.load(f)
    f.close()
    return _execute_compiled_code(code)


if __name__ == "__main__":
    # import time
    # start_time = time.time()
    # for _ in range(1000):
    #     execute_file("BB files/Testing/01 Counting.bb")
    # print(time.time() - start_time)
    #
    # f = open("BB files/Testing/01 Counting.bb")
    # file = f.read()
    # f.close()
    # compiled_code = _compile_code(_process_program(file))
    # start_time = time.time()
    # for _ in range(1_000_000):
    #     _execute_compiled_code(compiled_code)
    # print(time.time() - start_time)

    run_all_tests(execute_code, program_executor_kwargs={"discard_underscore_prefixed_variables": True, "print_errors": False}, skip_timeouts=True, test_file_location="BB files/De-extended Testing")
    print()
    run_all_benchmarks(_execute_compiled_code, lambda x: _compile_code(_process_program(x)), skip_timeouts=True, program_executor_kwargs={"loudness": 0}, test_file_location="BB files/De-extended Testing")
