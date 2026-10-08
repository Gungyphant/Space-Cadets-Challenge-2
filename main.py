import re


class ProgramError(Exception):
    """General class for all errors with user code (as opposed to bugs in this program)"""
    pass


class UndeclaredVariableError(ProgramError):
    """This error occurs when trying to increment or decrement a variable that has yet to be declared via clear"""
    pass


class NegativeError(ProgramError):
    """This error occurs when trying to make a variable negative"""


def parse_line(line, vars):
    clear_match = re.fullmatch(r"clear (\w+);", line)
    if clear_match:
        variable_name = clear_match.group(1)
        vars[variable_name] = 0

    else:
        incr_match = re.fullmatch(r"incr (\w+);", line)
        if incr_match:
            variable_name = incr_match.group(1)
            if variable_name not in vars:
                raise UndeclaredVariableError(f"Tried to increment the variable '{variable_name}' prior to it being initialised")
            else:
                vars[variable_name] += 1

        else:
            decr_match = re.fullmatch(r"decr (\w+);", line)
            if decr_match:
                variable_name = decr_match.group(1)
                if variable_name not in vars:
                    raise UndeclaredVariableError(f"Tried to decrement the variable '{variable_name}' prior to it being initialised")
                elif vars[variable_name] == 0:
                    raise NegativeError(f"Tried to decrement '{variable_name}' however it was already 0")
                else:
                    vars[variable_name] -= 1


if __name__ == "__main__":
    vars = {}
    parse_line("clear X;", vars)
    parse_line("incr X;", vars)
    print(vars)
