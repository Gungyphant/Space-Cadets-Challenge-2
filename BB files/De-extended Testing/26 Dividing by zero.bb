clear X;
incr X;

clear Y;

#> A r B = X / Y;
    #_X_copy = X;
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
    #clear B;
    
    #> B = X;
        clear B;
        #> B += X;
            clear _X_holder;
            
            while X not 0 do;
                incr B;
                incr _X_holder;
                decr X;
            end;
            
            while _X_holder not 0 do;
                incr X;
                decr _X_holder;
            end;
        #< done B += X;
    #< done B = X;
    #> _B_ge_Y = B >= Y;
        #> _B_gt_Y = B > Y;
            #> _B_copy = B;
                clear _B_copy;
                #> _B_copy += B;
                    clear _B_holder;
                    
                    while B not 0 do;
                        incr _B_copy;
                        incr _B_holder;
                        decr B;
                    end;
                    
                    while _B_holder not 0 do;
                        incr B;
                        decr _B_holder;
                    end;
                #< done _B_copy += B;
            #< done _B_copy = B;
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
            
            #> _difference = abs(_B_copy - _Y_copy);
                #> __B_copy_copy = _B_copy;
                    clear __B_copy_copy;
                    #> __B_copy_copy += _B_copy;
                        clear __B_copy_holder;
                        
                        while _B_copy not 0 do;
                            incr __B_copy_copy;
                            incr __B_copy_holder;
                            decr _B_copy;
                        end;
                        
                        while __B_copy_holder not 0 do;
                            incr _B_copy;
                            decr __B_copy_holder;
                        end;
                    #< done __B_copy_copy += _B_copy;
                #< done __B_copy_copy = _B_copy;
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
                
                #> __B_copy_copy_ne_zero = __B_copy_copy != 0;
                    #> _not___B_copy_copy_ne_zero = __B_copy_copy == 0;
                        #> ___B_copy_copy_copy = __B_copy_copy;
                            clear ___B_copy_copy_copy;
                            #> ___B_copy_copy_copy += __B_copy_copy;
                                clear ___B_copy_copy_holder;
                                
                                while __B_copy_copy not 0 do;
                                    incr ___B_copy_copy_copy;
                                    incr ___B_copy_copy_holder;
                                    decr __B_copy_copy;
                                end;
                                
                                while ___B_copy_copy_holder not 0 do;
                                    incr __B_copy_copy;
                                    decr ___B_copy_copy_holder;
                                end;
                            #< done ___B_copy_copy_copy += __B_copy_copy;
                        #< done ___B_copy_copy_copy = __B_copy_copy;
                        
                        clear _not___B_copy_copy_ne_zero;
                        incr _not___B_copy_copy_ne_zero;
                        while ___B_copy_copy_copy not 0 do;
                            clear _not___B_copy_copy_ne_zero;
                            clear ___B_copy_copy_copy;
                        end;
                    #< done _not___B_copy_copy_ne_zero = __B_copy_copy == 0;
                    #> __B_copy_copy_ne_zero = not _not___B_copy_copy_ne_zero;
                        #> __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                            clear __not___B_copy_copy_ne_zero_copy;
                            #> __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                clear __not___B_copy_copy_ne_zero_holder;
                                
                                while _not___B_copy_copy_ne_zero not 0 do;
                                    incr __not___B_copy_copy_ne_zero_copy;
                                    incr __not___B_copy_copy_ne_zero_holder;
                                    decr _not___B_copy_copy_ne_zero;
                                end;
                                
                                while __not___B_copy_copy_ne_zero_holder not 0 do;
                                    incr _not___B_copy_copy_ne_zero;
                                    decr __not___B_copy_copy_ne_zero_holder;
                                end;
                            #< done __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                        #< done __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                        
                        clear __B_copy_copy_ne_zero;
                        incr __B_copy_copy_ne_zero;
                        
                        while __not___B_copy_copy_ne_zero_copy not 0 do;
                            clear __B_copy_copy_ne_zero;
                            clear __not___B_copy_copy_ne_zero_copy;
                        end;
                    #< done __B_copy_copy_ne_zero = not _not___B_copy_copy_ne_zero;
                #< done __B_copy_copy_ne_zero = __B_copy_copy != 0;
                #> __Y_copy_copy_ne_zero = __Y_copy_copy != 0;
                    #> _not___Y_copy_copy_ne_zero = __Y_copy_copy == 0;
                        #> ___Y_copy_copy_copy = __Y_copy_copy;
                            clear ___Y_copy_copy_copy;
                            #> ___Y_copy_copy_copy += __Y_copy_copy;
                                clear ___Y_copy_copy_holder;
                                
                                while __Y_copy_copy not 0 do;
                                    incr ___Y_copy_copy_copy;
                                    incr ___Y_copy_copy_holder;
                                    decr __Y_copy_copy;
                                end;
                                
                                while ___Y_copy_copy_holder not 0 do;
                                    incr __Y_copy_copy;
                                    decr ___Y_copy_copy_holder;
                                end;
                            #< done ___Y_copy_copy_copy += __Y_copy_copy;
                        #< done ___Y_copy_copy_copy = __Y_copy_copy;
                        
                        clear _not___Y_copy_copy_ne_zero;
                        incr _not___Y_copy_copy_ne_zero;
                        while ___Y_copy_copy_copy not 0 do;
                            clear _not___Y_copy_copy_ne_zero;
                            clear ___Y_copy_copy_copy;
                        end;
                    #< done _not___Y_copy_copy_ne_zero = __Y_copy_copy == 0;
                    #> __Y_copy_copy_ne_zero = not _not___Y_copy_copy_ne_zero;
                        #> __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                            clear __not___Y_copy_copy_ne_zero_copy;
                            #> __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                clear __not___Y_copy_copy_ne_zero_holder;
                                
                                while _not___Y_copy_copy_ne_zero not 0 do;
                                    incr __not___Y_copy_copy_ne_zero_copy;
                                    incr __not___Y_copy_copy_ne_zero_holder;
                                    decr _not___Y_copy_copy_ne_zero;
                                end;
                                
                                while __not___Y_copy_copy_ne_zero_holder not 0 do;
                                    incr _not___Y_copy_copy_ne_zero;
                                    decr __not___Y_copy_copy_ne_zero_holder;
                                end;
                            #< done __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                        #< done __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                        
                        clear __Y_copy_copy_ne_zero;
                        incr __Y_copy_copy_ne_zero;
                        
                        while __not___Y_copy_copy_ne_zero_copy not 0 do;
                            clear __Y_copy_copy_ne_zero;
                            clear __not___Y_copy_copy_ne_zero_copy;
                        end;
                    #< done __Y_copy_copy_ne_zero = not _not___Y_copy_copy_ne_zero;
                #< done __Y_copy_copy_ne_zero = __Y_copy_copy != 0;
                #> _neither_are_zero = __Y_copy_copy_ne_zero and __B_copy_copy_ne_zero;
                    # DeMorgan's:
                    #  (X and Y) = not ((not X) or (not Y))
                    #> _not___Y_copy_copy_ne_zero = not __Y_copy_copy_ne_zero;
                        #> ___Y_copy_copy_ne_zero_copy = __Y_copy_copy_ne_zero;
                            clear ___Y_copy_copy_ne_zero_copy;
                            #> ___Y_copy_copy_ne_zero_copy += __Y_copy_copy_ne_zero;
                                clear ___Y_copy_copy_ne_zero_holder;
                                
                                while __Y_copy_copy_ne_zero not 0 do;
                                    incr ___Y_copy_copy_ne_zero_copy;
                                    incr ___Y_copy_copy_ne_zero_holder;
                                    decr __Y_copy_copy_ne_zero;
                                end;
                                
                                while ___Y_copy_copy_ne_zero_holder not 0 do;
                                    incr __Y_copy_copy_ne_zero;
                                    decr ___Y_copy_copy_ne_zero_holder;
                                end;
                            #< done ___Y_copy_copy_ne_zero_copy += __Y_copy_copy_ne_zero;
                        #< done ___Y_copy_copy_ne_zero_copy = __Y_copy_copy_ne_zero;
                        
                        clear _not___Y_copy_copy_ne_zero;
                        incr _not___Y_copy_copy_ne_zero;
                        
                        while ___Y_copy_copy_ne_zero_copy not 0 do;
                            clear _not___Y_copy_copy_ne_zero;
                            clear ___Y_copy_copy_ne_zero_copy;
                        end;
                    #< done _not___Y_copy_copy_ne_zero = not __Y_copy_copy_ne_zero;
                    #> _not___B_copy_copy_ne_zero = not __B_copy_copy_ne_zero;
                        #> ___B_copy_copy_ne_zero_copy = __B_copy_copy_ne_zero;
                            clear ___B_copy_copy_ne_zero_copy;
                            #> ___B_copy_copy_ne_zero_copy += __B_copy_copy_ne_zero;
                                clear ___B_copy_copy_ne_zero_holder;
                                
                                while __B_copy_copy_ne_zero not 0 do;
                                    incr ___B_copy_copy_ne_zero_copy;
                                    incr ___B_copy_copy_ne_zero_holder;
                                    decr __B_copy_copy_ne_zero;
                                end;
                                
                                while ___B_copy_copy_ne_zero_holder not 0 do;
                                    incr __B_copy_copy_ne_zero;
                                    decr ___B_copy_copy_ne_zero_holder;
                                end;
                            #< done ___B_copy_copy_ne_zero_copy += __B_copy_copy_ne_zero;
                        #< done ___B_copy_copy_ne_zero_copy = __B_copy_copy_ne_zero;
                        
                        clear _not___B_copy_copy_ne_zero;
                        incr _not___B_copy_copy_ne_zero;
                        
                        while ___B_copy_copy_ne_zero_copy not 0 do;
                            clear _not___B_copy_copy_ne_zero;
                            clear ___B_copy_copy_ne_zero_copy;
                        end;
                    #< done _not___B_copy_copy_ne_zero = not __B_copy_copy_ne_zero;
                    #> _inner_or = _not___Y_copy_copy_ne_zero or _not___B_copy_copy_ne_zero;
                        #> __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                            clear __not___Y_copy_copy_ne_zero_copy;
                            #> __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                clear __not___Y_copy_copy_ne_zero_holder;
                                
                                while _not___Y_copy_copy_ne_zero not 0 do;
                                    incr __not___Y_copy_copy_ne_zero_copy;
                                    incr __not___Y_copy_copy_ne_zero_holder;
                                    decr _not___Y_copy_copy_ne_zero;
                                end;
                                
                                while __not___Y_copy_copy_ne_zero_holder not 0 do;
                                    incr _not___Y_copy_copy_ne_zero;
                                    decr __not___Y_copy_copy_ne_zero_holder;
                                end;
                            #< done __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                        #< done __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                        #> __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                            clear __not___B_copy_copy_ne_zero_copy;
                            #> __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                clear __not___B_copy_copy_ne_zero_holder;
                                
                                while _not___B_copy_copy_ne_zero not 0 do;
                                    incr __not___B_copy_copy_ne_zero_copy;
                                    incr __not___B_copy_copy_ne_zero_holder;
                                    decr _not___B_copy_copy_ne_zero;
                                end;
                                
                                while __not___B_copy_copy_ne_zero_holder not 0 do;
                                    incr _not___B_copy_copy_ne_zero;
                                    decr __not___B_copy_copy_ne_zero_holder;
                                end;
                            #< done __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                        #< done __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                        clear _inner_or;
                        
                        while __not___Y_copy_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not___Y_copy_copy_ne_zero_copy;
                        end;
                        
                        while __not___B_copy_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not___B_copy_copy_ne_zero_copy;
                        end;
                    #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___B_copy_copy_ne_zero;
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
                #< done _neither_are_zero = __Y_copy_copy_ne_zero and __B_copy_copy_ne_zero;
                while _neither_are_zero not 0 do;
                    decr __B_copy_copy;
                    decr __Y_copy_copy;
                    
                    #> __B_copy_copy_ne_zero = __B_copy_copy != 0;
                        #> _not___B_copy_copy_ne_zero = __B_copy_copy == 0;
                            #> ___B_copy_copy_copy = __B_copy_copy;
                                clear ___B_copy_copy_copy;
                                #> ___B_copy_copy_copy += __B_copy_copy;
                                    clear ___B_copy_copy_holder;
                                    
                                    while __B_copy_copy not 0 do;
                                        incr ___B_copy_copy_copy;
                                        incr ___B_copy_copy_holder;
                                        decr __B_copy_copy;
                                    end;
                                    
                                    while ___B_copy_copy_holder not 0 do;
                                        incr __B_copy_copy;
                                        decr ___B_copy_copy_holder;
                                    end;
                                #< done ___B_copy_copy_copy += __B_copy_copy;
                            #< done ___B_copy_copy_copy = __B_copy_copy;
                            
                            clear _not___B_copy_copy_ne_zero;
                            incr _not___B_copy_copy_ne_zero;
                            while ___B_copy_copy_copy not 0 do;
                                clear _not___B_copy_copy_ne_zero;
                                clear ___B_copy_copy_copy;
                            end;
                        #< done _not___B_copy_copy_ne_zero = __B_copy_copy == 0;
                        #> __B_copy_copy_ne_zero = not _not___B_copy_copy_ne_zero;
                            #> __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                                clear __not___B_copy_copy_ne_zero_copy;
                                #> __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                    clear __not___B_copy_copy_ne_zero_holder;
                                    
                                    while _not___B_copy_copy_ne_zero not 0 do;
                                        incr __not___B_copy_copy_ne_zero_copy;
                                        incr __not___B_copy_copy_ne_zero_holder;
                                        decr _not___B_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___B_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___B_copy_copy_ne_zero;
                                        decr __not___B_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                            #< done __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                            
                            clear __B_copy_copy_ne_zero;
                            incr __B_copy_copy_ne_zero;
                            
                            while __not___B_copy_copy_ne_zero_copy not 0 do;
                                clear __B_copy_copy_ne_zero;
                                clear __not___B_copy_copy_ne_zero_copy;
                            end;
                        #< done __B_copy_copy_ne_zero = not _not___B_copy_copy_ne_zero;
                    #< done __B_copy_copy_ne_zero = __B_copy_copy != 0;
                    #> __Y_copy_copy_ne_zero = __Y_copy_copy != 0;
                        #> _not___Y_copy_copy_ne_zero = __Y_copy_copy == 0;
                            #> ___Y_copy_copy_copy = __Y_copy_copy;
                                clear ___Y_copy_copy_copy;
                                #> ___Y_copy_copy_copy += __Y_copy_copy;
                                    clear ___Y_copy_copy_holder;
                                    
                                    while __Y_copy_copy not 0 do;
                                        incr ___Y_copy_copy_copy;
                                        incr ___Y_copy_copy_holder;
                                        decr __Y_copy_copy;
                                    end;
                                    
                                    while ___Y_copy_copy_holder not 0 do;
                                        incr __Y_copy_copy;
                                        decr ___Y_copy_copy_holder;
                                    end;
                                #< done ___Y_copy_copy_copy += __Y_copy_copy;
                            #< done ___Y_copy_copy_copy = __Y_copy_copy;
                            
                            clear _not___Y_copy_copy_ne_zero;
                            incr _not___Y_copy_copy_ne_zero;
                            while ___Y_copy_copy_copy not 0 do;
                                clear _not___Y_copy_copy_ne_zero;
                                clear ___Y_copy_copy_copy;
                            end;
                        #< done _not___Y_copy_copy_ne_zero = __Y_copy_copy == 0;
                        #> __Y_copy_copy_ne_zero = not _not___Y_copy_copy_ne_zero;
                            #> __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                                clear __not___Y_copy_copy_ne_zero_copy;
                                #> __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                    clear __not___Y_copy_copy_ne_zero_holder;
                                    
                                    while _not___Y_copy_copy_ne_zero not 0 do;
                                        incr __not___Y_copy_copy_ne_zero_copy;
                                        incr __not___Y_copy_copy_ne_zero_holder;
                                        decr _not___Y_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___Y_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___Y_copy_copy_ne_zero;
                                        decr __not___Y_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                            #< done __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                            
                            clear __Y_copy_copy_ne_zero;
                            incr __Y_copy_copy_ne_zero;
                            
                            while __not___Y_copy_copy_ne_zero_copy not 0 do;
                                clear __Y_copy_copy_ne_zero;
                                clear __not___Y_copy_copy_ne_zero_copy;
                            end;
                        #< done __Y_copy_copy_ne_zero = not _not___Y_copy_copy_ne_zero;
                    #< done __Y_copy_copy_ne_zero = __Y_copy_copy != 0;
                    #> _neither_are_zero = __Y_copy_copy_ne_zero and __B_copy_copy_ne_zero;
                        # DeMorgan's:
                        #  (X and Y) = not ((not X) or (not Y))
                        #> _not___Y_copy_copy_ne_zero = not __Y_copy_copy_ne_zero;
                            #> ___Y_copy_copy_ne_zero_copy = __Y_copy_copy_ne_zero;
                                clear ___Y_copy_copy_ne_zero_copy;
                                #> ___Y_copy_copy_ne_zero_copy += __Y_copy_copy_ne_zero;
                                    clear ___Y_copy_copy_ne_zero_holder;
                                    
                                    while __Y_copy_copy_ne_zero not 0 do;
                                        incr ___Y_copy_copy_ne_zero_copy;
                                        incr ___Y_copy_copy_ne_zero_holder;
                                        decr __Y_copy_copy_ne_zero;
                                    end;
                                    
                                    while ___Y_copy_copy_ne_zero_holder not 0 do;
                                        incr __Y_copy_copy_ne_zero;
                                        decr ___Y_copy_copy_ne_zero_holder;
                                    end;
                                #< done ___Y_copy_copy_ne_zero_copy += __Y_copy_copy_ne_zero;
                            #< done ___Y_copy_copy_ne_zero_copy = __Y_copy_copy_ne_zero;
                            
                            clear _not___Y_copy_copy_ne_zero;
                            incr _not___Y_copy_copy_ne_zero;
                            
                            while ___Y_copy_copy_ne_zero_copy not 0 do;
                                clear _not___Y_copy_copy_ne_zero;
                                clear ___Y_copy_copy_ne_zero_copy;
                            end;
                        #< done _not___Y_copy_copy_ne_zero = not __Y_copy_copy_ne_zero;
                        #> _not___B_copy_copy_ne_zero = not __B_copy_copy_ne_zero;
                            #> ___B_copy_copy_ne_zero_copy = __B_copy_copy_ne_zero;
                                clear ___B_copy_copy_ne_zero_copy;
                                #> ___B_copy_copy_ne_zero_copy += __B_copy_copy_ne_zero;
                                    clear ___B_copy_copy_ne_zero_holder;
                                    
                                    while __B_copy_copy_ne_zero not 0 do;
                                        incr ___B_copy_copy_ne_zero_copy;
                                        incr ___B_copy_copy_ne_zero_holder;
                                        decr __B_copy_copy_ne_zero;
                                    end;
                                    
                                    while ___B_copy_copy_ne_zero_holder not 0 do;
                                        incr __B_copy_copy_ne_zero;
                                        decr ___B_copy_copy_ne_zero_holder;
                                    end;
                                #< done ___B_copy_copy_ne_zero_copy += __B_copy_copy_ne_zero;
                            #< done ___B_copy_copy_ne_zero_copy = __B_copy_copy_ne_zero;
                            
                            clear _not___B_copy_copy_ne_zero;
                            incr _not___B_copy_copy_ne_zero;
                            
                            while ___B_copy_copy_ne_zero_copy not 0 do;
                                clear _not___B_copy_copy_ne_zero;
                                clear ___B_copy_copy_ne_zero_copy;
                            end;
                        #< done _not___B_copy_copy_ne_zero = not __B_copy_copy_ne_zero;
                        #> _inner_or = _not___Y_copy_copy_ne_zero or _not___B_copy_copy_ne_zero;
                            #> __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                                clear __not___Y_copy_copy_ne_zero_copy;
                                #> __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                    clear __not___Y_copy_copy_ne_zero_holder;
                                    
                                    while _not___Y_copy_copy_ne_zero not 0 do;
                                        incr __not___Y_copy_copy_ne_zero_copy;
                                        incr __not___Y_copy_copy_ne_zero_holder;
                                        decr _not___Y_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___Y_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___Y_copy_copy_ne_zero;
                                        decr __not___Y_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                            #< done __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                            #> __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                                clear __not___B_copy_copy_ne_zero_copy;
                                #> __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                    clear __not___B_copy_copy_ne_zero_holder;
                                    
                                    while _not___B_copy_copy_ne_zero not 0 do;
                                        incr __not___B_copy_copy_ne_zero_copy;
                                        incr __not___B_copy_copy_ne_zero_holder;
                                        decr _not___B_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___B_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___B_copy_copy_ne_zero;
                                        decr __not___B_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                            #< done __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                            clear _inner_or;
                            
                            while __not___Y_copy_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not___Y_copy_copy_ne_zero_copy;
                            end;
                            
                            while __not___B_copy_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not___B_copy_copy_ne_zero_copy;
                            end;
                        #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___B_copy_copy_ne_zero;
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
                    #< done _neither_are_zero = __Y_copy_copy_ne_zero and __B_copy_copy_ne_zero;
                end;
                
                
                clear _difference;
                
                while __Y_copy_copy_ne_zero not 0 do;
                    # __Y_copy_copy_ne_zero is True, so _Y_copy must be the larger
                    #> _difference = __Y_copy_copy;
                        clear _difference;
                        #> _difference += __Y_copy_copy;
                            clear ___Y_copy_copy_holder;
                            
                            while __Y_copy_copy not 0 do;
                                incr _difference;
                                incr ___Y_copy_copy_holder;
                                decr __Y_copy_copy;
                            end;
                            
                            while ___Y_copy_copy_holder not 0 do;
                                incr __Y_copy_copy;
                                decr ___Y_copy_copy_holder;
                            end;
                        #< done _difference += __Y_copy_copy;
                    #< done _difference = __Y_copy_copy;
                    clear __Y_copy_copy_ne_zero;
                end;
                
                while __B_copy_copy_ne_zero not 0 do;
                    # __B_copy_copy_ne_zero is True, so _B_copy must be the larger
                    #> _difference = __B_copy_copy;
                        clear _difference;
                        #> _difference += __B_copy_copy;
                            clear ___B_copy_copy_holder;
                            
                            while __B_copy_copy not 0 do;
                                incr _difference;
                                incr ___B_copy_copy_holder;
                                decr __B_copy_copy;
                            end;
                            
                            while ___B_copy_copy_holder not 0 do;
                                incr __B_copy_copy;
                                decr ___B_copy_copy_holder;
                            end;
                        #< done _difference += __B_copy_copy;
                    #< done _difference = __B_copy_copy;
                    clear __B_copy_copy_ne_zero;
                end;
            #< done _difference = abs(_B_copy - _Y_copy);
            #> _B_plus_difference = _B_copy + _difference;
                #> __B_copy_copy = _B_copy;
                    clear __B_copy_copy;
                    #> __B_copy_copy += _B_copy;
                        clear __B_copy_holder;
                        
                        while _B_copy not 0 do;
                            incr __B_copy_copy;
                            incr __B_copy_holder;
                            decr _B_copy;
                        end;
                        
                        while __B_copy_holder not 0 do;
                            incr _B_copy;
                            decr __B_copy_holder;
                        end;
                    #< done __B_copy_copy += _B_copy;
                #< done __B_copy_copy = _B_copy;
                #> __difference_copy = _difference;
                    clear __difference_copy;
                    #> __difference_copy += _difference;
                        clear __difference_holder;
                        
                        while _difference not 0 do;
                            incr __difference_copy;
                            incr __difference_holder;
                            decr _difference;
                        end;
                        
                        while __difference_holder not 0 do;
                            incr _difference;
                            decr __difference_holder;
                        end;
                    #< done __difference_copy += _difference;
                #< done __difference_copy = _difference;
                clear _B_plus_difference;
                #> _B_plus_difference += __B_copy_copy;
                    clear ___B_copy_copy_holder;
                    
                    while __B_copy_copy not 0 do;
                        incr _B_plus_difference;
                        incr ___B_copy_copy_holder;
                        decr __B_copy_copy;
                    end;
                    
                    while ___B_copy_copy_holder not 0 do;
                        incr __B_copy_copy;
                        decr ___B_copy_copy_holder;
                    end;
                #< done _B_plus_difference += __B_copy_copy;
                #> _B_plus_difference += __difference_copy;
                    clear ___difference_copy_holder;
                    
                    while __difference_copy not 0 do;
                        incr _B_plus_difference;
                        incr ___difference_copy_holder;
                        decr __difference_copy;
                    end;
                    
                    while ___difference_copy_holder not 0 do;
                        incr __difference_copy;
                        decr ___difference_copy_holder;
                    end;
                #< done _B_plus_difference += __difference_copy;
            #< done _B_plus_difference = _B_copy + _difference;
            #> _B_plus_difference_eq_Y = _B_plus_difference == Y;
                #> _difference = abs(_B_plus_difference - Y);
                    #> __B_plus_difference_copy = _B_plus_difference;
                        clear __B_plus_difference_copy;
                        #> __B_plus_difference_copy += _B_plus_difference;
                            clear __B_plus_difference_holder;
                            
                            while _B_plus_difference not 0 do;
                                incr __B_plus_difference_copy;
                                incr __B_plus_difference_holder;
                                decr _B_plus_difference;
                            end;
                            
                            while __B_plus_difference_holder not 0 do;
                                incr _B_plus_difference;
                                decr __B_plus_difference_holder;
                            end;
                        #< done __B_plus_difference_copy += _B_plus_difference;
                    #< done __B_plus_difference_copy = _B_plus_difference;
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
                    
                    #> __B_plus_difference_copy_ne_zero = __B_plus_difference_copy != 0;
                        #> _not___B_plus_difference_copy_ne_zero = __B_plus_difference_copy == 0;
                            #> ___B_plus_difference_copy_copy = __B_plus_difference_copy;
                                clear ___B_plus_difference_copy_copy;
                                #> ___B_plus_difference_copy_copy += __B_plus_difference_copy;
                                    clear ___B_plus_difference_copy_holder;
                                    
                                    while __B_plus_difference_copy not 0 do;
                                        incr ___B_plus_difference_copy_copy;
                                        incr ___B_plus_difference_copy_holder;
                                        decr __B_plus_difference_copy;
                                    end;
                                    
                                    while ___B_plus_difference_copy_holder not 0 do;
                                        incr __B_plus_difference_copy;
                                        decr ___B_plus_difference_copy_holder;
                                    end;
                                #< done ___B_plus_difference_copy_copy += __B_plus_difference_copy;
                            #< done ___B_plus_difference_copy_copy = __B_plus_difference_copy;
                            
                            clear _not___B_plus_difference_copy_ne_zero;
                            incr _not___B_plus_difference_copy_ne_zero;
                            while ___B_plus_difference_copy_copy not 0 do;
                                clear _not___B_plus_difference_copy_ne_zero;
                                clear ___B_plus_difference_copy_copy;
                            end;
                        #< done _not___B_plus_difference_copy_ne_zero = __B_plus_difference_copy == 0;
                        #> __B_plus_difference_copy_ne_zero = not _not___B_plus_difference_copy_ne_zero;
                            #> __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                clear __not___B_plus_difference_copy_ne_zero_copy;
                                #> __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                    clear __not___B_plus_difference_copy_ne_zero_holder;
                                    
                                    while _not___B_plus_difference_copy_ne_zero not 0 do;
                                        incr __not___B_plus_difference_copy_ne_zero_copy;
                                        incr __not___B_plus_difference_copy_ne_zero_holder;
                                        decr _not___B_plus_difference_copy_ne_zero;
                                    end;
                                    
                                    while __not___B_plus_difference_copy_ne_zero_holder not 0 do;
                                        incr _not___B_plus_difference_copy_ne_zero;
                                        decr __not___B_plus_difference_copy_ne_zero_holder;
                                    end;
                                #< done __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                            #< done __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                            
                            clear __B_plus_difference_copy_ne_zero;
                            incr __B_plus_difference_copy_ne_zero;
                            
                            while __not___B_plus_difference_copy_ne_zero_copy not 0 do;
                                clear __B_plus_difference_copy_ne_zero;
                                clear __not___B_plus_difference_copy_ne_zero_copy;
                            end;
                        #< done __B_plus_difference_copy_ne_zero = not _not___B_plus_difference_copy_ne_zero;
                    #< done __B_plus_difference_copy_ne_zero = __B_plus_difference_copy != 0;
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
                    #> _neither_are_zero = _Y_copy_ne_zero and __B_plus_difference_copy_ne_zero;
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
                        #> _not___B_plus_difference_copy_ne_zero = not __B_plus_difference_copy_ne_zero;
                            #> ___B_plus_difference_copy_ne_zero_copy = __B_plus_difference_copy_ne_zero;
                                clear ___B_plus_difference_copy_ne_zero_copy;
                                #> ___B_plus_difference_copy_ne_zero_copy += __B_plus_difference_copy_ne_zero;
                                    clear ___B_plus_difference_copy_ne_zero_holder;
                                    
                                    while __B_plus_difference_copy_ne_zero not 0 do;
                                        incr ___B_plus_difference_copy_ne_zero_copy;
                                        incr ___B_plus_difference_copy_ne_zero_holder;
                                        decr __B_plus_difference_copy_ne_zero;
                                    end;
                                    
                                    while ___B_plus_difference_copy_ne_zero_holder not 0 do;
                                        incr __B_plus_difference_copy_ne_zero;
                                        decr ___B_plus_difference_copy_ne_zero_holder;
                                    end;
                                #< done ___B_plus_difference_copy_ne_zero_copy += __B_plus_difference_copy_ne_zero;
                            #< done ___B_plus_difference_copy_ne_zero_copy = __B_plus_difference_copy_ne_zero;
                            
                            clear _not___B_plus_difference_copy_ne_zero;
                            incr _not___B_plus_difference_copy_ne_zero;
                            
                            while ___B_plus_difference_copy_ne_zero_copy not 0 do;
                                clear _not___B_plus_difference_copy_ne_zero;
                                clear ___B_plus_difference_copy_ne_zero_copy;
                            end;
                        #< done _not___B_plus_difference_copy_ne_zero = not __B_plus_difference_copy_ne_zero;
                        #> _inner_or = _not__Y_copy_ne_zero or _not___B_plus_difference_copy_ne_zero;
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
                            #> __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                clear __not___B_plus_difference_copy_ne_zero_copy;
                                #> __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                    clear __not___B_plus_difference_copy_ne_zero_holder;
                                    
                                    while _not___B_plus_difference_copy_ne_zero not 0 do;
                                        incr __not___B_plus_difference_copy_ne_zero_copy;
                                        incr __not___B_plus_difference_copy_ne_zero_holder;
                                        decr _not___B_plus_difference_copy_ne_zero;
                                    end;
                                    
                                    while __not___B_plus_difference_copy_ne_zero_holder not 0 do;
                                        incr _not___B_plus_difference_copy_ne_zero;
                                        decr __not___B_plus_difference_copy_ne_zero_holder;
                                    end;
                                #< done __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                            #< done __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                            clear _inner_or;
                            
                            while __not__Y_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not__Y_copy_ne_zero_copy;
                            end;
                            
                            while __not___B_plus_difference_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not___B_plus_difference_copy_ne_zero_copy;
                            end;
                        #< done _inner_or = _not__Y_copy_ne_zero or _not___B_plus_difference_copy_ne_zero;
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
                    #< done _neither_are_zero = _Y_copy_ne_zero and __B_plus_difference_copy_ne_zero;
                    while _neither_are_zero not 0 do;
                        decr __B_plus_difference_copy;
                        decr _Y_copy;
                        
                        #> __B_plus_difference_copy_ne_zero = __B_plus_difference_copy != 0;
                            #> _not___B_plus_difference_copy_ne_zero = __B_plus_difference_copy == 0;
                                #> ___B_plus_difference_copy_copy = __B_plus_difference_copy;
                                    clear ___B_plus_difference_copy_copy;
                                    #> ___B_plus_difference_copy_copy += __B_plus_difference_copy;
                                        clear ___B_plus_difference_copy_holder;
                                        
                                        while __B_plus_difference_copy not 0 do;
                                            incr ___B_plus_difference_copy_copy;
                                            incr ___B_plus_difference_copy_holder;
                                            decr __B_plus_difference_copy;
                                        end;
                                        
                                        while ___B_plus_difference_copy_holder not 0 do;
                                            incr __B_plus_difference_copy;
                                            decr ___B_plus_difference_copy_holder;
                                        end;
                                    #< done ___B_plus_difference_copy_copy += __B_plus_difference_copy;
                                #< done ___B_plus_difference_copy_copy = __B_plus_difference_copy;
                                
                                clear _not___B_plus_difference_copy_ne_zero;
                                incr _not___B_plus_difference_copy_ne_zero;
                                while ___B_plus_difference_copy_copy not 0 do;
                                    clear _not___B_plus_difference_copy_ne_zero;
                                    clear ___B_plus_difference_copy_copy;
                                end;
                            #< done _not___B_plus_difference_copy_ne_zero = __B_plus_difference_copy == 0;
                            #> __B_plus_difference_copy_ne_zero = not _not___B_plus_difference_copy_ne_zero;
                                #> __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                    clear __not___B_plus_difference_copy_ne_zero_copy;
                                    #> __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                        clear __not___B_plus_difference_copy_ne_zero_holder;
                                        
                                        while _not___B_plus_difference_copy_ne_zero not 0 do;
                                            incr __not___B_plus_difference_copy_ne_zero_copy;
                                            incr __not___B_plus_difference_copy_ne_zero_holder;
                                            decr _not___B_plus_difference_copy_ne_zero;
                                        end;
                                        
                                        while __not___B_plus_difference_copy_ne_zero_holder not 0 do;
                                            incr _not___B_plus_difference_copy_ne_zero;
                                            decr __not___B_plus_difference_copy_ne_zero_holder;
                                        end;
                                    #< done __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                #< done __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                
                                clear __B_plus_difference_copy_ne_zero;
                                incr __B_plus_difference_copy_ne_zero;
                                
                                while __not___B_plus_difference_copy_ne_zero_copy not 0 do;
                                    clear __B_plus_difference_copy_ne_zero;
                                    clear __not___B_plus_difference_copy_ne_zero_copy;
                                end;
                            #< done __B_plus_difference_copy_ne_zero = not _not___B_plus_difference_copy_ne_zero;
                        #< done __B_plus_difference_copy_ne_zero = __B_plus_difference_copy != 0;
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
                        #> _neither_are_zero = _Y_copy_ne_zero and __B_plus_difference_copy_ne_zero;
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
                            #> _not___B_plus_difference_copy_ne_zero = not __B_plus_difference_copy_ne_zero;
                                #> ___B_plus_difference_copy_ne_zero_copy = __B_plus_difference_copy_ne_zero;
                                    clear ___B_plus_difference_copy_ne_zero_copy;
                                    #> ___B_plus_difference_copy_ne_zero_copy += __B_plus_difference_copy_ne_zero;
                                        clear ___B_plus_difference_copy_ne_zero_holder;
                                        
                                        while __B_plus_difference_copy_ne_zero not 0 do;
                                            incr ___B_plus_difference_copy_ne_zero_copy;
                                            incr ___B_plus_difference_copy_ne_zero_holder;
                                            decr __B_plus_difference_copy_ne_zero;
                                        end;
                                        
                                        while ___B_plus_difference_copy_ne_zero_holder not 0 do;
                                            incr __B_plus_difference_copy_ne_zero;
                                            decr ___B_plus_difference_copy_ne_zero_holder;
                                        end;
                                    #< done ___B_plus_difference_copy_ne_zero_copy += __B_plus_difference_copy_ne_zero;
                                #< done ___B_plus_difference_copy_ne_zero_copy = __B_plus_difference_copy_ne_zero;
                                
                                clear _not___B_plus_difference_copy_ne_zero;
                                incr _not___B_plus_difference_copy_ne_zero;
                                
                                while ___B_plus_difference_copy_ne_zero_copy not 0 do;
                                    clear _not___B_plus_difference_copy_ne_zero;
                                    clear ___B_plus_difference_copy_ne_zero_copy;
                                end;
                            #< done _not___B_plus_difference_copy_ne_zero = not __B_plus_difference_copy_ne_zero;
                            #> _inner_or = _not__Y_copy_ne_zero or _not___B_plus_difference_copy_ne_zero;
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
                                #> __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                    clear __not___B_plus_difference_copy_ne_zero_copy;
                                    #> __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                        clear __not___B_plus_difference_copy_ne_zero_holder;
                                        
                                        while _not___B_plus_difference_copy_ne_zero not 0 do;
                                            incr __not___B_plus_difference_copy_ne_zero_copy;
                                            incr __not___B_plus_difference_copy_ne_zero_holder;
                                            decr _not___B_plus_difference_copy_ne_zero;
                                        end;
                                        
                                        while __not___B_plus_difference_copy_ne_zero_holder not 0 do;
                                            incr _not___B_plus_difference_copy_ne_zero;
                                            decr __not___B_plus_difference_copy_ne_zero_holder;
                                        end;
                                    #< done __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                #< done __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not__Y_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__Y_copy_ne_zero_copy;
                                end;
                                
                                while __not___B_plus_difference_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___B_plus_difference_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not__Y_copy_ne_zero or _not___B_plus_difference_copy_ne_zero;
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
                        #< done _neither_are_zero = _Y_copy_ne_zero and __B_plus_difference_copy_ne_zero;
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
                    
                    while __B_plus_difference_copy_ne_zero not 0 do;
                        # __B_plus_difference_copy_ne_zero is True, so _B_plus_difference must be the larger
                        #> _difference = __B_plus_difference_copy;
                            clear _difference;
                            #> _difference += __B_plus_difference_copy;
                                clear ___B_plus_difference_copy_holder;
                                
                                while __B_plus_difference_copy not 0 do;
                                    incr _difference;
                                    incr ___B_plus_difference_copy_holder;
                                    decr __B_plus_difference_copy;
                                end;
                                
                                while ___B_plus_difference_copy_holder not 0 do;
                                    incr __B_plus_difference_copy;
                                    decr ___B_plus_difference_copy_holder;
                                end;
                            #< done _difference += __B_plus_difference_copy;
                        #< done _difference = __B_plus_difference_copy;
                        clear __B_plus_difference_copy_ne_zero;
                    end;
                #< done _difference = abs(_B_plus_difference - Y);
                clear _B_plus_difference_eq_Y;
                incr _B_plus_difference_eq_Y;
                while _difference not 0 do;
                    clear _B_plus_difference_eq_Y;
                    clear _difference;
                end;
                
                # If _B_plus_difference == Y, _B_plus_difference_eq_Y = 1. Otherwise, _B_plus_difference_eq_Y = 0
            #< done _B_plus_difference_eq_Y = _B_plus_difference == Y;
            # If X + abs(X - Y) == Y, Y was bigger, so false
            #> _B_gt_Y = not _B_plus_difference_eq_Y;
                #> __B_plus_difference_eq_Y_copy = _B_plus_difference_eq_Y;
                    clear __B_plus_difference_eq_Y_copy;
                    #> __B_plus_difference_eq_Y_copy += _B_plus_difference_eq_Y;
                        clear __B_plus_difference_eq_Y_holder;
                        
                        while _B_plus_difference_eq_Y not 0 do;
                            incr __B_plus_difference_eq_Y_copy;
                            incr __B_plus_difference_eq_Y_holder;
                            decr _B_plus_difference_eq_Y;
                        end;
                        
                        while __B_plus_difference_eq_Y_holder not 0 do;
                            incr _B_plus_difference_eq_Y;
                            decr __B_plus_difference_eq_Y_holder;
                        end;
                    #< done __B_plus_difference_eq_Y_copy += _B_plus_difference_eq_Y;
                #< done __B_plus_difference_eq_Y_copy = _B_plus_difference_eq_Y;
                
                clear _B_gt_Y;
                incr _B_gt_Y;
                
                while __B_plus_difference_eq_Y_copy not 0 do;
                    clear _B_gt_Y;
                    clear __B_plus_difference_eq_Y_copy;
                end;
            #< done _B_gt_Y = not _B_plus_difference_eq_Y;
        #< done _B_gt_Y = B > Y;
        #> _B_eq_Y = B == Y;
            #> _difference = abs(B - Y);
                #> _B_copy = B;
                    clear _B_copy;
                    #> _B_copy += B;
                        clear _B_holder;
                        
                        while B not 0 do;
                            incr _B_copy;
                            incr _B_holder;
                            decr B;
                        end;
                        
                        while _B_holder not 0 do;
                            incr B;
                            decr _B_holder;
                        end;
                    #< done _B_copy += B;
                #< done _B_copy = B;
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
                
                #> _B_copy_ne_zero = _B_copy != 0;
                    #> _not__B_copy_ne_zero = _B_copy == 0;
                        #> __B_copy_copy = _B_copy;
                            clear __B_copy_copy;
                            #> __B_copy_copy += _B_copy;
                                clear __B_copy_holder;
                                
                                while _B_copy not 0 do;
                                    incr __B_copy_copy;
                                    incr __B_copy_holder;
                                    decr _B_copy;
                                end;
                                
                                while __B_copy_holder not 0 do;
                                    incr _B_copy;
                                    decr __B_copy_holder;
                                end;
                            #< done __B_copy_copy += _B_copy;
                        #< done __B_copy_copy = _B_copy;
                        
                        clear _not__B_copy_ne_zero;
                        incr _not__B_copy_ne_zero;
                        while __B_copy_copy not 0 do;
                            clear _not__B_copy_ne_zero;
                            clear __B_copy_copy;
                        end;
                    #< done _not__B_copy_ne_zero = _B_copy == 0;
                    #> _B_copy_ne_zero = not _not__B_copy_ne_zero;
                        #> __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                            clear __not__B_copy_ne_zero_copy;
                            #> __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                clear __not__B_copy_ne_zero_holder;
                                
                                while _not__B_copy_ne_zero not 0 do;
                                    incr __not__B_copy_ne_zero_copy;
                                    incr __not__B_copy_ne_zero_holder;
                                    decr _not__B_copy_ne_zero;
                                end;
                                
                                while __not__B_copy_ne_zero_holder not 0 do;
                                    incr _not__B_copy_ne_zero;
                                    decr __not__B_copy_ne_zero_holder;
                                end;
                            #< done __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                        #< done __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                        
                        clear _B_copy_ne_zero;
                        incr _B_copy_ne_zero;
                        
                        while __not__B_copy_ne_zero_copy not 0 do;
                            clear _B_copy_ne_zero;
                            clear __not__B_copy_ne_zero_copy;
                        end;
                    #< done _B_copy_ne_zero = not _not__B_copy_ne_zero;
                #< done _B_copy_ne_zero = _B_copy != 0;
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
                #> _neither_are_zero = _Y_copy_ne_zero and _B_copy_ne_zero;
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
                    #> _not__B_copy_ne_zero = not _B_copy_ne_zero;
                        #> __B_copy_ne_zero_copy = _B_copy_ne_zero;
                            clear __B_copy_ne_zero_copy;
                            #> __B_copy_ne_zero_copy += _B_copy_ne_zero;
                                clear __B_copy_ne_zero_holder;
                                
                                while _B_copy_ne_zero not 0 do;
                                    incr __B_copy_ne_zero_copy;
                                    incr __B_copy_ne_zero_holder;
                                    decr _B_copy_ne_zero;
                                end;
                                
                                while __B_copy_ne_zero_holder not 0 do;
                                    incr _B_copy_ne_zero;
                                    decr __B_copy_ne_zero_holder;
                                end;
                            #< done __B_copy_ne_zero_copy += _B_copy_ne_zero;
                        #< done __B_copy_ne_zero_copy = _B_copy_ne_zero;
                        
                        clear _not__B_copy_ne_zero;
                        incr _not__B_copy_ne_zero;
                        
                        while __B_copy_ne_zero_copy not 0 do;
                            clear _not__B_copy_ne_zero;
                            clear __B_copy_ne_zero_copy;
                        end;
                    #< done _not__B_copy_ne_zero = not _B_copy_ne_zero;
                    #> _inner_or = _not__Y_copy_ne_zero or _not__B_copy_ne_zero;
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
                        #> __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                            clear __not__B_copy_ne_zero_copy;
                            #> __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                clear __not__B_copy_ne_zero_holder;
                                
                                while _not__B_copy_ne_zero not 0 do;
                                    incr __not__B_copy_ne_zero_copy;
                                    incr __not__B_copy_ne_zero_holder;
                                    decr _not__B_copy_ne_zero;
                                end;
                                
                                while __not__B_copy_ne_zero_holder not 0 do;
                                    incr _not__B_copy_ne_zero;
                                    decr __not__B_copy_ne_zero_holder;
                                end;
                            #< done __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                        #< done __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                        clear _inner_or;
                        
                        while __not__Y_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not__Y_copy_ne_zero_copy;
                        end;
                        
                        while __not__B_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not__B_copy_ne_zero_copy;
                        end;
                    #< done _inner_or = _not__Y_copy_ne_zero or _not__B_copy_ne_zero;
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
                #< done _neither_are_zero = _Y_copy_ne_zero and _B_copy_ne_zero;
                while _neither_are_zero not 0 do;
                    decr _B_copy;
                    decr _Y_copy;
                    
                    #> _B_copy_ne_zero = _B_copy != 0;
                        #> _not__B_copy_ne_zero = _B_copy == 0;
                            #> __B_copy_copy = _B_copy;
                                clear __B_copy_copy;
                                #> __B_copy_copy += _B_copy;
                                    clear __B_copy_holder;
                                    
                                    while _B_copy not 0 do;
                                        incr __B_copy_copy;
                                        incr __B_copy_holder;
                                        decr _B_copy;
                                    end;
                                    
                                    while __B_copy_holder not 0 do;
                                        incr _B_copy;
                                        decr __B_copy_holder;
                                    end;
                                #< done __B_copy_copy += _B_copy;
                            #< done __B_copy_copy = _B_copy;
                            
                            clear _not__B_copy_ne_zero;
                            incr _not__B_copy_ne_zero;
                            while __B_copy_copy not 0 do;
                                clear _not__B_copy_ne_zero;
                                clear __B_copy_copy;
                            end;
                        #< done _not__B_copy_ne_zero = _B_copy == 0;
                        #> _B_copy_ne_zero = not _not__B_copy_ne_zero;
                            #> __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                                clear __not__B_copy_ne_zero_copy;
                                #> __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                    clear __not__B_copy_ne_zero_holder;
                                    
                                    while _not__B_copy_ne_zero not 0 do;
                                        incr __not__B_copy_ne_zero_copy;
                                        incr __not__B_copy_ne_zero_holder;
                                        decr _not__B_copy_ne_zero;
                                    end;
                                    
                                    while __not__B_copy_ne_zero_holder not 0 do;
                                        incr _not__B_copy_ne_zero;
                                        decr __not__B_copy_ne_zero_holder;
                                    end;
                                #< done __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                            #< done __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                            
                            clear _B_copy_ne_zero;
                            incr _B_copy_ne_zero;
                            
                            while __not__B_copy_ne_zero_copy not 0 do;
                                clear _B_copy_ne_zero;
                                clear __not__B_copy_ne_zero_copy;
                            end;
                        #< done _B_copy_ne_zero = not _not__B_copy_ne_zero;
                    #< done _B_copy_ne_zero = _B_copy != 0;
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
                    #> _neither_are_zero = _Y_copy_ne_zero and _B_copy_ne_zero;
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
                        #> _not__B_copy_ne_zero = not _B_copy_ne_zero;
                            #> __B_copy_ne_zero_copy = _B_copy_ne_zero;
                                clear __B_copy_ne_zero_copy;
                                #> __B_copy_ne_zero_copy += _B_copy_ne_zero;
                                    clear __B_copy_ne_zero_holder;
                                    
                                    while _B_copy_ne_zero not 0 do;
                                        incr __B_copy_ne_zero_copy;
                                        incr __B_copy_ne_zero_holder;
                                        decr _B_copy_ne_zero;
                                    end;
                                    
                                    while __B_copy_ne_zero_holder not 0 do;
                                        incr _B_copy_ne_zero;
                                        decr __B_copy_ne_zero_holder;
                                    end;
                                #< done __B_copy_ne_zero_copy += _B_copy_ne_zero;
                            #< done __B_copy_ne_zero_copy = _B_copy_ne_zero;
                            
                            clear _not__B_copy_ne_zero;
                            incr _not__B_copy_ne_zero;
                            
                            while __B_copy_ne_zero_copy not 0 do;
                                clear _not__B_copy_ne_zero;
                                clear __B_copy_ne_zero_copy;
                            end;
                        #< done _not__B_copy_ne_zero = not _B_copy_ne_zero;
                        #> _inner_or = _not__Y_copy_ne_zero or _not__B_copy_ne_zero;
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
                            #> __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                                clear __not__B_copy_ne_zero_copy;
                                #> __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                    clear __not__B_copy_ne_zero_holder;
                                    
                                    while _not__B_copy_ne_zero not 0 do;
                                        incr __not__B_copy_ne_zero_copy;
                                        incr __not__B_copy_ne_zero_holder;
                                        decr _not__B_copy_ne_zero;
                                    end;
                                    
                                    while __not__B_copy_ne_zero_holder not 0 do;
                                        incr _not__B_copy_ne_zero;
                                        decr __not__B_copy_ne_zero_holder;
                                    end;
                                #< done __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                            #< done __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                            clear _inner_or;
                            
                            while __not__Y_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not__Y_copy_ne_zero_copy;
                            end;
                            
                            while __not__B_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not__B_copy_ne_zero_copy;
                            end;
                        #< done _inner_or = _not__Y_copy_ne_zero or _not__B_copy_ne_zero;
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
                    #< done _neither_are_zero = _Y_copy_ne_zero and _B_copy_ne_zero;
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
                
                while _B_copy_ne_zero not 0 do;
                    # _B_copy_ne_zero is True, so B must be the larger
                    #> _difference = _B_copy;
                        clear _difference;
                        #> _difference += _B_copy;
                            clear __B_copy_holder;
                            
                            while _B_copy not 0 do;
                                incr _difference;
                                incr __B_copy_holder;
                                decr _B_copy;
                            end;
                            
                            while __B_copy_holder not 0 do;
                                incr _B_copy;
                                decr __B_copy_holder;
                            end;
                        #< done _difference += _B_copy;
                    #< done _difference = _B_copy;
                    clear _B_copy_ne_zero;
                end;
            #< done _difference = abs(B - Y);
            clear _B_eq_Y;
            incr _B_eq_Y;
            while _difference not 0 do;
                clear _B_eq_Y;
                clear _difference;
            end;
            
            # If B == Y, _B_eq_Y = 1. Otherwise, _B_eq_Y = 0
        #< done _B_eq_Y = B == Y;
        #> _B_ge_Y = _B_gt_Y or _B_eq_Y;
            #> __B_gt_Y_copy = _B_gt_Y;
                clear __B_gt_Y_copy;
                #> __B_gt_Y_copy += _B_gt_Y;
                    clear __B_gt_Y_holder;
                    
                    while _B_gt_Y not 0 do;
                        incr __B_gt_Y_copy;
                        incr __B_gt_Y_holder;
                        decr _B_gt_Y;
                    end;
                    
                    while __B_gt_Y_holder not 0 do;
                        incr _B_gt_Y;
                        decr __B_gt_Y_holder;
                    end;
                #< done __B_gt_Y_copy += _B_gt_Y;
            #< done __B_gt_Y_copy = _B_gt_Y;
            #> __B_eq_Y_copy = _B_eq_Y;
                clear __B_eq_Y_copy;
                #> __B_eq_Y_copy += _B_eq_Y;
                    clear __B_eq_Y_holder;
                    
                    while _B_eq_Y not 0 do;
                        incr __B_eq_Y_copy;
                        incr __B_eq_Y_holder;
                        decr _B_eq_Y;
                    end;
                    
                    while __B_eq_Y_holder not 0 do;
                        incr _B_eq_Y;
                        decr __B_eq_Y_holder;
                    end;
                #< done __B_eq_Y_copy += _B_eq_Y;
            #< done __B_eq_Y_copy = _B_eq_Y;
            clear _B_ge_Y;
            
            while __B_gt_Y_copy not 0 do;
                clear _B_ge_Y;
                incr _B_ge_Y;
                clear __B_gt_Y_copy;
            end;
            
            while __B_eq_Y_copy not 0 do;
                clear _B_ge_Y;
                incr _B_ge_Y;
                clear __B_eq_Y_copy;
            end;
        #< done _B_ge_Y = _B_gt_Y or _B_eq_Y;
    #< done _B_ge_Y = B >= Y;
    while _B_ge_Y not 0 do;
        incr A;
        #> B -= Y;
            clear _Y_holder;
            
            while Y not 0 do;
                decr B;
                incr _Y_holder;
                decr Y;
            end;
            
            while _Y_holder not 0 do;
                incr Y;
                decr _Y_holder;
            end;
        #< done B -= Y;
        
        #> _B_ge_Y = B >= Y;
            #> _B_gt_Y = B > Y;
                #> _B_copy = B;
                    clear _B_copy;
                    #> _B_copy += B;
                        clear _B_holder;
                        
                        while B not 0 do;
                            incr _B_copy;
                            incr _B_holder;
                            decr B;
                        end;
                        
                        while _B_holder not 0 do;
                            incr B;
                            decr _B_holder;
                        end;
                    #< done _B_copy += B;
                #< done _B_copy = B;
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
                
                #> _difference = abs(_B_copy - _Y_copy);
                    #> __B_copy_copy = _B_copy;
                        clear __B_copy_copy;
                        #> __B_copy_copy += _B_copy;
                            clear __B_copy_holder;
                            
                            while _B_copy not 0 do;
                                incr __B_copy_copy;
                                incr __B_copy_holder;
                                decr _B_copy;
                            end;
                            
                            while __B_copy_holder not 0 do;
                                incr _B_copy;
                                decr __B_copy_holder;
                            end;
                        #< done __B_copy_copy += _B_copy;
                    #< done __B_copy_copy = _B_copy;
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
                    
                    #> __B_copy_copy_ne_zero = __B_copy_copy != 0;
                        #> _not___B_copy_copy_ne_zero = __B_copy_copy == 0;
                            #> ___B_copy_copy_copy = __B_copy_copy;
                                clear ___B_copy_copy_copy;
                                #> ___B_copy_copy_copy += __B_copy_copy;
                                    clear ___B_copy_copy_holder;
                                    
                                    while __B_copy_copy not 0 do;
                                        incr ___B_copy_copy_copy;
                                        incr ___B_copy_copy_holder;
                                        decr __B_copy_copy;
                                    end;
                                    
                                    while ___B_copy_copy_holder not 0 do;
                                        incr __B_copy_copy;
                                        decr ___B_copy_copy_holder;
                                    end;
                                #< done ___B_copy_copy_copy += __B_copy_copy;
                            #< done ___B_copy_copy_copy = __B_copy_copy;
                            
                            clear _not___B_copy_copy_ne_zero;
                            incr _not___B_copy_copy_ne_zero;
                            while ___B_copy_copy_copy not 0 do;
                                clear _not___B_copy_copy_ne_zero;
                                clear ___B_copy_copy_copy;
                            end;
                        #< done _not___B_copy_copy_ne_zero = __B_copy_copy == 0;
                        #> __B_copy_copy_ne_zero = not _not___B_copy_copy_ne_zero;
                            #> __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                                clear __not___B_copy_copy_ne_zero_copy;
                                #> __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                    clear __not___B_copy_copy_ne_zero_holder;
                                    
                                    while _not___B_copy_copy_ne_zero not 0 do;
                                        incr __not___B_copy_copy_ne_zero_copy;
                                        incr __not___B_copy_copy_ne_zero_holder;
                                        decr _not___B_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___B_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___B_copy_copy_ne_zero;
                                        decr __not___B_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                            #< done __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                            
                            clear __B_copy_copy_ne_zero;
                            incr __B_copy_copy_ne_zero;
                            
                            while __not___B_copy_copy_ne_zero_copy not 0 do;
                                clear __B_copy_copy_ne_zero;
                                clear __not___B_copy_copy_ne_zero_copy;
                            end;
                        #< done __B_copy_copy_ne_zero = not _not___B_copy_copy_ne_zero;
                    #< done __B_copy_copy_ne_zero = __B_copy_copy != 0;
                    #> __Y_copy_copy_ne_zero = __Y_copy_copy != 0;
                        #> _not___Y_copy_copy_ne_zero = __Y_copy_copy == 0;
                            #> ___Y_copy_copy_copy = __Y_copy_copy;
                                clear ___Y_copy_copy_copy;
                                #> ___Y_copy_copy_copy += __Y_copy_copy;
                                    clear ___Y_copy_copy_holder;
                                    
                                    while __Y_copy_copy not 0 do;
                                        incr ___Y_copy_copy_copy;
                                        incr ___Y_copy_copy_holder;
                                        decr __Y_copy_copy;
                                    end;
                                    
                                    while ___Y_copy_copy_holder not 0 do;
                                        incr __Y_copy_copy;
                                        decr ___Y_copy_copy_holder;
                                    end;
                                #< done ___Y_copy_copy_copy += __Y_copy_copy;
                            #< done ___Y_copy_copy_copy = __Y_copy_copy;
                            
                            clear _not___Y_copy_copy_ne_zero;
                            incr _not___Y_copy_copy_ne_zero;
                            while ___Y_copy_copy_copy not 0 do;
                                clear _not___Y_copy_copy_ne_zero;
                                clear ___Y_copy_copy_copy;
                            end;
                        #< done _not___Y_copy_copy_ne_zero = __Y_copy_copy == 0;
                        #> __Y_copy_copy_ne_zero = not _not___Y_copy_copy_ne_zero;
                            #> __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                                clear __not___Y_copy_copy_ne_zero_copy;
                                #> __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                    clear __not___Y_copy_copy_ne_zero_holder;
                                    
                                    while _not___Y_copy_copy_ne_zero not 0 do;
                                        incr __not___Y_copy_copy_ne_zero_copy;
                                        incr __not___Y_copy_copy_ne_zero_holder;
                                        decr _not___Y_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___Y_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___Y_copy_copy_ne_zero;
                                        decr __not___Y_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                            #< done __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                            
                            clear __Y_copy_copy_ne_zero;
                            incr __Y_copy_copy_ne_zero;
                            
                            while __not___Y_copy_copy_ne_zero_copy not 0 do;
                                clear __Y_copy_copy_ne_zero;
                                clear __not___Y_copy_copy_ne_zero_copy;
                            end;
                        #< done __Y_copy_copy_ne_zero = not _not___Y_copy_copy_ne_zero;
                    #< done __Y_copy_copy_ne_zero = __Y_copy_copy != 0;
                    #> _neither_are_zero = __Y_copy_copy_ne_zero and __B_copy_copy_ne_zero;
                        # DeMorgan's:
                        #  (X and Y) = not ((not X) or (not Y))
                        #> _not___Y_copy_copy_ne_zero = not __Y_copy_copy_ne_zero;
                            #> ___Y_copy_copy_ne_zero_copy = __Y_copy_copy_ne_zero;
                                clear ___Y_copy_copy_ne_zero_copy;
                                #> ___Y_copy_copy_ne_zero_copy += __Y_copy_copy_ne_zero;
                                    clear ___Y_copy_copy_ne_zero_holder;
                                    
                                    while __Y_copy_copy_ne_zero not 0 do;
                                        incr ___Y_copy_copy_ne_zero_copy;
                                        incr ___Y_copy_copy_ne_zero_holder;
                                        decr __Y_copy_copy_ne_zero;
                                    end;
                                    
                                    while ___Y_copy_copy_ne_zero_holder not 0 do;
                                        incr __Y_copy_copy_ne_zero;
                                        decr ___Y_copy_copy_ne_zero_holder;
                                    end;
                                #< done ___Y_copy_copy_ne_zero_copy += __Y_copy_copy_ne_zero;
                            #< done ___Y_copy_copy_ne_zero_copy = __Y_copy_copy_ne_zero;
                            
                            clear _not___Y_copy_copy_ne_zero;
                            incr _not___Y_copy_copy_ne_zero;
                            
                            while ___Y_copy_copy_ne_zero_copy not 0 do;
                                clear _not___Y_copy_copy_ne_zero;
                                clear ___Y_copy_copy_ne_zero_copy;
                            end;
                        #< done _not___Y_copy_copy_ne_zero = not __Y_copy_copy_ne_zero;
                        #> _not___B_copy_copy_ne_zero = not __B_copy_copy_ne_zero;
                            #> ___B_copy_copy_ne_zero_copy = __B_copy_copy_ne_zero;
                                clear ___B_copy_copy_ne_zero_copy;
                                #> ___B_copy_copy_ne_zero_copy += __B_copy_copy_ne_zero;
                                    clear ___B_copy_copy_ne_zero_holder;
                                    
                                    while __B_copy_copy_ne_zero not 0 do;
                                        incr ___B_copy_copy_ne_zero_copy;
                                        incr ___B_copy_copy_ne_zero_holder;
                                        decr __B_copy_copy_ne_zero;
                                    end;
                                    
                                    while ___B_copy_copy_ne_zero_holder not 0 do;
                                        incr __B_copy_copy_ne_zero;
                                        decr ___B_copy_copy_ne_zero_holder;
                                    end;
                                #< done ___B_copy_copy_ne_zero_copy += __B_copy_copy_ne_zero;
                            #< done ___B_copy_copy_ne_zero_copy = __B_copy_copy_ne_zero;
                            
                            clear _not___B_copy_copy_ne_zero;
                            incr _not___B_copy_copy_ne_zero;
                            
                            while ___B_copy_copy_ne_zero_copy not 0 do;
                                clear _not___B_copy_copy_ne_zero;
                                clear ___B_copy_copy_ne_zero_copy;
                            end;
                        #< done _not___B_copy_copy_ne_zero = not __B_copy_copy_ne_zero;
                        #> _inner_or = _not___Y_copy_copy_ne_zero or _not___B_copy_copy_ne_zero;
                            #> __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                                clear __not___Y_copy_copy_ne_zero_copy;
                                #> __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                    clear __not___Y_copy_copy_ne_zero_holder;
                                    
                                    while _not___Y_copy_copy_ne_zero not 0 do;
                                        incr __not___Y_copy_copy_ne_zero_copy;
                                        incr __not___Y_copy_copy_ne_zero_holder;
                                        decr _not___Y_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___Y_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___Y_copy_copy_ne_zero;
                                        decr __not___Y_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                            #< done __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                            #> __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                                clear __not___B_copy_copy_ne_zero_copy;
                                #> __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                    clear __not___B_copy_copy_ne_zero_holder;
                                    
                                    while _not___B_copy_copy_ne_zero not 0 do;
                                        incr __not___B_copy_copy_ne_zero_copy;
                                        incr __not___B_copy_copy_ne_zero_holder;
                                        decr _not___B_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___B_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___B_copy_copy_ne_zero;
                                        decr __not___B_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                            #< done __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                            clear _inner_or;
                            
                            while __not___Y_copy_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not___Y_copy_copy_ne_zero_copy;
                            end;
                            
                            while __not___B_copy_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not___B_copy_copy_ne_zero_copy;
                            end;
                        #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___B_copy_copy_ne_zero;
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
                    #< done _neither_are_zero = __Y_copy_copy_ne_zero and __B_copy_copy_ne_zero;
                    while _neither_are_zero not 0 do;
                        decr __B_copy_copy;
                        decr __Y_copy_copy;
                        
                        #> __B_copy_copy_ne_zero = __B_copy_copy != 0;
                            #> _not___B_copy_copy_ne_zero = __B_copy_copy == 0;
                                #> ___B_copy_copy_copy = __B_copy_copy;
                                    clear ___B_copy_copy_copy;
                                    #> ___B_copy_copy_copy += __B_copy_copy;
                                        clear ___B_copy_copy_holder;
                                        
                                        while __B_copy_copy not 0 do;
                                            incr ___B_copy_copy_copy;
                                            incr ___B_copy_copy_holder;
                                            decr __B_copy_copy;
                                        end;
                                        
                                        while ___B_copy_copy_holder not 0 do;
                                            incr __B_copy_copy;
                                            decr ___B_copy_copy_holder;
                                        end;
                                    #< done ___B_copy_copy_copy += __B_copy_copy;
                                #< done ___B_copy_copy_copy = __B_copy_copy;
                                
                                clear _not___B_copy_copy_ne_zero;
                                incr _not___B_copy_copy_ne_zero;
                                while ___B_copy_copy_copy not 0 do;
                                    clear _not___B_copy_copy_ne_zero;
                                    clear ___B_copy_copy_copy;
                                end;
                            #< done _not___B_copy_copy_ne_zero = __B_copy_copy == 0;
                            #> __B_copy_copy_ne_zero = not _not___B_copy_copy_ne_zero;
                                #> __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                                    clear __not___B_copy_copy_ne_zero_copy;
                                    #> __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                        clear __not___B_copy_copy_ne_zero_holder;
                                        
                                        while _not___B_copy_copy_ne_zero not 0 do;
                                            incr __not___B_copy_copy_ne_zero_copy;
                                            incr __not___B_copy_copy_ne_zero_holder;
                                            decr _not___B_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___B_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___B_copy_copy_ne_zero;
                                            decr __not___B_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                #< done __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                                
                                clear __B_copy_copy_ne_zero;
                                incr __B_copy_copy_ne_zero;
                                
                                while __not___B_copy_copy_ne_zero_copy not 0 do;
                                    clear __B_copy_copy_ne_zero;
                                    clear __not___B_copy_copy_ne_zero_copy;
                                end;
                            #< done __B_copy_copy_ne_zero = not _not___B_copy_copy_ne_zero;
                        #< done __B_copy_copy_ne_zero = __B_copy_copy != 0;
                        #> __Y_copy_copy_ne_zero = __Y_copy_copy != 0;
                            #> _not___Y_copy_copy_ne_zero = __Y_copy_copy == 0;
                                #> ___Y_copy_copy_copy = __Y_copy_copy;
                                    clear ___Y_copy_copy_copy;
                                    #> ___Y_copy_copy_copy += __Y_copy_copy;
                                        clear ___Y_copy_copy_holder;
                                        
                                        while __Y_copy_copy not 0 do;
                                            incr ___Y_copy_copy_copy;
                                            incr ___Y_copy_copy_holder;
                                            decr __Y_copy_copy;
                                        end;
                                        
                                        while ___Y_copy_copy_holder not 0 do;
                                            incr __Y_copy_copy;
                                            decr ___Y_copy_copy_holder;
                                        end;
                                    #< done ___Y_copy_copy_copy += __Y_copy_copy;
                                #< done ___Y_copy_copy_copy = __Y_copy_copy;
                                
                                clear _not___Y_copy_copy_ne_zero;
                                incr _not___Y_copy_copy_ne_zero;
                                while ___Y_copy_copy_copy not 0 do;
                                    clear _not___Y_copy_copy_ne_zero;
                                    clear ___Y_copy_copy_copy;
                                end;
                            #< done _not___Y_copy_copy_ne_zero = __Y_copy_copy == 0;
                            #> __Y_copy_copy_ne_zero = not _not___Y_copy_copy_ne_zero;
                                #> __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                                    clear __not___Y_copy_copy_ne_zero_copy;
                                    #> __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                        clear __not___Y_copy_copy_ne_zero_holder;
                                        
                                        while _not___Y_copy_copy_ne_zero not 0 do;
                                            incr __not___Y_copy_copy_ne_zero_copy;
                                            incr __not___Y_copy_copy_ne_zero_holder;
                                            decr _not___Y_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___Y_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___Y_copy_copy_ne_zero;
                                            decr __not___Y_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                #< done __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                                
                                clear __Y_copy_copy_ne_zero;
                                incr __Y_copy_copy_ne_zero;
                                
                                while __not___Y_copy_copy_ne_zero_copy not 0 do;
                                    clear __Y_copy_copy_ne_zero;
                                    clear __not___Y_copy_copy_ne_zero_copy;
                                end;
                            #< done __Y_copy_copy_ne_zero = not _not___Y_copy_copy_ne_zero;
                        #< done __Y_copy_copy_ne_zero = __Y_copy_copy != 0;
                        #> _neither_are_zero = __Y_copy_copy_ne_zero and __B_copy_copy_ne_zero;
                            # DeMorgan's:
                            #  (X and Y) = not ((not X) or (not Y))
                            #> _not___Y_copy_copy_ne_zero = not __Y_copy_copy_ne_zero;
                                #> ___Y_copy_copy_ne_zero_copy = __Y_copy_copy_ne_zero;
                                    clear ___Y_copy_copy_ne_zero_copy;
                                    #> ___Y_copy_copy_ne_zero_copy += __Y_copy_copy_ne_zero;
                                        clear ___Y_copy_copy_ne_zero_holder;
                                        
                                        while __Y_copy_copy_ne_zero not 0 do;
                                            incr ___Y_copy_copy_ne_zero_copy;
                                            incr ___Y_copy_copy_ne_zero_holder;
                                            decr __Y_copy_copy_ne_zero;
                                        end;
                                        
                                        while ___Y_copy_copy_ne_zero_holder not 0 do;
                                            incr __Y_copy_copy_ne_zero;
                                            decr ___Y_copy_copy_ne_zero_holder;
                                        end;
                                    #< done ___Y_copy_copy_ne_zero_copy += __Y_copy_copy_ne_zero;
                                #< done ___Y_copy_copy_ne_zero_copy = __Y_copy_copy_ne_zero;
                                
                                clear _not___Y_copy_copy_ne_zero;
                                incr _not___Y_copy_copy_ne_zero;
                                
                                while ___Y_copy_copy_ne_zero_copy not 0 do;
                                    clear _not___Y_copy_copy_ne_zero;
                                    clear ___Y_copy_copy_ne_zero_copy;
                                end;
                            #< done _not___Y_copy_copy_ne_zero = not __Y_copy_copy_ne_zero;
                            #> _not___B_copy_copy_ne_zero = not __B_copy_copy_ne_zero;
                                #> ___B_copy_copy_ne_zero_copy = __B_copy_copy_ne_zero;
                                    clear ___B_copy_copy_ne_zero_copy;
                                    #> ___B_copy_copy_ne_zero_copy += __B_copy_copy_ne_zero;
                                        clear ___B_copy_copy_ne_zero_holder;
                                        
                                        while __B_copy_copy_ne_zero not 0 do;
                                            incr ___B_copy_copy_ne_zero_copy;
                                            incr ___B_copy_copy_ne_zero_holder;
                                            decr __B_copy_copy_ne_zero;
                                        end;
                                        
                                        while ___B_copy_copy_ne_zero_holder not 0 do;
                                            incr __B_copy_copy_ne_zero;
                                            decr ___B_copy_copy_ne_zero_holder;
                                        end;
                                    #< done ___B_copy_copy_ne_zero_copy += __B_copy_copy_ne_zero;
                                #< done ___B_copy_copy_ne_zero_copy = __B_copy_copy_ne_zero;
                                
                                clear _not___B_copy_copy_ne_zero;
                                incr _not___B_copy_copy_ne_zero;
                                
                                while ___B_copy_copy_ne_zero_copy not 0 do;
                                    clear _not___B_copy_copy_ne_zero;
                                    clear ___B_copy_copy_ne_zero_copy;
                                end;
                            #< done _not___B_copy_copy_ne_zero = not __B_copy_copy_ne_zero;
                            #> _inner_or = _not___Y_copy_copy_ne_zero or _not___B_copy_copy_ne_zero;
                                #> __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                                    clear __not___Y_copy_copy_ne_zero_copy;
                                    #> __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                        clear __not___Y_copy_copy_ne_zero_holder;
                                        
                                        while _not___Y_copy_copy_ne_zero not 0 do;
                                            incr __not___Y_copy_copy_ne_zero_copy;
                                            incr __not___Y_copy_copy_ne_zero_holder;
                                            decr _not___Y_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___Y_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___Y_copy_copy_ne_zero;
                                            decr __not___Y_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___Y_copy_copy_ne_zero_copy += _not___Y_copy_copy_ne_zero;
                                #< done __not___Y_copy_copy_ne_zero_copy = _not___Y_copy_copy_ne_zero;
                                #> __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                                    clear __not___B_copy_copy_ne_zero_copy;
                                    #> __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                        clear __not___B_copy_copy_ne_zero_holder;
                                        
                                        while _not___B_copy_copy_ne_zero not 0 do;
                                            incr __not___B_copy_copy_ne_zero_copy;
                                            incr __not___B_copy_copy_ne_zero_holder;
                                            decr _not___B_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___B_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___B_copy_copy_ne_zero;
                                            decr __not___B_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___B_copy_copy_ne_zero_copy += _not___B_copy_copy_ne_zero;
                                #< done __not___B_copy_copy_ne_zero_copy = _not___B_copy_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not___Y_copy_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___Y_copy_copy_ne_zero_copy;
                                end;
                                
                                while __not___B_copy_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___B_copy_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___B_copy_copy_ne_zero;
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
                        #< done _neither_are_zero = __Y_copy_copy_ne_zero and __B_copy_copy_ne_zero;
                    end;
                    
                    
                    clear _difference;
                    
                    while __Y_copy_copy_ne_zero not 0 do;
                        # __Y_copy_copy_ne_zero is True, so _Y_copy must be the larger
                        #> _difference = __Y_copy_copy;
                            clear _difference;
                            #> _difference += __Y_copy_copy;
                                clear ___Y_copy_copy_holder;
                                
                                while __Y_copy_copy not 0 do;
                                    incr _difference;
                                    incr ___Y_copy_copy_holder;
                                    decr __Y_copy_copy;
                                end;
                                
                                while ___Y_copy_copy_holder not 0 do;
                                    incr __Y_copy_copy;
                                    decr ___Y_copy_copy_holder;
                                end;
                            #< done _difference += __Y_copy_copy;
                        #< done _difference = __Y_copy_copy;
                        clear __Y_copy_copy_ne_zero;
                    end;
                    
                    while __B_copy_copy_ne_zero not 0 do;
                        # __B_copy_copy_ne_zero is True, so _B_copy must be the larger
                        #> _difference = __B_copy_copy;
                            clear _difference;
                            #> _difference += __B_copy_copy;
                                clear ___B_copy_copy_holder;
                                
                                while __B_copy_copy not 0 do;
                                    incr _difference;
                                    incr ___B_copy_copy_holder;
                                    decr __B_copy_copy;
                                end;
                                
                                while ___B_copy_copy_holder not 0 do;
                                    incr __B_copy_copy;
                                    decr ___B_copy_copy_holder;
                                end;
                            #< done _difference += __B_copy_copy;
                        #< done _difference = __B_copy_copy;
                        clear __B_copy_copy_ne_zero;
                    end;
                #< done _difference = abs(_B_copy - _Y_copy);
                #> _B_plus_difference = _B_copy + _difference;
                    #> __B_copy_copy = _B_copy;
                        clear __B_copy_copy;
                        #> __B_copy_copy += _B_copy;
                            clear __B_copy_holder;
                            
                            while _B_copy not 0 do;
                                incr __B_copy_copy;
                                incr __B_copy_holder;
                                decr _B_copy;
                            end;
                            
                            while __B_copy_holder not 0 do;
                                incr _B_copy;
                                decr __B_copy_holder;
                            end;
                        #< done __B_copy_copy += _B_copy;
                    #< done __B_copy_copy = _B_copy;
                    #> __difference_copy = _difference;
                        clear __difference_copy;
                        #> __difference_copy += _difference;
                            clear __difference_holder;
                            
                            while _difference not 0 do;
                                incr __difference_copy;
                                incr __difference_holder;
                                decr _difference;
                            end;
                            
                            while __difference_holder not 0 do;
                                incr _difference;
                                decr __difference_holder;
                            end;
                        #< done __difference_copy += _difference;
                    #< done __difference_copy = _difference;
                    clear _B_plus_difference;
                    #> _B_plus_difference += __B_copy_copy;
                        clear ___B_copy_copy_holder;
                        
                        while __B_copy_copy not 0 do;
                            incr _B_plus_difference;
                            incr ___B_copy_copy_holder;
                            decr __B_copy_copy;
                        end;
                        
                        while ___B_copy_copy_holder not 0 do;
                            incr __B_copy_copy;
                            decr ___B_copy_copy_holder;
                        end;
                    #< done _B_plus_difference += __B_copy_copy;
                    #> _B_plus_difference += __difference_copy;
                        clear ___difference_copy_holder;
                        
                        while __difference_copy not 0 do;
                            incr _B_plus_difference;
                            incr ___difference_copy_holder;
                            decr __difference_copy;
                        end;
                        
                        while ___difference_copy_holder not 0 do;
                            incr __difference_copy;
                            decr ___difference_copy_holder;
                        end;
                    #< done _B_plus_difference += __difference_copy;
                #< done _B_plus_difference = _B_copy + _difference;
                #> _B_plus_difference_eq_Y = _B_plus_difference == Y;
                    #> _difference = abs(_B_plus_difference - Y);
                        #> __B_plus_difference_copy = _B_plus_difference;
                            clear __B_plus_difference_copy;
                            #> __B_plus_difference_copy += _B_plus_difference;
                                clear __B_plus_difference_holder;
                                
                                while _B_plus_difference not 0 do;
                                    incr __B_plus_difference_copy;
                                    incr __B_plus_difference_holder;
                                    decr _B_plus_difference;
                                end;
                                
                                while __B_plus_difference_holder not 0 do;
                                    incr _B_plus_difference;
                                    decr __B_plus_difference_holder;
                                end;
                            #< done __B_plus_difference_copy += _B_plus_difference;
                        #< done __B_plus_difference_copy = _B_plus_difference;
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
                        
                        #> __B_plus_difference_copy_ne_zero = __B_plus_difference_copy != 0;
                            #> _not___B_plus_difference_copy_ne_zero = __B_plus_difference_copy == 0;
                                #> ___B_plus_difference_copy_copy = __B_plus_difference_copy;
                                    clear ___B_plus_difference_copy_copy;
                                    #> ___B_plus_difference_copy_copy += __B_plus_difference_copy;
                                        clear ___B_plus_difference_copy_holder;
                                        
                                        while __B_plus_difference_copy not 0 do;
                                            incr ___B_plus_difference_copy_copy;
                                            incr ___B_plus_difference_copy_holder;
                                            decr __B_plus_difference_copy;
                                        end;
                                        
                                        while ___B_plus_difference_copy_holder not 0 do;
                                            incr __B_plus_difference_copy;
                                            decr ___B_plus_difference_copy_holder;
                                        end;
                                    #< done ___B_plus_difference_copy_copy += __B_plus_difference_copy;
                                #< done ___B_plus_difference_copy_copy = __B_plus_difference_copy;
                                
                                clear _not___B_plus_difference_copy_ne_zero;
                                incr _not___B_plus_difference_copy_ne_zero;
                                while ___B_plus_difference_copy_copy not 0 do;
                                    clear _not___B_plus_difference_copy_ne_zero;
                                    clear ___B_plus_difference_copy_copy;
                                end;
                            #< done _not___B_plus_difference_copy_ne_zero = __B_plus_difference_copy == 0;
                            #> __B_plus_difference_copy_ne_zero = not _not___B_plus_difference_copy_ne_zero;
                                #> __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                    clear __not___B_plus_difference_copy_ne_zero_copy;
                                    #> __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                        clear __not___B_plus_difference_copy_ne_zero_holder;
                                        
                                        while _not___B_plus_difference_copy_ne_zero not 0 do;
                                            incr __not___B_plus_difference_copy_ne_zero_copy;
                                            incr __not___B_plus_difference_copy_ne_zero_holder;
                                            decr _not___B_plus_difference_copy_ne_zero;
                                        end;
                                        
                                        while __not___B_plus_difference_copy_ne_zero_holder not 0 do;
                                            incr _not___B_plus_difference_copy_ne_zero;
                                            decr __not___B_plus_difference_copy_ne_zero_holder;
                                        end;
                                    #< done __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                #< done __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                
                                clear __B_plus_difference_copy_ne_zero;
                                incr __B_plus_difference_copy_ne_zero;
                                
                                while __not___B_plus_difference_copy_ne_zero_copy not 0 do;
                                    clear __B_plus_difference_copy_ne_zero;
                                    clear __not___B_plus_difference_copy_ne_zero_copy;
                                end;
                            #< done __B_plus_difference_copy_ne_zero = not _not___B_plus_difference_copy_ne_zero;
                        #< done __B_plus_difference_copy_ne_zero = __B_plus_difference_copy != 0;
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
                        #> _neither_are_zero = _Y_copy_ne_zero and __B_plus_difference_copy_ne_zero;
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
                            #> _not___B_plus_difference_copy_ne_zero = not __B_plus_difference_copy_ne_zero;
                                #> ___B_plus_difference_copy_ne_zero_copy = __B_plus_difference_copy_ne_zero;
                                    clear ___B_plus_difference_copy_ne_zero_copy;
                                    #> ___B_plus_difference_copy_ne_zero_copy += __B_plus_difference_copy_ne_zero;
                                        clear ___B_plus_difference_copy_ne_zero_holder;
                                        
                                        while __B_plus_difference_copy_ne_zero not 0 do;
                                            incr ___B_plus_difference_copy_ne_zero_copy;
                                            incr ___B_plus_difference_copy_ne_zero_holder;
                                            decr __B_plus_difference_copy_ne_zero;
                                        end;
                                        
                                        while ___B_plus_difference_copy_ne_zero_holder not 0 do;
                                            incr __B_plus_difference_copy_ne_zero;
                                            decr ___B_plus_difference_copy_ne_zero_holder;
                                        end;
                                    #< done ___B_plus_difference_copy_ne_zero_copy += __B_plus_difference_copy_ne_zero;
                                #< done ___B_plus_difference_copy_ne_zero_copy = __B_plus_difference_copy_ne_zero;
                                
                                clear _not___B_plus_difference_copy_ne_zero;
                                incr _not___B_plus_difference_copy_ne_zero;
                                
                                while ___B_plus_difference_copy_ne_zero_copy not 0 do;
                                    clear _not___B_plus_difference_copy_ne_zero;
                                    clear ___B_plus_difference_copy_ne_zero_copy;
                                end;
                            #< done _not___B_plus_difference_copy_ne_zero = not __B_plus_difference_copy_ne_zero;
                            #> _inner_or = _not__Y_copy_ne_zero or _not___B_plus_difference_copy_ne_zero;
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
                                #> __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                    clear __not___B_plus_difference_copy_ne_zero_copy;
                                    #> __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                        clear __not___B_plus_difference_copy_ne_zero_holder;
                                        
                                        while _not___B_plus_difference_copy_ne_zero not 0 do;
                                            incr __not___B_plus_difference_copy_ne_zero_copy;
                                            incr __not___B_plus_difference_copy_ne_zero_holder;
                                            decr _not___B_plus_difference_copy_ne_zero;
                                        end;
                                        
                                        while __not___B_plus_difference_copy_ne_zero_holder not 0 do;
                                            incr _not___B_plus_difference_copy_ne_zero;
                                            decr __not___B_plus_difference_copy_ne_zero_holder;
                                        end;
                                    #< done __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                #< done __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not__Y_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__Y_copy_ne_zero_copy;
                                end;
                                
                                while __not___B_plus_difference_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___B_plus_difference_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not__Y_copy_ne_zero or _not___B_plus_difference_copy_ne_zero;
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
                        #< done _neither_are_zero = _Y_copy_ne_zero and __B_plus_difference_copy_ne_zero;
                        while _neither_are_zero not 0 do;
                            decr __B_plus_difference_copy;
                            decr _Y_copy;
                            
                            #> __B_plus_difference_copy_ne_zero = __B_plus_difference_copy != 0;
                                #> _not___B_plus_difference_copy_ne_zero = __B_plus_difference_copy == 0;
                                    #> ___B_plus_difference_copy_copy = __B_plus_difference_copy;
                                        clear ___B_plus_difference_copy_copy;
                                        #> ___B_plus_difference_copy_copy += __B_plus_difference_copy;
                                            clear ___B_plus_difference_copy_holder;
                                            
                                            while __B_plus_difference_copy not 0 do;
                                                incr ___B_plus_difference_copy_copy;
                                                incr ___B_plus_difference_copy_holder;
                                                decr __B_plus_difference_copy;
                                            end;
                                            
                                            while ___B_plus_difference_copy_holder not 0 do;
                                                incr __B_plus_difference_copy;
                                                decr ___B_plus_difference_copy_holder;
                                            end;
                                        #< done ___B_plus_difference_copy_copy += __B_plus_difference_copy;
                                    #< done ___B_plus_difference_copy_copy = __B_plus_difference_copy;
                                    
                                    clear _not___B_plus_difference_copy_ne_zero;
                                    incr _not___B_plus_difference_copy_ne_zero;
                                    while ___B_plus_difference_copy_copy not 0 do;
                                        clear _not___B_plus_difference_copy_ne_zero;
                                        clear ___B_plus_difference_copy_copy;
                                    end;
                                #< done _not___B_plus_difference_copy_ne_zero = __B_plus_difference_copy == 0;
                                #> __B_plus_difference_copy_ne_zero = not _not___B_plus_difference_copy_ne_zero;
                                    #> __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                        clear __not___B_plus_difference_copy_ne_zero_copy;
                                        #> __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                            clear __not___B_plus_difference_copy_ne_zero_holder;
                                            
                                            while _not___B_plus_difference_copy_ne_zero not 0 do;
                                                incr __not___B_plus_difference_copy_ne_zero_copy;
                                                incr __not___B_plus_difference_copy_ne_zero_holder;
                                                decr _not___B_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while __not___B_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr _not___B_plus_difference_copy_ne_zero;
                                                decr __not___B_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                    #< done __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                    
                                    clear __B_plus_difference_copy_ne_zero;
                                    incr __B_plus_difference_copy_ne_zero;
                                    
                                    while __not___B_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear __B_plus_difference_copy_ne_zero;
                                        clear __not___B_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done __B_plus_difference_copy_ne_zero = not _not___B_plus_difference_copy_ne_zero;
                            #< done __B_plus_difference_copy_ne_zero = __B_plus_difference_copy != 0;
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
                            #> _neither_are_zero = _Y_copy_ne_zero and __B_plus_difference_copy_ne_zero;
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
                                #> _not___B_plus_difference_copy_ne_zero = not __B_plus_difference_copy_ne_zero;
                                    #> ___B_plus_difference_copy_ne_zero_copy = __B_plus_difference_copy_ne_zero;
                                        clear ___B_plus_difference_copy_ne_zero_copy;
                                        #> ___B_plus_difference_copy_ne_zero_copy += __B_plus_difference_copy_ne_zero;
                                            clear ___B_plus_difference_copy_ne_zero_holder;
                                            
                                            while __B_plus_difference_copy_ne_zero not 0 do;
                                                incr ___B_plus_difference_copy_ne_zero_copy;
                                                incr ___B_plus_difference_copy_ne_zero_holder;
                                                decr __B_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while ___B_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr __B_plus_difference_copy_ne_zero;
                                                decr ___B_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done ___B_plus_difference_copy_ne_zero_copy += __B_plus_difference_copy_ne_zero;
                                    #< done ___B_plus_difference_copy_ne_zero_copy = __B_plus_difference_copy_ne_zero;
                                    
                                    clear _not___B_plus_difference_copy_ne_zero;
                                    incr _not___B_plus_difference_copy_ne_zero;
                                    
                                    while ___B_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear _not___B_plus_difference_copy_ne_zero;
                                        clear ___B_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done _not___B_plus_difference_copy_ne_zero = not __B_plus_difference_copy_ne_zero;
                                #> _inner_or = _not__Y_copy_ne_zero or _not___B_plus_difference_copy_ne_zero;
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
                                    #> __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                        clear __not___B_plus_difference_copy_ne_zero_copy;
                                        #> __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                            clear __not___B_plus_difference_copy_ne_zero_holder;
                                            
                                            while _not___B_plus_difference_copy_ne_zero not 0 do;
                                                incr __not___B_plus_difference_copy_ne_zero_copy;
                                                incr __not___B_plus_difference_copy_ne_zero_holder;
                                                decr _not___B_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while __not___B_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr _not___B_plus_difference_copy_ne_zero;
                                                decr __not___B_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done __not___B_plus_difference_copy_ne_zero_copy += _not___B_plus_difference_copy_ne_zero;
                                    #< done __not___B_plus_difference_copy_ne_zero_copy = _not___B_plus_difference_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not__Y_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not__Y_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not___B_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___B_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not__Y_copy_ne_zero or _not___B_plus_difference_copy_ne_zero;
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
                            #< done _neither_are_zero = _Y_copy_ne_zero and __B_plus_difference_copy_ne_zero;
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
                        
                        while __B_plus_difference_copy_ne_zero not 0 do;
                            # __B_plus_difference_copy_ne_zero is True, so _B_plus_difference must be the larger
                            #> _difference = __B_plus_difference_copy;
                                clear _difference;
                                #> _difference += __B_plus_difference_copy;
                                    clear ___B_plus_difference_copy_holder;
                                    
                                    while __B_plus_difference_copy not 0 do;
                                        incr _difference;
                                        incr ___B_plus_difference_copy_holder;
                                        decr __B_plus_difference_copy;
                                    end;
                                    
                                    while ___B_plus_difference_copy_holder not 0 do;
                                        incr __B_plus_difference_copy;
                                        decr ___B_plus_difference_copy_holder;
                                    end;
                                #< done _difference += __B_plus_difference_copy;
                            #< done _difference = __B_plus_difference_copy;
                            clear __B_plus_difference_copy_ne_zero;
                        end;
                    #< done _difference = abs(_B_plus_difference - Y);
                    clear _B_plus_difference_eq_Y;
                    incr _B_plus_difference_eq_Y;
                    while _difference not 0 do;
                        clear _B_plus_difference_eq_Y;
                        clear _difference;
                    end;
                    
                    # If _B_plus_difference == Y, _B_plus_difference_eq_Y = 1. Otherwise, _B_plus_difference_eq_Y = 0
                #< done _B_plus_difference_eq_Y = _B_plus_difference == Y;
                # If X + abs(X - Y) == Y, Y was bigger, so false
                #> _B_gt_Y = not _B_plus_difference_eq_Y;
                    #> __B_plus_difference_eq_Y_copy = _B_plus_difference_eq_Y;
                        clear __B_plus_difference_eq_Y_copy;
                        #> __B_plus_difference_eq_Y_copy += _B_plus_difference_eq_Y;
                            clear __B_plus_difference_eq_Y_holder;
                            
                            while _B_plus_difference_eq_Y not 0 do;
                                incr __B_plus_difference_eq_Y_copy;
                                incr __B_plus_difference_eq_Y_holder;
                                decr _B_plus_difference_eq_Y;
                            end;
                            
                            while __B_plus_difference_eq_Y_holder not 0 do;
                                incr _B_plus_difference_eq_Y;
                                decr __B_plus_difference_eq_Y_holder;
                            end;
                        #< done __B_plus_difference_eq_Y_copy += _B_plus_difference_eq_Y;
                    #< done __B_plus_difference_eq_Y_copy = _B_plus_difference_eq_Y;
                    
                    clear _B_gt_Y;
                    incr _B_gt_Y;
                    
                    while __B_plus_difference_eq_Y_copy not 0 do;
                        clear _B_gt_Y;
                        clear __B_plus_difference_eq_Y_copy;
                    end;
                #< done _B_gt_Y = not _B_plus_difference_eq_Y;
            #< done _B_gt_Y = B > Y;
            #> _B_eq_Y = B == Y;
                #> _difference = abs(B - Y);
                    #> _B_copy = B;
                        clear _B_copy;
                        #> _B_copy += B;
                            clear _B_holder;
                            
                            while B not 0 do;
                                incr _B_copy;
                                incr _B_holder;
                                decr B;
                            end;
                            
                            while _B_holder not 0 do;
                                incr B;
                                decr _B_holder;
                            end;
                        #< done _B_copy += B;
                    #< done _B_copy = B;
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
                    
                    #> _B_copy_ne_zero = _B_copy != 0;
                        #> _not__B_copy_ne_zero = _B_copy == 0;
                            #> __B_copy_copy = _B_copy;
                                clear __B_copy_copy;
                                #> __B_copy_copy += _B_copy;
                                    clear __B_copy_holder;
                                    
                                    while _B_copy not 0 do;
                                        incr __B_copy_copy;
                                        incr __B_copy_holder;
                                        decr _B_copy;
                                    end;
                                    
                                    while __B_copy_holder not 0 do;
                                        incr _B_copy;
                                        decr __B_copy_holder;
                                    end;
                                #< done __B_copy_copy += _B_copy;
                            #< done __B_copy_copy = _B_copy;
                            
                            clear _not__B_copy_ne_zero;
                            incr _not__B_copy_ne_zero;
                            while __B_copy_copy not 0 do;
                                clear _not__B_copy_ne_zero;
                                clear __B_copy_copy;
                            end;
                        #< done _not__B_copy_ne_zero = _B_copy == 0;
                        #> _B_copy_ne_zero = not _not__B_copy_ne_zero;
                            #> __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                                clear __not__B_copy_ne_zero_copy;
                                #> __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                    clear __not__B_copy_ne_zero_holder;
                                    
                                    while _not__B_copy_ne_zero not 0 do;
                                        incr __not__B_copy_ne_zero_copy;
                                        incr __not__B_copy_ne_zero_holder;
                                        decr _not__B_copy_ne_zero;
                                    end;
                                    
                                    while __not__B_copy_ne_zero_holder not 0 do;
                                        incr _not__B_copy_ne_zero;
                                        decr __not__B_copy_ne_zero_holder;
                                    end;
                                #< done __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                            #< done __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                            
                            clear _B_copy_ne_zero;
                            incr _B_copy_ne_zero;
                            
                            while __not__B_copy_ne_zero_copy not 0 do;
                                clear _B_copy_ne_zero;
                                clear __not__B_copy_ne_zero_copy;
                            end;
                        #< done _B_copy_ne_zero = not _not__B_copy_ne_zero;
                    #< done _B_copy_ne_zero = _B_copy != 0;
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
                    #> _neither_are_zero = _Y_copy_ne_zero and _B_copy_ne_zero;
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
                        #> _not__B_copy_ne_zero = not _B_copy_ne_zero;
                            #> __B_copy_ne_zero_copy = _B_copy_ne_zero;
                                clear __B_copy_ne_zero_copy;
                                #> __B_copy_ne_zero_copy += _B_copy_ne_zero;
                                    clear __B_copy_ne_zero_holder;
                                    
                                    while _B_copy_ne_zero not 0 do;
                                        incr __B_copy_ne_zero_copy;
                                        incr __B_copy_ne_zero_holder;
                                        decr _B_copy_ne_zero;
                                    end;
                                    
                                    while __B_copy_ne_zero_holder not 0 do;
                                        incr _B_copy_ne_zero;
                                        decr __B_copy_ne_zero_holder;
                                    end;
                                #< done __B_copy_ne_zero_copy += _B_copy_ne_zero;
                            #< done __B_copy_ne_zero_copy = _B_copy_ne_zero;
                            
                            clear _not__B_copy_ne_zero;
                            incr _not__B_copy_ne_zero;
                            
                            while __B_copy_ne_zero_copy not 0 do;
                                clear _not__B_copy_ne_zero;
                                clear __B_copy_ne_zero_copy;
                            end;
                        #< done _not__B_copy_ne_zero = not _B_copy_ne_zero;
                        #> _inner_or = _not__Y_copy_ne_zero or _not__B_copy_ne_zero;
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
                            #> __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                                clear __not__B_copy_ne_zero_copy;
                                #> __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                    clear __not__B_copy_ne_zero_holder;
                                    
                                    while _not__B_copy_ne_zero not 0 do;
                                        incr __not__B_copy_ne_zero_copy;
                                        incr __not__B_copy_ne_zero_holder;
                                        decr _not__B_copy_ne_zero;
                                    end;
                                    
                                    while __not__B_copy_ne_zero_holder not 0 do;
                                        incr _not__B_copy_ne_zero;
                                        decr __not__B_copy_ne_zero_holder;
                                    end;
                                #< done __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                            #< done __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                            clear _inner_or;
                            
                            while __not__Y_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not__Y_copy_ne_zero_copy;
                            end;
                            
                            while __not__B_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not__B_copy_ne_zero_copy;
                            end;
                        #< done _inner_or = _not__Y_copy_ne_zero or _not__B_copy_ne_zero;
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
                    #< done _neither_are_zero = _Y_copy_ne_zero and _B_copy_ne_zero;
                    while _neither_are_zero not 0 do;
                        decr _B_copy;
                        decr _Y_copy;
                        
                        #> _B_copy_ne_zero = _B_copy != 0;
                            #> _not__B_copy_ne_zero = _B_copy == 0;
                                #> __B_copy_copy = _B_copy;
                                    clear __B_copy_copy;
                                    #> __B_copy_copy += _B_copy;
                                        clear __B_copy_holder;
                                        
                                        while _B_copy not 0 do;
                                            incr __B_copy_copy;
                                            incr __B_copy_holder;
                                            decr _B_copy;
                                        end;
                                        
                                        while __B_copy_holder not 0 do;
                                            incr _B_copy;
                                            decr __B_copy_holder;
                                        end;
                                    #< done __B_copy_copy += _B_copy;
                                #< done __B_copy_copy = _B_copy;
                                
                                clear _not__B_copy_ne_zero;
                                incr _not__B_copy_ne_zero;
                                while __B_copy_copy not 0 do;
                                    clear _not__B_copy_ne_zero;
                                    clear __B_copy_copy;
                                end;
                            #< done _not__B_copy_ne_zero = _B_copy == 0;
                            #> _B_copy_ne_zero = not _not__B_copy_ne_zero;
                                #> __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                                    clear __not__B_copy_ne_zero_copy;
                                    #> __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                        clear __not__B_copy_ne_zero_holder;
                                        
                                        while _not__B_copy_ne_zero not 0 do;
                                            incr __not__B_copy_ne_zero_copy;
                                            incr __not__B_copy_ne_zero_holder;
                                            decr _not__B_copy_ne_zero;
                                        end;
                                        
                                        while __not__B_copy_ne_zero_holder not 0 do;
                                            incr _not__B_copy_ne_zero;
                                            decr __not__B_copy_ne_zero_holder;
                                        end;
                                    #< done __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                #< done __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                                
                                clear _B_copy_ne_zero;
                                incr _B_copy_ne_zero;
                                
                                while __not__B_copy_ne_zero_copy not 0 do;
                                    clear _B_copy_ne_zero;
                                    clear __not__B_copy_ne_zero_copy;
                                end;
                            #< done _B_copy_ne_zero = not _not__B_copy_ne_zero;
                        #< done _B_copy_ne_zero = _B_copy != 0;
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
                        #> _neither_are_zero = _Y_copy_ne_zero and _B_copy_ne_zero;
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
                            #> _not__B_copy_ne_zero = not _B_copy_ne_zero;
                                #> __B_copy_ne_zero_copy = _B_copy_ne_zero;
                                    clear __B_copy_ne_zero_copy;
                                    #> __B_copy_ne_zero_copy += _B_copy_ne_zero;
                                        clear __B_copy_ne_zero_holder;
                                        
                                        while _B_copy_ne_zero not 0 do;
                                            incr __B_copy_ne_zero_copy;
                                            incr __B_copy_ne_zero_holder;
                                            decr _B_copy_ne_zero;
                                        end;
                                        
                                        while __B_copy_ne_zero_holder not 0 do;
                                            incr _B_copy_ne_zero;
                                            decr __B_copy_ne_zero_holder;
                                        end;
                                    #< done __B_copy_ne_zero_copy += _B_copy_ne_zero;
                                #< done __B_copy_ne_zero_copy = _B_copy_ne_zero;
                                
                                clear _not__B_copy_ne_zero;
                                incr _not__B_copy_ne_zero;
                                
                                while __B_copy_ne_zero_copy not 0 do;
                                    clear _not__B_copy_ne_zero;
                                    clear __B_copy_ne_zero_copy;
                                end;
                            #< done _not__B_copy_ne_zero = not _B_copy_ne_zero;
                            #> _inner_or = _not__Y_copy_ne_zero or _not__B_copy_ne_zero;
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
                                #> __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                                    clear __not__B_copy_ne_zero_copy;
                                    #> __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                        clear __not__B_copy_ne_zero_holder;
                                        
                                        while _not__B_copy_ne_zero not 0 do;
                                            incr __not__B_copy_ne_zero_copy;
                                            incr __not__B_copy_ne_zero_holder;
                                            decr _not__B_copy_ne_zero;
                                        end;
                                        
                                        while __not__B_copy_ne_zero_holder not 0 do;
                                            incr _not__B_copy_ne_zero;
                                            decr __not__B_copy_ne_zero_holder;
                                        end;
                                    #< done __not__B_copy_ne_zero_copy += _not__B_copy_ne_zero;
                                #< done __not__B_copy_ne_zero_copy = _not__B_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not__Y_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__Y_copy_ne_zero_copy;
                                end;
                                
                                while __not__B_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__B_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not__Y_copy_ne_zero or _not__B_copy_ne_zero;
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
                        #< done _neither_are_zero = _Y_copy_ne_zero and _B_copy_ne_zero;
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
                    
                    while _B_copy_ne_zero not 0 do;
                        # _B_copy_ne_zero is True, so B must be the larger
                        #> _difference = _B_copy;
                            clear _difference;
                            #> _difference += _B_copy;
                                clear __B_copy_holder;
                                
                                while _B_copy not 0 do;
                                    incr _difference;
                                    incr __B_copy_holder;
                                    decr _B_copy;
                                end;
                                
                                while __B_copy_holder not 0 do;
                                    incr _B_copy;
                                    decr __B_copy_holder;
                                end;
                            #< done _difference += _B_copy;
                        #< done _difference = _B_copy;
                        clear _B_copy_ne_zero;
                    end;
                #< done _difference = abs(B - Y);
                clear _B_eq_Y;
                incr _B_eq_Y;
                while _difference not 0 do;
                    clear _B_eq_Y;
                    clear _difference;
                end;
                
                # If B == Y, _B_eq_Y = 1. Otherwise, _B_eq_Y = 0
            #< done _B_eq_Y = B == Y;
            #> _B_ge_Y = _B_gt_Y or _B_eq_Y;
                #> __B_gt_Y_copy = _B_gt_Y;
                    clear __B_gt_Y_copy;
                    #> __B_gt_Y_copy += _B_gt_Y;
                        clear __B_gt_Y_holder;
                        
                        while _B_gt_Y not 0 do;
                            incr __B_gt_Y_copy;
                            incr __B_gt_Y_holder;
                            decr _B_gt_Y;
                        end;
                        
                        while __B_gt_Y_holder not 0 do;
                            incr _B_gt_Y;
                            decr __B_gt_Y_holder;
                        end;
                    #< done __B_gt_Y_copy += _B_gt_Y;
                #< done __B_gt_Y_copy = _B_gt_Y;
                #> __B_eq_Y_copy = _B_eq_Y;
                    clear __B_eq_Y_copy;
                    #> __B_eq_Y_copy += _B_eq_Y;
                        clear __B_eq_Y_holder;
                        
                        while _B_eq_Y not 0 do;
                            incr __B_eq_Y_copy;
                            incr __B_eq_Y_holder;
                            decr _B_eq_Y;
                        end;
                        
                        while __B_eq_Y_holder not 0 do;
                            incr _B_eq_Y;
                            decr __B_eq_Y_holder;
                        end;
                    #< done __B_eq_Y_copy += _B_eq_Y;
                #< done __B_eq_Y_copy = _B_eq_Y;
                clear _B_ge_Y;
                
                while __B_gt_Y_copy not 0 do;
                    clear _B_ge_Y;
                    incr _B_ge_Y;
                    clear __B_gt_Y_copy;
                end;
                
                while __B_eq_Y_copy not 0 do;
                    clear _B_ge_Y;
                    incr _B_ge_Y;
                    clear __B_eq_Y_copy;
                end;
            #< done _B_ge_Y = _B_gt_Y or _B_eq_Y;
        #< done _B_ge_Y = B >= Y;
    end;
#< done A r B = X / Y;
# ? = 1 / 0
#error:TimeoutError