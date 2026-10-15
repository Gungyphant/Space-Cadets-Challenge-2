clear X;
clear Y;

# Both false (0)
#> A = X and Y;
    # DeMorgan's:
    #  (X and Y) = not ((not X) or (not Y))
    #> _not_X = not X;
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
        
        clear _not_X;
        incr _not_X;
        
        while _X_copy not 0 do;
            clear _not_X;
            clear _X_copy;
        end;
    #< done _not_X = not X;
    #> _not_Y = not Y;
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
        
        clear _not_Y;
        incr _not_Y;
        
        while _Y_copy not 0 do;
            clear _not_Y;
            clear _Y_copy;
        end;
    #< done _not_Y = not Y;
    #> _inner_or = _not_X or _not_Y;
        #> __not_X_copy = _not_X;
            clear __not_X_copy;
            #> __not_X_copy += _not_X;
                clear __not_X_holder;
                
                while _not_X not 0 do;
                    incr __not_X_copy;
                    incr __not_X_holder;
                    decr _not_X;
                end;
                
                while __not_X_holder not 0 do;
                    incr _not_X;
                    decr __not_X_holder;
                end;
            #< done __not_X_copy += _not_X;
        #< done __not_X_copy = _not_X;
        #> __not_Y_copy = _not_Y;
            clear __not_Y_copy;
            #> __not_Y_copy += _not_Y;
                clear __not_Y_holder;
                
                while _not_Y not 0 do;
                    incr __not_Y_copy;
                    incr __not_Y_holder;
                    decr _not_Y;
                end;
                
                while __not_Y_holder not 0 do;
                    incr _not_Y;
                    decr __not_Y_holder;
                end;
            #< done __not_Y_copy += _not_Y;
        #< done __not_Y_copy = _not_Y;
        clear _inner_or;
        
        while __not_X_copy not 0 do;
            clear _inner_or;
            incr _inner_or;
            clear __not_X_copy;
        end;
        
        while __not_Y_copy not 0 do;
            clear _inner_or;
            incr _inner_or;
            clear __not_Y_copy;
        end;
    #< done _inner_or = _not_X or _not_Y;
    #> A = not _inner_or;
        #> __inner_or_copy = _inner_or;
            clear __inner_or_copy;
            #> __inner_or_copy += _inner_or;
                clear __inner_or_holder;
                
                while _inner_or not 0 do;
                    incr __inner_or_copy;
                    incr __inner_or_holder;
                    decr _inner_or;
                end;
                
                while __inner_or_holder not 0 do;
                    incr _inner_or;
                    decr __inner_or_holder;
                end;
            #< done __inner_or_copy += _inner_or;
        #< done __inner_or_copy = _inner_or;
        
        clear A;
        incr A;
        
        while __inner_or_copy not 0 do;
            clear A;
            clear __inner_or_copy;
        end;
    #< done A = not _inner_or;
#< done A = X and Y;
incr X;
# X is True (1), Y is False (0)
#> B = X and Y;
    # DeMorgan's:
    #  (X and Y) = not ((not X) or (not Y))
    #> _not_X = not X;
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
        
        clear _not_X;
        incr _not_X;
        
        while _X_copy not 0 do;
            clear _not_X;
            clear _X_copy;
        end;
    #< done _not_X = not X;
    #> _not_Y = not Y;
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
        
        clear _not_Y;
        incr _not_Y;
        
        while _Y_copy not 0 do;
            clear _not_Y;
            clear _Y_copy;
        end;
    #< done _not_Y = not Y;
    #> _inner_or = _not_X or _not_Y;
        #> __not_X_copy = _not_X;
            clear __not_X_copy;
            #> __not_X_copy += _not_X;
                clear __not_X_holder;
                
                while _not_X not 0 do;
                    incr __not_X_copy;
                    incr __not_X_holder;
                    decr _not_X;
                end;
                
                while __not_X_holder not 0 do;
                    incr _not_X;
                    decr __not_X_holder;
                end;
            #< done __not_X_copy += _not_X;
        #< done __not_X_copy = _not_X;
        #> __not_Y_copy = _not_Y;
            clear __not_Y_copy;
            #> __not_Y_copy += _not_Y;
                clear __not_Y_holder;
                
                while _not_Y not 0 do;
                    incr __not_Y_copy;
                    incr __not_Y_holder;
                    decr _not_Y;
                end;
                
                while __not_Y_holder not 0 do;
                    incr _not_Y;
                    decr __not_Y_holder;
                end;
            #< done __not_Y_copy += _not_Y;
        #< done __not_Y_copy = _not_Y;
        clear _inner_or;
        
        while __not_X_copy not 0 do;
            clear _inner_or;
            incr _inner_or;
            clear __not_X_copy;
        end;
        
        while __not_Y_copy not 0 do;
            clear _inner_or;
            incr _inner_or;
            clear __not_Y_copy;
        end;
    #< done _inner_or = _not_X or _not_Y;
    #> B = not _inner_or;
        #> __inner_or_copy = _inner_or;
            clear __inner_or_copy;
            #> __inner_or_copy += _inner_or;
                clear __inner_or_holder;
                
                while _inner_or not 0 do;
                    incr __inner_or_copy;
                    incr __inner_or_holder;
                    decr _inner_or;
                end;
                
                while __inner_or_holder not 0 do;
                    incr _inner_or;
                    decr __inner_or_holder;
                end;
            #< done __inner_or_copy += _inner_or;
        #< done __inner_or_copy = _inner_or;
        
        clear B;
        incr B;
        
        while __inner_or_copy not 0 do;
            clear B;
            clear __inner_or_copy;
        end;
    #< done B = not _inner_or;
#< done B = X and Y;
incr Y;
# Both True (1)
#> C = X and Y;
    # DeMorgan's:
    #  (X and Y) = not ((not X) or (not Y))
    #> _not_X = not X;
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
        
        clear _not_X;
        incr _not_X;
        
        while _X_copy not 0 do;
            clear _not_X;
            clear _X_copy;
        end;
    #< done _not_X = not X;
    #> _not_Y = not Y;
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
        
        clear _not_Y;
        incr _not_Y;
        
        while _Y_copy not 0 do;
            clear _not_Y;
            clear _Y_copy;
        end;
    #< done _not_Y = not Y;
    #> _inner_or = _not_X or _not_Y;
        #> __not_X_copy = _not_X;
            clear __not_X_copy;
            #> __not_X_copy += _not_X;
                clear __not_X_holder;
                
                while _not_X not 0 do;
                    incr __not_X_copy;
                    incr __not_X_holder;
                    decr _not_X;
                end;
                
                while __not_X_holder not 0 do;
                    incr _not_X;
                    decr __not_X_holder;
                end;
            #< done __not_X_copy += _not_X;
        #< done __not_X_copy = _not_X;
        #> __not_Y_copy = _not_Y;
            clear __not_Y_copy;
            #> __not_Y_copy += _not_Y;
                clear __not_Y_holder;
                
                while _not_Y not 0 do;
                    incr __not_Y_copy;
                    incr __not_Y_holder;
                    decr _not_Y;
                end;
                
                while __not_Y_holder not 0 do;
                    incr _not_Y;
                    decr __not_Y_holder;
                end;
            #< done __not_Y_copy += _not_Y;
        #< done __not_Y_copy = _not_Y;
        clear _inner_or;
        
        while __not_X_copy not 0 do;
            clear _inner_or;
            incr _inner_or;
            clear __not_X_copy;
        end;
        
        while __not_Y_copy not 0 do;
            clear _inner_or;
            incr _inner_or;
            clear __not_Y_copy;
        end;
    #< done _inner_or = _not_X or _not_Y;
    #> C = not _inner_or;
        #> __inner_or_copy = _inner_or;
            clear __inner_or_copy;
            #> __inner_or_copy += _inner_or;
                clear __inner_or_holder;
                
                while _inner_or not 0 do;
                    incr __inner_or_copy;
                    incr __inner_or_holder;
                    decr _inner_or;
                end;
                
                while __inner_or_holder not 0 do;
                    incr _inner_or;
                    decr __inner_or_holder;
                end;
            #< done __inner_or_copy += _inner_or;
        #< done __inner_or_copy = _inner_or;
        
        clear C;
        incr C;
        
        while __inner_or_copy not 0 do;
            clear C;
            clear __inner_or_copy;
        end;
    #< done C = not _inner_or;
#< done C = X and Y;
decr Y;
# X True, Y False
#> D = X and Y;
    # DeMorgan's:
    #  (X and Y) = not ((not X) or (not Y))
    #> _not_X = not X;
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
        
        clear _not_X;
        incr _not_X;
        
        while _X_copy not 0 do;
            clear _not_X;
            clear _X_copy;
        end;
    #< done _not_X = not X;
    #> _not_Y = not Y;
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
        
        clear _not_Y;
        incr _not_Y;
        
        while _Y_copy not 0 do;
            clear _not_Y;
            clear _Y_copy;
        end;
    #< done _not_Y = not Y;
    #> _inner_or = _not_X or _not_Y;
        #> __not_X_copy = _not_X;
            clear __not_X_copy;
            #> __not_X_copy += _not_X;
                clear __not_X_holder;
                
                while _not_X not 0 do;
                    incr __not_X_copy;
                    incr __not_X_holder;
                    decr _not_X;
                end;
                
                while __not_X_holder not 0 do;
                    incr _not_X;
                    decr __not_X_holder;
                end;
            #< done __not_X_copy += _not_X;
        #< done __not_X_copy = _not_X;
        #> __not_Y_copy = _not_Y;
            clear __not_Y_copy;
            #> __not_Y_copy += _not_Y;
                clear __not_Y_holder;
                
                while _not_Y not 0 do;
                    incr __not_Y_copy;
                    incr __not_Y_holder;
                    decr _not_Y;
                end;
                
                while __not_Y_holder not 0 do;
                    incr _not_Y;
                    decr __not_Y_holder;
                end;
            #< done __not_Y_copy += _not_Y;
        #< done __not_Y_copy = _not_Y;
        clear _inner_or;
        
        while __not_X_copy not 0 do;
            clear _inner_or;
            incr _inner_or;
            clear __not_X_copy;
        end;
        
        while __not_Y_copy not 0 do;
            clear _inner_or;
            incr _inner_or;
            clear __not_Y_copy;
        end;
    #< done _inner_or = _not_X or _not_Y;
    #> D = not _inner_or;
        #> __inner_or_copy = _inner_or;
            clear __inner_or_copy;
            #> __inner_or_copy += _inner_or;
                clear __inner_or_holder;
                
                while _inner_or not 0 do;
                    incr __inner_or_copy;
                    incr __inner_or_holder;
                    decr _inner_or;
                end;
                
                while __inner_or_holder not 0 do;
                    incr _inner_or;
                    decr __inner_or_holder;
                end;
            #< done __inner_or_copy += _inner_or;
        #< done __inner_or_copy = _inner_or;
        
        clear D;
        incr D;
        
        while __inner_or_copy not 0 do;
            clear D;
            clear __inner_or_copy;
        end;
    #< done D = not _inner_or;
#< done D = X and Y;
#vars:A=0,B=0,C=1,D=0,X=1,Y=0