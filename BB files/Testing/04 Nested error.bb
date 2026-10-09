clear Y;
incr Y;

clear X;
incr X;
incr X;
incr X;
incr X;
incr X;
while Y not 0 do;
    decr X;
end;
#Raised error ProgramError("! Within a nested code block on lines 10-12, the following error occurred:\n!     NegativeError occurred on line 1: decr X;\n!     Tried to decrement 'X' however it was already 0")