clear X;
clear Y;

#> A = X != Y;
    #> _not_A = X == Y;
        #> _difference = abs(X - Y);
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
            
            
            clear _difference;
            
            while _Y_copy_ne_zero not 0 do;
                # _Y_copy_ne_zero is True, so Y must be the larger
                #> _difference = _Y_copy;
                    clear _difference;
                    #> _difference += _Y_copy;
                        clear __Y_copy_holder;
                        
                        while _Y_copy not 0 do;
                            incr _difference;
                            incr __Y_copy_holder;
                            decr _Y_copy;
                        end;
                        
                        while __Y_copy_holder not 0 do;
                            incr _Y_copy;
                            decr __Y_copy_holder;
                        end;
                    #< done _difference += _Y_copy;
                #< done _difference = _Y_copy;
                clear _Y_copy_ne_zero;
            end;
            
            while _X_copy_ne_zero not 0 do;
                # _X_copy_ne_zero is True, so X must be the larger
                #> _difference = _X_copy;
                    clear _difference;
                    #> _difference += _X_copy;
                        clear __X_copy_holder;
                        
                        while _X_copy not 0 do;
                            incr _difference;
                            incr __X_copy_holder;
                            decr _X_copy;
                        end;
                        
                        while __X_copy_holder not 0 do;
                            incr _X_copy;
                            decr __X_copy_holder;
                        end;
                    #< done _difference += _X_copy;
                #< done _difference = _X_copy;
                clear _X_copy_ne_zero;
            end;
        #< done _difference = abs(X - Y);
        clear _not_A;
        incr _not_A;
        while _difference not 0 do;
            clear _not_A;
            clear _difference;
        end;
        
        # If X == Y, _not_A = 1. Otherwise, _not_A = 0
    #< done _not_A = X == Y;
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
#< done A = X != Y;

incr X;

#> B = X != Y;
    #> _not_B = X == Y;
        #> _difference = abs(X - Y);
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
            
            
            clear _difference;
            
            while _Y_copy_ne_zero not 0 do;
                # _Y_copy_ne_zero is True, so Y must be the larger
                #> _difference = _Y_copy;
                    clear _difference;
                    #> _difference += _Y_copy;
                        clear __Y_copy_holder;
                        
                        while _Y_copy not 0 do;
                            incr _difference;
                            incr __Y_copy_holder;
                            decr _Y_copy;
                        end;
                        
                        while __Y_copy_holder not 0 do;
                            incr _Y_copy;
                            decr __Y_copy_holder;
                        end;
                    #< done _difference += _Y_copy;
                #< done _difference = _Y_copy;
                clear _Y_copy_ne_zero;
            end;
            
            while _X_copy_ne_zero not 0 do;
                # _X_copy_ne_zero is True, so X must be the larger
                #> _difference = _X_copy;
                    clear _difference;
                    #> _difference += _X_copy;
                        clear __X_copy_holder;
                        
                        while _X_copy not 0 do;
                            incr _difference;
                            incr __X_copy_holder;
                            decr _X_copy;
                        end;
                        
                        while __X_copy_holder not 0 do;
                            incr _X_copy;
                            decr __X_copy_holder;
                        end;
                    #< done _difference += _X_copy;
                #< done _difference = _X_copy;
                clear _X_copy_ne_zero;
            end;
        #< done _difference = abs(X - Y);
        clear _not_B;
        incr _not_B;
        while _difference not 0 do;
            clear _not_B;
            clear _difference;
        end;
        
        # If X == Y, _not_B = 1. Otherwise, _not_B = 0
    #< done _not_B = X == Y;
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
#< done B = X != Y;

incr Y;
incr Y;

#> C = X != Y;
    #> _not_C = X == Y;
        #> _difference = abs(X - Y);
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
            
            
            clear _difference;
            
            while _Y_copy_ne_zero not 0 do;
                # _Y_copy_ne_zero is True, so Y must be the larger
                #> _difference = _Y_copy;
                    clear _difference;
                    #> _difference += _Y_copy;
                        clear __Y_copy_holder;
                        
                        while _Y_copy not 0 do;
                            incr _difference;
                            incr __Y_copy_holder;
                            decr _Y_copy;
                        end;
                        
                        while __Y_copy_holder not 0 do;
                            incr _Y_copy;
                            decr __Y_copy_holder;
                        end;
                    #< done _difference += _Y_copy;
                #< done _difference = _Y_copy;
                clear _Y_copy_ne_zero;
            end;
            
            while _X_copy_ne_zero not 0 do;
                # _X_copy_ne_zero is True, so X must be the larger
                #> _difference = _X_copy;
                    clear _difference;
                    #> _difference += _X_copy;
                        clear __X_copy_holder;
                        
                        while _X_copy not 0 do;
                            incr _difference;
                            incr __X_copy_holder;
                            decr _X_copy;
                        end;
                        
                        while __X_copy_holder not 0 do;
                            incr _X_copy;
                            decr __X_copy_holder;
                        end;
                    #< done _difference += _X_copy;
                #< done _difference = _X_copy;
                clear _X_copy_ne_zero;
            end;
        #< done _difference = abs(X - Y);
        clear _not_C;
        incr _not_C;
        while _difference not 0 do;
            clear _not_C;
            clear _difference;
        end;
        
        # If X == Y, _not_C = 1. Otherwise, _not_C = 0
    #< done _not_C = X == Y;
    #> C = not _not_C;
        #> __not_C_copy = _not_C;
            clear __not_C_copy;
            #> __not_C_copy += _not_C;
                clear __not_C_holder;
                
                while _not_C not 0 do;
                    incr __not_C_copy;
                    incr __not_C_holder;
                    decr _not_C;
                end;
                
                while __not_C_holder not 0 do;
                    incr _not_C;
                    decr __not_C_holder;
                end;
            #< done __not_C_copy += _not_C;
        #< done __not_C_copy = _not_C;
        
        clear C;
        incr C;
        
        while __not_C_copy not 0 do;
            clear C;
            clear __not_C_copy;
        end;
    #< done C = not _not_C;
#< done C = X != Y;
#vars:A=0,B=1,C=1,X=1,Y=2