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

#> A = abs(X - Y);
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
    
    #> _X_copy_ne_zero = _X_copy != 0;
        #> _not__X_copy_ne_zero = _X_copy == 0;
            #> __X_copy_copy = _X_copy;
                clear __X_copy_copy;
                #> __X_copy_copy += _X_copy;
                    clear __X_copy_holder;
                    
                    while _X_copy not 0 do;
                        incr __X_copy_copy;
                        incr __X_copy_holder;
                        decr _X_copy;
                    end;
                    
                    while __X_copy_holder not 0 do;
                        incr _X_copy;
                        decr __X_copy_holder;
                    end;
                #< done __X_copy_copy += _X_copy;
            #< done __X_copy_copy = _X_copy;
            
            clear _not__X_copy_ne_zero;
            incr _not__X_copy_ne_zero;
            while __X_copy_copy not 0 do;
                clear _not__X_copy_ne_zero;
                clear __X_copy_copy;
            end;
        #< done _not__X_copy_ne_zero = _X_copy == 0;
        #> _X_copy_ne_zero = not _not__X_copy_ne_zero;
            #> __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                clear __not__X_copy_ne_zero_copy;
                #> __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_holder;
                    
                    while _not__X_copy_ne_zero not 0 do;
                        incr __not__X_copy_ne_zero_copy;
                        incr __not__X_copy_ne_zero_holder;
                        decr _not__X_copy_ne_zero;
                    end;
                    
                    while __not__X_copy_ne_zero_holder not 0 do;
                        incr _not__X_copy_ne_zero;
                        decr __not__X_copy_ne_zero_holder;
                    end;
                #< done __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
            #< done __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
            
            clear _X_copy_ne_zero;
            incr _X_copy_ne_zero;
            
            while __not__X_copy_ne_zero_copy not 0 do;
                clear _X_copy_ne_zero;
                clear __not__X_copy_ne_zero_copy;
            end;
        #< done _X_copy_ne_zero = not _not__X_copy_ne_zero;
    #< done _X_copy_ne_zero = _X_copy != 0;
    #> _Y_copy_ne_zero = _Y_copy != 0;
        #> _not__Y_copy_ne_zero = _Y_copy == 0;
            #> __Y_copy_copy = _Y_copy;
                clear __Y_copy_copy;
                #> __Y_copy_copy += _Y_copy;
                    clear __Y_copy_holder;
                    
                    while _Y_copy not 0 do;
                        incr __Y_copy_copy;
                        incr __Y_copy_holder;
                        decr _Y_copy;
                    end;
                    
                    while __Y_copy_holder not 0 do;
                        incr _Y_copy;
                        decr __Y_copy_holder;
                    end;
                #< done __Y_copy_copy += _Y_copy;
            #< done __Y_copy_copy = _Y_copy;
            
            clear _not__Y_copy_ne_zero;
            incr _not__Y_copy_ne_zero;
            while __Y_copy_copy not 0 do;
                clear _not__Y_copy_ne_zero;
                clear __Y_copy_copy;
            end;
        #< done _not__Y_copy_ne_zero = _Y_copy == 0;
        #> _Y_copy_ne_zero = not _not__Y_copy_ne_zero;
            #> __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                clear __not__Y_copy_ne_zero_copy;
                #> __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_holder;
                    
                    while _not__Y_copy_ne_zero not 0 do;
                        incr __not__Y_copy_ne_zero_copy;
                        incr __not__Y_copy_ne_zero_holder;
                        decr _not__Y_copy_ne_zero;
                    end;
                    
                    while __not__Y_copy_ne_zero_holder not 0 do;
                        incr _not__Y_copy_ne_zero;
                        decr __not__Y_copy_ne_zero_holder;
                    end;
                #< done __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
            #< done __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
            
            clear _Y_copy_ne_zero;
            incr _Y_copy_ne_zero;
            
            while __not__Y_copy_ne_zero_copy not 0 do;
                clear _Y_copy_ne_zero;
                clear __not__Y_copy_ne_zero_copy;
            end;
        #< done _Y_copy_ne_zero = not _not__Y_copy_ne_zero;
    #< done _Y_copy_ne_zero = _Y_copy != 0;
    #> _neither_are_zero = _Y_copy_ne_zero and _X_copy_ne_zero;
        # DeMorgan's:
        #  (X and Y) = not ((not X) or (not Y))
        #> _not__Y_copy_ne_zero = not _Y_copy_ne_zero;
            #> __Y_copy_ne_zero_copy = _Y_copy_ne_zero;
                clear __Y_copy_ne_zero_copy;
                #> __Y_copy_ne_zero_copy += _Y_copy_ne_zero;
                    clear __Y_copy_ne_zero_holder;
                    
                    while _Y_copy_ne_zero not 0 do;
                        incr __Y_copy_ne_zero_copy;
                        incr __Y_copy_ne_zero_holder;
                        decr _Y_copy_ne_zero;
                    end;
                    
                    while __Y_copy_ne_zero_holder not 0 do;
                        incr _Y_copy_ne_zero;
                        decr __Y_copy_ne_zero_holder;
                    end;
                #< done __Y_copy_ne_zero_copy += _Y_copy_ne_zero;
            #< done __Y_copy_ne_zero_copy = _Y_copy_ne_zero;
            
            clear _not__Y_copy_ne_zero;
            incr _not__Y_copy_ne_zero;
            
            while __Y_copy_ne_zero_copy not 0 do;
                clear _not__Y_copy_ne_zero;
                clear __Y_copy_ne_zero_copy;
            end;
        #< done _not__Y_copy_ne_zero = not _Y_copy_ne_zero;
        #> _not__X_copy_ne_zero = not _X_copy_ne_zero;
            #> __X_copy_ne_zero_copy = _X_copy_ne_zero;
                clear __X_copy_ne_zero_copy;
                #> __X_copy_ne_zero_copy += _X_copy_ne_zero;
                    clear __X_copy_ne_zero_holder;
                    
                    while _X_copy_ne_zero not 0 do;
                        incr __X_copy_ne_zero_copy;
                        incr __X_copy_ne_zero_holder;
                        decr _X_copy_ne_zero;
                    end;
                    
                    while __X_copy_ne_zero_holder not 0 do;
                        incr _X_copy_ne_zero;
                        decr __X_copy_ne_zero_holder;
                    end;
                #< done __X_copy_ne_zero_copy += _X_copy_ne_zero;
            #< done __X_copy_ne_zero_copy = _X_copy_ne_zero;
            
            clear _not__X_copy_ne_zero;
            incr _not__X_copy_ne_zero;
            
            while __X_copy_ne_zero_copy not 0 do;
                clear _not__X_copy_ne_zero;
                clear __X_copy_ne_zero_copy;
            end;
        #< done _not__X_copy_ne_zero = not _X_copy_ne_zero;
        #> _inner_or = _not__Y_copy_ne_zero or _not__X_copy_ne_zero;
            #> __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                clear __not__Y_copy_ne_zero_copy;
                #> __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_holder;
                    
                    while _not__Y_copy_ne_zero not 0 do;
                        incr __not__Y_copy_ne_zero_copy;
                        incr __not__Y_copy_ne_zero_holder;
                        decr _not__Y_copy_ne_zero;
                    end;
                    
                    while __not__Y_copy_ne_zero_holder not 0 do;
                        incr _not__Y_copy_ne_zero;
                        decr __not__Y_copy_ne_zero_holder;
                    end;
                #< done __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
            #< done __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
            #> __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                clear __not__X_copy_ne_zero_copy;
                #> __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_holder;
                    
                    while _not__X_copy_ne_zero not 0 do;
                        incr __not__X_copy_ne_zero_copy;
                        incr __not__X_copy_ne_zero_holder;
                        decr _not__X_copy_ne_zero;
                    end;
                    
                    while __not__X_copy_ne_zero_holder not 0 do;
                        incr _not__X_copy_ne_zero;
                        decr __not__X_copy_ne_zero_holder;
                    end;
                #< done __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
            #< done __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
            clear _inner_or;
            
            while __not__Y_copy_ne_zero_copy not 0 do;
                clear _inner_or;
                incr _inner_or;
                clear __not__Y_copy_ne_zero_copy;
            end;
            
            while __not__X_copy_ne_zero_copy not 0 do;
                clear _inner_or;
                incr _inner_or;
                clear __not__X_copy_ne_zero_copy;
            end;
        #< done _inner_or = _not__Y_copy_ne_zero or _not__X_copy_ne_zero;
        #> _neither_are_zero = not _inner_or;
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
            
            clear _neither_are_zero;
            incr _neither_are_zero;
            
            while __inner_or_copy not 0 do;
                clear _neither_are_zero;
                clear __inner_or_copy;
            end;
        #< done _neither_are_zero = not _inner_or;
    #< done _neither_are_zero = _Y_copy_ne_zero and _X_copy_ne_zero;
    while _neither_are_zero not 0 do;
        decr _X_copy;
        decr _Y_copy;
        
        #> _X_copy_ne_zero = _X_copy != 0;
            #> _not__X_copy_ne_zero = _X_copy == 0;
                #> __X_copy_copy = _X_copy;
                    clear __X_copy_copy;
                    #> __X_copy_copy += _X_copy;
                        clear __X_copy_holder;
                        
                        while _X_copy not 0 do;
                            incr __X_copy_copy;
                            incr __X_copy_holder;
                            decr _X_copy;
                        end;
                        
                        while __X_copy_holder not 0 do;
                            incr _X_copy;
                            decr __X_copy_holder;
                        end;
                    #< done __X_copy_copy += _X_copy;
                #< done __X_copy_copy = _X_copy;
                
                clear _not__X_copy_ne_zero;
                incr _not__X_copy_ne_zero;
                while __X_copy_copy not 0 do;
                    clear _not__X_copy_ne_zero;
                    clear __X_copy_copy;
                end;
            #< done _not__X_copy_ne_zero = _X_copy == 0;
            #> _X_copy_ne_zero = not _not__X_copy_ne_zero;
                #> __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_copy;
                    #> __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                        clear __not__X_copy_ne_zero_holder;
                        
                        while _not__X_copy_ne_zero not 0 do;
                            incr __not__X_copy_ne_zero_copy;
                            incr __not__X_copy_ne_zero_holder;
                            decr _not__X_copy_ne_zero;
                        end;
                        
                        while __not__X_copy_ne_zero_holder not 0 do;
                            incr _not__X_copy_ne_zero;
                            decr __not__X_copy_ne_zero_holder;
                        end;
                    #< done __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                #< done __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                
                clear _X_copy_ne_zero;
                incr _X_copy_ne_zero;
                
                while __not__X_copy_ne_zero_copy not 0 do;
                    clear _X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_copy;
                end;
            #< done _X_copy_ne_zero = not _not__X_copy_ne_zero;
        #< done _X_copy_ne_zero = _X_copy != 0;
        #> _Y_copy_ne_zero = _Y_copy != 0;
            #> _not__Y_copy_ne_zero = _Y_copy == 0;
                #> __Y_copy_copy = _Y_copy;
                    clear __Y_copy_copy;
                    #> __Y_copy_copy += _Y_copy;
                        clear __Y_copy_holder;
                        
                        while _Y_copy not 0 do;
                            incr __Y_copy_copy;
                            incr __Y_copy_holder;
                            decr _Y_copy;
                        end;
                        
                        while __Y_copy_holder not 0 do;
                            incr _Y_copy;
                            decr __Y_copy_holder;
                        end;
                    #< done __Y_copy_copy += _Y_copy;
                #< done __Y_copy_copy = _Y_copy;
                
                clear _not__Y_copy_ne_zero;
                incr _not__Y_copy_ne_zero;
                while __Y_copy_copy not 0 do;
                    clear _not__Y_copy_ne_zero;
                    clear __Y_copy_copy;
                end;
            #< done _not__Y_copy_ne_zero = _Y_copy == 0;
            #> _Y_copy_ne_zero = not _not__Y_copy_ne_zero;
                #> __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_copy;
                    #> __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                        clear __not__Y_copy_ne_zero_holder;
                        
                        while _not__Y_copy_ne_zero not 0 do;
                            incr __not__Y_copy_ne_zero_copy;
                            incr __not__Y_copy_ne_zero_holder;
                            decr _not__Y_copy_ne_zero;
                        end;
                        
                        while __not__Y_copy_ne_zero_holder not 0 do;
                            incr _not__Y_copy_ne_zero;
                            decr __not__Y_copy_ne_zero_holder;
                        end;
                    #< done __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                #< done __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                
                clear _Y_copy_ne_zero;
                incr _Y_copy_ne_zero;
                
                while __not__Y_copy_ne_zero_copy not 0 do;
                    clear _Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_copy;
                end;
            #< done _Y_copy_ne_zero = not _not__Y_copy_ne_zero;
        #< done _Y_copy_ne_zero = _Y_copy != 0;
        #> _neither_are_zero = _Y_copy_ne_zero and _X_copy_ne_zero;
            # DeMorgan's:
            #  (X and Y) = not ((not X) or (not Y))
            #> _not__Y_copy_ne_zero = not _Y_copy_ne_zero;
                #> __Y_copy_ne_zero_copy = _Y_copy_ne_zero;
                    clear __Y_copy_ne_zero_copy;
                    #> __Y_copy_ne_zero_copy += _Y_copy_ne_zero;
                        clear __Y_copy_ne_zero_holder;
                        
                        while _Y_copy_ne_zero not 0 do;
                            incr __Y_copy_ne_zero_copy;
                            incr __Y_copy_ne_zero_holder;
                            decr _Y_copy_ne_zero;
                        end;
                        
                        while __Y_copy_ne_zero_holder not 0 do;
                            incr _Y_copy_ne_zero;
                            decr __Y_copy_ne_zero_holder;
                        end;
                    #< done __Y_copy_ne_zero_copy += _Y_copy_ne_zero;
                #< done __Y_copy_ne_zero_copy = _Y_copy_ne_zero;
                
                clear _not__Y_copy_ne_zero;
                incr _not__Y_copy_ne_zero;
                
                while __Y_copy_ne_zero_copy not 0 do;
                    clear _not__Y_copy_ne_zero;
                    clear __Y_copy_ne_zero_copy;
                end;
            #< done _not__Y_copy_ne_zero = not _Y_copy_ne_zero;
            #> _not__X_copy_ne_zero = not _X_copy_ne_zero;
                #> __X_copy_ne_zero_copy = _X_copy_ne_zero;
                    clear __X_copy_ne_zero_copy;
                    #> __X_copy_ne_zero_copy += _X_copy_ne_zero;
                        clear __X_copy_ne_zero_holder;
                        
                        while _X_copy_ne_zero not 0 do;
                            incr __X_copy_ne_zero_copy;
                            incr __X_copy_ne_zero_holder;
                            decr _X_copy_ne_zero;
                        end;
                        
                        while __X_copy_ne_zero_holder not 0 do;
                            incr _X_copy_ne_zero;
                            decr __X_copy_ne_zero_holder;
                        end;
                    #< done __X_copy_ne_zero_copy += _X_copy_ne_zero;
                #< done __X_copy_ne_zero_copy = _X_copy_ne_zero;
                
                clear _not__X_copy_ne_zero;
                incr _not__X_copy_ne_zero;
                
                while __X_copy_ne_zero_copy not 0 do;
                    clear _not__X_copy_ne_zero;
                    clear __X_copy_ne_zero_copy;
                end;
            #< done _not__X_copy_ne_zero = not _X_copy_ne_zero;
            #> _inner_or = _not__Y_copy_ne_zero or _not__X_copy_ne_zero;
                #> __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_copy;
                    #> __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                        clear __not__Y_copy_ne_zero_holder;
                        
                        while _not__Y_copy_ne_zero not 0 do;
                            incr __not__Y_copy_ne_zero_copy;
                            incr __not__Y_copy_ne_zero_holder;
                            decr _not__Y_copy_ne_zero;
                        end;
                        
                        while __not__Y_copy_ne_zero_holder not 0 do;
                            incr _not__Y_copy_ne_zero;
                            decr __not__Y_copy_ne_zero_holder;
                        end;
                    #< done __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                #< done __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                #> __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_copy;
                    #> __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                        clear __not__X_copy_ne_zero_holder;
                        
                        while _not__X_copy_ne_zero not 0 do;
                            incr __not__X_copy_ne_zero_copy;
                            incr __not__X_copy_ne_zero_holder;
                            decr _not__X_copy_ne_zero;
                        end;
                        
                        while __not__X_copy_ne_zero_holder not 0 do;
                            incr _not__X_copy_ne_zero;
                            decr __not__X_copy_ne_zero_holder;
                        end;
                    #< done __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                #< done __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                clear _inner_or;
                
                while __not__Y_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not__Y_copy_ne_zero_copy;
                end;
                
                while __not__X_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not__X_copy_ne_zero_copy;
                end;
            #< done _inner_or = _not__Y_copy_ne_zero or _not__X_copy_ne_zero;
            #> _neither_are_zero = not _inner_or;
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
                
                clear _neither_are_zero;
                incr _neither_are_zero;
                
                while __inner_or_copy not 0 do;
                    clear _neither_are_zero;
                    clear __inner_or_copy;
                end;
            #< done _neither_are_zero = not _inner_or;
        #< done _neither_are_zero = _Y_copy_ne_zero and _X_copy_ne_zero;
    end;
    
    
    clear A;
    
    while _Y_copy_ne_zero not 0 do;
        # _Y_copy_ne_zero is True, so Y must be the larger
        #> A = _Y_copy;
            clear A;
            #> A += _Y_copy;
                clear __Y_copy_holder;
                
                while _Y_copy not 0 do;
                    incr A;
                    incr __Y_copy_holder;
                    decr _Y_copy;
                end;
                
                while __Y_copy_holder not 0 do;
                    incr _Y_copy;
                    decr __Y_copy_holder;
                end;
            #< done A += _Y_copy;
        #< done A = _Y_copy;
        clear _Y_copy_ne_zero;
    end;
    
    while _X_copy_ne_zero not 0 do;
        # _X_copy_ne_zero is True, so X must be the larger
        #> A = _X_copy;
            clear A;
            #> A += _X_copy;
                clear __X_copy_holder;
                
                while _X_copy not 0 do;
                    incr A;
                    incr __X_copy_holder;
                    decr _X_copy;
                end;
                
                while __X_copy_holder not 0 do;
                    incr _X_copy;
                    decr __X_copy_holder;
                end;
            #< done A += _X_copy;
        #< done A = _X_copy;
        clear _X_copy_ne_zero;
    end;
#< done A = abs(X - Y);
#> B = abs(Y - X);
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
    
    #> _Y_copy_ne_zero = _Y_copy != 0;
        #> _not__Y_copy_ne_zero = _Y_copy == 0;
            #> __Y_copy_copy = _Y_copy;
                clear __Y_copy_copy;
                #> __Y_copy_copy += _Y_copy;
                    clear __Y_copy_holder;
                    
                    while _Y_copy not 0 do;
                        incr __Y_copy_copy;
                        incr __Y_copy_holder;
                        decr _Y_copy;
                    end;
                    
                    while __Y_copy_holder not 0 do;
                        incr _Y_copy;
                        decr __Y_copy_holder;
                    end;
                #< done __Y_copy_copy += _Y_copy;
            #< done __Y_copy_copy = _Y_copy;
            
            clear _not__Y_copy_ne_zero;
            incr _not__Y_copy_ne_zero;
            while __Y_copy_copy not 0 do;
                clear _not__Y_copy_ne_zero;
                clear __Y_copy_copy;
            end;
        #< done _not__Y_copy_ne_zero = _Y_copy == 0;
        #> _Y_copy_ne_zero = not _not__Y_copy_ne_zero;
            #> __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                clear __not__Y_copy_ne_zero_copy;
                #> __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_holder;
                    
                    while _not__Y_copy_ne_zero not 0 do;
                        incr __not__Y_copy_ne_zero_copy;
                        incr __not__Y_copy_ne_zero_holder;
                        decr _not__Y_copy_ne_zero;
                    end;
                    
                    while __not__Y_copy_ne_zero_holder not 0 do;
                        incr _not__Y_copy_ne_zero;
                        decr __not__Y_copy_ne_zero_holder;
                    end;
                #< done __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
            #< done __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
            
            clear _Y_copy_ne_zero;
            incr _Y_copy_ne_zero;
            
            while __not__Y_copy_ne_zero_copy not 0 do;
                clear _Y_copy_ne_zero;
                clear __not__Y_copy_ne_zero_copy;
            end;
        #< done _Y_copy_ne_zero = not _not__Y_copy_ne_zero;
    #< done _Y_copy_ne_zero = _Y_copy != 0;
    #> _X_copy_ne_zero = _X_copy != 0;
        #> _not__X_copy_ne_zero = _X_copy == 0;
            #> __X_copy_copy = _X_copy;
                clear __X_copy_copy;
                #> __X_copy_copy += _X_copy;
                    clear __X_copy_holder;
                    
                    while _X_copy not 0 do;
                        incr __X_copy_copy;
                        incr __X_copy_holder;
                        decr _X_copy;
                    end;
                    
                    while __X_copy_holder not 0 do;
                        incr _X_copy;
                        decr __X_copy_holder;
                    end;
                #< done __X_copy_copy += _X_copy;
            #< done __X_copy_copy = _X_copy;
            
            clear _not__X_copy_ne_zero;
            incr _not__X_copy_ne_zero;
            while __X_copy_copy not 0 do;
                clear _not__X_copy_ne_zero;
                clear __X_copy_copy;
            end;
        #< done _not__X_copy_ne_zero = _X_copy == 0;
        #> _X_copy_ne_zero = not _not__X_copy_ne_zero;
            #> __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                clear __not__X_copy_ne_zero_copy;
                #> __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_holder;
                    
                    while _not__X_copy_ne_zero not 0 do;
                        incr __not__X_copy_ne_zero_copy;
                        incr __not__X_copy_ne_zero_holder;
                        decr _not__X_copy_ne_zero;
                    end;
                    
                    while __not__X_copy_ne_zero_holder not 0 do;
                        incr _not__X_copy_ne_zero;
                        decr __not__X_copy_ne_zero_holder;
                    end;
                #< done __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
            #< done __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
            
            clear _X_copy_ne_zero;
            incr _X_copy_ne_zero;
            
            while __not__X_copy_ne_zero_copy not 0 do;
                clear _X_copy_ne_zero;
                clear __not__X_copy_ne_zero_copy;
            end;
        #< done _X_copy_ne_zero = not _not__X_copy_ne_zero;
    #< done _X_copy_ne_zero = _X_copy != 0;
    #> _neither_are_zero = _X_copy_ne_zero and _Y_copy_ne_zero;
        # DeMorgan's:
        #  (X and Y) = not ((not X) or (not Y))
        #> _not__X_copy_ne_zero = not _X_copy_ne_zero;
            #> __X_copy_ne_zero_copy = _X_copy_ne_zero;
                clear __X_copy_ne_zero_copy;
                #> __X_copy_ne_zero_copy += _X_copy_ne_zero;
                    clear __X_copy_ne_zero_holder;
                    
                    while _X_copy_ne_zero not 0 do;
                        incr __X_copy_ne_zero_copy;
                        incr __X_copy_ne_zero_holder;
                        decr _X_copy_ne_zero;
                    end;
                    
                    while __X_copy_ne_zero_holder not 0 do;
                        incr _X_copy_ne_zero;
                        decr __X_copy_ne_zero_holder;
                    end;
                #< done __X_copy_ne_zero_copy += _X_copy_ne_zero;
            #< done __X_copy_ne_zero_copy = _X_copy_ne_zero;
            
            clear _not__X_copy_ne_zero;
            incr _not__X_copy_ne_zero;
            
            while __X_copy_ne_zero_copy not 0 do;
                clear _not__X_copy_ne_zero;
                clear __X_copy_ne_zero_copy;
            end;
        #< done _not__X_copy_ne_zero = not _X_copy_ne_zero;
        #> _not__Y_copy_ne_zero = not _Y_copy_ne_zero;
            #> __Y_copy_ne_zero_copy = _Y_copy_ne_zero;
                clear __Y_copy_ne_zero_copy;
                #> __Y_copy_ne_zero_copy += _Y_copy_ne_zero;
                    clear __Y_copy_ne_zero_holder;
                    
                    while _Y_copy_ne_zero not 0 do;
                        incr __Y_copy_ne_zero_copy;
                        incr __Y_copy_ne_zero_holder;
                        decr _Y_copy_ne_zero;
                    end;
                    
                    while __Y_copy_ne_zero_holder not 0 do;
                        incr _Y_copy_ne_zero;
                        decr __Y_copy_ne_zero_holder;
                    end;
                #< done __Y_copy_ne_zero_copy += _Y_copy_ne_zero;
            #< done __Y_copy_ne_zero_copy = _Y_copy_ne_zero;
            
            clear _not__Y_copy_ne_zero;
            incr _not__Y_copy_ne_zero;
            
            while __Y_copy_ne_zero_copy not 0 do;
                clear _not__Y_copy_ne_zero;
                clear __Y_copy_ne_zero_copy;
            end;
        #< done _not__Y_copy_ne_zero = not _Y_copy_ne_zero;
        #> _inner_or = _not__X_copy_ne_zero or _not__Y_copy_ne_zero;
            #> __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                clear __not__X_copy_ne_zero_copy;
                #> __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_holder;
                    
                    while _not__X_copy_ne_zero not 0 do;
                        incr __not__X_copy_ne_zero_copy;
                        incr __not__X_copy_ne_zero_holder;
                        decr _not__X_copy_ne_zero;
                    end;
                    
                    while __not__X_copy_ne_zero_holder not 0 do;
                        incr _not__X_copy_ne_zero;
                        decr __not__X_copy_ne_zero_holder;
                    end;
                #< done __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
            #< done __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
            #> __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                clear __not__Y_copy_ne_zero_copy;
                #> __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_holder;
                    
                    while _not__Y_copy_ne_zero not 0 do;
                        incr __not__Y_copy_ne_zero_copy;
                        incr __not__Y_copy_ne_zero_holder;
                        decr _not__Y_copy_ne_zero;
                    end;
                    
                    while __not__Y_copy_ne_zero_holder not 0 do;
                        incr _not__Y_copy_ne_zero;
                        decr __not__Y_copy_ne_zero_holder;
                    end;
                #< done __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
            #< done __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
            clear _inner_or;
            
            while __not__X_copy_ne_zero_copy not 0 do;
                clear _inner_or;
                incr _inner_or;
                clear __not__X_copy_ne_zero_copy;
            end;
            
            while __not__Y_copy_ne_zero_copy not 0 do;
                clear _inner_or;
                incr _inner_or;
                clear __not__Y_copy_ne_zero_copy;
            end;
        #< done _inner_or = _not__X_copy_ne_zero or _not__Y_copy_ne_zero;
        #> _neither_are_zero = not _inner_or;
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
            
            clear _neither_are_zero;
            incr _neither_are_zero;
            
            while __inner_or_copy not 0 do;
                clear _neither_are_zero;
                clear __inner_or_copy;
            end;
        #< done _neither_are_zero = not _inner_or;
    #< done _neither_are_zero = _X_copy_ne_zero and _Y_copy_ne_zero;
    while _neither_are_zero not 0 do;
        decr _Y_copy;
        decr _X_copy;
        
        #> _Y_copy_ne_zero = _Y_copy != 0;
            #> _not__Y_copy_ne_zero = _Y_copy == 0;
                #> __Y_copy_copy = _Y_copy;
                    clear __Y_copy_copy;
                    #> __Y_copy_copy += _Y_copy;
                        clear __Y_copy_holder;
                        
                        while _Y_copy not 0 do;
                            incr __Y_copy_copy;
                            incr __Y_copy_holder;
                            decr _Y_copy;
                        end;
                        
                        while __Y_copy_holder not 0 do;
                            incr _Y_copy;
                            decr __Y_copy_holder;
                        end;
                    #< done __Y_copy_copy += _Y_copy;
                #< done __Y_copy_copy = _Y_copy;
                
                clear _not__Y_copy_ne_zero;
                incr _not__Y_copy_ne_zero;
                while __Y_copy_copy not 0 do;
                    clear _not__Y_copy_ne_zero;
                    clear __Y_copy_copy;
                end;
            #< done _not__Y_copy_ne_zero = _Y_copy == 0;
            #> _Y_copy_ne_zero = not _not__Y_copy_ne_zero;
                #> __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_copy;
                    #> __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                        clear __not__Y_copy_ne_zero_holder;
                        
                        while _not__Y_copy_ne_zero not 0 do;
                            incr __not__Y_copy_ne_zero_copy;
                            incr __not__Y_copy_ne_zero_holder;
                            decr _not__Y_copy_ne_zero;
                        end;
                        
                        while __not__Y_copy_ne_zero_holder not 0 do;
                            incr _not__Y_copy_ne_zero;
                            decr __not__Y_copy_ne_zero_holder;
                        end;
                    #< done __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                #< done __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                
                clear _Y_copy_ne_zero;
                incr _Y_copy_ne_zero;
                
                while __not__Y_copy_ne_zero_copy not 0 do;
                    clear _Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_copy;
                end;
            #< done _Y_copy_ne_zero = not _not__Y_copy_ne_zero;
        #< done _Y_copy_ne_zero = _Y_copy != 0;
        #> _X_copy_ne_zero = _X_copy != 0;
            #> _not__X_copy_ne_zero = _X_copy == 0;
                #> __X_copy_copy = _X_copy;
                    clear __X_copy_copy;
                    #> __X_copy_copy += _X_copy;
                        clear __X_copy_holder;
                        
                        while _X_copy not 0 do;
                            incr __X_copy_copy;
                            incr __X_copy_holder;
                            decr _X_copy;
                        end;
                        
                        while __X_copy_holder not 0 do;
                            incr _X_copy;
                            decr __X_copy_holder;
                        end;
                    #< done __X_copy_copy += _X_copy;
                #< done __X_copy_copy = _X_copy;
                
                clear _not__X_copy_ne_zero;
                incr _not__X_copy_ne_zero;
                while __X_copy_copy not 0 do;
                    clear _not__X_copy_ne_zero;
                    clear __X_copy_copy;
                end;
            #< done _not__X_copy_ne_zero = _X_copy == 0;
            #> _X_copy_ne_zero = not _not__X_copy_ne_zero;
                #> __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_copy;
                    #> __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                        clear __not__X_copy_ne_zero_holder;
                        
                        while _not__X_copy_ne_zero not 0 do;
                            incr __not__X_copy_ne_zero_copy;
                            incr __not__X_copy_ne_zero_holder;
                            decr _not__X_copy_ne_zero;
                        end;
                        
                        while __not__X_copy_ne_zero_holder not 0 do;
                            incr _not__X_copy_ne_zero;
                            decr __not__X_copy_ne_zero_holder;
                        end;
                    #< done __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                #< done __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                
                clear _X_copy_ne_zero;
                incr _X_copy_ne_zero;
                
                while __not__X_copy_ne_zero_copy not 0 do;
                    clear _X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_copy;
                end;
            #< done _X_copy_ne_zero = not _not__X_copy_ne_zero;
        #< done _X_copy_ne_zero = _X_copy != 0;
        #> _neither_are_zero = _X_copy_ne_zero and _Y_copy_ne_zero;
            # DeMorgan's:
            #  (X and Y) = not ((not X) or (not Y))
            #> _not__X_copy_ne_zero = not _X_copy_ne_zero;
                #> __X_copy_ne_zero_copy = _X_copy_ne_zero;
                    clear __X_copy_ne_zero_copy;
                    #> __X_copy_ne_zero_copy += _X_copy_ne_zero;
                        clear __X_copy_ne_zero_holder;
                        
                        while _X_copy_ne_zero not 0 do;
                            incr __X_copy_ne_zero_copy;
                            incr __X_copy_ne_zero_holder;
                            decr _X_copy_ne_zero;
                        end;
                        
                        while __X_copy_ne_zero_holder not 0 do;
                            incr _X_copy_ne_zero;
                            decr __X_copy_ne_zero_holder;
                        end;
                    #< done __X_copy_ne_zero_copy += _X_copy_ne_zero;
                #< done __X_copy_ne_zero_copy = _X_copy_ne_zero;
                
                clear _not__X_copy_ne_zero;
                incr _not__X_copy_ne_zero;
                
                while __X_copy_ne_zero_copy not 0 do;
                    clear _not__X_copy_ne_zero;
                    clear __X_copy_ne_zero_copy;
                end;
            #< done _not__X_copy_ne_zero = not _X_copy_ne_zero;
            #> _not__Y_copy_ne_zero = not _Y_copy_ne_zero;
                #> __Y_copy_ne_zero_copy = _Y_copy_ne_zero;
                    clear __Y_copy_ne_zero_copy;
                    #> __Y_copy_ne_zero_copy += _Y_copy_ne_zero;
                        clear __Y_copy_ne_zero_holder;
                        
                        while _Y_copy_ne_zero not 0 do;
                            incr __Y_copy_ne_zero_copy;
                            incr __Y_copy_ne_zero_holder;
                            decr _Y_copy_ne_zero;
                        end;
                        
                        while __Y_copy_ne_zero_holder not 0 do;
                            incr _Y_copy_ne_zero;
                            decr __Y_copy_ne_zero_holder;
                        end;
                    #< done __Y_copy_ne_zero_copy += _Y_copy_ne_zero;
                #< done __Y_copy_ne_zero_copy = _Y_copy_ne_zero;
                
                clear _not__Y_copy_ne_zero;
                incr _not__Y_copy_ne_zero;
                
                while __Y_copy_ne_zero_copy not 0 do;
                    clear _not__Y_copy_ne_zero;
                    clear __Y_copy_ne_zero_copy;
                end;
            #< done _not__Y_copy_ne_zero = not _Y_copy_ne_zero;
            #> _inner_or = _not__X_copy_ne_zero or _not__Y_copy_ne_zero;
                #> __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                    clear __not__X_copy_ne_zero_copy;
                    #> __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                        clear __not__X_copy_ne_zero_holder;
                        
                        while _not__X_copy_ne_zero not 0 do;
                            incr __not__X_copy_ne_zero_copy;
                            incr __not__X_copy_ne_zero_holder;
                            decr _not__X_copy_ne_zero;
                        end;
                        
                        while __not__X_copy_ne_zero_holder not 0 do;
                            incr _not__X_copy_ne_zero;
                            decr __not__X_copy_ne_zero_holder;
                        end;
                    #< done __not__X_copy_ne_zero_copy += _not__X_copy_ne_zero;
                #< done __not__X_copy_ne_zero_copy = _not__X_copy_ne_zero;
                #> __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                    clear __not__Y_copy_ne_zero_copy;
                    #> __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                        clear __not__Y_copy_ne_zero_holder;
                        
                        while _not__Y_copy_ne_zero not 0 do;
                            incr __not__Y_copy_ne_zero_copy;
                            incr __not__Y_copy_ne_zero_holder;
                            decr _not__Y_copy_ne_zero;
                        end;
                        
                        while __not__Y_copy_ne_zero_holder not 0 do;
                            incr _not__Y_copy_ne_zero;
                            decr __not__Y_copy_ne_zero_holder;
                        end;
                    #< done __not__Y_copy_ne_zero_copy += _not__Y_copy_ne_zero;
                #< done __not__Y_copy_ne_zero_copy = _not__Y_copy_ne_zero;
                clear _inner_or;
                
                while __not__X_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not__X_copy_ne_zero_copy;
                end;
                
                while __not__Y_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not__Y_copy_ne_zero_copy;
                end;
            #< done _inner_or = _not__X_copy_ne_zero or _not__Y_copy_ne_zero;
            #> _neither_are_zero = not _inner_or;
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
                
                clear _neither_are_zero;
                incr _neither_are_zero;
                
                while __inner_or_copy not 0 do;
                    clear _neither_are_zero;
                    clear __inner_or_copy;
                end;
            #< done _neither_are_zero = not _inner_or;
        #< done _neither_are_zero = _X_copy_ne_zero and _Y_copy_ne_zero;
    end;
    
    
    clear B;
    
    while _X_copy_ne_zero not 0 do;
        # _X_copy_ne_zero is True, so X must be the larger
        #> B = _X_copy;
            clear B;
            #> B += _X_copy;
                clear __X_copy_holder;
                
                while _X_copy not 0 do;
                    incr B;
                    incr __X_copy_holder;
                    decr _X_copy;
                end;
                
                while __X_copy_holder not 0 do;
                    incr _X_copy;
                    decr __X_copy_holder;
                end;
            #< done B += _X_copy;
        #< done B = _X_copy;
        clear _X_copy_ne_zero;
    end;
    
    while _Y_copy_ne_zero not 0 do;
        # _Y_copy_ne_zero is True, so Y must be the larger
        #> B = _Y_copy;
            clear B;
            #> B += _Y_copy;
                clear __Y_copy_holder;
                
                while _Y_copy not 0 do;
                    incr B;
                    incr __Y_copy_holder;
                    decr _Y_copy;
                end;
                
                while __Y_copy_holder not 0 do;
                    incr _Y_copy;
                    decr __Y_copy_holder;
                end;
            #< done B += _Y_copy;
        #< done B = _Y_copy;
        clear _Y_copy_ne_zero;
    end;
#< done B = abs(Y - X);
#vars:A=2,B=2,X=5,Y=3