clear X;
#> A = X != 0;
    #> _not_A = X == 0;
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
        
        clear _not_A;
        incr _not_A;
        while _X_copy not 0 do;
            clear _not_A;
            clear _X_copy;
        end;
    #< done _not_A = X == 0;
    #> A = not _not_A;
        #> __not_A_copy = _not_A;
            clear __not_A_copy;
            #> __not_A_copy += _not_A;
                clear __not_A_holder;
                
                while _not_A not 0 do;
                    incr __not_A_copy;
                    incr __not_A_holder;
                    decr _not_A;
                end;
                
                while __not_A_holder not 0 do;
                    incr _not_A;
                    decr __not_A_holder;
                end;
            #< done __not_A_copy += _not_A;
        #< done __not_A_copy = _not_A;
        
        clear A;
        incr A;
        
        while __not_A_copy not 0 do;
            clear A;
            clear __not_A_copy;
        end;
    #< done A = not _not_A;
#< done A = X != 0;
incr X;
#> B = X != 0;
    #> _not_B = X == 0;
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
        
        clear _not_B;
        incr _not_B;
        while _X_copy not 0 do;
            clear _not_B;
            clear _X_copy;
        end;
    #< done _not_B = X == 0;
    #> B = not _not_B;
        #> __not_B_copy = _not_B;
            clear __not_B_copy;
            #> __not_B_copy += _not_B;
                clear __not_B_holder;
                
                while _not_B not 0 do;
                    incr __not_B_copy;
                    incr __not_B_holder;
                    decr _not_B;
                end;
                
                while __not_B_holder not 0 do;
                    incr _not_B;
                    decr __not_B_holder;
                end;
            #< done __not_B_copy += _not_B;
        #< done __not_B_copy = _not_B;
        
        clear B;
        incr B;
        
        while __not_B_copy not 0 do;
            clear B;
            clear __not_B_copy;
        end;
    #< done B = not _not_B;
#< done B = X != 0;
#vars:A=0,B=1,X=1