import os
import re
import time
import warnings
from collections.abc import Callable
from enum import Enum
from typing import Tuple
from unittest import result

from utils import *


class ProgramError(Exception):
    """General class for all errors with user code (as opposed to bugs in this program)"""


class UndefinedVariableError(ProgramError):
    """This error occurs when trying to increment or decrement a variable that has yet to be declared via clear"""


class NegativeError(ProgramError):
    """This error occurs when trying to make a variable negative"""


class SyntacticalError(ProgramError):  # should really be called SyntaxError but that'd be confusing
    """This error occurs when trying to parse a line that's not of a correct format, or attempts to call a non-existent function"""


class MultilineExpressionError(ProgramError):
    """This error occurs when trying to execute a multiline statement somewhere that only supports single-line statements"""


class TimeoutError(ProgramError):
    """This error occurs when a program takes longer than the timeout"""


class _InnerCodeError(ProgramError):
    """This error occurs when _parse_lines re-raises an exception from a program, with additional information"""
    def __init__(self, inner_exception: ProgramError, line_number: int, line: str):
        self.inner_exception: ProgramError = inner_exception
        self.line_number: int = line_number
        self.line: str = line


VariableDict = dict[str, int]  # Custom type hint for variables

class Command(Enum):
    INCR = 0
    DECR = 1
    CLEAR = 2
    WHILE = 3
    END = 4
    PRINT = 5
ProcessedLine = Tuple[Command, str] | None  # the string is the variable the command acts on (None represents a blank line)


def _process_line(line: str, *, do_strip: bool = True) -> ProcessedLine:
    """Convert lines to ProcessedLines"""
    if do_strip:
        line = line.strip()  # Indentation and trailing whitespace is ignored

    if not line or line.startswith("#"):
        return  # Ignore blank lines and comment lines

    incr_match = re.fullmatch(r"incr (\w{2,}|[a-zA-Z_]);", line)
    if incr_match:
        variable_name = incr_match.group(1)
        return Command.INCR, variable_name

    else:
        decr_match = re.fullmatch(r"decr (\w{2,}|[a-zA-Z_]);", line)
        if decr_match:
            variable_name = decr_match.group(1)
            return Command.DECR, variable_name

        else:
            clear_match = re.fullmatch(r"clear (\w{2,}|[a-zA-Z_]);", line)
            if clear_match:
                variable_name = clear_match.group(1)
                return Command.CLEAR, variable_name

            else:
                print_match = re.fullmatch(r"print (\w{2,}|[a-zA-Z_]);", line)
                if print_match:
                    variable_name = print_match.group(1)
                    return Command.PRINT, variable_name

                else:
                    blank_print_match = re.fullmatch(r"print;", line)
                    if blank_print_match:
                        return Command.PRINT, ""

                    else:
                        while_match = re.fullmatch(r"while (\w{2,}|[a-zA-Z_]) not 0 do;", line)
                        if while_match:
                            variable_name = while_match.group(1)
                            return Command.WHILE, variable_name

                        else:
                            end_match = re.fullmatch(r"end;", line)
                            if end_match:
                                return Command.END, ""

                            # Doesn't match any BB command; raise an error:
                            elif not line.endswith(";"):
                                raise SyntacticalError(f"Missing semicolon on line '{line}'")
                            else:
                                raise SyntacticalError(f"Unparsable line '{line}'")


def _process_program(code: str | list[str]) -> list[ProcessedLine]:
    result = []
    if isinstance(code, str):
        code = code.splitlines()
    for line_number, line in enumerate(code):
        try:
            processed_line = _process_line(line)
        except ProgramError as e:
            raise _InnerCodeError(e,line_number + 1, line)
        # if processed_line is not None:
        result.append(processed_line)
    return result


def parse_line(line: str, variables: VariableDict, *, do_strip: bool = True) -> None:
    """Parse a line of Bare Bones, updating `variables` accordingly

    Note: only parses single-line statements; while loops are not supported (use parse_code)

    Pass the keyword-only argument do_strip as False if the line has already been stripped (to avoid unnecessary re-stripping) (Note that unstripped lines passed with do_strip=False will raise a SyntacticalError)
    """
    _parse_line(_process_line(line, do_strip=do_strip), variables)


def _parse_line(line: ProcessedLine, variables: VariableDict) -> None:
    if line is None:
        return
    command, variable_name = line
    match command:
        case Command.INCR:
            if variable_name not in variables:
                raise UndefinedVariableError(f"Tried to increment the variable '{variable_name}' prior to it being initialised")
            else:
                variables[variable_name] += 1

        case Command.DECR:
            if variable_name not in variables:
                raise UndefinedVariableError(f"Tried to decrement the variable '{variable_name}' prior to it being initialised")
            elif variables[variable_name] == 0:
                raise NegativeError(f"Tried to decrement '{variable_name}' however it was already 0")
            else:
                variables[variable_name] -= 1

        case Command.CLEAR:
            variables[variable_name] = 0

        case Command.PRINT:
            if variable_name:
                if variable_name not in variables:
                    raise UndefinedVariableError(f"Tried to print the variable '{variable_name}' prior to it being initialised")
                else:
                    print(variables[variable_name])
            else:
                print()

        case Command.WHILE | Command.END:
            raise MultilineExpressionError(f"Attempted to run a multiline statement on the line '{line}'")

        case _:
            raise ValueError(f"Unexpected Command {command}")


def begin_repl() -> None:
    """Activates REPL mode, wherein individual lines of code can be run while maintaining variables

    REPL mode also allows the use of the following non-standard commands, for convenience:

    - `quit` -- Exits REPL mode
    - `vars` -- Prints the values of all defined variables
    """
    variables = {}
    while True:  # TODO missing feature: add while support similar to parse_code
        line = input(">>> ")
        if line == "quit;":
            break
        elif line == "vars;":
            print(*(f"{var}: {val}" for var, val in variables.items()), sep="\n")
        else:
            try:
                parse_line(line, variables)
            except ProgramError as e:
                print(e)

def parse_code(code: str | list[str], *, print_errors: bool = True, loudness: int = 1, timeout: float = float("inf"), discard_underscore_prefixed_variables: bool = False) -> VariableDict:  # wrapper to allow _parse_code to pass variables to itself without allowing them to be passed to parse_code
    """Parses an entire Bare Bones program

    :returns: A dictionary of the final values of the variables when the program terminates

    The `print_errors` argument determines if parse_code will print errors instead of raising them

    The `loudness` argument determines how much information should be printed:

    - 0 -- No printing at all
    - 1 (default) -- Print any errors that occur
    - 2 -- 1, and print the state of the program after each line

    The `timeout` argument will, if the program has been running for that long, cause an error to be raised before parsing the next line
    """
    # TODO: revert ProcessedLines to lines when they need to be output
    variables = {}
    result = {}
    try:
        processed_code = _process_program(code)
        result =  _parse_code(processed_code, variables, loudness, timeout)
    except _InnerCodeError as e:
        if print_errors:
            if loudness >= 1:
                print(f"! {repr(e.inner_exception)} occurred on line {e.line_number}: {e.line}")  # By default, a real exception is not raised, since it adds the context of the parse_code function, which isn't relevant to the BB code
        else:
            raise
    except ProgramError as e:
        if print_errors:
            if loudness >= 1:
                print(f"! {repr(e)} occurred")
        else:
            raise _InnerCodeError(e, -1, "")
    if result and discard_underscore_prefixed_variables:
        return {k: v for k, v in result.items() if not k.startswith("_")}
    else:
        return result


def _parse_code(code: list[ProcessedLine], variables: VariableDict, loudness: int, timeout: float) -> VariableDict:
    """Parses a subsection of a Bare Bones program

    :returns: A dictionary of the final values of the variables when the section terminates
    """
    # _parse_code works recursively; each `while` block is passed to a new parse_code each time until (if ever) the loop terminates
    # TODO optimisation: make it non-recursive to reduce function overhead
    # TODO missing feature: currently, BB while loops can only be nested to a depth of 998 (bc they're recursive, 2 less bc the first parse_code and the active parse_line call use 1 each)
    # TODO missing feature: make it output the line again when loudness == 2

    # if timeout < float("inf"):
    start_time = time.time()

    while_mode = False
    while_var = ""
    while_code = []
    while_line_number = -1
    while_depth = 0
    for line_number, line in enumerate(code):
        if line is None: continue
        command, variable = line
        # When in normal mode (while_mode == False), run the code. When in while mode, cache the lines to execute once the entire loop is known
        if timeout < float("inf") and time.time() - start_time > timeout:
            raise TimeoutError(f"The program exceeded the {format_time(timeout)} timeout")
        if not while_mode:
            if command == Command.WHILE:
                while_mode = True
                while_var = variable
                while_code = []
                while_line_number = line_number
                while_depth = 0
            else:
                try:
                    _parse_line(line, variables)
                except ProgramError as e:
                    raise _InnerCodeError(e, line_number + 1, f"{command.name.lower()} {variable};")
                else:
                    if loudness >= 2:
                        print(f"{command.name.lower()} {variable};", variables)

        else:
            if command == Command.WHILE:
                while_depth += 1
            elif command == Command.END:  # Is an end command
                while_depth -= 1

            if command == Command.END and while_depth < 0:
                try:
                    while variables[while_var] != 0:
                        try:
                            _parse_code(while_code, variables, loudness, timeout - (time.time() - start_time))
                        except TimeoutError:
                            # Correct the timeout
                            raise TimeoutError(f"The program exceeded the {format_time(timeout)} timeout")
                        except _InnerCodeError as e:
                            inner_exception, inner_line_number, inner_line = e.inner_exception, e.line_number, e.line
                            raise _InnerCodeError(inner_exception, inner_line_number + while_line_number + 1, inner_line)
                    while_mode = False
                except KeyError:
                    raise UndefinedVariableError(f"Tried to have a while based on the variable '{while_var}' prior to it being initialised")
            else:
                while_code.append(line)

    if while_mode:
        # The program terminated without reaching an `end;`
        raise SyntacticalError(f"A `while` went unclosed")

    return variables


def parse_file(filepath: str, *, print_errors: bool = True, loudness: int = 1, discard_underscore_prefixed_variables: bool = False) -> dict[str, int] | None:
    """Parses the Bare Bones program located at filepath

    :returns: A dictionary of the final values of the variables when the program terminates

    The `print_errors` and `loudness` arguments are passed directly to parse_code; see its documentation for details
    """
    if filepath.endswith(".bbe"):
        warnings.warn("Warning: parse_file does not support BBE files. See the BBE documentation for details.")
    f = open(filepath)
    code = f.readlines()
    f.close()
    return parse_code(code, print_errors=print_errors, loudness=loudness, discard_underscore_prefixed_variables=discard_underscore_prefixed_variables)


# def _run_all_tests(
#         program_executor: Callable[Concatenate[list[str], ...], VariableDict] = parse_code,
#         kwargs: dict[str, Any] = {"print_errors": False, "timeout": 3},
# ) -> None:
def _run_all_tests(program_executor: Callable[[list[str], ...], VariableDict], kwargs=None, skip_timeouts: bool = False) -> None:
    """Runs every .bb file in 'BB files/Testing' using parse_code"""
    if kwargs is None:
        kwargs = {}
    for test_file in os.listdir("BB files/De-extended Testing"):
        if test_file.endswith(".bb"):
            f = open(f"BB files/De-extended Testing/{test_file}")
            code = f.readlines()
            f.close()
            expected_result = code[-1]
            if skip_timeouts and expected_result.startswith("#error:TimeoutError"):
                continue
            print(test_file, end=": ")
            try:
                variables = program_executor(code, **kwargs)
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


def _run_all_benchmarks(program_executor: Callable[[list[str], ...], VariableDict], kwargs=None, time_per_file: float = 1.0, skip_timeouts: bool = False) -> None:
    """Times every .bb file in 'BB files/Testing' using parse_file"""
    if kwargs is None:
        kwargs = {}
    for test_file in os.listdir("BB files/De-extended Testing"):
        if test_file.endswith(".bb"):
            print(test_file, end=": ")
            f = open(f"BB files/De-extended Testing/{test_file}")
            code = f.readlines()
            f.close()
            if skip_timeouts and code[-1].startswith("#error:TimeoutError"):
                continue
            start_time = time.time()
            number = 0
            while time.time() - start_time < time_per_file:
                program_executor(code, **kwargs)
                number += 1
            print(f"{format_time((time.time() - start_time)/number)}")


if __name__ == "__main__":
    _run_all_tests(parse_code, {"print_errors": False, "timeout": 3, "discard_underscore_prefixed_variables": True})
    print()
    _run_all_benchmarks(parse_code, {"print_errors": True, "loudness": 0, "timeout": 1.0, "discard_underscore_prefixed_variables": True})
