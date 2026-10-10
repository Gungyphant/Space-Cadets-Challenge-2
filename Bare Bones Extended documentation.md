## Bare Bones Extended Documentation
Bare Bones Extended files (.bbe) are similar to Bare Bones files (.bb), however they allow 
the use of custom commands defined via aliases.

These alias files (.bba) should be stored in `./Aliases` relative to the location of file 
execution.

### .bba Format

A .bba file is a JSON file comprised of an array of objects, where each object represents
one alias. These objects must have the properties `signature` and `code`.

The `signature` property stores the signature that would be written in the BBE program.
Parameters for the alias should be written in braces; they will match any variable within 
a program using the .bba. The `code` property stores the code, which should be valid BB 
code (i.e. cannot include `using`s themselves). Any variables in the `code` which match a
parameter will be replaced with whatever variable is provided to that parameter; all other
variables must be `clear`ed as in a regular BB program.

To more easily create an .bba in the correct format from a folder of files (BB or BBE), 
use Alias generator.py. Warning: despite it performing some checks, it's output should not 
be considered 100% safe to use in a .bba and certain signatures or variable names may still 
cause problems. While Alias generator.py does allow the use of aliases in its input files,
it converts them to BB files at the time of generation, rather than at the time they are 
loaded.

Note that, unlike a function in a more advanced programming language, aliases in BBE do 
not have a separate scope and accordingly if a variable in an alias shares its name with
a variable in a program the alias is used, unexpected results may occur. Accordingly,
it is recommended to prefix all variables with an _ in alias definitions, and to avoid
the prefix in BBE files. As the variable names in an alias's signature never appear in
a compiled BBE file, it doesn't matter whether they are prefixed with _ or not; built-in
aliases do not use the prefix to more clearly distinguish them from variables cleared 
within the function.

### Loading Aliases

Alias files can be loaded into a BBE program via the command `using` followed by the name of 
the alias file (excluding the filepath). For example, to load the alias file located at 
`./Aliases/maths.bba`, the following command would be used: `using maths;`

`using` commands can be placed anywhere within the BBE program, however they act 
retroactively, so to avoid confusion it is better to place them at the top of the program.

Once a command has been defined via an alias, it can be used within the program as if it 
were a standard command, e.g.

```extendedbarebones
using maths;

clear X;
incr X;
incr X;
incr X;

clear Y;
incr Y;

add X to Y into Z;
#vars:X=3,Y=2,Z=5
```

Note that, if a command is defined in multiple used aliases, the last alias to define it 
will take priority

### Running BBE files

BBE files can be run directly via the function `parse_extended_file` (or passed as strings 
to `parse_extended_code`), or compiled into a regular BB program via 
`compile_extended_file` and run via `parse_file`. Note that `parse_extended_file` compiles 
the code and runs it together, so if the BBE program will be run several times, it is 
faster to compile it to a BB file once and run that file repeatedly rather than recompiling 
every time.
