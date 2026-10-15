clear X;
clear Y;

# Both false (0)
#> A = X or Y;
    #> _X_copy = X;
        clear _X_copy;
        #> _X_copy += X;
            clear _X_holder;
            
            while X not 0 do;
                incr _X_copy;
                incr _X_holder;
                decr X;
            end;
            
            while _X_holder not 0 do;
                incr X;
                decr _X_holder;
            end;
        #< done _X_copy += X;
    #< done _X_copy = X;
    #> _Y_copy = Y;
        clear _Y_copy;
        #> _Y_copy += Y;
            clear _Y_holder;
            
            while Y not 0 do;
                incr _Y_copy;
                incr _Y_holder;
                decr Y;
            end;
            
            while _Y_holder not 0 do;
                incr Y;
                decr _Y_holder;
            end;
        #< done _Y_copy += Y;
    #< done _Y_copy = Y;
    clear A;
    
    while _X_copy not 0 do;
        clear A;
        incr A;
        clear _X_copy;
    end;
    
    while _Y_copy not 0 do;
        clear A;
        incr A;
        clear _Y_copy;
    end;
#< done A = X or Y;
incr X;
# X is True (1), Y is False (0)
#> B = X or Y;
    #> _X_copy = X;
        clear _X_copy;
        #> _X_copy += X;
            clear _X_holder;
            
            while X not 0 do;
                incr _X_copy;
                incr _X_holder;
                decr X;
            end;
            
            while _X_holder not 0 do;
                incr X;
                decr _X_holder;
            end;
        #< done _X_copy += X;
    #< done _X_copy = X;
    #> _Y_copy = Y;
        clear _Y_copy;
        #> _Y_copy += Y;
            clear _Y_holder;
            
            while Y not 0 do;
                incr _Y_copy;
                incr _Y_holder;
                decr Y;
            end;
            
            while _Y_holder not 0 do;
                incr Y;
                decr _Y_holder;
            end;
        #< done _Y_copy += Y;
    #< done _Y_copy = Y;
    clear B;
    
    while _X_copy not 0 do;
        clear B;
        incr B;
        clear _X_copy;
    end;
    
    while _Y_copy not 0 do;
        clear B;
        incr B;
        clear _Y_copy;
    end;
#< done B = X or Y;
incr Y;
# Both True (1)
#> C = X or Y;
    #> _X_copy = X;
        clear _X_copy;
        #> _X_copy += X;
            clear _X_holder;
            
            while X not 0 do;
                incr _X_copy;
                incr _X_holder;
                decr X;
            end;
            
            while _X_holder not 0 do;
                incr X;
                decr _X_holder;
            end;
        #< done _X_copy += X;
    #< done _X_copy = X;
    #> _Y_copy = Y;
        clear _Y_copy;
        #> _Y_copy += Y;
            clear _Y_holder;
            
            while Y not 0 do;
                incr _Y_copy;
                incr _Y_holder;
                decr Y;
            end;
            
            while _Y_holder not 0 do;
                incr Y;
                decr _Y_holder;
            end;
        #< done _Y_copy += Y;
    #< done _Y_copy = Y;
    clear C;
    
    while _X_copy not 0 do;
        clear C;
        incr C;
        clear _X_copy;
    end;
    
    while _Y_copy not 0 do;
        clear C;
        incr C;
        clear _Y_copy;
    end;
#< done C = X or Y;
decr Y;
# X True, Y False
#> D = X or Y;
    #> _X_copy = X;
        clear _X_copy;
        #> _X_copy += X;
            clear _X_holder;
            
            while X not 0 do;
                incr _X_copy;
                incr _X_holder;
                decr X;
            end;
            
            while _X_holder not 0 do;
                incr X;
                decr _X_holder;
            end;
        #< done _X_copy += X;
    #< done _X_copy = X;
    #> _Y_copy = Y;
        clear _Y_copy;
        #> _Y_copy += Y;
            clear _Y_holder;
            
            while Y not 0 do;
                incr _Y_copy;
                incr _Y_holder;
                decr Y;
            end;
            
            while _Y_holder not 0 do;
                incr Y;
                decr _Y_holder;
            end;
        #< done _Y_copy += Y;
    #< done _Y_copy = Y;
    clear D;
    
    while _X_copy not 0 do;
        clear D;
        incr D;
        clear _X_copy;
    end;
    
    while _Y_copy not 0 do;
        clear D;
        incr D;
        clear _Y_copy;
    end;
#< done D = X or Y;
#vars:A=0,B=1,C=1,D=1,X=1,Y=0