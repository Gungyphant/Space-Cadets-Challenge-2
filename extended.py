import json
import pathlib

from main import *
from main import _InnerCodeError


def parse_extended_file(filepath: str, *, print_errors: bool = True, loudness: int = 1, discard_underscore_prefixed_variables: bool = True) -> VariableDict:
    """Parses the Bare Bones Extended program located at `filepath`

    :returns: A dictionary of the final values of the variables when the program terminates
    All keyword arguments are the same as in parse_extended_code; see its documentation for details
    """
    f = open(filepath)
    code = f.readlines()
    f.close()
    return parse_extended_code(code, print_errors=print_errors, loudness=loudness, discard_underscore_prefixed_variables=discard_underscore_prefixed_variables)


def parse_extended_code(code: str | list[str], *, print_errors: bool = True, loudness: int = 1, discard_underscore_prefixed_variables: bool = True) -> VariableDict | None:
    """Parses an entire Bare Bones Extended program

    :returns: A dictionary of the final values of the variables when the program terminates
    `discard_underscore_prefixed_variables` determines if variables whose name begins with an underscore, as is standard for variables defined in aliases, should be discarded from the result
    All keyword arguments are the same as in main.parse_code; see its documentation for details
    """
    result = parse_code(_de_extend_code(code), print_errors=print_errors, loudness=loudness)
    if result and discard_underscore_prefixed_variables:
        return {k: v for k, v in result.items() if not k.startswith("_")}
    else:
        return result


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


PARAMETER_REGEX = r"{(\w+)}"


def _de_extend_code(code: list[str]) -> list[str]:
    """Converts BBE code into BB code"""
    # Load all usings
    non_using_lines = []
    aliases = {}  # {regex: (parameter names, code)}
    for line in code:
        line = line.strip()
        using_match = re.fullmatch(r"\s*using (\w+);", line)
        if using_match:
            alias = using_match.group(1)
            f = open(f"Aliases/{alias}.bba")
            file = f.read()
            f.close()
            for object in json.loads(file):
                signature = object["signature"]
                program_code = object["code"].splitlines()
                parameters = re.findall(PARAMETER_REGEX, signature)
                regex_form = re.sub(PARAMETER_REGEX, r"(\\w+)", signature) + ";"
                aliases[regex_form] = (parameters, program_code)
        else:
            non_using_lines.append(line)

    # Substitute in all aliases
    converted_code = []
    for line in non_using_lines:
        keep = True
        for regex_form, (parameters, program_code) in aliases.items():
            alias_match = re.fullmatch(regex_form, line)
            if alias_match:
                for alias_parameter, corresponding_variable in zip(parameters, alias_match.groups()):
                    program_code = [line.replace(alias_parameter, corresponding_variable) for line in program_code]
                converted_code += program_code
                keep = False
                break  # Each line should only match one alias

        if keep:
            converted_code.append(line)

    return converted_code


def _run_all_tests() -> None:
    """Runs every .bb or .bbe file in 'BB files/Testing' using parse_extended_code"""
    for test_file in os.listdir("BB files/Testing"):
        if test_file.endswith(".bb") or test_file.endswith(".bbe"):
            print(test_file, end=": ")
            f = open(f"BB files/Testing/{test_file}")
            code = f.readlines()
            f.close()
            expected_result = code[-1]
            try:
                variables = parse_extended_code(code, print_errors=False)
            except _InnerCodeError as e:
                result = f"#error:{type(e.inner_exception).__name__}@{e.line_number}"
            else:
                result = f"#vars:{",".join(f"{var}={val}" for var, val in sorted(variables.items(), key=lambda x: x[0]))}"

            if result == expected_result:
                print("Passed")
            else:
                print(f"Failed. Got {result}")


def _run_all_benchmarks(time_per_file: float = 1.0) -> None:
    """Times every .bb or .bbe file in 'BB files/Testing' using parse_extended_code"""
    for test_file in os.listdir("BB files/Testing"):
        if test_file.endswith(".bb") or test_file.endswith(".bbe"):
            print(test_file, end=": ")
            f = open(f"BB files/Testing/{test_file}")
            code = f.readlines()
            f.close()
            start_time = time.time()
            number = 0
            while time.time() - start_time < time_per_file:
                parse_extended_code(code, print_errors=True, loudness=0)
                number += 1
            print(f"{format_time((time.time() - start_time)/number)}")


if __name__ == "__main__":
    _run_all_tests()
    print()
    _run_all_benchmarks()
