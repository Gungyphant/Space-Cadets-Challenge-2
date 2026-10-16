import os
import pathlib
import sys
import traceback
# import multiprocessing

# import dill

from main import ProcessedLine, Command, VariableDict, _process_program, _run_all_tests, _run_all_benchmarks
from main import ProgramError, UndefinedVariableError, NegativeError, _InnerCodeError, SyntacticalError
# from utils import format_time


def _compile_code(code: list[ProcessedLine]) -> str:
    """Converts BB code to Python code"""
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

    return "\n".join(python_code)


def compile_program_to_file(extended_filepath: str, regular_filepath: str | None = None) -> None:
    """Compiles a Bare Bones program to a Python program

    The second argument, if provided, is the destination of the compiled program; otherwise, it will be in the same location as the BB program with the extension .py
    """
    if regular_filepath is None:
        extended_filepath_directory, extended_filepath_full_name = os.path.split(extended_filepath)
        extended_filepath_name = pathlib.Path(extended_filepath_full_name).stem
        regular_filepath = os.path.join(extended_filepath_directory, f"{extended_filepath_name} de-extended.bb")

    f = open(extended_filepath)
    code = f.readlines()
    f.close()

    new_code = _compile_code(_process_program(code))

    pathlib.Path(regular_filepath).parent.mkdir(parents=True, exist_ok=True)
    f = open(regular_filepath, "w")
    f.write("\n".join(new_code))
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
    #         line_no_line = traceback.format_exc().splitlines()[-2]
    #         line_no = int(line_no_line[24:-13])  # '  File "<string>", line XYZ, in <module>'
    #         raise _InnerCodeError(e, line_no, python_code.splitlines()[line_no])
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
    try:
        python_code = _compile_code(_process_program(code))
    except SyntacticalError:
        pass

    try:
        exec(python_code)
    except ProgramError as e:
        line_no_line = traceback.format_exc().splitlines()[-2]  # '  File "<string>", line XYZ, in <module>'
        line_no = int(line_no_line[24:-13])
        line = python_code.splitlines()[line_no]
        if print_errors:
            if loudness >= 1:
                print(f"! Error on line {line_no}: {line}\n!     {repr(e)}")
        else:
            raise _InnerCodeError(e, line_no, line)

    result = {k: v for k, v in locals().items() if k not in ["python_code", "code", "discard_underscore_prefixed_variables", "print_errors", "loudness"]}
    if result and discard_underscore_prefixed_variables:
        return {k: v for k, v in result.items() if not k.startswith("_")}
    else:
        return result


def execute_file(filepath: str, *, discard_underscore_prefixed_variables: bool = False) -> VariableDict:
    """Opens a file and executes its contents

    All keyword-only arguments are the same as in execute_code; see its documentation for details"""
    f = open(filepath)
    file = f.read()
    f.close()
    return execute_code(file, discard_underscore_prefixed_variables=discard_underscore_prefixed_variables)


if __name__ == "__main__":
    _run_all_tests(execute_code, kwargs={"discard_underscore_prefixed_variables": True, "print_errors": False}, skip_timeouts=True)
    print()
    _run_all_benchmarks(execute_code, skip_timeouts=True, kwargs={"loudness": 0})
