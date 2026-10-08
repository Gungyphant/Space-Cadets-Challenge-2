import re


class ProgramError(Exception):
    """General class for all errors with user code (as opposed to bugs in this program)"""


class UndefinedVariableError(ProgramError):
    """This error occurs when trying to increment or decrement a variable that has yet to be declared via clear"""


class NegativeError(ProgramError):
    """This error occurs when trying to make a variable negative"""


class SyntacticalError(ProgramError):  # should really be called SyntaxError but that'd be confusing
    """This error occurs when trying to parse a line that's not of a correct format, or attempts to call a non-existent function"""


def parse_line(line: str, variables: dict[str, int]) -> None:
    """Parse a line of Bare Bones"""
    clear_match = re.fullmatch(r"clear (\w+);", line)
    if clear_match:
        variable_name = clear_match.group(1)
        variables[variable_name] = 0

    else:
        incr_match = re.fullmatch(r"incr (\w+);", line)
        if incr_match:
            variable_name = incr_match.group(1)
            if variable_name not in variables:
                raise UndefinedVariableError(f"Tried to increment the variable '{variable_name}' prior to it being initialised")
            else:
                variables[variable_name] += 1

        else:
            decr_match = re.fullmatch(r"decr (\w+);", line)
            if decr_match:
                variable_name = decr_match.group(1)
                if variable_name not in variables:
                    raise UndefinedVariableError(f"Tried to decrement the variable '{variable_name}' prior to it being initialised")
                elif variables[variable_name] == 0:
                    raise NegativeError(f"Tried to decrement '{variable_name}' however it was already 0")
                else:
                    variables[variable_name] -= 1

            else:
                raise SyntacticalError(f"Unparsable line '{line}'")


def begin_repl():
    """Activates REPL mode, wherein individual lines of code can be run while maintaining variables

    REPL mode also allows the use of the following non-standard commands, for convenience:

    - `quit` -- Exits REPL mode
    - `vars` -- Prints the values of all defined variables
    """
    variables = {}
    while True:
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


if __name__ == "__main__":
    begin_repl()
