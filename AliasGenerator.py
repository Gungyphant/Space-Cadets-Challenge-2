import os
import pathlib
import re
from extended import _de_extend_code
from main import parse_code
from errors import ProgramError, SyntacticalError, _InnerCodeError
import html

def generate_aliases(aliases_location):
    for alias_location in os.listdir(f"Alias definitions/{aliases_location}"):
        f = open(f"Aliases/{alias_location}.bba", "w")
        f.write("[\n]")
        f.close()
    all_valid = False
    while not all_valid:
        all_valid = True
        for alias_location in os.listdir(f"Alias definitions/{aliases_location}"):
            result = "[\n"
            for file in os.listdir(f"Alias definitions/{alias_location}"):
                if not (file.endswith(".bb") or file.endswith(".bbe")):
                    continue
                signature = html.unescape(pathlib.Path(file).stem).replace("&slash;", "/")
                variable_names = re.findall(r"{(\w{2,}|[a-zA-Z_])}", signature)
                if any(name in ["incr", "decr", "clear", "while", "not", "0", "do", "end"] for name in variable_names):
                    is_valid_signature = False
                    print(f"One or more of the parameters in the signature '{signature}' conflict with pre-existing commands and cannot be used")
                    break

                filepath = os.path.join(f"Alias definitions/{alias_location}", file)
                f = open(filepath)
                _code = f.readlines()
                f.close()
                if filepath.endswith(".bbe"):
                    code = _de_extend_code(_code)
                else:
                    code = _code

                # Check the code is valid before outputting it
                init_values = {var: 1 for var in variable_names}
                if code[-1].startswith("#init:"):
                    for pairing in code[-1].split(":")[1].split(","):
                        var, val = pairing.split("=")
                        init_values[var] = int(val)
                full_code = sum([[f"clear {var};"] + [f"incr {var};"] * val for var, val in init_values.items()], []) + code
                try:
                    parse_code(full_code, print_errors=False, loudness=0, timeout=3)
                except SyntacticalError as e:
                    all_valid = False
                    print(file, e)
                except _InnerCodeError as e:
                    while isinstance(e, _InnerCodeError):
                        e = e.inner_exception
                    if isinstance(e, SyntacticalError):
                        all_valid = False
                        print(file, e)
                    else:
                        print(file)
                        raise
                except ProgramError:
                    print(file)
                    raise
                else:
                    result += f"""  {{\n    "signature": "{signature}",\n    "code": "{"\\n".join(line.replace("\n", "") for line in code)}"\n  }},\n"""

            if result.endswith(",\n"):
                result = result[:-2]  # Get rid of the trailing comma
            result += "\n]"

            f = open(f"Aliases/{alias_location}.bba", "w")
            f.write(result)
            f.close()

    print("Successfully compiled all .bbas")

if __name__ == "__main__":
    generate_aliases(input("Directory to generate .bbas from relative to ./Alias definitions: "))
