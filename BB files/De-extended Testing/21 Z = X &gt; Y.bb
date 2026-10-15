clear X;
incr X;
incr X;
incr X;
incr X;

clear Y;
incr Y;
incr Y;
incr Y;

# X > Y:
#> A = X > Y;
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
    
    #> _difference = abs(_X_copy - _Y_copy);
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
        
        #> __X_copy_copy_ne_zero = __X_copy_copy != 0;
            #> _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
                #> ___X_copy_copy_copy = __X_copy_copy;
                    clear ___X_copy_copy_copy;
                    #> ___X_copy_copy_copy += __X_copy_copy;
                        clear ___X_copy_copy_holder;
                        
                        while __X_copy_copy not 0 do;
                            incr ___X_copy_copy_copy;
                            incr ___X_copy_copy_holder;
                            decr __X_copy_copy;
                        end;
                        
                        while ___X_copy_copy_holder not 0 do;
                            incr __X_copy_copy;
                            decr ___X_copy_copy_holder;
                        end;
                    #< done ___X_copy_copy_copy += __X_copy_copy;
                #< done ___X_copy_copy_copy = __X_copy_copy;
                
                clear _not___X_copy_copy_ne_zero;
                incr _not___X_copy_copy_ne_zero;
                while ___X_copy_copy_copy not 0 do;
                    clear _not___X_copy_copy_ne_zero;
                    clear ___X_copy_copy_copy;
                end;
            #< done _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
            #> __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
                #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    clear __not___X_copy_copy_ne_zero_copy;
                    #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_holder;
                        
                        while _not___X_copy_copy_ne_zero not 0 do;
                            incr __not___X_copy_copy_ne_zero_copy;
                            incr __not___X_copy_copy_ne_zero_holder;
                            decr _not___X_copy_copy_ne_zero;
                        end;
                        
                        while __not___X_copy_copy_ne_zero_holder not 0 do;
                            incr _not___X_copy_copy_ne_zero;
                            decr __not___X_copy_copy_ne_zero_holder;
                        end;
                    #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                
                clear __X_copy_copy_ne_zero;
                incr __X_copy_copy_ne_zero;
                
                while __not___X_copy_copy_ne_zero_copy not 0 do;
                    clear __X_copy_copy_ne_zero;
                    clear __not___X_copy_copy_ne_zero_copy;
                end;
            #< done __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
        #< done __X_copy_copy_ne_zero = __X_copy_copy != 0;
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
        #> _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
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
            #> _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
                #> ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                    clear ___X_copy_copy_ne_zero_copy;
                    #> ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                        clear ___X_copy_copy_ne_zero_holder;
                        
                        while __X_copy_copy_ne_zero not 0 do;
                            incr ___X_copy_copy_ne_zero_copy;
                            incr ___X_copy_copy_ne_zero_holder;
                            decr __X_copy_copy_ne_zero;
                        end;
                        
                        while ___X_copy_copy_ne_zero_holder not 0 do;
                            incr __X_copy_copy_ne_zero;
                            decr ___X_copy_copy_ne_zero_holder;
                        end;
                    #< done ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                #< done ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                
                clear _not___X_copy_copy_ne_zero;
                incr _not___X_copy_copy_ne_zero;
                
                while ___X_copy_copy_ne_zero_copy not 0 do;
                    clear _not___X_copy_copy_ne_zero;
                    clear ___X_copy_copy_ne_zero_copy;
                end;
            #< done _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
            #> _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
                #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    clear __not___X_copy_copy_ne_zero_copy;
                    #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_holder;
                        
                        while _not___X_copy_copy_ne_zero not 0 do;
                            incr __not___X_copy_copy_ne_zero_copy;
                            incr __not___X_copy_copy_ne_zero_holder;
                            decr _not___X_copy_copy_ne_zero;
                        end;
                        
                        while __not___X_copy_copy_ne_zero_holder not 0 do;
                            incr _not___X_copy_copy_ne_zero;
                            decr __not___X_copy_copy_ne_zero_holder;
                        end;
                    #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                clear _inner_or;
                
                while __not___Y_copy_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not___Y_copy_copy_ne_zero_copy;
                end;
                
                while __not___X_copy_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not___X_copy_copy_ne_zero_copy;
                end;
            #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
        #< done _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
        while _neither_are_zero not 0 do;
            decr __X_copy_copy;
            decr __Y_copy_copy;
            
            #> __X_copy_copy_ne_zero = __X_copy_copy != 0;
                #> _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
                    #> ___X_copy_copy_copy = __X_copy_copy;
                        clear ___X_copy_copy_copy;
                        #> ___X_copy_copy_copy += __X_copy_copy;
                            clear ___X_copy_copy_holder;
                            
                            while __X_copy_copy not 0 do;
                                incr ___X_copy_copy_copy;
                                incr ___X_copy_copy_holder;
                                decr __X_copy_copy;
                            end;
                            
                            while ___X_copy_copy_holder not 0 do;
                                incr __X_copy_copy;
                                decr ___X_copy_copy_holder;
                            end;
                        #< done ___X_copy_copy_copy += __X_copy_copy;
                    #< done ___X_copy_copy_copy = __X_copy_copy;
                    
                    clear _not___X_copy_copy_ne_zero;
                    incr _not___X_copy_copy_ne_zero;
                    while ___X_copy_copy_copy not 0 do;
                        clear _not___X_copy_copy_ne_zero;
                        clear ___X_copy_copy_copy;
                    end;
                #< done _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
                #> __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
                    #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_copy;
                        #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                            clear __not___X_copy_copy_ne_zero_holder;
                            
                            while _not___X_copy_copy_ne_zero not 0 do;
                                incr __not___X_copy_copy_ne_zero_copy;
                                incr __not___X_copy_copy_ne_zero_holder;
                                decr _not___X_copy_copy_ne_zero;
                            end;
                            
                            while __not___X_copy_copy_ne_zero_holder not 0 do;
                                incr _not___X_copy_copy_ne_zero;
                                decr __not___X_copy_copy_ne_zero_holder;
                            end;
                        #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                    #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    
                    clear __X_copy_copy_ne_zero;
                    incr __X_copy_copy_ne_zero;
                    
                    while __not___X_copy_copy_ne_zero_copy not 0 do;
                        clear __X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_copy;
                    end;
                #< done __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
            #< done __X_copy_copy_ne_zero = __X_copy_copy != 0;
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
            #> _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
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
                #> _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
                    #> ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                        clear ___X_copy_copy_ne_zero_copy;
                        #> ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                            clear ___X_copy_copy_ne_zero_holder;
                            
                            while __X_copy_copy_ne_zero not 0 do;
                                incr ___X_copy_copy_ne_zero_copy;
                                incr ___X_copy_copy_ne_zero_holder;
                                decr __X_copy_copy_ne_zero;
                            end;
                            
                            while ___X_copy_copy_ne_zero_holder not 0 do;
                                incr __X_copy_copy_ne_zero;
                                decr ___X_copy_copy_ne_zero_holder;
                            end;
                        #< done ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                    #< done ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                    
                    clear _not___X_copy_copy_ne_zero;
                    incr _not___X_copy_copy_ne_zero;
                    
                    while ___X_copy_copy_ne_zero_copy not 0 do;
                        clear _not___X_copy_copy_ne_zero;
                        clear ___X_copy_copy_ne_zero_copy;
                    end;
                #< done _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
                #> _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
                    #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_copy;
                        #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                            clear __not___X_copy_copy_ne_zero_holder;
                            
                            while _not___X_copy_copy_ne_zero not 0 do;
                                incr __not___X_copy_copy_ne_zero_copy;
                                incr __not___X_copy_copy_ne_zero_holder;
                                decr _not___X_copy_copy_ne_zero;
                            end;
                            
                            while __not___X_copy_copy_ne_zero_holder not 0 do;
                                incr _not___X_copy_copy_ne_zero;
                                decr __not___X_copy_copy_ne_zero_holder;
                            end;
                        #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                    #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    clear _inner_or;
                    
                    while __not___Y_copy_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not___Y_copy_copy_ne_zero_copy;
                    end;
                    
                    while __not___X_copy_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not___X_copy_copy_ne_zero_copy;
                    end;
                #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
            #< done _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
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
        
        while __X_copy_copy_ne_zero not 0 do;
            # __X_copy_copy_ne_zero is True, so _X_copy must be the larger
            #> _difference = __X_copy_copy;
                clear _difference;
                #> _difference += __X_copy_copy;
                    clear ___X_copy_copy_holder;
                    
                    while __X_copy_copy not 0 do;
                        incr _difference;
                        incr ___X_copy_copy_holder;
                        decr __X_copy_copy;
                    end;
                    
                    while ___X_copy_copy_holder not 0 do;
                        incr __X_copy_copy;
                        decr ___X_copy_copy_holder;
                    end;
                #< done _difference += __X_copy_copy;
            #< done _difference = __X_copy_copy;
            clear __X_copy_copy_ne_zero;
        end;
    #< done _difference = abs(_X_copy - _Y_copy);
    #> _X_plus_difference = _X_copy + _difference;
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
        clear _X_plus_difference;
        #> _X_plus_difference += __X_copy_copy;
            clear ___X_copy_copy_holder;
            
            while __X_copy_copy not 0 do;
                incr _X_plus_difference;
                incr ___X_copy_copy_holder;
                decr __X_copy_copy;
            end;
            
            while ___X_copy_copy_holder not 0 do;
                incr __X_copy_copy;
                decr ___X_copy_copy_holder;
            end;
        #< done _X_plus_difference += __X_copy_copy;
        #> _X_plus_difference += __difference_copy;
            clear ___difference_copy_holder;
            
            while __difference_copy not 0 do;
                incr _X_plus_difference;
                incr ___difference_copy_holder;
                decr __difference_copy;
            end;
            
            while ___difference_copy_holder not 0 do;
                incr __difference_copy;
                decr ___difference_copy_holder;
            end;
        #< done _X_plus_difference += __difference_copy;
    #< done _X_plus_difference = _X_copy + _difference;
    #> _X_plus_difference_eq_Y = _X_plus_difference == Y;
        #> _difference = abs(_X_plus_difference - Y);
            #> __X_plus_difference_copy = _X_plus_difference;
                clear __X_plus_difference_copy;
                #> __X_plus_difference_copy += _X_plus_difference;
                    clear __X_plus_difference_holder;
                    
                    while _X_plus_difference not 0 do;
                        incr __X_plus_difference_copy;
                        incr __X_plus_difference_holder;
                        decr _X_plus_difference;
                    end;
                    
                    while __X_plus_difference_holder not 0 do;
                        incr _X_plus_difference;
                        decr __X_plus_difference_holder;
                    end;
                #< done __X_plus_difference_copy += _X_plus_difference;
            #< done __X_plus_difference_copy = _X_plus_difference;
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
            
            #> __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
                #> _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                    #> ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                        clear ___X_plus_difference_copy_copy;
                        #> ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                            clear ___X_plus_difference_copy_holder;
                            
                            while __X_plus_difference_copy not 0 do;
                                incr ___X_plus_difference_copy_copy;
                                incr ___X_plus_difference_copy_holder;
                                decr __X_plus_difference_copy;
                            end;
                            
                            while ___X_plus_difference_copy_holder not 0 do;
                                incr __X_plus_difference_copy;
                                decr ___X_plus_difference_copy_holder;
                            end;
                        #< done ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                    #< done ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                    
                    clear _not___X_plus_difference_copy_ne_zero;
                    incr _not___X_plus_difference_copy_ne_zero;
                    while ___X_plus_difference_copy_copy not 0 do;
                        clear _not___X_plus_difference_copy_ne_zero;
                        clear ___X_plus_difference_copy_copy;
                    end;
                #< done _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                #> __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
                    #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                        #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_holder;
                            
                            while _not___X_plus_difference_copy_ne_zero not 0 do;
                                incr __not___X_plus_difference_copy_ne_zero_copy;
                                incr __not___X_plus_difference_copy_ne_zero_holder;
                                decr _not___X_plus_difference_copy_ne_zero;
                            end;
                            
                            while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                incr _not___X_plus_difference_copy_ne_zero;
                                decr __not___X_plus_difference_copy_ne_zero_holder;
                            end;
                        #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                    #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                    
                    clear __X_plus_difference_copy_ne_zero;
                    incr __X_plus_difference_copy_ne_zero;
                    
                    while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                        clear __X_plus_difference_copy_ne_zero;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                    end;
                #< done __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
            #< done __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
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
            #> _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
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
                #> _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                    #> ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                        clear ___X_plus_difference_copy_ne_zero_copy;
                        #> ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_ne_zero_holder;
                            
                            while __X_plus_difference_copy_ne_zero not 0 do;
                                incr ___X_plus_difference_copy_ne_zero_copy;
                                incr ___X_plus_difference_copy_ne_zero_holder;
                                decr __X_plus_difference_copy_ne_zero;
                            end;
                            
                            while ___X_plus_difference_copy_ne_zero_holder not 0 do;
                                incr __X_plus_difference_copy_ne_zero;
                                decr ___X_plus_difference_copy_ne_zero_holder;
                            end;
                        #< done ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                    #< done ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                    
                    clear _not___X_plus_difference_copy_ne_zero;
                    incr _not___X_plus_difference_copy_ne_zero;
                    
                    while ___X_plus_difference_copy_ne_zero_copy not 0 do;
                        clear _not___X_plus_difference_copy_ne_zero;
                        clear ___X_plus_difference_copy_ne_zero_copy;
                    end;
                #< done _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                #> _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
                    #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                        #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_holder;
                            
                            while _not___X_plus_difference_copy_ne_zero not 0 do;
                                incr __not___X_plus_difference_copy_ne_zero_copy;
                                incr __not___X_plus_difference_copy_ne_zero_holder;
                                decr _not___X_plus_difference_copy_ne_zero;
                            end;
                            
                            while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                incr _not___X_plus_difference_copy_ne_zero;
                                decr __not___X_plus_difference_copy_ne_zero_holder;
                            end;
                        #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                    #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                    clear _inner_or;
                    
                    while __not__Y_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not__Y_copy_ne_zero_copy;
                    end;
                    
                    while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                    end;
                #< done _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
            #< done _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
            while _neither_are_zero not 0 do;
                decr __X_plus_difference_copy;
                decr _Y_copy;
                
                #> __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
                    #> _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                        #> ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                            clear ___X_plus_difference_copy_copy;
                            #> ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                                clear ___X_plus_difference_copy_holder;
                                
                                while __X_plus_difference_copy not 0 do;
                                    incr ___X_plus_difference_copy_copy;
                                    incr ___X_plus_difference_copy_holder;
                                    decr __X_plus_difference_copy;
                                end;
                                
                                while ___X_plus_difference_copy_holder not 0 do;
                                    incr __X_plus_difference_copy;
                                    decr ___X_plus_difference_copy_holder;
                                end;
                            #< done ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                        #< done ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                        
                        clear _not___X_plus_difference_copy_ne_zero;
                        incr _not___X_plus_difference_copy_ne_zero;
                        while ___X_plus_difference_copy_copy not 0 do;
                            clear _not___X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_copy;
                        end;
                    #< done _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                    #> __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
                        #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                            #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                                clear __not___X_plus_difference_copy_ne_zero_holder;
                                
                                while _not___X_plus_difference_copy_ne_zero not 0 do;
                                    incr __not___X_plus_difference_copy_ne_zero_copy;
                                    incr __not___X_plus_difference_copy_ne_zero_holder;
                                    decr _not___X_plus_difference_copy_ne_zero;
                                end;
                                
                                while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                    incr _not___X_plus_difference_copy_ne_zero;
                                    decr __not___X_plus_difference_copy_ne_zero_holder;
                                end;
                            #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                        #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        
                        clear __X_plus_difference_copy_ne_zero;
                        incr __X_plus_difference_copy_ne_zero;
                        
                        while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                            clear __X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                        end;
                    #< done __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
                #< done __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
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
                #> _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
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
                    #> _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                        #> ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_ne_zero_copy;
                            #> ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                                clear ___X_plus_difference_copy_ne_zero_holder;
                                
                                while __X_plus_difference_copy_ne_zero not 0 do;
                                    incr ___X_plus_difference_copy_ne_zero_copy;
                                    incr ___X_plus_difference_copy_ne_zero_holder;
                                    decr __X_plus_difference_copy_ne_zero;
                                end;
                                
                                while ___X_plus_difference_copy_ne_zero_holder not 0 do;
                                    incr __X_plus_difference_copy_ne_zero;
                                    decr ___X_plus_difference_copy_ne_zero_holder;
                                end;
                            #< done ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                        #< done ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                        
                        clear _not___X_plus_difference_copy_ne_zero;
                        incr _not___X_plus_difference_copy_ne_zero;
                        
                        while ___X_plus_difference_copy_ne_zero_copy not 0 do;
                            clear _not___X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_ne_zero_copy;
                        end;
                    #< done _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                    #> _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
                        #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                            #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                                clear __not___X_plus_difference_copy_ne_zero_holder;
                                
                                while _not___X_plus_difference_copy_ne_zero not 0 do;
                                    incr __not___X_plus_difference_copy_ne_zero_copy;
                                    incr __not___X_plus_difference_copy_ne_zero_holder;
                                    decr _not___X_plus_difference_copy_ne_zero;
                                end;
                                
                                while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                    incr _not___X_plus_difference_copy_ne_zero;
                                    decr __not___X_plus_difference_copy_ne_zero_holder;
                                end;
                            #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                        #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        clear _inner_or;
                        
                        while __not__Y_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not__Y_copy_ne_zero_copy;
                        end;
                        
                        while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                        end;
                    #< done _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
                #< done _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
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
            
            while __X_plus_difference_copy_ne_zero not 0 do;
                # __X_plus_difference_copy_ne_zero is True, so _X_plus_difference must be the larger
                #> _difference = __X_plus_difference_copy;
                    clear _difference;
                    #> _difference += __X_plus_difference_copy;
                        clear ___X_plus_difference_copy_holder;
                        
                        while __X_plus_difference_copy not 0 do;
                            incr _difference;
                            incr ___X_plus_difference_copy_holder;
                            decr __X_plus_difference_copy;
                        end;
                        
                        while ___X_plus_difference_copy_holder not 0 do;
                            incr __X_plus_difference_copy;
                            decr ___X_plus_difference_copy_holder;
                        end;
                    #< done _difference += __X_plus_difference_copy;
                #< done _difference = __X_plus_difference_copy;
                clear __X_plus_difference_copy_ne_zero;
            end;
        #< done _difference = abs(_X_plus_difference - Y);
        clear _X_plus_difference_eq_Y;
        incr _X_plus_difference_eq_Y;
        while _difference not 0 do;
            clear _X_plus_difference_eq_Y;
            clear _difference;
        end;
        
        # If _X_plus_difference == Y, _X_plus_difference_eq_Y = 1. Otherwise, _X_plus_difference_eq_Y = 0
    #< done _X_plus_difference_eq_Y = _X_plus_difference == Y;
    # If X + abs(X - Y) == Y, Y was bigger, so false
    #> A = not _X_plus_difference_eq_Y;
        #> __X_plus_difference_eq_Y_copy = _X_plus_difference_eq_Y;
            clear __X_plus_difference_eq_Y_copy;
            #> __X_plus_difference_eq_Y_copy += _X_plus_difference_eq_Y;
                clear __X_plus_difference_eq_Y_holder;
                
                while _X_plus_difference_eq_Y not 0 do;
                    incr __X_plus_difference_eq_Y_copy;
                    incr __X_plus_difference_eq_Y_holder;
                    decr _X_plus_difference_eq_Y;
                end;
                
                while __X_plus_difference_eq_Y_holder not 0 do;
                    incr _X_plus_difference_eq_Y;
                    decr __X_plus_difference_eq_Y_holder;
                end;
            #< done __X_plus_difference_eq_Y_copy += _X_plus_difference_eq_Y;
        #< done __X_plus_difference_eq_Y_copy = _X_plus_difference_eq_Y;
        
        clear A;
        incr A;
        
        while __X_plus_difference_eq_Y_copy not 0 do;
            clear A;
            clear __X_plus_difference_eq_Y_copy;
        end;
    #< done A = not _X_plus_difference_eq_Y;
#< done A = X > Y;

incr Y;
# X == Y:
#> B = X > Y;
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
    
    #> _difference = abs(_X_copy - _Y_copy);
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
        
        #> __X_copy_copy_ne_zero = __X_copy_copy != 0;
            #> _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
                #> ___X_copy_copy_copy = __X_copy_copy;
                    clear ___X_copy_copy_copy;
                    #> ___X_copy_copy_copy += __X_copy_copy;
                        clear ___X_copy_copy_holder;
                        
                        while __X_copy_copy not 0 do;
                            incr ___X_copy_copy_copy;
                            incr ___X_copy_copy_holder;
                            decr __X_copy_copy;
                        end;
                        
                        while ___X_copy_copy_holder not 0 do;
                            incr __X_copy_copy;
                            decr ___X_copy_copy_holder;
                        end;
                    #< done ___X_copy_copy_copy += __X_copy_copy;
                #< done ___X_copy_copy_copy = __X_copy_copy;
                
                clear _not___X_copy_copy_ne_zero;
                incr _not___X_copy_copy_ne_zero;
                while ___X_copy_copy_copy not 0 do;
                    clear _not___X_copy_copy_ne_zero;
                    clear ___X_copy_copy_copy;
                end;
            #< done _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
            #> __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
                #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    clear __not___X_copy_copy_ne_zero_copy;
                    #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_holder;
                        
                        while _not___X_copy_copy_ne_zero not 0 do;
                            incr __not___X_copy_copy_ne_zero_copy;
                            incr __not___X_copy_copy_ne_zero_holder;
                            decr _not___X_copy_copy_ne_zero;
                        end;
                        
                        while __not___X_copy_copy_ne_zero_holder not 0 do;
                            incr _not___X_copy_copy_ne_zero;
                            decr __not___X_copy_copy_ne_zero_holder;
                        end;
                    #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                
                clear __X_copy_copy_ne_zero;
                incr __X_copy_copy_ne_zero;
                
                while __not___X_copy_copy_ne_zero_copy not 0 do;
                    clear __X_copy_copy_ne_zero;
                    clear __not___X_copy_copy_ne_zero_copy;
                end;
            #< done __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
        #< done __X_copy_copy_ne_zero = __X_copy_copy != 0;
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
        #> _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
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
            #> _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
                #> ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                    clear ___X_copy_copy_ne_zero_copy;
                    #> ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                        clear ___X_copy_copy_ne_zero_holder;
                        
                        while __X_copy_copy_ne_zero not 0 do;
                            incr ___X_copy_copy_ne_zero_copy;
                            incr ___X_copy_copy_ne_zero_holder;
                            decr __X_copy_copy_ne_zero;
                        end;
                        
                        while ___X_copy_copy_ne_zero_holder not 0 do;
                            incr __X_copy_copy_ne_zero;
                            decr ___X_copy_copy_ne_zero_holder;
                        end;
                    #< done ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                #< done ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                
                clear _not___X_copy_copy_ne_zero;
                incr _not___X_copy_copy_ne_zero;
                
                while ___X_copy_copy_ne_zero_copy not 0 do;
                    clear _not___X_copy_copy_ne_zero;
                    clear ___X_copy_copy_ne_zero_copy;
                end;
            #< done _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
            #> _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
                #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    clear __not___X_copy_copy_ne_zero_copy;
                    #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_holder;
                        
                        while _not___X_copy_copy_ne_zero not 0 do;
                            incr __not___X_copy_copy_ne_zero_copy;
                            incr __not___X_copy_copy_ne_zero_holder;
                            decr _not___X_copy_copy_ne_zero;
                        end;
                        
                        while __not___X_copy_copy_ne_zero_holder not 0 do;
                            incr _not___X_copy_copy_ne_zero;
                            decr __not___X_copy_copy_ne_zero_holder;
                        end;
                    #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                clear _inner_or;
                
                while __not___Y_copy_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not___Y_copy_copy_ne_zero_copy;
                end;
                
                while __not___X_copy_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not___X_copy_copy_ne_zero_copy;
                end;
            #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
        #< done _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
        while _neither_are_zero not 0 do;
            decr __X_copy_copy;
            decr __Y_copy_copy;
            
            #> __X_copy_copy_ne_zero = __X_copy_copy != 0;
                #> _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
                    #> ___X_copy_copy_copy = __X_copy_copy;
                        clear ___X_copy_copy_copy;
                        #> ___X_copy_copy_copy += __X_copy_copy;
                            clear ___X_copy_copy_holder;
                            
                            while __X_copy_copy not 0 do;
                                incr ___X_copy_copy_copy;
                                incr ___X_copy_copy_holder;
                                decr __X_copy_copy;
                            end;
                            
                            while ___X_copy_copy_holder not 0 do;
                                incr __X_copy_copy;
                                decr ___X_copy_copy_holder;
                            end;
                        #< done ___X_copy_copy_copy += __X_copy_copy;
                    #< done ___X_copy_copy_copy = __X_copy_copy;
                    
                    clear _not___X_copy_copy_ne_zero;
                    incr _not___X_copy_copy_ne_zero;
                    while ___X_copy_copy_copy not 0 do;
                        clear _not___X_copy_copy_ne_zero;
                        clear ___X_copy_copy_copy;
                    end;
                #< done _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
                #> __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
                    #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_copy;
                        #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                            clear __not___X_copy_copy_ne_zero_holder;
                            
                            while _not___X_copy_copy_ne_zero not 0 do;
                                incr __not___X_copy_copy_ne_zero_copy;
                                incr __not___X_copy_copy_ne_zero_holder;
                                decr _not___X_copy_copy_ne_zero;
                            end;
                            
                            while __not___X_copy_copy_ne_zero_holder not 0 do;
                                incr _not___X_copy_copy_ne_zero;
                                decr __not___X_copy_copy_ne_zero_holder;
                            end;
                        #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                    #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    
                    clear __X_copy_copy_ne_zero;
                    incr __X_copy_copy_ne_zero;
                    
                    while __not___X_copy_copy_ne_zero_copy not 0 do;
                        clear __X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_copy;
                    end;
                #< done __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
            #< done __X_copy_copy_ne_zero = __X_copy_copy != 0;
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
            #> _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
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
                #> _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
                    #> ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                        clear ___X_copy_copy_ne_zero_copy;
                        #> ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                            clear ___X_copy_copy_ne_zero_holder;
                            
                            while __X_copy_copy_ne_zero not 0 do;
                                incr ___X_copy_copy_ne_zero_copy;
                                incr ___X_copy_copy_ne_zero_holder;
                                decr __X_copy_copy_ne_zero;
                            end;
                            
                            while ___X_copy_copy_ne_zero_holder not 0 do;
                                incr __X_copy_copy_ne_zero;
                                decr ___X_copy_copy_ne_zero_holder;
                            end;
                        #< done ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                    #< done ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                    
                    clear _not___X_copy_copy_ne_zero;
                    incr _not___X_copy_copy_ne_zero;
                    
                    while ___X_copy_copy_ne_zero_copy not 0 do;
                        clear _not___X_copy_copy_ne_zero;
                        clear ___X_copy_copy_ne_zero_copy;
                    end;
                #< done _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
                #> _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
                    #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_copy;
                        #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                            clear __not___X_copy_copy_ne_zero_holder;
                            
                            while _not___X_copy_copy_ne_zero not 0 do;
                                incr __not___X_copy_copy_ne_zero_copy;
                                incr __not___X_copy_copy_ne_zero_holder;
                                decr _not___X_copy_copy_ne_zero;
                            end;
                            
                            while __not___X_copy_copy_ne_zero_holder not 0 do;
                                incr _not___X_copy_copy_ne_zero;
                                decr __not___X_copy_copy_ne_zero_holder;
                            end;
                        #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                    #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    clear _inner_or;
                    
                    while __not___Y_copy_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not___Y_copy_copy_ne_zero_copy;
                    end;
                    
                    while __not___X_copy_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not___X_copy_copy_ne_zero_copy;
                    end;
                #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
            #< done _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
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
        
        while __X_copy_copy_ne_zero not 0 do;
            # __X_copy_copy_ne_zero is True, so _X_copy must be the larger
            #> _difference = __X_copy_copy;
                clear _difference;
                #> _difference += __X_copy_copy;
                    clear ___X_copy_copy_holder;
                    
                    while __X_copy_copy not 0 do;
                        incr _difference;
                        incr ___X_copy_copy_holder;
                        decr __X_copy_copy;
                    end;
                    
                    while ___X_copy_copy_holder not 0 do;
                        incr __X_copy_copy;
                        decr ___X_copy_copy_holder;
                    end;
                #< done _difference += __X_copy_copy;
            #< done _difference = __X_copy_copy;
            clear __X_copy_copy_ne_zero;
        end;
    #< done _difference = abs(_X_copy - _Y_copy);
    #> _X_plus_difference = _X_copy + _difference;
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
        clear _X_plus_difference;
        #> _X_plus_difference += __X_copy_copy;
            clear ___X_copy_copy_holder;
            
            while __X_copy_copy not 0 do;
                incr _X_plus_difference;
                incr ___X_copy_copy_holder;
                decr __X_copy_copy;
            end;
            
            while ___X_copy_copy_holder not 0 do;
                incr __X_copy_copy;
                decr ___X_copy_copy_holder;
            end;
        #< done _X_plus_difference += __X_copy_copy;
        #> _X_plus_difference += __difference_copy;
            clear ___difference_copy_holder;
            
            while __difference_copy not 0 do;
                incr _X_plus_difference;
                incr ___difference_copy_holder;
                decr __difference_copy;
            end;
            
            while ___difference_copy_holder not 0 do;
                incr __difference_copy;
                decr ___difference_copy_holder;
            end;
        #< done _X_plus_difference += __difference_copy;
    #< done _X_plus_difference = _X_copy + _difference;
    #> _X_plus_difference_eq_Y = _X_plus_difference == Y;
        #> _difference = abs(_X_plus_difference - Y);
            #> __X_plus_difference_copy = _X_plus_difference;
                clear __X_plus_difference_copy;
                #> __X_plus_difference_copy += _X_plus_difference;
                    clear __X_plus_difference_holder;
                    
                    while _X_plus_difference not 0 do;
                        incr __X_plus_difference_copy;
                        incr __X_plus_difference_holder;
                        decr _X_plus_difference;
                    end;
                    
                    while __X_plus_difference_holder not 0 do;
                        incr _X_plus_difference;
                        decr __X_plus_difference_holder;
                    end;
                #< done __X_plus_difference_copy += _X_plus_difference;
            #< done __X_plus_difference_copy = _X_plus_difference;
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
            
            #> __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
                #> _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                    #> ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                        clear ___X_plus_difference_copy_copy;
                        #> ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                            clear ___X_plus_difference_copy_holder;
                            
                            while __X_plus_difference_copy not 0 do;
                                incr ___X_plus_difference_copy_copy;
                                incr ___X_plus_difference_copy_holder;
                                decr __X_plus_difference_copy;
                            end;
                            
                            while ___X_plus_difference_copy_holder not 0 do;
                                incr __X_plus_difference_copy;
                                decr ___X_plus_difference_copy_holder;
                            end;
                        #< done ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                    #< done ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                    
                    clear _not___X_plus_difference_copy_ne_zero;
                    incr _not___X_plus_difference_copy_ne_zero;
                    while ___X_plus_difference_copy_copy not 0 do;
                        clear _not___X_plus_difference_copy_ne_zero;
                        clear ___X_plus_difference_copy_copy;
                    end;
                #< done _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                #> __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
                    #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                        #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_holder;
                            
                            while _not___X_plus_difference_copy_ne_zero not 0 do;
                                incr __not___X_plus_difference_copy_ne_zero_copy;
                                incr __not___X_plus_difference_copy_ne_zero_holder;
                                decr _not___X_plus_difference_copy_ne_zero;
                            end;
                            
                            while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                incr _not___X_plus_difference_copy_ne_zero;
                                decr __not___X_plus_difference_copy_ne_zero_holder;
                            end;
                        #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                    #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                    
                    clear __X_plus_difference_copy_ne_zero;
                    incr __X_plus_difference_copy_ne_zero;
                    
                    while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                        clear __X_plus_difference_copy_ne_zero;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                    end;
                #< done __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
            #< done __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
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
            #> _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
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
                #> _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                    #> ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                        clear ___X_plus_difference_copy_ne_zero_copy;
                        #> ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_ne_zero_holder;
                            
                            while __X_plus_difference_copy_ne_zero not 0 do;
                                incr ___X_plus_difference_copy_ne_zero_copy;
                                incr ___X_plus_difference_copy_ne_zero_holder;
                                decr __X_plus_difference_copy_ne_zero;
                            end;
                            
                            while ___X_plus_difference_copy_ne_zero_holder not 0 do;
                                incr __X_plus_difference_copy_ne_zero;
                                decr ___X_plus_difference_copy_ne_zero_holder;
                            end;
                        #< done ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                    #< done ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                    
                    clear _not___X_plus_difference_copy_ne_zero;
                    incr _not___X_plus_difference_copy_ne_zero;
                    
                    while ___X_plus_difference_copy_ne_zero_copy not 0 do;
                        clear _not___X_plus_difference_copy_ne_zero;
                        clear ___X_plus_difference_copy_ne_zero_copy;
                    end;
                #< done _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                #> _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
                    #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                        #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_holder;
                            
                            while _not___X_plus_difference_copy_ne_zero not 0 do;
                                incr __not___X_plus_difference_copy_ne_zero_copy;
                                incr __not___X_plus_difference_copy_ne_zero_holder;
                                decr _not___X_plus_difference_copy_ne_zero;
                            end;
                            
                            while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                incr _not___X_plus_difference_copy_ne_zero;
                                decr __not___X_plus_difference_copy_ne_zero_holder;
                            end;
                        #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                    #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                    clear _inner_or;
                    
                    while __not__Y_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not__Y_copy_ne_zero_copy;
                    end;
                    
                    while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                    end;
                #< done _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
            #< done _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
            while _neither_are_zero not 0 do;
                decr __X_plus_difference_copy;
                decr _Y_copy;
                
                #> __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
                    #> _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                        #> ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                            clear ___X_plus_difference_copy_copy;
                            #> ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                                clear ___X_plus_difference_copy_holder;
                                
                                while __X_plus_difference_copy not 0 do;
                                    incr ___X_plus_difference_copy_copy;
                                    incr ___X_plus_difference_copy_holder;
                                    decr __X_plus_difference_copy;
                                end;
                                
                                while ___X_plus_difference_copy_holder not 0 do;
                                    incr __X_plus_difference_copy;
                                    decr ___X_plus_difference_copy_holder;
                                end;
                            #< done ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                        #< done ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                        
                        clear _not___X_plus_difference_copy_ne_zero;
                        incr _not___X_plus_difference_copy_ne_zero;
                        while ___X_plus_difference_copy_copy not 0 do;
                            clear _not___X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_copy;
                        end;
                    #< done _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                    #> __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
                        #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                            #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                                clear __not___X_plus_difference_copy_ne_zero_holder;
                                
                                while _not___X_plus_difference_copy_ne_zero not 0 do;
                                    incr __not___X_plus_difference_copy_ne_zero_copy;
                                    incr __not___X_plus_difference_copy_ne_zero_holder;
                                    decr _not___X_plus_difference_copy_ne_zero;
                                end;
                                
                                while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                    incr _not___X_plus_difference_copy_ne_zero;
                                    decr __not___X_plus_difference_copy_ne_zero_holder;
                                end;
                            #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                        #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        
                        clear __X_plus_difference_copy_ne_zero;
                        incr __X_plus_difference_copy_ne_zero;
                        
                        while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                            clear __X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                        end;
                    #< done __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
                #< done __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
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
                #> _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
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
                    #> _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                        #> ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_ne_zero_copy;
                            #> ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                                clear ___X_plus_difference_copy_ne_zero_holder;
                                
                                while __X_plus_difference_copy_ne_zero not 0 do;
                                    incr ___X_plus_difference_copy_ne_zero_copy;
                                    incr ___X_plus_difference_copy_ne_zero_holder;
                                    decr __X_plus_difference_copy_ne_zero;
                                end;
                                
                                while ___X_plus_difference_copy_ne_zero_holder not 0 do;
                                    incr __X_plus_difference_copy_ne_zero;
                                    decr ___X_plus_difference_copy_ne_zero_holder;
                                end;
                            #< done ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                        #< done ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                        
                        clear _not___X_plus_difference_copy_ne_zero;
                        incr _not___X_plus_difference_copy_ne_zero;
                        
                        while ___X_plus_difference_copy_ne_zero_copy not 0 do;
                            clear _not___X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_ne_zero_copy;
                        end;
                    #< done _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                    #> _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
                        #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                            #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                                clear __not___X_plus_difference_copy_ne_zero_holder;
                                
                                while _not___X_plus_difference_copy_ne_zero not 0 do;
                                    incr __not___X_plus_difference_copy_ne_zero_copy;
                                    incr __not___X_plus_difference_copy_ne_zero_holder;
                                    decr _not___X_plus_difference_copy_ne_zero;
                                end;
                                
                                while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                    incr _not___X_plus_difference_copy_ne_zero;
                                    decr __not___X_plus_difference_copy_ne_zero_holder;
                                end;
                            #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                        #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        clear _inner_or;
                        
                        while __not__Y_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not__Y_copy_ne_zero_copy;
                        end;
                        
                        while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                        end;
                    #< done _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
                #< done _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
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
            
            while __X_plus_difference_copy_ne_zero not 0 do;
                # __X_plus_difference_copy_ne_zero is True, so _X_plus_difference must be the larger
                #> _difference = __X_plus_difference_copy;
                    clear _difference;
                    #> _difference += __X_plus_difference_copy;
                        clear ___X_plus_difference_copy_holder;
                        
                        while __X_plus_difference_copy not 0 do;
                            incr _difference;
                            incr ___X_plus_difference_copy_holder;
                            decr __X_plus_difference_copy;
                        end;
                        
                        while ___X_plus_difference_copy_holder not 0 do;
                            incr __X_plus_difference_copy;
                            decr ___X_plus_difference_copy_holder;
                        end;
                    #< done _difference += __X_plus_difference_copy;
                #< done _difference = __X_plus_difference_copy;
                clear __X_plus_difference_copy_ne_zero;
            end;
        #< done _difference = abs(_X_plus_difference - Y);
        clear _X_plus_difference_eq_Y;
        incr _X_plus_difference_eq_Y;
        while _difference not 0 do;
            clear _X_plus_difference_eq_Y;
            clear _difference;
        end;
        
        # If _X_plus_difference == Y, _X_plus_difference_eq_Y = 1. Otherwise, _X_plus_difference_eq_Y = 0
    #< done _X_plus_difference_eq_Y = _X_plus_difference == Y;
    # If X + abs(X - Y) == Y, Y was bigger, so false
    #> B = not _X_plus_difference_eq_Y;
        #> __X_plus_difference_eq_Y_copy = _X_plus_difference_eq_Y;
            clear __X_plus_difference_eq_Y_copy;
            #> __X_plus_difference_eq_Y_copy += _X_plus_difference_eq_Y;
                clear __X_plus_difference_eq_Y_holder;
                
                while _X_plus_difference_eq_Y not 0 do;
                    incr __X_plus_difference_eq_Y_copy;
                    incr __X_plus_difference_eq_Y_holder;
                    decr _X_plus_difference_eq_Y;
                end;
                
                while __X_plus_difference_eq_Y_holder not 0 do;
                    incr _X_plus_difference_eq_Y;
                    decr __X_plus_difference_eq_Y_holder;
                end;
            #< done __X_plus_difference_eq_Y_copy += _X_plus_difference_eq_Y;
        #< done __X_plus_difference_eq_Y_copy = _X_plus_difference_eq_Y;
        
        clear B;
        incr B;
        
        while __X_plus_difference_eq_Y_copy not 0 do;
            clear B;
            clear __X_plus_difference_eq_Y_copy;
        end;
    #< done B = not _X_plus_difference_eq_Y;
#< done B = X > Y;

incr Y;
# X < Y:
#> C = X > Y;
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
    
    #> _difference = abs(_X_copy - _Y_copy);
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
        
        #> __X_copy_copy_ne_zero = __X_copy_copy != 0;
            #> _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
                #> ___X_copy_copy_copy = __X_copy_copy;
                    clear ___X_copy_copy_copy;
                    #> ___X_copy_copy_copy += __X_copy_copy;
                        clear ___X_copy_copy_holder;
                        
                        while __X_copy_copy not 0 do;
                            incr ___X_copy_copy_copy;
                            incr ___X_copy_copy_holder;
                            decr __X_copy_copy;
                        end;
                        
                        while ___X_copy_copy_holder not 0 do;
                            incr __X_copy_copy;
                            decr ___X_copy_copy_holder;
                        end;
                    #< done ___X_copy_copy_copy += __X_copy_copy;
                #< done ___X_copy_copy_copy = __X_copy_copy;
                
                clear _not___X_copy_copy_ne_zero;
                incr _not___X_copy_copy_ne_zero;
                while ___X_copy_copy_copy not 0 do;
                    clear _not___X_copy_copy_ne_zero;
                    clear ___X_copy_copy_copy;
                end;
            #< done _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
            #> __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
                #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    clear __not___X_copy_copy_ne_zero_copy;
                    #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_holder;
                        
                        while _not___X_copy_copy_ne_zero not 0 do;
                            incr __not___X_copy_copy_ne_zero_copy;
                            incr __not___X_copy_copy_ne_zero_holder;
                            decr _not___X_copy_copy_ne_zero;
                        end;
                        
                        while __not___X_copy_copy_ne_zero_holder not 0 do;
                            incr _not___X_copy_copy_ne_zero;
                            decr __not___X_copy_copy_ne_zero_holder;
                        end;
                    #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                
                clear __X_copy_copy_ne_zero;
                incr __X_copy_copy_ne_zero;
                
                while __not___X_copy_copy_ne_zero_copy not 0 do;
                    clear __X_copy_copy_ne_zero;
                    clear __not___X_copy_copy_ne_zero_copy;
                end;
            #< done __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
        #< done __X_copy_copy_ne_zero = __X_copy_copy != 0;
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
        #> _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
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
            #> _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
                #> ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                    clear ___X_copy_copy_ne_zero_copy;
                    #> ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                        clear ___X_copy_copy_ne_zero_holder;
                        
                        while __X_copy_copy_ne_zero not 0 do;
                            incr ___X_copy_copy_ne_zero_copy;
                            incr ___X_copy_copy_ne_zero_holder;
                            decr __X_copy_copy_ne_zero;
                        end;
                        
                        while ___X_copy_copy_ne_zero_holder not 0 do;
                            incr __X_copy_copy_ne_zero;
                            decr ___X_copy_copy_ne_zero_holder;
                        end;
                    #< done ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                #< done ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                
                clear _not___X_copy_copy_ne_zero;
                incr _not___X_copy_copy_ne_zero;
                
                while ___X_copy_copy_ne_zero_copy not 0 do;
                    clear _not___X_copy_copy_ne_zero;
                    clear ___X_copy_copy_ne_zero_copy;
                end;
            #< done _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
            #> _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
                #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    clear __not___X_copy_copy_ne_zero_copy;
                    #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_holder;
                        
                        while _not___X_copy_copy_ne_zero not 0 do;
                            incr __not___X_copy_copy_ne_zero_copy;
                            incr __not___X_copy_copy_ne_zero_holder;
                            decr _not___X_copy_copy_ne_zero;
                        end;
                        
                        while __not___X_copy_copy_ne_zero_holder not 0 do;
                            incr _not___X_copy_copy_ne_zero;
                            decr __not___X_copy_copy_ne_zero_holder;
                        end;
                    #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                clear _inner_or;
                
                while __not___Y_copy_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not___Y_copy_copy_ne_zero_copy;
                end;
                
                while __not___X_copy_copy_ne_zero_copy not 0 do;
                    clear _inner_or;
                    incr _inner_or;
                    clear __not___X_copy_copy_ne_zero_copy;
                end;
            #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
        #< done _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
        while _neither_are_zero not 0 do;
            decr __X_copy_copy;
            decr __Y_copy_copy;
            
            #> __X_copy_copy_ne_zero = __X_copy_copy != 0;
                #> _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
                    #> ___X_copy_copy_copy = __X_copy_copy;
                        clear ___X_copy_copy_copy;
                        #> ___X_copy_copy_copy += __X_copy_copy;
                            clear ___X_copy_copy_holder;
                            
                            while __X_copy_copy not 0 do;
                                incr ___X_copy_copy_copy;
                                incr ___X_copy_copy_holder;
                                decr __X_copy_copy;
                            end;
                            
                            while ___X_copy_copy_holder not 0 do;
                                incr __X_copy_copy;
                                decr ___X_copy_copy_holder;
                            end;
                        #< done ___X_copy_copy_copy += __X_copy_copy;
                    #< done ___X_copy_copy_copy = __X_copy_copy;
                    
                    clear _not___X_copy_copy_ne_zero;
                    incr _not___X_copy_copy_ne_zero;
                    while ___X_copy_copy_copy not 0 do;
                        clear _not___X_copy_copy_ne_zero;
                        clear ___X_copy_copy_copy;
                    end;
                #< done _not___X_copy_copy_ne_zero = __X_copy_copy == 0;
                #> __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
                    #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_copy;
                        #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                            clear __not___X_copy_copy_ne_zero_holder;
                            
                            while _not___X_copy_copy_ne_zero not 0 do;
                                incr __not___X_copy_copy_ne_zero_copy;
                                incr __not___X_copy_copy_ne_zero_holder;
                                decr _not___X_copy_copy_ne_zero;
                            end;
                            
                            while __not___X_copy_copy_ne_zero_holder not 0 do;
                                incr _not___X_copy_copy_ne_zero;
                                decr __not___X_copy_copy_ne_zero_holder;
                            end;
                        #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                    #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    
                    clear __X_copy_copy_ne_zero;
                    incr __X_copy_copy_ne_zero;
                    
                    while __not___X_copy_copy_ne_zero_copy not 0 do;
                        clear __X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_copy;
                    end;
                #< done __X_copy_copy_ne_zero = not _not___X_copy_copy_ne_zero;
            #< done __X_copy_copy_ne_zero = __X_copy_copy != 0;
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
            #> _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
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
                #> _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
                    #> ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                        clear ___X_copy_copy_ne_zero_copy;
                        #> ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                            clear ___X_copy_copy_ne_zero_holder;
                            
                            while __X_copy_copy_ne_zero not 0 do;
                                incr ___X_copy_copy_ne_zero_copy;
                                incr ___X_copy_copy_ne_zero_holder;
                                decr __X_copy_copy_ne_zero;
                            end;
                            
                            while ___X_copy_copy_ne_zero_holder not 0 do;
                                incr __X_copy_copy_ne_zero;
                                decr ___X_copy_copy_ne_zero_holder;
                            end;
                        #< done ___X_copy_copy_ne_zero_copy += __X_copy_copy_ne_zero;
                    #< done ___X_copy_copy_ne_zero_copy = __X_copy_copy_ne_zero;
                    
                    clear _not___X_copy_copy_ne_zero;
                    incr _not___X_copy_copy_ne_zero;
                    
                    while ___X_copy_copy_ne_zero_copy not 0 do;
                        clear _not___X_copy_copy_ne_zero;
                        clear ___X_copy_copy_ne_zero_copy;
                    end;
                #< done _not___X_copy_copy_ne_zero = not __X_copy_copy_ne_zero;
                #> _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
                    #> __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                        clear __not___X_copy_copy_ne_zero_copy;
                        #> __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                            clear __not___X_copy_copy_ne_zero_holder;
                            
                            while _not___X_copy_copy_ne_zero not 0 do;
                                incr __not___X_copy_copy_ne_zero_copy;
                                incr __not___X_copy_copy_ne_zero_holder;
                                decr _not___X_copy_copy_ne_zero;
                            end;
                            
                            while __not___X_copy_copy_ne_zero_holder not 0 do;
                                incr _not___X_copy_copy_ne_zero;
                                decr __not___X_copy_copy_ne_zero_holder;
                            end;
                        #< done __not___X_copy_copy_ne_zero_copy += _not___X_copy_copy_ne_zero;
                    #< done __not___X_copy_copy_ne_zero_copy = _not___X_copy_copy_ne_zero;
                    clear _inner_or;
                    
                    while __not___Y_copy_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not___Y_copy_copy_ne_zero_copy;
                    end;
                    
                    while __not___X_copy_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not___X_copy_copy_ne_zero_copy;
                    end;
                #< done _inner_or = _not___Y_copy_copy_ne_zero or _not___X_copy_copy_ne_zero;
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
            #< done _neither_are_zero = __Y_copy_copy_ne_zero and __X_copy_copy_ne_zero;
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
        
        while __X_copy_copy_ne_zero not 0 do;
            # __X_copy_copy_ne_zero is True, so _X_copy must be the larger
            #> _difference = __X_copy_copy;
                clear _difference;
                #> _difference += __X_copy_copy;
                    clear ___X_copy_copy_holder;
                    
                    while __X_copy_copy not 0 do;
                        incr _difference;
                        incr ___X_copy_copy_holder;
                        decr __X_copy_copy;
                    end;
                    
                    while ___X_copy_copy_holder not 0 do;
                        incr __X_copy_copy;
                        decr ___X_copy_copy_holder;
                    end;
                #< done _difference += __X_copy_copy;
            #< done _difference = __X_copy_copy;
            clear __X_copy_copy_ne_zero;
        end;
    #< done _difference = abs(_X_copy - _Y_copy);
    #> _X_plus_difference = _X_copy + _difference;
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
        clear _X_plus_difference;
        #> _X_plus_difference += __X_copy_copy;
            clear ___X_copy_copy_holder;
            
            while __X_copy_copy not 0 do;
                incr _X_plus_difference;
                incr ___X_copy_copy_holder;
                decr __X_copy_copy;
            end;
            
            while ___X_copy_copy_holder not 0 do;
                incr __X_copy_copy;
                decr ___X_copy_copy_holder;
            end;
        #< done _X_plus_difference += __X_copy_copy;
        #> _X_plus_difference += __difference_copy;
            clear ___difference_copy_holder;
            
            while __difference_copy not 0 do;
                incr _X_plus_difference;
                incr ___difference_copy_holder;
                decr __difference_copy;
            end;
            
            while ___difference_copy_holder not 0 do;
                incr __difference_copy;
                decr ___difference_copy_holder;
            end;
        #< done _X_plus_difference += __difference_copy;
    #< done _X_plus_difference = _X_copy + _difference;
    #> _X_plus_difference_eq_Y = _X_plus_difference == Y;
        #> _difference = abs(_X_plus_difference - Y);
            #> __X_plus_difference_copy = _X_plus_difference;
                clear __X_plus_difference_copy;
                #> __X_plus_difference_copy += _X_plus_difference;
                    clear __X_plus_difference_holder;
                    
                    while _X_plus_difference not 0 do;
                        incr __X_plus_difference_copy;
                        incr __X_plus_difference_holder;
                        decr _X_plus_difference;
                    end;
                    
                    while __X_plus_difference_holder not 0 do;
                        incr _X_plus_difference;
                        decr __X_plus_difference_holder;
                    end;
                #< done __X_plus_difference_copy += _X_plus_difference;
            #< done __X_plus_difference_copy = _X_plus_difference;
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
            
            #> __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
                #> _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                    #> ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                        clear ___X_plus_difference_copy_copy;
                        #> ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                            clear ___X_plus_difference_copy_holder;
                            
                            while __X_plus_difference_copy not 0 do;
                                incr ___X_plus_difference_copy_copy;
                                incr ___X_plus_difference_copy_holder;
                                decr __X_plus_difference_copy;
                            end;
                            
                            while ___X_plus_difference_copy_holder not 0 do;
                                incr __X_plus_difference_copy;
                                decr ___X_plus_difference_copy_holder;
                            end;
                        #< done ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                    #< done ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                    
                    clear _not___X_plus_difference_copy_ne_zero;
                    incr _not___X_plus_difference_copy_ne_zero;
                    while ___X_plus_difference_copy_copy not 0 do;
                        clear _not___X_plus_difference_copy_ne_zero;
                        clear ___X_plus_difference_copy_copy;
                    end;
                #< done _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                #> __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
                    #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                        #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_holder;
                            
                            while _not___X_plus_difference_copy_ne_zero not 0 do;
                                incr __not___X_plus_difference_copy_ne_zero_copy;
                                incr __not___X_plus_difference_copy_ne_zero_holder;
                                decr _not___X_plus_difference_copy_ne_zero;
                            end;
                            
                            while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                incr _not___X_plus_difference_copy_ne_zero;
                                decr __not___X_plus_difference_copy_ne_zero_holder;
                            end;
                        #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                    #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                    
                    clear __X_plus_difference_copy_ne_zero;
                    incr __X_plus_difference_copy_ne_zero;
                    
                    while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                        clear __X_plus_difference_copy_ne_zero;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                    end;
                #< done __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
            #< done __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
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
            #> _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
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
                #> _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                    #> ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                        clear ___X_plus_difference_copy_ne_zero_copy;
                        #> ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_ne_zero_holder;
                            
                            while __X_plus_difference_copy_ne_zero not 0 do;
                                incr ___X_plus_difference_copy_ne_zero_copy;
                                incr ___X_plus_difference_copy_ne_zero_holder;
                                decr __X_plus_difference_copy_ne_zero;
                            end;
                            
                            while ___X_plus_difference_copy_ne_zero_holder not 0 do;
                                incr __X_plus_difference_copy_ne_zero;
                                decr ___X_plus_difference_copy_ne_zero_holder;
                            end;
                        #< done ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                    #< done ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                    
                    clear _not___X_plus_difference_copy_ne_zero;
                    incr _not___X_plus_difference_copy_ne_zero;
                    
                    while ___X_plus_difference_copy_ne_zero_copy not 0 do;
                        clear _not___X_plus_difference_copy_ne_zero;
                        clear ___X_plus_difference_copy_ne_zero_copy;
                    end;
                #< done _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                #> _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
                    #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                        #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_holder;
                            
                            while _not___X_plus_difference_copy_ne_zero not 0 do;
                                incr __not___X_plus_difference_copy_ne_zero_copy;
                                incr __not___X_plus_difference_copy_ne_zero_holder;
                                decr _not___X_plus_difference_copy_ne_zero;
                            end;
                            
                            while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                incr _not___X_plus_difference_copy_ne_zero;
                                decr __not___X_plus_difference_copy_ne_zero_holder;
                            end;
                        #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                    #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                    clear _inner_or;
                    
                    while __not__Y_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not__Y_copy_ne_zero_copy;
                    end;
                    
                    while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                        clear _inner_or;
                        incr _inner_or;
                        clear __not___X_plus_difference_copy_ne_zero_copy;
                    end;
                #< done _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
            #< done _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
            while _neither_are_zero not 0 do;
                decr __X_plus_difference_copy;
                decr _Y_copy;
                
                #> __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
                    #> _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                        #> ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                            clear ___X_plus_difference_copy_copy;
                            #> ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                                clear ___X_plus_difference_copy_holder;
                                
                                while __X_plus_difference_copy not 0 do;
                                    incr ___X_plus_difference_copy_copy;
                                    incr ___X_plus_difference_copy_holder;
                                    decr __X_plus_difference_copy;
                                end;
                                
                                while ___X_plus_difference_copy_holder not 0 do;
                                    incr __X_plus_difference_copy;
                                    decr ___X_plus_difference_copy_holder;
                                end;
                            #< done ___X_plus_difference_copy_copy += __X_plus_difference_copy;
                        #< done ___X_plus_difference_copy_copy = __X_plus_difference_copy;
                        
                        clear _not___X_plus_difference_copy_ne_zero;
                        incr _not___X_plus_difference_copy_ne_zero;
                        while ___X_plus_difference_copy_copy not 0 do;
                            clear _not___X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_copy;
                        end;
                    #< done _not___X_plus_difference_copy_ne_zero = __X_plus_difference_copy == 0;
                    #> __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
                        #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                            #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                                clear __not___X_plus_difference_copy_ne_zero_holder;
                                
                                while _not___X_plus_difference_copy_ne_zero not 0 do;
                                    incr __not___X_plus_difference_copy_ne_zero_copy;
                                    incr __not___X_plus_difference_copy_ne_zero_holder;
                                    decr _not___X_plus_difference_copy_ne_zero;
                                end;
                                
                                while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                    incr _not___X_plus_difference_copy_ne_zero;
                                    decr __not___X_plus_difference_copy_ne_zero_holder;
                                end;
                            #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                        #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        
                        clear __X_plus_difference_copy_ne_zero;
                        incr __X_plus_difference_copy_ne_zero;
                        
                        while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                            clear __X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                        end;
                    #< done __X_plus_difference_copy_ne_zero = not _not___X_plus_difference_copy_ne_zero;
                #< done __X_plus_difference_copy_ne_zero = __X_plus_difference_copy != 0;
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
                #> _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
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
                    #> _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                        #> ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_ne_zero_copy;
                            #> ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                                clear ___X_plus_difference_copy_ne_zero_holder;
                                
                                while __X_plus_difference_copy_ne_zero not 0 do;
                                    incr ___X_plus_difference_copy_ne_zero_copy;
                                    incr ___X_plus_difference_copy_ne_zero_holder;
                                    decr __X_plus_difference_copy_ne_zero;
                                end;
                                
                                while ___X_plus_difference_copy_ne_zero_holder not 0 do;
                                    incr __X_plus_difference_copy_ne_zero;
                                    decr ___X_plus_difference_copy_ne_zero_holder;
                                end;
                            #< done ___X_plus_difference_copy_ne_zero_copy += __X_plus_difference_copy_ne_zero;
                        #< done ___X_plus_difference_copy_ne_zero_copy = __X_plus_difference_copy_ne_zero;
                        
                        clear _not___X_plus_difference_copy_ne_zero;
                        incr _not___X_plus_difference_copy_ne_zero;
                        
                        while ___X_plus_difference_copy_ne_zero_copy not 0 do;
                            clear _not___X_plus_difference_copy_ne_zero;
                            clear ___X_plus_difference_copy_ne_zero_copy;
                        end;
                    #< done _not___X_plus_difference_copy_ne_zero = not __X_plus_difference_copy_ne_zero;
                    #> _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
                        #> __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                            #> __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                                clear __not___X_plus_difference_copy_ne_zero_holder;
                                
                                while _not___X_plus_difference_copy_ne_zero not 0 do;
                                    incr __not___X_plus_difference_copy_ne_zero_copy;
                                    incr __not___X_plus_difference_copy_ne_zero_holder;
                                    decr _not___X_plus_difference_copy_ne_zero;
                                end;
                                
                                while __not___X_plus_difference_copy_ne_zero_holder not 0 do;
                                    incr _not___X_plus_difference_copy_ne_zero;
                                    decr __not___X_plus_difference_copy_ne_zero_holder;
                                end;
                            #< done __not___X_plus_difference_copy_ne_zero_copy += _not___X_plus_difference_copy_ne_zero;
                        #< done __not___X_plus_difference_copy_ne_zero_copy = _not___X_plus_difference_copy_ne_zero;
                        clear _inner_or;
                        
                        while __not__Y_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not__Y_copy_ne_zero_copy;
                        end;
                        
                        while __not___X_plus_difference_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not___X_plus_difference_copy_ne_zero_copy;
                        end;
                    #< done _inner_or = _not__Y_copy_ne_zero or _not___X_plus_difference_copy_ne_zero;
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
                #< done _neither_are_zero = _Y_copy_ne_zero and __X_plus_difference_copy_ne_zero;
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
            
            while __X_plus_difference_copy_ne_zero not 0 do;
                # __X_plus_difference_copy_ne_zero is True, so _X_plus_difference must be the larger
                #> _difference = __X_plus_difference_copy;
                    clear _difference;
                    #> _difference += __X_plus_difference_copy;
                        clear ___X_plus_difference_copy_holder;
                        
                        while __X_plus_difference_copy not 0 do;
                            incr _difference;
                            incr ___X_plus_difference_copy_holder;
                            decr __X_plus_difference_copy;
                        end;
                        
                        while ___X_plus_difference_copy_holder not 0 do;
                            incr __X_plus_difference_copy;
                            decr ___X_plus_difference_copy_holder;
                        end;
                    #< done _difference += __X_plus_difference_copy;
                #< done _difference = __X_plus_difference_copy;
                clear __X_plus_difference_copy_ne_zero;
            end;
        #< done _difference = abs(_X_plus_difference - Y);
        clear _X_plus_difference_eq_Y;
        incr _X_plus_difference_eq_Y;
        while _difference not 0 do;
            clear _X_plus_difference_eq_Y;
            clear _difference;
        end;
        
        # If _X_plus_difference == Y, _X_plus_difference_eq_Y = 1. Otherwise, _X_plus_difference_eq_Y = 0
    #< done _X_plus_difference_eq_Y = _X_plus_difference == Y;
    # If X + abs(X - Y) == Y, Y was bigger, so false
    #> C = not _X_plus_difference_eq_Y;
        #> __X_plus_difference_eq_Y_copy = _X_plus_difference_eq_Y;
            clear __X_plus_difference_eq_Y_copy;
            #> __X_plus_difference_eq_Y_copy += _X_plus_difference_eq_Y;
                clear __X_plus_difference_eq_Y_holder;
                
                while _X_plus_difference_eq_Y not 0 do;
                    incr __X_plus_difference_eq_Y_copy;
                    incr __X_plus_difference_eq_Y_holder;
                    decr _X_plus_difference_eq_Y;
                end;
                
                while __X_plus_difference_eq_Y_holder not 0 do;
                    incr _X_plus_difference_eq_Y;
                    decr __X_plus_difference_eq_Y_holder;
                end;
            #< done __X_plus_difference_eq_Y_copy += _X_plus_difference_eq_Y;
        #< done __X_plus_difference_eq_Y_copy = _X_plus_difference_eq_Y;
        
        clear C;
        incr C;
        
        while __X_plus_difference_eq_Y_copy not 0 do;
            clear C;
            clear __X_plus_difference_eq_Y_copy;
        end;
    #< done C = not _X_plus_difference_eq_Y;
#< done C = X > Y;

#vars:A=1,B=0,C=0,X=4,Y=5