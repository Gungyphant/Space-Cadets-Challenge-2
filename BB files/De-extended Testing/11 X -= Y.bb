clear X;
incr X;
incr X;
incr X;
incr X;
incr X;
incr X;

clear Y;
incr Y;
incr Y;

#> X -= Y;
    clear _Y_holder;
    
    while Y not 0 do;
        decr X;
        incr _Y_holder;
        decr Y;
    end;
    
    while _Y_holder not 0 do;
        incr Y;
        decr _Y_holder;
    end;
#< done X -= Y;
#vars:X=4,Y=2