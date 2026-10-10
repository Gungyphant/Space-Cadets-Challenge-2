Testing files should be regular Bare Bones programs, followed by a results line beginning 
with a #, which indicates the expected output of the program

If the program is expected to terminate successfully, the results line should begin `vars:`. 
After that, there should be a series of comma-separated variable=value pairs

For example, if the program should terminate with the variable X having a value of 3 and the 
variable Y having a value of 4, the results line should read:

```#vars:X=3,Y=4```

If the program is expected to fail with an error on a certain line, the results line 
should begin `error:`. After that, it should take the form error@line number

For example, if the program should fail with a syntactical error on line 4, the results 
line should read:

```#error:SyntacticalError@4```