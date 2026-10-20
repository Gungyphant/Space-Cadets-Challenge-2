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
