# Undefined destination var:
clear Y;
incr Y;
incr Y;
incr Y;

#> X = Y;
    clear X;
    #> X += Y;
        clear _Y_holder;
        
        while Y not 0 do;
            incr X;
            incr _Y_holder;
            decr Y;
        end;
        
        while _Y_holder not 0 do;
            incr Y;
            decr _Y_holder;
        end;
    #< done X += Y;
#< done X = Y;
incr X;

# Defined destination var:
clear A;
incr A;
incr A;
incr A;
incr A;

clear B;
incr B;

#> B = A;
    clear B;
    #> B += A;
        clear _A_holder;
        
        while A not 0 do;
            incr B;
            incr _A_holder;
            decr A;
        end;
        
        while _A_holder not 0 do;
            incr A;
            decr _A_holder;
        end;
    #< done B += A;
#< done B = A;

#vars:A=4,B=4,X=4,Y=3