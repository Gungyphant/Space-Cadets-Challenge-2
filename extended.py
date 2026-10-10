import pathlib

from main import *


def parse_extended_file(filepath: str, *, print_errors: bool = True, loudness: int=1) -> VariableDict:
    """Parses the Bare Bones Extended program located at `filepath`

    :returns: A dictionary of the final values of the variables when the program terminates
    All keyword arguments are the same as in main.parse_code; see its documentation for details
    """
    f = open(filepath)
    code = f.readlines()
    f.close()
    return parse_extended_code(code, print_errors=print_errors, loudness=loudness)


def parse_extended_code(code: str | list[str], *, print_errors: bool = True, loudness: int = 1) -> VariableDict | None:
    """Parses an entire Bare Bones Extended program

    :returns: A dictionary of the final values of the variables when the program terminates
    All keyword arguments are the same as in main.parse_code; see its documentation for details
    """
    return parse_code(_de_extend_code(code))


def compile_extended_file(extended_filepath: str, regular_filepath: str = None) -> None:
    """Compiles a Bare Bones Extended program into a regular Bare Bones program, for using in main.parse_file

    The second argument, if provided, is the destination of the compiled program; otherwise, it will be in the same location as the BBE program with the suffix " de-extended", and the
    appropriate file extension
    """
    if regular_filepath is None:
        extended_filepath_directory, extended_filepath_full_name = os.path.split(extended_filepath)
        extended_filepath_name = pathlib.Path(extended_filepath_full_name).stem
        regular_filepath = os.path.join(extended_filepath_directory, f"{extended_filepath_name} de-extended.bb")

    f = open(extended_filepath)
    code = f.readlines()
    f.close()

    new_code = _de_extend_code(code)

    pathlib.Path(regular_filepath).parent.mkdir(parents=True, exist_ok=True)
    f = open(regular_filepath, "w")
    f.writelines(new_code)
    f.close()


def _de_extend_code(code: list[str]) -> list[str]:
    """Converts BBE code into BB code"""
