clear X;
incr X;
incr X;
incr X;
incr X;
incr X;

clear Y;
incr Y;
incr Y;
incr Y;

#> Z = X - Y;
    #> Z = X;
        clear Z;
        #> Z += X;
            clear _X_holder;
            
            while X not 0 do;
                incr Z;
                incr _X_holder;
                decr X;
            end;
            
            while _X_holder not 0 do;
                incr X;
                decr _X_holder;
            end;
        #< done Z += X;
    #< done Z = X;
    #> Z -= Y;
        clear _Y_holder;
        
        while Y not 0 do;
            decr Z;
            incr _Y_holder;
            decr Y;
        end;
        
        while _Y_holder not 0 do;
            incr Y;
            decr _Y_holder;
        end;
    #< done Z -= Y;
#< done Z = X - Y;
#vars:X=5,Y=3,Z=2