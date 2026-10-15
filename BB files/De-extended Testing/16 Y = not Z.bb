clear X;
#> A = not X;
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
    
    clear A;
    incr A;
    
    while _X_copy not 0 do;
        clear A;
        clear _X_copy;
    end;
#< done A = not X;
incr X;
#> B = not X;
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
    
    clear B;
    incr B;
    
    while _X_copy not 0 do;
        clear B;
        clear _X_copy;
    end;
#< done B = not X;
#vars:A=1,B=0,X=1