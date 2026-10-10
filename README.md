Challenge 2 is to write an interpreter for Bare Bones:

> Bare Bones is the simple language that Brookshear uses in his book, 'Computer Science: an Overview', to illustrate the power of Turing complete machines and investigate the halting problem.
> 
> Bare Bones has three simple commands for manipulating a variable:
> 
> ```clear name;```
> ```incr name;```
> ```decr name;```
> ... which respectively sets variable name to zero, increments it by one and decrements it by one.
> 
> The language also contains one control sequence, a simple loop:
> 
>  
> ```while name not 0 do;```
> ```...```
> ```...```
> ```end;```
> 
> ... where name is a variable. Note that variables need not be declared before they are used and must be non-negative integers. Statements are delimited by the ; character.
> 
> Note that while loops must be terminated by an end statement, but that they can be nested.

The python interpreter has two main functions, `parse_file` and `begin_repl`. The first takes a single input, a filepath, and runs the Bare Bones program located there, and the second enters a REPL state where commands can be entered line-by-line
