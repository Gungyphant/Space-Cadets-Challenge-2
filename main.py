import os
import re


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


class InnerCodeError(ProgramError):
    """This error occurs when _parse_lines re-raises an exception from your code, with additional information"""


VariableDict = dict[str, int]  # Custom type hint for variables


def parse_line(line: str, variables: VariableDict, *, do_strip: bool = True) -> None:
    """Parse a line of Bare Bones, updating `variables` accordingly

    Note: only parses single-line statements; while loops are not supported (use parse_code)
    Pass the keyword-only argument do_strip as False if the line has already been stripped (to avoid unnecessary re-stripping) (Note that unstripped lines passed with do_strip=False will raise a SyntacticalError)
    """
    if not line or line.startswith("#"):
        return  # Ignore blank lines and comment lines
    if do_strip:
        line = line.strip()  # Indentation and trailing whitespace is ignored

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


def parse_code(code: str | list[str], *, be_nice: bool = True) -> VariableDict:  # wrapper to allow _parse_code to pass variables to itself without allowing them to be passed to parse_code
    """Parses an entire Bare Bones program

    :returns: A dictionary of the final values of the variables when the program terminates
    The `be_nice` argument determines if parse_code will print errors instead of raising them
    """
    variables = {}
    try:
        return _parse_code(code, variables)
    except InnerCodeError as e:
        message = ""
        for line in e.args[0].splitlines(keepends=True):
            message += f"! {line}"  # Add !s to draw attention to errors
        if be_nice:
            print(message)  # By default, a real exception is not raised, since it adds the context of the parse_code function, which isn't relevant to the BB code
            return variables
        else:
            raise ProgramError(message)

def _parse_code(code: str | list[str], variables: VariableDict) -> VariableDict:
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
    for line_number, line in enumerate(code):
        # When in normal mode (while_mode == False), run the code. When in while mode, cache the lines to execute once the entire loop is known
        line = line.strip()  # Indentation and trailing whitespace is ignored
        if not while_mode:
            while_match = re.fullmatch(r"while (\w+) not 0 do;", line)
            if while_match:
                while_mode = True
                while_var = while_match.group(1)
                while_code = []
                while_line_number = line_number
            else:
                try:
                    parse_line(line, variables, do_strip=False)
                except ProgramError as e:
                    raise InnerCodeError(f"{type(e).__name__} occurred on line {line_number + 1}: {line}\n{e.args[0]}")

        else:
            if re.fullmatch(r"end;", line):  # Is an end command  # TODO bug: this finds the first while; if it's a nested while, this is wrong - maybe track depth; incr by 1 for each while added, decr by 1 for each end; if depth == 0 on end, end, otherwise add to code
                while variables[while_var] != 0:
                    try:
                        _parse_code(while_code, variables)
                    except InnerCodeError as e:  # Should be the only ProgramError that can occur in _parse_code, so better not to unintentionally catch any others
                        message = f"Within a nested code block on lines {while_line_number + 1}-{line_number + 1}, the following error occurred:\n"
                        for lower_message_line in e.args[0].splitlines(keepends=True):
                            message += f"    {lower_message_line}"
                        raise InnerCodeError(message)
                while_mode = False
            else:
                while_code.append(line)

    if while_mode:
        # The program terminated without reaching an `end;`
        raise SyntacticalError(f"A `while` went unclosed")

    return variables


def parse_file(filepath: str, *, be_nice: bool = True) -> VariableDict:
    """Parses the Bare Bones program located at filepath

    :returns: A dictionary of the final values of the variables when the program terminates
    The `be_nice` argument is passed directly to parse_code; see its documentation for details
    """
    f = open(filepath)
    code = f.readlines()
    f.close()
    return parse_code(code, be_nice=be_nice)


def _run_all_tests() -> None:
    """Runs every file in BB files/Testing using parse_file"""
    for test_file in os.listdir("BB files/Testing"):
        print(test_file, end=": ")
        f = open(f"BB files/Testing/{test_file}")
        code = f.readlines()
        f.close()
        expected_result = code[-1][1:]
        try:
            result = str(parse_code(code, be_nice=False))
        except ProgramError as e:
            result = f"Raised error {repr(e)}"

        if result == expected_result:
            print("Passed")
        else:
            print(f"Failed. Got {result}")


if __name__ == "__main__":
    _run_all_tests()
    # Known failures:
    #   02 Multiplication.bb should not raise an error (caused by lack of nested loop support)
    #   05 Heavily nested error.bb should raise a (nested) NegativeError instead of a SyntacticalError (caused by lack of nested loop support)
