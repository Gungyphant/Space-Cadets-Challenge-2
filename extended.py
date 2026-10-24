import json
import os
import pathlib

from main import *
from testing_tools import run_all_tests, run_all_benchmarks


def parse_extended_file(filepath: str, *, print_errors: bool = True, loudness: int = 1, discard_underscore_prefixed_variables: bool = True) -> VariableDict:
    """Parses the Bare Bones Extended program located at `filepath`

    :returns: A dictionary of the final values of the variables when the program terminates
    All keyword arguments are the same as in parse_extended_code; see its documentation for details
    """
    f = open(filepath)
    code = f.readlines()
    f.close()
    return parse_extended_code(code, print_errors=print_errors, loudness=loudness, discard_underscore_prefixed_variables=discard_underscore_prefixed_variables)


def parse_extended_code(code: str | list[str], *, print_errors: bool = True, loudness: int = 1, timeout: float = float("inf"), discard_underscore_prefixed_variables: bool = True) -> VariableDict:
    """Parses an entire Bare Bones Extended program

    :returns: A dictionary of the final values of the variables when the program terminates
    `discard_underscore_prefixed_variables` determines if variables whose name begins with an underscore, as is standard for variables defined in aliases, should be discarded from the result
    All keyword arguments are the same as in main.parse_code; see its documentation for details
    """
    if isinstance(code, str):
        code = code.splitlines()
    start_time = time.time()
    code = _de_extend_code(code)
    return parse_code(code, print_errors=print_errors, loudness=loudness, timeout=timeout - (time.time() - start_time), discard_underscore_prefixed_variables=discard_underscore_prefixed_variables)


def compile_extended_file(extended_filepath: str, regular_filepath: str | None = None) -> None:
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
    f.write("\n".join(new_code))
    f.close()


PARAMETER_REGEX = r"\\{(\w{2,}|[a-zA-Z_])\\}"


def _de_extend_code(code: list[str]) -> list[str]:
    """Converts BBE code into BB code"""
    # Load all usings
    non_using_lines = []
    aliases = {}  # {regex: (parameter names, code)}
    for line in code:
        line = line.strip()
        using_match = re.fullmatch(r"\s*using ((\w+ ?)+);", line)  # alias sets can include spaces in their names
        if using_match:
            alias = using_match.group(1)
            f = open(f"Aliases/{alias}.bba")
            file = f.read()
            f.close()
            for alias_object in json.loads(file):
                signature: str = alias_object["signature"]
                program_code = alias_object["code"].splitlines()
                regex_safe_signature: str = re.escape(signature).replace(r"\ ", " ")
                parameters = re.findall(PARAMETER_REGEX, regex_safe_signature)
                regex_form = re.sub(PARAMETER_REGEX, r"(\\w{2,}|[a-zA-Z_])", regex_safe_signature) + ";"  # This escapes every character in the signature. It's faster (and easier) than escaping only special characters, but it results in ugly signatures
                aliases[regex_form] = (parameters, program_code)
        else:
            non_using_lines.append(line)

    # Substitute in all aliases
    if aliases:
        converted_code = []
        for line in non_using_lines:
            keep = True
            for regex_form, (parameters, program_code) in aliases.items():
                alias_match = re.fullmatch(regex_form, line)
                if alias_match:
                    converted_code.append("#> " + line)
                    for alias_parameter, corresponding_variable in zip(parameters, alias_match.groups()):
                        program_code = [line.replace(alias_parameter, corresponding_variable) for line in program_code]
                    converted_code += program_code
                    converted_code.append("#< done " + line)
                    keep = False
                    break  # Each line should only match one alias

            if keep:
                converted_code.append(line)

        return _clean_up_code(converted_code)
    else:
        return code


def _clean_up_code(code: str | list[str]) -> list[str]:
    """Automatically indents while loops, or when #> or #< are used to manually change the indentation, and removes leading or trailing empty lines"""
    if isinstance(code, str):
        code = code.splitlines()
    indented_code = []
    depth = 0
    for line in code:
        line = line.strip()
        if re.fullmatch(r"end;", line) or line.startswith("#< "):
            depth -= 1
        indented_code.append("    " * depth + line)
        if re.fullmatch(r"while (\w{2,}|[a-zA-Z_]) not 0 do;", line) or line.startswith("#> "):
            depth += 1
        # This ordering means that whiles increase the indent after themselves, but ends decrease it including themselves
    while indented_code and indented_code[0] == "":
        indented_code = indented_code[1:]
    while indented_code and indented_code[-1] == "":
        indented_code = indented_code[:-1]
    return indented_code


# def _run_all_tests() -> None:
#     """Runs every .bb or .bbe file in 'BB files/Testing' using parse_extended_code"""
#     for test_file in os.listdir("BB files/Testing"):
#         if test_file.endswith(".bb") or test_file.endswith(".bbe"):
#             print(test_file, end=": ")
#             f = open(f"BB files/Testing/{test_file}")
#             code = f.readlines()
#             f.close()
#             expected_result = code[-1]
#             try:
#                 variables = parse_extended_code(code, print_errors=False, timeout=3)
#             except _InnerCodeError as e:
#                 message = e.inner_exception.args[0]
#                 if "@" in expected_result:
#                     result = f"#error:{type(e.inner_exception).__name__}@{e.line_number}"
#                 else:
#                     result = f"#error:{type(e.inner_exception).__name__}"
#             else:
#                 message = None
#                 result = f"#vars:{",".join(f"{var}={val}" for var, val in sorted(variables.items(), key=lambda x: x[0]))}"
#
#             if result == expected_result:
#                 print("Passed")
#             else:
#                 if message:
#                     result += " " + message
#                 print(f"Failed. Got {result}")
#
#
# def _run_all_benchmarks(time_per_file: float = 1.0) -> None:
#     """Times every .bb or .bbe file in 'BB files/Testing' using parse_extended_code"""
#     for test_file in os.listdir("BB files/Testing"):
#         if test_file.endswith(".bb") or test_file.endswith(".bbe"):
#             print(test_file, end=": ")
#             f = open(f"BB files/Testing/{test_file}")
#             code = f.readlines()
#             f.close()
#
#             start_time = time.time()
#             number = 0
#             while time.time() - start_time < time_per_file:
#                 _de_extend_code(code)
#                 number += 1
#             print(f"{format_time((time.time() - start_time)/number)} compilation, ", end="")
#
#             de_extended_code = _de_extend_code(code)
#             start_time = time.time()
#             number = 0
#             while time.time() - start_time < time_per_file:
#                 parse_code(de_extended_code, print_errors=True, loudness=0, timeout=time_per_file)
#                 number += 1
#             if number > 1:
#                 print(f"{format_time((time.time() - start_time)/number)} execution")
#             else:
#                 print("timeout on execution")


def _do_test():
    run_all_tests(program_executor=parse_code, program_executor_kwargs={"print_errors": False, "timeout": 3, "discard_underscore_prefixed_variables": True}, program_compiler=_de_extend_code, valid_extensions={".bb", ".bbe"})
    print()
    run_all_benchmarks(program_executor=parse_code, program_executor_kwargs={"print_errors": True, "loudness": 0, "timeout": 1.0, "discard_underscore_prefixed_variables": True}, program_compiler=_de_extend_code, valid_extensions={".bb", ".bbe"})
    print()
    # print(parse_extended_file("BB files/Factorial.bbe"))

if __name__ == "__main__":
    # parse_extended_file("BB files/Hello, world!.bbe")
    # _do_test()
    parse_extended_file("BB files/Bit vector print test.bbe")
