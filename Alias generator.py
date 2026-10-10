import os
import pathlib
import re
from extended import _de_extend_code

alias_location = input("Directory to generate .bba from: ")
result = "[\n"
for file in os.listdir(alias_location):
    signature = pathlib.Path(file).stem
    variable_names = re.findall(r"{(\w+)}", signature)
    if any(name in ["incr", "decr", "clear", "while", "not", "0", "do", "end"] for name in variable_names):
        is_valid_signature = False
        print(f"One or more of the parameters in the signature '{signature}' conflict with pre-existing commands and cannot be used")
        break

    filepath = os.path.join(alias_location, file)
    f = open(filepath)
    code = f.readlines()
    f.close()
    if filepath.endswith(".bbe"):
        code = _de_extend_code(code)

    result += f"""  {{
    "signature": "{signature}",
    "code": "{"\\n".join(line.replace("\n", "") for line in code)}"
  }},\n"""

result = result[:-2]  # Get rid of the trailing comma
result += "\n]"

print(result)
