clear X;
incr X;
incr X;
incr X;

clear Y;
incr Y;
incr Y;

#> Z = X + Y;
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
    clear Z;
    #> Z += _X_copy;
        clear __X_copy_holder;
        
        while _X_copy not 0 do;
            incr Z;
            incr __X_copy_holder;
            decr _X_copy;
        end;
        
        while __X_copy_holder not 0 do;
            incr _X_copy;
            decr __X_copy_holder;
        end;
    #< done Z += _X_copy;
    #> Z += _Y_copy;
        clear __Y_copy_holder;
        
        while _Y_copy not 0 do;
            incr Z;
            incr __Y_copy_holder;
            decr _Y_copy;
        end;
        
        while __Y_copy_holder not 0 do;
            incr _Y_copy;
            decr __Y_copy_holder;
        end;
    #< done Z += _Y_copy;
#< done Z = X + Y;
#vars:X=3,Y=2,Z=5