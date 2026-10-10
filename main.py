import os
import re
import time
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


class _InnerCodeError(ProgramError):
    """This error occurs when _parse_lines re-raises an exception from a program, with additional information"""
    def __init__(self, inner_exception: ProgramError, line_number: int, line: str):
        self.inner_exception: ProgramError = inner_exception
        self.line_number: int = line_number
        self.line: str = line


VariableDict = dict[str, int]  # Custom type hint for variables


def parse_line(line: str, variables: VariableDict, *, do_strip: bool = True) -> None:
    """Parse a line of Bare Bones, updating `variables` accordingly

    Note: only parses single-line statements; while loops are not supported (use parse_code)
    Pass the keyword-only argument do_strip as False if the line has already been stripped (to avoid unnecessary re-stripping) (Note that unstripped lines passed with do_strip=False will raise a SyntacticalError)
    """
    if do_strip:
        line = line.strip()  # Indentation and trailing whitespace is ignored

    if not line or line.startswith("#"):
        return  # Ignore blank lines and comment lines

    incr_match = re.fullmatch(r"incr (\w+);", line)
    if incr_match:
        variable_name = incr_match.group(1)
        if variable_name not in variables:
            raise UndefinedVariableError(
                f"Tried to increment the variable '{variable_name}' prior to it being initialised")
        else:
            variables[variable_name] += 1

    else:
        decr_match = re.fullmatch(r"decr (\w+);", line)
        if decr_match:
            variable_name = decr_match.group(1)
            if variable_name not in variables:
                raise UndefinedVariableError(
                    f"Tried to decrement the variable '{variable_name}' prior to it being initialised")
            elif variables[variable_name] == 0:
                raise NegativeError(f"Tried to decrement '{variable_name}' however it was already 0")
            else:
                variables[variable_name] -= 1

        else:
            clear_match = re.fullmatch(r"clear (\w+);", line)
            if clear_match:
                variable_name = clear_match.group(1)
                variables[variable_name] = 0

            else:
                # The line is invalid for parse_line; determine which error to raise
                if re.fullmatch(r"while (\w+) not 0 do;|end;", line):
                    raise MultilineExpressionError(f"Attempted to run a multiline statement on the line '{line}'")
                else:
                    raise SyntacticalError(f"Unparsable line '{line}'")


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


def parse_code(code: str | list[str], *, be_nice: bool = True, loudness: int = 1) -> VariableDict | None:  # wrapper to allow _parse_code to pass variables to itself without allowing them to be passed to parse_code
    """Parses an entire Bare Bones program

    :returns: A dictionary of the final values of the variables when the program terminates
    The `be_nice` argument determines if parse_code will print errors instead of raising them
    The `loudness` argument determines how much information should be printed:

    - 0 -- No printing at all (useful for testing and benchmarking)
    - 1 (default) -- Print any errors that occur
    - 2 -- 1, and print the state of the program after each line
    """
    variables = {}
    try:
        return _parse_code(code, variables, loudness)
    except _InnerCodeError as e:
        if be_nice:
            if loudness >= 1:
                print(f"! {repr(e.inner_exception)} occurred on line {e.line_number}: {e.line}")  # By default, a real exception is not raised, since it adds the context of the parse_code function, which isn't relevant to the BB code
        else:
            raise
    except ProgramError as e:
        if be_nice:
            if loudness >= 1:
                print(f"! {repr(e)} occurred")
        else:
            raise _InnerCodeError(e, -1, "")

def _parse_code(code: str | list[str], variables: VariableDict, loudness: int) -> VariableDict:
    """Parses a subsection of a Bare Bones program

    :returns: A dictionary of the final values of the variables when the section terminates
    """
    # _parse_code works recursively; each `while` block is passed to a new parse_code each time until (if ever) the loop terminates
    # TODO optimisation: make it non-recursive to reduce function overhead
    # TODO missing feature: currently, BB while loops can only be nested to a depth of 998 (bc they're recursive, 2 less bc the first parse_code and the active parse_line call use 1 each)
    if isinstance(code, str):
        code = code.splitlines()

    while_mode = False
    while_var = ""
    while_code = []
    while_line_number = -1
    while_depth = 0
    for line_number, true_line in enumerate(code):
        # When in normal mode (while_mode == False), run the code. When in while mode, cache the lines to execute once the entire loop is known
        line = true_line.strip()  # Indentation and trailing whitespace is ignored
        while_match = re.fullmatch(r"while (\w+) not 0 do;", line)
        if not while_mode:
            if while_match:
                while_mode = True
                while_var = while_match.group(1)
                while_code = []
                while_line_number = line_number
                while_depth = 0
            else:
                try:
                    parse_line(line, variables, do_strip=False)
                except ProgramError as e:
                    raise _InnerCodeError(e, line_number + 1, line)
                else:
                    if loudness >= 2 and line and not line.startswith("#"):
                        print(true_line.replace("\n", ""), variables)

        else:
            end_match = re.fullmatch(r"end;", line)
            if while_match:
                while_depth += 1
            elif end_match:  # Is an end command
                while_depth -= 1

            if end_match and while_depth < 0:
                while variables[while_var] != 0:
                    try:
                        _parse_code(while_code, variables, loudness)
                    except _InnerCodeError as e:
                        inner_exception, inner_line_number, inner_line = e.inner_exception, e.line_number, e.line
                        raise _InnerCodeError(inner_exception, inner_line_number + while_line_number + 1, inner_line)
                while_mode = False
            else:
                while_code.append(true_line)

    if while_mode:
        # The program terminated without reaching an `end;`
        raise SyntacticalError(f"A `while` went unclosed")

    return variables


def parse_file(filepath: str, *, be_nice: bool = True, loudness: int=1) -> VariableDict:
    """Parses the Bare Bones program located at filepath

    :returns: A dictionary of the final values of the variables when the program terminates
    The `be_nice` and `loudness` arguments are passed directly to parse_code; see its documentation for details
    """
    f = open(filepath)
    code = f.readlines()
    f.close()
    return parse_code(code, be_nice=be_nice, loudness=loudness)


def _run_all_tests() -> None:
    """Runs every .bb file in 'BB files/Testing' using parse_code"""
    for test_file in os.listdir("BB files/Testing"):
        if test_file.endswith(".bb"):
            print(test_file, end=": ")
            f = open(f"BB files/Testing/{test_file}")
            code = f.readlines()
            f.close()
            expected_result = code[-1]
            try:
                variables = parse_code(code, be_nice=False)
            except _InnerCodeError as e:
                result = f"#error:{type(e.inner_exception).__name__}@{e.line_number}"
            else:
                result = f"#vars:{",".join(f"{var}={val}" for var, val in sorted(variables.items(), key=lambda x: x[0]))}"

            if result == expected_result:
                print("Passed")
            else:
                print(f"Failed. Got {result}")


def _run_all_benchmarks(time_per_file: float = 1.0) -> None:
    """Times every .bb file in 'BB files/Testing' using parse_file"""
    for test_file in os.listdir("BB files/Testing"):
        if test_file.endswith(".bb"):
            print(test_file, end=": ")
            f = open(f"BB files/Testing/{test_file}")
            code = f.readlines()
            f.close()
            start_time = time.time()
            number = 0
            while time.time() - start_time < time_per_file:
                parse_code(code, be_nice=True, quiet=True)
                number += 1
            print(f"{format_time((time.time() - start_time)/number)}")


if __name__ == "__main__":
    # _run_all_tests()
    # print()
    # _run_all_benchmarks()

    parse_file("BB files/Testing/07 Extremely nested loop.bb", loudness=2)
