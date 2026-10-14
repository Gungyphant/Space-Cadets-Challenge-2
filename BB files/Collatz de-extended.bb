#> make number variables up to 10;
    clear _X;
    #> _ZERO = _X;
        clear _ZERO;
        #> _ZERO += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _ZERO;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _ZERO += _X;
    #< done _ZERO = _X;
    incr _X;
    #> _ONE = _X;
        clear _ONE;
        #> _ONE += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _ONE;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _ONE += _X;
    #< done _ONE = _X;
    incr _X;
    #> _TWO = _X;
        clear _TWO;
        #> _TWO += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _TWO;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _TWO += _X;
    #< done _TWO = _X;
    incr _X;
    #> _THREE = _X;
        clear _THREE;
        #> _THREE += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _THREE;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _THREE += _X;
    #< done _THREE = _X;
    incr _X;
    #> _FOUR = _X;
        clear _FOUR;
        #> _FOUR += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _FOUR;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _FOUR += _X;
    #< done _FOUR = _X;
    incr _X;
    #> _FIVE = _X;
        clear _FIVE;
        #> _FIVE += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _FIVE;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _FIVE += _X;
    #< done _FIVE = _X;
    incr _X;
    #> _SIX = _X;
        clear _SIX;
        #> _SIX += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _SIX;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _SIX += _X;
    #< done _SIX = _X;
    incr _X;
    #> _SEVEN = _X;
        clear _SEVEN;
        #> _SEVEN += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _SEVEN;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _SEVEN += _X;
    #< done _SEVEN = _X;
    incr _X;
    #> _EIGHT = _X;
        clear _EIGHT;
        #> _EIGHT += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _EIGHT;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _EIGHT += _X;
    #< done _EIGHT = _X;
    incr _X;
    #> _NINE = _X;
        clear _NINE;
        #> _NINE += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _NINE;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _NINE += _X;
    #< done _NINE = _X;
    incr _X;
    #> _TEN = _X;
        clear _TEN;
        #> _TEN += _X;
            clear __X_holder;
            
            while _X not 0 do;
                incr _TEN;
                incr __X_holder;
                decr _X;
            end;
            
            while __X_holder not 0 do;
                incr _X;
                decr __X_holder;
            end;
        #< done _TEN += _X;
    #< done _TEN = _X;
#< done make number variables up to 10;

clear X;
incr X;
incr X;
while X not 0 do;
    #> X_copy = X;
        clear X_copy;
        #> X_copy += X;
            clear _X_holder;
            
            while X not 0 do;
                incr X_copy;
                incr _X_holder;
                decr X;
            end;
            
            while _X_holder not 0 do;
                incr X;
                decr _X_holder;
            end;
        #< done X_copy += X;
    #< done X_copy = X;
    # Effectively while X_copy not 1 do
    decr X_copy;
    while X_copy not 0 do;
        incr X_copy;
        print X_copy;
        
        #> X_copy_over_two r remainder = X_copy / _TWO;
            #_X_copy_copy = X_copy;
            #> __TWO_copy = _TWO;
                clear __TWO_copy;
                #> __TWO_copy += _TWO;
                    clear __TWO_holder;
                    
                    while _TWO not 0 do;
                        incr __TWO_copy;
                        incr __TWO_holder;
                        decr _TWO;
                    end;
                    
                    while __TWO_holder not 0 do;
                        incr _TWO;
                        decr __TWO_holder;
                    end;
                #< done __TWO_copy += _TWO;
            #< done __TWO_copy = _TWO;
            clear X_copy_over_two;
            #clear remainder;
            
            #> remainder = X_copy;
                clear remainder;
                #> remainder += X_copy;
                    clear _X_copy_holder;
                    
                    while X_copy not 0 do;
                        incr remainder;
                        incr _X_copy_holder;
                        decr X_copy;
                    end;
                    
                    while _X_copy_holder not 0 do;
                        incr X_copy;
                        decr _X_copy_holder;
                    end;
                #< done remainder += X_copy;
            #< done remainder = X_copy;
            #> _remainder_ge__TWO = remainder >= _TWO;
                #> _remainder_gt__TWO = remainder > _TWO;
                    #> _remainder_copy = remainder;
                        clear _remainder_copy;
                        #> _remainder_copy += remainder;
                            clear _remainder_holder;
                            
                            while remainder not 0 do;
                                incr _remainder_copy;
                                incr _remainder_holder;
                                decr remainder;
                            end;
                            
                            while _remainder_holder not 0 do;
                                incr remainder;
                                decr _remainder_holder;
                            end;
                        #< done _remainder_copy += remainder;
                    #< done _remainder_copy = remainder;
                    #> __TWO_copy = _TWO;
                        clear __TWO_copy;
                        #> __TWO_copy += _TWO;
                            clear __TWO_holder;
                            
                            while _TWO not 0 do;
                                incr __TWO_copy;
                                incr __TWO_holder;
                                decr _TWO;
                            end;
                            
                            while __TWO_holder not 0 do;
                                incr _TWO;
                                decr __TWO_holder;
                            end;
                        #< done __TWO_copy += _TWO;
                    #< done __TWO_copy = _TWO;
                    
                    #> _difference = abs(_remainder_copy - __TWO_copy);
                        #> __remainder_copy_copy = _remainder_copy;
                            clear __remainder_copy_copy;
                            #> __remainder_copy_copy += _remainder_copy;
                                clear __remainder_copy_holder;
                                
                                while _remainder_copy not 0 do;
                                    incr __remainder_copy_copy;
                                    incr __remainder_copy_holder;
                                    decr _remainder_copy;
                                end;
                                
                                while __remainder_copy_holder not 0 do;
                                    incr _remainder_copy;
                                    decr __remainder_copy_holder;
                                end;
                            #< done __remainder_copy_copy += _remainder_copy;
                        #< done __remainder_copy_copy = _remainder_copy;
                        #> ___TWO_copy_copy = __TWO_copy;
                            clear ___TWO_copy_copy;
                            #> ___TWO_copy_copy += __TWO_copy;
                                clear ___TWO_copy_holder;
                                
                                while __TWO_copy not 0 do;
                                    incr ___TWO_copy_copy;
                                    incr ___TWO_copy_holder;
                                    decr __TWO_copy;
                                end;
                                
                                while ___TWO_copy_holder not 0 do;
                                    incr __TWO_copy;
                                    decr ___TWO_copy_holder;
                                end;
                            #< done ___TWO_copy_copy += __TWO_copy;
                        #< done ___TWO_copy_copy = __TWO_copy;
                        
                        #> __remainder_copy_copy_ne_zero = __remainder_copy_copy != 0;
                            #> _not___remainder_copy_copy_ne_zero = __remainder_copy_copy == 0;
                                #> ___remainder_copy_copy_copy = __remainder_copy_copy;
                                    clear ___remainder_copy_copy_copy;
                                    #> ___remainder_copy_copy_copy += __remainder_copy_copy;
                                        clear ___remainder_copy_copy_holder;
                                        
                                        while __remainder_copy_copy not 0 do;
                                            incr ___remainder_copy_copy_copy;
                                            incr ___remainder_copy_copy_holder;
                                            decr __remainder_copy_copy;
                                        end;
                                        
                                        while ___remainder_copy_copy_holder not 0 do;
                                            incr __remainder_copy_copy;
                                            decr ___remainder_copy_copy_holder;
                                        end;
                                    #< done ___remainder_copy_copy_copy += __remainder_copy_copy;
                                #< done ___remainder_copy_copy_copy = __remainder_copy_copy;
                                
                                clear _not___remainder_copy_copy_ne_zero;
                                incr _not___remainder_copy_copy_ne_zero;
                                while ___remainder_copy_copy_copy not 0 do;
                                    clear _not___remainder_copy_copy_ne_zero;
                                    clear ___remainder_copy_copy_copy;
                                end;
                            #< done _not___remainder_copy_copy_ne_zero = __remainder_copy_copy == 0;
                            #> __remainder_copy_copy_ne_zero = not _not___remainder_copy_copy_ne_zero;
                                #> __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                    clear __not___remainder_copy_copy_ne_zero_copy;
                                    #> __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                        clear __not___remainder_copy_copy_ne_zero_holder;
                                        
                                        while _not___remainder_copy_copy_ne_zero not 0 do;
                                            incr __not___remainder_copy_copy_ne_zero_copy;
                                            incr __not___remainder_copy_copy_ne_zero_holder;
                                            decr _not___remainder_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___remainder_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___remainder_copy_copy_ne_zero;
                                            decr __not___remainder_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                #< done __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                
                                clear __remainder_copy_copy_ne_zero;
                                incr __remainder_copy_copy_ne_zero;
                                
                                while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                    clear __remainder_copy_copy_ne_zero;
                                    clear __not___remainder_copy_copy_ne_zero_copy;
                                end;
                            #< done __remainder_copy_copy_ne_zero = not _not___remainder_copy_copy_ne_zero;
                        #< done __remainder_copy_copy_ne_zero = __remainder_copy_copy != 0;
                        #> ___TWO_copy_copy_ne_zero = ___TWO_copy_copy != 0;
                            #> _not____TWO_copy_copy_ne_zero = ___TWO_copy_copy == 0;
                                #> ____TWO_copy_copy_copy = ___TWO_copy_copy;
                                    clear ____TWO_copy_copy_copy;
                                    #> ____TWO_copy_copy_copy += ___TWO_copy_copy;
                                        clear ____TWO_copy_copy_holder;
                                        
                                        while ___TWO_copy_copy not 0 do;
                                            incr ____TWO_copy_copy_copy;
                                            incr ____TWO_copy_copy_holder;
                                            decr ___TWO_copy_copy;
                                        end;
                                        
                                        while ____TWO_copy_copy_holder not 0 do;
                                            incr ___TWO_copy_copy;
                                            decr ____TWO_copy_copy_holder;
                                        end;
                                    #< done ____TWO_copy_copy_copy += ___TWO_copy_copy;
                                #< done ____TWO_copy_copy_copy = ___TWO_copy_copy;
                                
                                clear _not____TWO_copy_copy_ne_zero;
                                incr _not____TWO_copy_copy_ne_zero;
                                while ____TWO_copy_copy_copy not 0 do;
                                    clear _not____TWO_copy_copy_ne_zero;
                                    clear ____TWO_copy_copy_copy;
                                end;
                            #< done _not____TWO_copy_copy_ne_zero = ___TWO_copy_copy == 0;
                            #> ___TWO_copy_copy_ne_zero = not _not____TWO_copy_copy_ne_zero;
                                #> __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                    clear __not____TWO_copy_copy_ne_zero_copy;
                                    #> __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                        clear __not____TWO_copy_copy_ne_zero_holder;
                                        
                                        while _not____TWO_copy_copy_ne_zero not 0 do;
                                            incr __not____TWO_copy_copy_ne_zero_copy;
                                            incr __not____TWO_copy_copy_ne_zero_holder;
                                            decr _not____TWO_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not____TWO_copy_copy_ne_zero_holder not 0 do;
                                            incr _not____TWO_copy_copy_ne_zero;
                                            decr __not____TWO_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                #< done __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                
                                clear ___TWO_copy_copy_ne_zero;
                                incr ___TWO_copy_copy_ne_zero;
                                
                                while __not____TWO_copy_copy_ne_zero_copy not 0 do;
                                    clear ___TWO_copy_copy_ne_zero;
                                    clear __not____TWO_copy_copy_ne_zero_copy;
                                end;
                            #< done ___TWO_copy_copy_ne_zero = not _not____TWO_copy_copy_ne_zero;
                        #< done ___TWO_copy_copy_ne_zero = ___TWO_copy_copy != 0;
                        #> _neither_are_zero = ___TWO_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                            # DeMorgan's:
                            #  (X and Y) = not ((not X) or (not Y))
                            #> _not____TWO_copy_copy_ne_zero = not ___TWO_copy_copy_ne_zero;
                                #> ____TWO_copy_copy_ne_zero_copy = ___TWO_copy_copy_ne_zero;
                                    clear ____TWO_copy_copy_ne_zero_copy;
                                    #> ____TWO_copy_copy_ne_zero_copy += ___TWO_copy_copy_ne_zero;
                                        clear ____TWO_copy_copy_ne_zero_holder;
                                        
                                        while ___TWO_copy_copy_ne_zero not 0 do;
                                            incr ____TWO_copy_copy_ne_zero_copy;
                                            incr ____TWO_copy_copy_ne_zero_holder;
                                            decr ___TWO_copy_copy_ne_zero;
                                        end;
                                        
                                        while ____TWO_copy_copy_ne_zero_holder not 0 do;
                                            incr ___TWO_copy_copy_ne_zero;
                                            decr ____TWO_copy_copy_ne_zero_holder;
                                        end;
                                    #< done ____TWO_copy_copy_ne_zero_copy += ___TWO_copy_copy_ne_zero;
                                #< done ____TWO_copy_copy_ne_zero_copy = ___TWO_copy_copy_ne_zero;
                                
                                clear _not____TWO_copy_copy_ne_zero;
                                incr _not____TWO_copy_copy_ne_zero;
                                
                                while ____TWO_copy_copy_ne_zero_copy not 0 do;
                                    clear _not____TWO_copy_copy_ne_zero;
                                    clear ____TWO_copy_copy_ne_zero_copy;
                                end;
                            #< done _not____TWO_copy_copy_ne_zero = not ___TWO_copy_copy_ne_zero;
                            #> _not___remainder_copy_copy_ne_zero = not __remainder_copy_copy_ne_zero;
                                #> ___remainder_copy_copy_ne_zero_copy = __remainder_copy_copy_ne_zero;
                                    clear ___remainder_copy_copy_ne_zero_copy;
                                    #> ___remainder_copy_copy_ne_zero_copy += __remainder_copy_copy_ne_zero;
                                        clear ___remainder_copy_copy_ne_zero_holder;
                                        
                                        while __remainder_copy_copy_ne_zero not 0 do;
                                            incr ___remainder_copy_copy_ne_zero_copy;
                                            incr ___remainder_copy_copy_ne_zero_holder;
                                            decr __remainder_copy_copy_ne_zero;
                                        end;
                                        
                                        while ___remainder_copy_copy_ne_zero_holder not 0 do;
                                            incr __remainder_copy_copy_ne_zero;
                                            decr ___remainder_copy_copy_ne_zero_holder;
                                        end;
                                    #< done ___remainder_copy_copy_ne_zero_copy += __remainder_copy_copy_ne_zero;
                                #< done ___remainder_copy_copy_ne_zero_copy = __remainder_copy_copy_ne_zero;
                                
                                clear _not___remainder_copy_copy_ne_zero;
                                incr _not___remainder_copy_copy_ne_zero;
                                
                                while ___remainder_copy_copy_ne_zero_copy not 0 do;
                                    clear _not___remainder_copy_copy_ne_zero;
                                    clear ___remainder_copy_copy_ne_zero_copy;
                                end;
                            #< done _not___remainder_copy_copy_ne_zero = not __remainder_copy_copy_ne_zero;
                            #> _inner_or = _not____TWO_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
                                #> __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                    clear __not____TWO_copy_copy_ne_zero_copy;
                                    #> __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                        clear __not____TWO_copy_copy_ne_zero_holder;
                                        
                                        while _not____TWO_copy_copy_ne_zero not 0 do;
                                            incr __not____TWO_copy_copy_ne_zero_copy;
                                            incr __not____TWO_copy_copy_ne_zero_holder;
                                            decr _not____TWO_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not____TWO_copy_copy_ne_zero_holder not 0 do;
                                            incr _not____TWO_copy_copy_ne_zero;
                                            decr __not____TWO_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                #< done __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                #> __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                    clear __not___remainder_copy_copy_ne_zero_copy;
                                    #> __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                        clear __not___remainder_copy_copy_ne_zero_holder;
                                        
                                        while _not___remainder_copy_copy_ne_zero not 0 do;
                                            incr __not___remainder_copy_copy_ne_zero_copy;
                                            incr __not___remainder_copy_copy_ne_zero_holder;
                                            decr _not___remainder_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___remainder_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___remainder_copy_copy_ne_zero;
                                            decr __not___remainder_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                #< done __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not____TWO_copy_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not____TWO_copy_copy_ne_zero_copy;
                                end;
                                
                                while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___remainder_copy_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not____TWO_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
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
                        #< done _neither_are_zero = ___TWO_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                        while _neither_are_zero not 0 do;
                            decr __remainder_copy_copy;
                            decr ___TWO_copy_copy;
                            
                            #> __remainder_copy_copy_ne_zero = __remainder_copy_copy != 0;
                                #> _not___remainder_copy_copy_ne_zero = __remainder_copy_copy == 0;
                                    #> ___remainder_copy_copy_copy = __remainder_copy_copy;
                                        clear ___remainder_copy_copy_copy;
                                        #> ___remainder_copy_copy_copy += __remainder_copy_copy;
                                            clear ___remainder_copy_copy_holder;
                                            
                                            while __remainder_copy_copy not 0 do;
                                                incr ___remainder_copy_copy_copy;
                                                incr ___remainder_copy_copy_holder;
                                                decr __remainder_copy_copy;
                                            end;
                                            
                                            while ___remainder_copy_copy_holder not 0 do;
                                                incr __remainder_copy_copy;
                                                decr ___remainder_copy_copy_holder;
                                            end;
                                        #< done ___remainder_copy_copy_copy += __remainder_copy_copy;
                                    #< done ___remainder_copy_copy_copy = __remainder_copy_copy;
                                    
                                    clear _not___remainder_copy_copy_ne_zero;
                                    incr _not___remainder_copy_copy_ne_zero;
                                    while ___remainder_copy_copy_copy not 0 do;
                                        clear _not___remainder_copy_copy_ne_zero;
                                        clear ___remainder_copy_copy_copy;
                                    end;
                                #< done _not___remainder_copy_copy_ne_zero = __remainder_copy_copy == 0;
                                #> __remainder_copy_copy_ne_zero = not _not___remainder_copy_copy_ne_zero;
                                    #> __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                        clear __not___remainder_copy_copy_ne_zero_copy;
                                        #> __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                            clear __not___remainder_copy_copy_ne_zero_holder;
                                            
                                            while _not___remainder_copy_copy_ne_zero not 0 do;
                                                incr __not___remainder_copy_copy_ne_zero_copy;
                                                incr __not___remainder_copy_copy_ne_zero_holder;
                                                decr _not___remainder_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___remainder_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___remainder_copy_copy_ne_zero;
                                                decr __not___remainder_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                    #< done __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                    
                                    clear __remainder_copy_copy_ne_zero;
                                    incr __remainder_copy_copy_ne_zero;
                                    
                                    while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                        clear __remainder_copy_copy_ne_zero;
                                        clear __not___remainder_copy_copy_ne_zero_copy;
                                    end;
                                #< done __remainder_copy_copy_ne_zero = not _not___remainder_copy_copy_ne_zero;
                            #< done __remainder_copy_copy_ne_zero = __remainder_copy_copy != 0;
                            #> ___TWO_copy_copy_ne_zero = ___TWO_copy_copy != 0;
                                #> _not____TWO_copy_copy_ne_zero = ___TWO_copy_copy == 0;
                                    #> ____TWO_copy_copy_copy = ___TWO_copy_copy;
                                        clear ____TWO_copy_copy_copy;
                                        #> ____TWO_copy_copy_copy += ___TWO_copy_copy;
                                            clear ____TWO_copy_copy_holder;
                                            
                                            while ___TWO_copy_copy not 0 do;
                                                incr ____TWO_copy_copy_copy;
                                                incr ____TWO_copy_copy_holder;
                                                decr ___TWO_copy_copy;
                                            end;
                                            
                                            while ____TWO_copy_copy_holder not 0 do;
                                                incr ___TWO_copy_copy;
                                                decr ____TWO_copy_copy_holder;
                                            end;
                                        #< done ____TWO_copy_copy_copy += ___TWO_copy_copy;
                                    #< done ____TWO_copy_copy_copy = ___TWO_copy_copy;
                                    
                                    clear _not____TWO_copy_copy_ne_zero;
                                    incr _not____TWO_copy_copy_ne_zero;
                                    while ____TWO_copy_copy_copy not 0 do;
                                        clear _not____TWO_copy_copy_ne_zero;
                                        clear ____TWO_copy_copy_copy;
                                    end;
                                #< done _not____TWO_copy_copy_ne_zero = ___TWO_copy_copy == 0;
                                #> ___TWO_copy_copy_ne_zero = not _not____TWO_copy_copy_ne_zero;
                                    #> __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                        clear __not____TWO_copy_copy_ne_zero_copy;
                                        #> __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                            clear __not____TWO_copy_copy_ne_zero_holder;
                                            
                                            while _not____TWO_copy_copy_ne_zero not 0 do;
                                                incr __not____TWO_copy_copy_ne_zero_copy;
                                                incr __not____TWO_copy_copy_ne_zero_holder;
                                                decr _not____TWO_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not____TWO_copy_copy_ne_zero_holder not 0 do;
                                                incr _not____TWO_copy_copy_ne_zero;
                                                decr __not____TWO_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                    #< done __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                    
                                    clear ___TWO_copy_copy_ne_zero;
                                    incr ___TWO_copy_copy_ne_zero;
                                    
                                    while __not____TWO_copy_copy_ne_zero_copy not 0 do;
                                        clear ___TWO_copy_copy_ne_zero;
                                        clear __not____TWO_copy_copy_ne_zero_copy;
                                    end;
                                #< done ___TWO_copy_copy_ne_zero = not _not____TWO_copy_copy_ne_zero;
                            #< done ___TWO_copy_copy_ne_zero = ___TWO_copy_copy != 0;
                            #> _neither_are_zero = ___TWO_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not____TWO_copy_copy_ne_zero = not ___TWO_copy_copy_ne_zero;
                                    #> ____TWO_copy_copy_ne_zero_copy = ___TWO_copy_copy_ne_zero;
                                        clear ____TWO_copy_copy_ne_zero_copy;
                                        #> ____TWO_copy_copy_ne_zero_copy += ___TWO_copy_copy_ne_zero;
                                            clear ____TWO_copy_copy_ne_zero_holder;
                                            
                                            while ___TWO_copy_copy_ne_zero not 0 do;
                                                incr ____TWO_copy_copy_ne_zero_copy;
                                                incr ____TWO_copy_copy_ne_zero_holder;
                                                decr ___TWO_copy_copy_ne_zero;
                                            end;
                                            
                                            while ____TWO_copy_copy_ne_zero_holder not 0 do;
                                                incr ___TWO_copy_copy_ne_zero;
                                                decr ____TWO_copy_copy_ne_zero_holder;
                                            end;
                                        #< done ____TWO_copy_copy_ne_zero_copy += ___TWO_copy_copy_ne_zero;
                                    #< done ____TWO_copy_copy_ne_zero_copy = ___TWO_copy_copy_ne_zero;
                                    
                                    clear _not____TWO_copy_copy_ne_zero;
                                    incr _not____TWO_copy_copy_ne_zero;
                                    
                                    while ____TWO_copy_copy_ne_zero_copy not 0 do;
                                        clear _not____TWO_copy_copy_ne_zero;
                                        clear ____TWO_copy_copy_ne_zero_copy;
                                    end;
                                #< done _not____TWO_copy_copy_ne_zero = not ___TWO_copy_copy_ne_zero;
                                #> _not___remainder_copy_copy_ne_zero = not __remainder_copy_copy_ne_zero;
                                    #> ___remainder_copy_copy_ne_zero_copy = __remainder_copy_copy_ne_zero;
                                        clear ___remainder_copy_copy_ne_zero_copy;
                                        #> ___remainder_copy_copy_ne_zero_copy += __remainder_copy_copy_ne_zero;
                                            clear ___remainder_copy_copy_ne_zero_holder;
                                            
                                            while __remainder_copy_copy_ne_zero not 0 do;
                                                incr ___remainder_copy_copy_ne_zero_copy;
                                                incr ___remainder_copy_copy_ne_zero_holder;
                                                decr __remainder_copy_copy_ne_zero;
                                            end;
                                            
                                            while ___remainder_copy_copy_ne_zero_holder not 0 do;
                                                incr __remainder_copy_copy_ne_zero;
                                                decr ___remainder_copy_copy_ne_zero_holder;
                                            end;
                                        #< done ___remainder_copy_copy_ne_zero_copy += __remainder_copy_copy_ne_zero;
                                    #< done ___remainder_copy_copy_ne_zero_copy = __remainder_copy_copy_ne_zero;
                                    
                                    clear _not___remainder_copy_copy_ne_zero;
                                    incr _not___remainder_copy_copy_ne_zero;
                                    
                                    while ___remainder_copy_copy_ne_zero_copy not 0 do;
                                        clear _not___remainder_copy_copy_ne_zero;
                                        clear ___remainder_copy_copy_ne_zero_copy;
                                    end;
                                #< done _not___remainder_copy_copy_ne_zero = not __remainder_copy_copy_ne_zero;
                                #> _inner_or = _not____TWO_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
                                    #> __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                        clear __not____TWO_copy_copy_ne_zero_copy;
                                        #> __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                            clear __not____TWO_copy_copy_ne_zero_holder;
                                            
                                            while _not____TWO_copy_copy_ne_zero not 0 do;
                                                incr __not____TWO_copy_copy_ne_zero_copy;
                                                incr __not____TWO_copy_copy_ne_zero_holder;
                                                decr _not____TWO_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not____TWO_copy_copy_ne_zero_holder not 0 do;
                                                incr _not____TWO_copy_copy_ne_zero;
                                                decr __not____TWO_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                    #< done __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                    #> __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                        clear __not___remainder_copy_copy_ne_zero_copy;
                                        #> __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                            clear __not___remainder_copy_copy_ne_zero_holder;
                                            
                                            while _not___remainder_copy_copy_ne_zero not 0 do;
                                                incr __not___remainder_copy_copy_ne_zero_copy;
                                                incr __not___remainder_copy_copy_ne_zero_holder;
                                                decr _not___remainder_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___remainder_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___remainder_copy_copy_ne_zero;
                                                decr __not___remainder_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                    #< done __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not____TWO_copy_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not____TWO_copy_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___remainder_copy_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not____TWO_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
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
                            #< done _neither_are_zero = ___TWO_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                        end;
                        
                        
                        clear _difference;
                        
                        while ___TWO_copy_copy_ne_zero not 0 do;
                            # ___TWO_copy_copy_ne_zero is True, so __TWO_copy must be the larger
                            #> _difference = ___TWO_copy_copy;
                                clear _difference;
                                #> _difference += ___TWO_copy_copy;
                                    clear ____TWO_copy_copy_holder;
                                    
                                    while ___TWO_copy_copy not 0 do;
                                        incr _difference;
                                        incr ____TWO_copy_copy_holder;
                                        decr ___TWO_copy_copy;
                                    end;
                                    
                                    while ____TWO_copy_copy_holder not 0 do;
                                        incr ___TWO_copy_copy;
                                        decr ____TWO_copy_copy_holder;
                                    end;
                                #< done _difference += ___TWO_copy_copy;
                            #< done _difference = ___TWO_copy_copy;
                            clear ___TWO_copy_copy_ne_zero;
                        end;
                        
                        while __remainder_copy_copy_ne_zero not 0 do;
                            # __remainder_copy_copy_ne_zero is True, so _remainder_copy must be the larger
                            #> _difference = __remainder_copy_copy;
                                clear _difference;
                                #> _difference += __remainder_copy_copy;
                                    clear ___remainder_copy_copy_holder;
                                    
                                    while __remainder_copy_copy not 0 do;
                                        incr _difference;
                                        incr ___remainder_copy_copy_holder;
                                        decr __remainder_copy_copy;
                                    end;
                                    
                                    while ___remainder_copy_copy_holder not 0 do;
                                        incr __remainder_copy_copy;
                                        decr ___remainder_copy_copy_holder;
                                    end;
                                #< done _difference += __remainder_copy_copy;
                            #< done _difference = __remainder_copy_copy;
                            clear __remainder_copy_copy_ne_zero;
                        end;
                    #< done _difference = abs(_remainder_copy - __TWO_copy);
                    #> _remainder_plus_difference = _remainder_copy + _difference;
                        #> __remainder_copy_copy = _remainder_copy;
                            clear __remainder_copy_copy;
                            #> __remainder_copy_copy += _remainder_copy;
                                clear __remainder_copy_holder;
                                
                                while _remainder_copy not 0 do;
                                    incr __remainder_copy_copy;
                                    incr __remainder_copy_holder;
                                    decr _remainder_copy;
                                end;
                                
                                while __remainder_copy_holder not 0 do;
                                    incr _remainder_copy;
                                    decr __remainder_copy_holder;
                                end;
                            #< done __remainder_copy_copy += _remainder_copy;
                        #< done __remainder_copy_copy = _remainder_copy;
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
                        clear _remainder_plus_difference;
                        #> _remainder_plus_difference += __remainder_copy_copy;
                            clear ___remainder_copy_copy_holder;
                            
                            while __remainder_copy_copy not 0 do;
                                incr _remainder_plus_difference;
                                incr ___remainder_copy_copy_holder;
                                decr __remainder_copy_copy;
                            end;
                            
                            while ___remainder_copy_copy_holder not 0 do;
                                incr __remainder_copy_copy;
                                decr ___remainder_copy_copy_holder;
                            end;
                        #< done _remainder_plus_difference += __remainder_copy_copy;
                        #> _remainder_plus_difference += __difference_copy;
                            clear ___difference_copy_holder;
                            
                            while __difference_copy not 0 do;
                                incr _remainder_plus_difference;
                                incr ___difference_copy_holder;
                                decr __difference_copy;
                            end;
                            
                            while ___difference_copy_holder not 0 do;
                                incr __difference_copy;
                                decr ___difference_copy_holder;
                            end;
                        #< done _remainder_plus_difference += __difference_copy;
                    #< done _remainder_plus_difference = _remainder_copy + _difference;
                    #> _remainder_plus_difference_eq__TWO = _remainder_plus_difference == _TWO;
                        #> _difference = abs(_remainder_plus_difference - _TWO);
                            #> __remainder_plus_difference_copy = _remainder_plus_difference;
                                clear __remainder_plus_difference_copy;
                                #> __remainder_plus_difference_copy += _remainder_plus_difference;
                                    clear __remainder_plus_difference_holder;
                                    
                                    while _remainder_plus_difference not 0 do;
                                        incr __remainder_plus_difference_copy;
                                        incr __remainder_plus_difference_holder;
                                        decr _remainder_plus_difference;
                                    end;
                                    
                                    while __remainder_plus_difference_holder not 0 do;
                                        incr _remainder_plus_difference;
                                        decr __remainder_plus_difference_holder;
                                    end;
                                #< done __remainder_plus_difference_copy += _remainder_plus_difference;
                            #< done __remainder_plus_difference_copy = _remainder_plus_difference;
                            #> __TWO_copy = _TWO;
                                clear __TWO_copy;
                                #> __TWO_copy += _TWO;
                                    clear __TWO_holder;
                                    
                                    while _TWO not 0 do;
                                        incr __TWO_copy;
                                        incr __TWO_holder;
                                        decr _TWO;
                                    end;
                                    
                                    while __TWO_holder not 0 do;
                                        incr _TWO;
                                        decr __TWO_holder;
                                    end;
                                #< done __TWO_copy += _TWO;
                            #< done __TWO_copy = _TWO;
                            
                            #> __remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy != 0;
                                #> _not___remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy == 0;
                                    #> ___remainder_plus_difference_copy_copy = __remainder_plus_difference_copy;
                                        clear ___remainder_plus_difference_copy_copy;
                                        #> ___remainder_plus_difference_copy_copy += __remainder_plus_difference_copy;
                                            clear ___remainder_plus_difference_copy_holder;
                                            
                                            while __remainder_plus_difference_copy not 0 do;
                                                incr ___remainder_plus_difference_copy_copy;
                                                incr ___remainder_plus_difference_copy_holder;
                                                decr __remainder_plus_difference_copy;
                                            end;
                                            
                                            while ___remainder_plus_difference_copy_holder not 0 do;
                                                incr __remainder_plus_difference_copy;
                                                decr ___remainder_plus_difference_copy_holder;
                                            end;
                                        #< done ___remainder_plus_difference_copy_copy += __remainder_plus_difference_copy;
                                    #< done ___remainder_plus_difference_copy_copy = __remainder_plus_difference_copy;
                                    
                                    clear _not___remainder_plus_difference_copy_ne_zero;
                                    incr _not___remainder_plus_difference_copy_ne_zero;
                                    while ___remainder_plus_difference_copy_copy not 0 do;
                                        clear _not___remainder_plus_difference_copy_ne_zero;
                                        clear ___remainder_plus_difference_copy_copy;
                                    end;
                                #< done _not___remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy == 0;
                                #> __remainder_plus_difference_copy_ne_zero = not _not___remainder_plus_difference_copy_ne_zero;
                                    #> __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                        clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                        #> __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                            clear __not___remainder_plus_difference_copy_ne_zero_holder;
                                            
                                            while _not___remainder_plus_difference_copy_ne_zero not 0 do;
                                                incr __not___remainder_plus_difference_copy_ne_zero_copy;
                                                incr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                decr _not___remainder_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while __not___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr _not___remainder_plus_difference_copy_ne_zero;
                                                decr __not___remainder_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                    #< done __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                    
                                    clear __remainder_plus_difference_copy_ne_zero;
                                    incr __remainder_plus_difference_copy_ne_zero;
                                    
                                    while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear __remainder_plus_difference_copy_ne_zero;
                                        clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done __remainder_plus_difference_copy_ne_zero = not _not___remainder_plus_difference_copy_ne_zero;
                            #< done __remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy != 0;
                            #> __TWO_copy_ne_zero = __TWO_copy != 0;
                                #> _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                    #> ___TWO_copy_copy = __TWO_copy;
                                        clear ___TWO_copy_copy;
                                        #> ___TWO_copy_copy += __TWO_copy;
                                            clear ___TWO_copy_holder;
                                            
                                            while __TWO_copy not 0 do;
                                                incr ___TWO_copy_copy;
                                                incr ___TWO_copy_holder;
                                                decr __TWO_copy;
                                            end;
                                            
                                            while ___TWO_copy_holder not 0 do;
                                                incr __TWO_copy;
                                                decr ___TWO_copy_holder;
                                            end;
                                        #< done ___TWO_copy_copy += __TWO_copy;
                                    #< done ___TWO_copy_copy = __TWO_copy;
                                    
                                    clear _not___TWO_copy_ne_zero;
                                    incr _not___TWO_copy_ne_zero;
                                    while ___TWO_copy_copy not 0 do;
                                        clear _not___TWO_copy_ne_zero;
                                        clear ___TWO_copy_copy;
                                    end;
                                #< done _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                #> __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                    #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_copy;
                                        #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_holder;
                                            
                                            while _not___TWO_copy_ne_zero not 0 do;
                                                incr __not___TWO_copy_ne_zero_copy;
                                                incr __not___TWO_copy_ne_zero_holder;
                                                decr _not___TWO_copy_ne_zero;
                                            end;
                                            
                                            while __not___TWO_copy_ne_zero_holder not 0 do;
                                                incr _not___TWO_copy_ne_zero;
                                                decr __not___TWO_copy_ne_zero_holder;
                                            end;
                                        #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                    #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                    
                                    clear __TWO_copy_ne_zero;
                                    incr __TWO_copy_ne_zero;
                                    
                                    while __not___TWO_copy_ne_zero_copy not 0 do;
                                        clear __TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_copy;
                                    end;
                                #< done __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                            #< done __TWO_copy_ne_zero = __TWO_copy != 0;
                            #> _neither_are_zero = __TWO_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                    #> ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                        clear ___TWO_copy_ne_zero_copy;
                                        #> ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                            clear ___TWO_copy_ne_zero_holder;
                                            
                                            while __TWO_copy_ne_zero not 0 do;
                                                incr ___TWO_copy_ne_zero_copy;
                                                incr ___TWO_copy_ne_zero_holder;
                                                decr __TWO_copy_ne_zero;
                                            end;
                                            
                                            while ___TWO_copy_ne_zero_holder not 0 do;
                                                incr __TWO_copy_ne_zero;
                                                decr ___TWO_copy_ne_zero_holder;
                                            end;
                                        #< done ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                    #< done ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                    
                                    clear _not___TWO_copy_ne_zero;
                                    incr _not___TWO_copy_ne_zero;
                                    
                                    while ___TWO_copy_ne_zero_copy not 0 do;
                                        clear _not___TWO_copy_ne_zero;
                                        clear ___TWO_copy_ne_zero_copy;
                                    end;
                                #< done _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                #> _not___remainder_plus_difference_copy_ne_zero = not __remainder_plus_difference_copy_ne_zero;
                                    #> ___remainder_plus_difference_copy_ne_zero_copy = __remainder_plus_difference_copy_ne_zero;
                                        clear ___remainder_plus_difference_copy_ne_zero_copy;
                                        #> ___remainder_plus_difference_copy_ne_zero_copy += __remainder_plus_difference_copy_ne_zero;
                                            clear ___remainder_plus_difference_copy_ne_zero_holder;
                                            
                                            while __remainder_plus_difference_copy_ne_zero not 0 do;
                                                incr ___remainder_plus_difference_copy_ne_zero_copy;
                                                incr ___remainder_plus_difference_copy_ne_zero_holder;
                                                decr __remainder_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while ___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr __remainder_plus_difference_copy_ne_zero;
                                                decr ___remainder_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done ___remainder_plus_difference_copy_ne_zero_copy += __remainder_plus_difference_copy_ne_zero;
                                    #< done ___remainder_plus_difference_copy_ne_zero_copy = __remainder_plus_difference_copy_ne_zero;
                                    
                                    clear _not___remainder_plus_difference_copy_ne_zero;
                                    incr _not___remainder_plus_difference_copy_ne_zero;
                                    
                                    while ___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear _not___remainder_plus_difference_copy_ne_zero;
                                        clear ___remainder_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done _not___remainder_plus_difference_copy_ne_zero = not __remainder_plus_difference_copy_ne_zero;
                                #> _inner_or = _not___TWO_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
                                    #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_copy;
                                        #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_holder;
                                            
                                            while _not___TWO_copy_ne_zero not 0 do;
                                                incr __not___TWO_copy_ne_zero_copy;
                                                incr __not___TWO_copy_ne_zero_holder;
                                                decr _not___TWO_copy_ne_zero;
                                            end;
                                            
                                            while __not___TWO_copy_ne_zero_holder not 0 do;
                                                incr _not___TWO_copy_ne_zero;
                                                decr __not___TWO_copy_ne_zero_holder;
                                            end;
                                        #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                    #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                    #> __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                        clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                        #> __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                            clear __not___remainder_plus_difference_copy_ne_zero_holder;
                                            
                                            while _not___remainder_plus_difference_copy_ne_zero not 0 do;
                                                incr __not___remainder_plus_difference_copy_ne_zero_copy;
                                                incr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                decr _not___remainder_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while __not___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr _not___remainder_plus_difference_copy_ne_zero;
                                                decr __not___remainder_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                    #< done __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not___TWO_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___TWO_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not___TWO_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
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
                            #< done _neither_are_zero = __TWO_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                            while _neither_are_zero not 0 do;
                                decr __remainder_plus_difference_copy;
                                decr __TWO_copy;
                                
                                #> __remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy != 0;
                                    #> _not___remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy == 0;
                                        #> ___remainder_plus_difference_copy_copy = __remainder_plus_difference_copy;
                                            clear ___remainder_plus_difference_copy_copy;
                                            #> ___remainder_plus_difference_copy_copy += __remainder_plus_difference_copy;
                                                clear ___remainder_plus_difference_copy_holder;
                                                
                                                while __remainder_plus_difference_copy not 0 do;
                                                    incr ___remainder_plus_difference_copy_copy;
                                                    incr ___remainder_plus_difference_copy_holder;
                                                    decr __remainder_plus_difference_copy;
                                                end;
                                                
                                                while ___remainder_plus_difference_copy_holder not 0 do;
                                                    incr __remainder_plus_difference_copy;
                                                    decr ___remainder_plus_difference_copy_holder;
                                                end;
                                            #< done ___remainder_plus_difference_copy_copy += __remainder_plus_difference_copy;
                                        #< done ___remainder_plus_difference_copy_copy = __remainder_plus_difference_copy;
                                        
                                        clear _not___remainder_plus_difference_copy_ne_zero;
                                        incr _not___remainder_plus_difference_copy_ne_zero;
                                        while ___remainder_plus_difference_copy_copy not 0 do;
                                            clear _not___remainder_plus_difference_copy_ne_zero;
                                            clear ___remainder_plus_difference_copy_copy;
                                        end;
                                    #< done _not___remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy == 0;
                                    #> __remainder_plus_difference_copy_ne_zero = not _not___remainder_plus_difference_copy_ne_zero;
                                        #> __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                            clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                            #> __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                                clear __not___remainder_plus_difference_copy_ne_zero_holder;
                                                
                                                while _not___remainder_plus_difference_copy_ne_zero not 0 do;
                                                    incr __not___remainder_plus_difference_copy_ne_zero_copy;
                                                    incr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                    decr _not___remainder_plus_difference_copy_ne_zero;
                                                end;
                                                
                                                while __not___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                    incr _not___remainder_plus_difference_copy_ne_zero;
                                                    decr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                end;
                                            #< done __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                        #< done __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                        
                                        clear __remainder_plus_difference_copy_ne_zero;
                                        incr __remainder_plus_difference_copy_ne_zero;
                                        
                                        while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear __remainder_plus_difference_copy_ne_zero;
                                            clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done __remainder_plus_difference_copy_ne_zero = not _not___remainder_plus_difference_copy_ne_zero;
                                #< done __remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy != 0;
                                #> __TWO_copy_ne_zero = __TWO_copy != 0;
                                    #> _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                        #> ___TWO_copy_copy = __TWO_copy;
                                            clear ___TWO_copy_copy;
                                            #> ___TWO_copy_copy += __TWO_copy;
                                                clear ___TWO_copy_holder;
                                                
                                                while __TWO_copy not 0 do;
                                                    incr ___TWO_copy_copy;
                                                    incr ___TWO_copy_holder;
                                                    decr __TWO_copy;
                                                end;
                                                
                                                while ___TWO_copy_holder not 0 do;
                                                    incr __TWO_copy;
                                                    decr ___TWO_copy_holder;
                                                end;
                                            #< done ___TWO_copy_copy += __TWO_copy;
                                        #< done ___TWO_copy_copy = __TWO_copy;
                                        
                                        clear _not___TWO_copy_ne_zero;
                                        incr _not___TWO_copy_ne_zero;
                                        while ___TWO_copy_copy not 0 do;
                                            clear _not___TWO_copy_ne_zero;
                                            clear ___TWO_copy_copy;
                                        end;
                                    #< done _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                    #> __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                        #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_copy;
                                            #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                                clear __not___TWO_copy_ne_zero_holder;
                                                
                                                while _not___TWO_copy_ne_zero not 0 do;
                                                    incr __not___TWO_copy_ne_zero_copy;
                                                    incr __not___TWO_copy_ne_zero_holder;
                                                    decr _not___TWO_copy_ne_zero;
                                                end;
                                                
                                                while __not___TWO_copy_ne_zero_holder not 0 do;
                                                    incr _not___TWO_copy_ne_zero;
                                                    decr __not___TWO_copy_ne_zero_holder;
                                                end;
                                            #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                        #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        
                                        clear __TWO_copy_ne_zero;
                                        incr __TWO_copy_ne_zero;
                                        
                                        while __not___TWO_copy_ne_zero_copy not 0 do;
                                            clear __TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_copy;
                                        end;
                                    #< done __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                #< done __TWO_copy_ne_zero = __TWO_copy != 0;
                                #> _neither_are_zero = __TWO_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                        #> ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                            clear ___TWO_copy_ne_zero_copy;
                                            #> ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                                clear ___TWO_copy_ne_zero_holder;
                                                
                                                while __TWO_copy_ne_zero not 0 do;
                                                    incr ___TWO_copy_ne_zero_copy;
                                                    incr ___TWO_copy_ne_zero_holder;
                                                    decr __TWO_copy_ne_zero;
                                                end;
                                                
                                                while ___TWO_copy_ne_zero_holder not 0 do;
                                                    incr __TWO_copy_ne_zero;
                                                    decr ___TWO_copy_ne_zero_holder;
                                                end;
                                            #< done ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                        #< done ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                        
                                        clear _not___TWO_copy_ne_zero;
                                        incr _not___TWO_copy_ne_zero;
                                        
                                        while ___TWO_copy_ne_zero_copy not 0 do;
                                            clear _not___TWO_copy_ne_zero;
                                            clear ___TWO_copy_ne_zero_copy;
                                        end;
                                    #< done _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                    #> _not___remainder_plus_difference_copy_ne_zero = not __remainder_plus_difference_copy_ne_zero;
                                        #> ___remainder_plus_difference_copy_ne_zero_copy = __remainder_plus_difference_copy_ne_zero;
                                            clear ___remainder_plus_difference_copy_ne_zero_copy;
                                            #> ___remainder_plus_difference_copy_ne_zero_copy += __remainder_plus_difference_copy_ne_zero;
                                                clear ___remainder_plus_difference_copy_ne_zero_holder;
                                                
                                                while __remainder_plus_difference_copy_ne_zero not 0 do;
                                                    incr ___remainder_plus_difference_copy_ne_zero_copy;
                                                    incr ___remainder_plus_difference_copy_ne_zero_holder;
                                                    decr __remainder_plus_difference_copy_ne_zero;
                                                end;
                                                
                                                while ___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                    incr __remainder_plus_difference_copy_ne_zero;
                                                    decr ___remainder_plus_difference_copy_ne_zero_holder;
                                                end;
                                            #< done ___remainder_plus_difference_copy_ne_zero_copy += __remainder_plus_difference_copy_ne_zero;
                                        #< done ___remainder_plus_difference_copy_ne_zero_copy = __remainder_plus_difference_copy_ne_zero;
                                        
                                        clear _not___remainder_plus_difference_copy_ne_zero;
                                        incr _not___remainder_plus_difference_copy_ne_zero;
                                        
                                        while ___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear _not___remainder_plus_difference_copy_ne_zero;
                                            clear ___remainder_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done _not___remainder_plus_difference_copy_ne_zero = not __remainder_plus_difference_copy_ne_zero;
                                    #> _inner_or = _not___TWO_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
                                        #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_copy;
                                            #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                                clear __not___TWO_copy_ne_zero_holder;
                                                
                                                while _not___TWO_copy_ne_zero not 0 do;
                                                    incr __not___TWO_copy_ne_zero_copy;
                                                    incr __not___TWO_copy_ne_zero_holder;
                                                    decr _not___TWO_copy_ne_zero;
                                                end;
                                                
                                                while __not___TWO_copy_ne_zero_holder not 0 do;
                                                    incr _not___TWO_copy_ne_zero;
                                                    decr __not___TWO_copy_ne_zero_holder;
                                                end;
                                            #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                        #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        #> __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                            clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                            #> __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                                clear __not___remainder_plus_difference_copy_ne_zero_holder;
                                                
                                                while _not___remainder_plus_difference_copy_ne_zero not 0 do;
                                                    incr __not___remainder_plus_difference_copy_ne_zero_copy;
                                                    incr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                    decr _not___remainder_plus_difference_copy_ne_zero;
                                                end;
                                                
                                                while __not___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                    incr _not___remainder_plus_difference_copy_ne_zero;
                                                    decr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                end;
                                            #< done __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                        #< done __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                        clear _inner_or;
                                        
                                        while __not___TWO_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___TWO_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not___TWO_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
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
                                #< done _neither_are_zero = __TWO_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                            end;
                            
                            
                            clear _difference;
                            
                            while __TWO_copy_ne_zero not 0 do;
                                # __TWO_copy_ne_zero is True, so _TWO must be the larger
                                #> _difference = __TWO_copy;
                                    clear _difference;
                                    #> _difference += __TWO_copy;
                                        clear ___TWO_copy_holder;
                                        
                                        while __TWO_copy not 0 do;
                                            incr _difference;
                                            incr ___TWO_copy_holder;
                                            decr __TWO_copy;
                                        end;
                                        
                                        while ___TWO_copy_holder not 0 do;
                                            incr __TWO_copy;
                                            decr ___TWO_copy_holder;
                                        end;
                                    #< done _difference += __TWO_copy;
                                #< done _difference = __TWO_copy;
                                clear __TWO_copy_ne_zero;
                            end;
                            
                            while __remainder_plus_difference_copy_ne_zero not 0 do;
                                # __remainder_plus_difference_copy_ne_zero is True, so _remainder_plus_difference must be the larger
                                #> _difference = __remainder_plus_difference_copy;
                                    clear _difference;
                                    #> _difference += __remainder_plus_difference_copy;
                                        clear ___remainder_plus_difference_copy_holder;
                                        
                                        while __remainder_plus_difference_copy not 0 do;
                                            incr _difference;
                                            incr ___remainder_plus_difference_copy_holder;
                                            decr __remainder_plus_difference_copy;
                                        end;
                                        
                                        while ___remainder_plus_difference_copy_holder not 0 do;
                                            incr __remainder_plus_difference_copy;
                                            decr ___remainder_plus_difference_copy_holder;
                                        end;
                                    #< done _difference += __remainder_plus_difference_copy;
                                #< done _difference = __remainder_plus_difference_copy;
                                clear __remainder_plus_difference_copy_ne_zero;
                            end;
                        #< done _difference = abs(_remainder_plus_difference - _TWO);
                        clear _remainder_plus_difference_eq__TWO;
                        incr _remainder_plus_difference_eq__TWO;
                        while _difference not 0 do;
                            clear _remainder_plus_difference_eq__TWO;
                            clear _difference;
                        end;
                        
                        # If _remainder_plus_difference == _TWO, _remainder_plus_difference_eq__TWO = 1. Otherwise, _remainder_plus_difference_eq__TWO = 0
                    #< done _remainder_plus_difference_eq__TWO = _remainder_plus_difference == _TWO;
                    # If X + abs(X - Y) == Y, Y was bigger, so false
                    #> _remainder_gt__TWO = not _remainder_plus_difference_eq__TWO;
                        #> __remainder_plus_difference_eq__TWO_copy = _remainder_plus_difference_eq__TWO;
                            clear __remainder_plus_difference_eq__TWO_copy;
                            #> __remainder_plus_difference_eq__TWO_copy += _remainder_plus_difference_eq__TWO;
                                clear __remainder_plus_difference_eq__TWO_holder;
                                
                                while _remainder_plus_difference_eq__TWO not 0 do;
                                    incr __remainder_plus_difference_eq__TWO_copy;
                                    incr __remainder_plus_difference_eq__TWO_holder;
                                    decr _remainder_plus_difference_eq__TWO;
                                end;
                                
                                while __remainder_plus_difference_eq__TWO_holder not 0 do;
                                    incr _remainder_plus_difference_eq__TWO;
                                    decr __remainder_plus_difference_eq__TWO_holder;
                                end;
                            #< done __remainder_plus_difference_eq__TWO_copy += _remainder_plus_difference_eq__TWO;
                        #< done __remainder_plus_difference_eq__TWO_copy = _remainder_plus_difference_eq__TWO;
                        
                        clear _remainder_gt__TWO;
                        incr _remainder_gt__TWO;
                        
                        while __remainder_plus_difference_eq__TWO_copy not 0 do;
                            clear _remainder_gt__TWO;
                            clear __remainder_plus_difference_eq__TWO_copy;
                        end;
                    #< done _remainder_gt__TWO = not _remainder_plus_difference_eq__TWO;
                #< done _remainder_gt__TWO = remainder > _TWO;
                #> _remainder_eq__TWO = remainder == _TWO;
                    #> _difference = abs(remainder - _TWO);
                        #> _remainder_copy = remainder;
                            clear _remainder_copy;
                            #> _remainder_copy += remainder;
                                clear _remainder_holder;
                                
                                while remainder not 0 do;
                                    incr _remainder_copy;
                                    incr _remainder_holder;
                                    decr remainder;
                                end;
                                
                                while _remainder_holder not 0 do;
                                    incr remainder;
                                    decr _remainder_holder;
                                end;
                            #< done _remainder_copy += remainder;
                        #< done _remainder_copy = remainder;
                        #> __TWO_copy = _TWO;
                            clear __TWO_copy;
                            #> __TWO_copy += _TWO;
                                clear __TWO_holder;
                                
                                while _TWO not 0 do;
                                    incr __TWO_copy;
                                    incr __TWO_holder;
                                    decr _TWO;
                                end;
                                
                                while __TWO_holder not 0 do;
                                    incr _TWO;
                                    decr __TWO_holder;
                                end;
                            #< done __TWO_copy += _TWO;
                        #< done __TWO_copy = _TWO;
                        
                        #> _remainder_copy_ne_zero = _remainder_copy != 0;
                            #> _not__remainder_copy_ne_zero = _remainder_copy == 0;
                                #> __remainder_copy_copy = _remainder_copy;
                                    clear __remainder_copy_copy;
                                    #> __remainder_copy_copy += _remainder_copy;
                                        clear __remainder_copy_holder;
                                        
                                        while _remainder_copy not 0 do;
                                            incr __remainder_copy_copy;
                                            incr __remainder_copy_holder;
                                            decr _remainder_copy;
                                        end;
                                        
                                        while __remainder_copy_holder not 0 do;
                                            incr _remainder_copy;
                                            decr __remainder_copy_holder;
                                        end;
                                    #< done __remainder_copy_copy += _remainder_copy;
                                #< done __remainder_copy_copy = _remainder_copy;
                                
                                clear _not__remainder_copy_ne_zero;
                                incr _not__remainder_copy_ne_zero;
                                while __remainder_copy_copy not 0 do;
                                    clear _not__remainder_copy_ne_zero;
                                    clear __remainder_copy_copy;
                                end;
                            #< done _not__remainder_copy_ne_zero = _remainder_copy == 0;
                            #> _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                                #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_copy;
                                    #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_holder;
                                        
                                        while _not__remainder_copy_ne_zero not 0 do;
                                            incr __not__remainder_copy_ne_zero_copy;
                                            incr __not__remainder_copy_ne_zero_holder;
                                            decr _not__remainder_copy_ne_zero;
                                        end;
                                        
                                        while __not__remainder_copy_ne_zero_holder not 0 do;
                                            incr _not__remainder_copy_ne_zero;
                                            decr __not__remainder_copy_ne_zero_holder;
                                        end;
                                    #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                
                                clear _remainder_copy_ne_zero;
                                incr _remainder_copy_ne_zero;
                                
                                while __not__remainder_copy_ne_zero_copy not 0 do;
                                    clear _remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_copy;
                                end;
                            #< done _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                        #< done _remainder_copy_ne_zero = _remainder_copy != 0;
                        #> __TWO_copy_ne_zero = __TWO_copy != 0;
                            #> _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                #> ___TWO_copy_copy = __TWO_copy;
                                    clear ___TWO_copy_copy;
                                    #> ___TWO_copy_copy += __TWO_copy;
                                        clear ___TWO_copy_holder;
                                        
                                        while __TWO_copy not 0 do;
                                            incr ___TWO_copy_copy;
                                            incr ___TWO_copy_holder;
                                            decr __TWO_copy;
                                        end;
                                        
                                        while ___TWO_copy_holder not 0 do;
                                            incr __TWO_copy;
                                            decr ___TWO_copy_holder;
                                        end;
                                    #< done ___TWO_copy_copy += __TWO_copy;
                                #< done ___TWO_copy_copy = __TWO_copy;
                                
                                clear _not___TWO_copy_ne_zero;
                                incr _not___TWO_copy_ne_zero;
                                while ___TWO_copy_copy not 0 do;
                                    clear _not___TWO_copy_ne_zero;
                                    clear ___TWO_copy_copy;
                                end;
                            #< done _not___TWO_copy_ne_zero = __TWO_copy == 0;
                            #> __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                    clear __not___TWO_copy_ne_zero_copy;
                                    #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_holder;
                                        
                                        while _not___TWO_copy_ne_zero not 0 do;
                                            incr __not___TWO_copy_ne_zero_copy;
                                            incr __not___TWO_copy_ne_zero_holder;
                                            decr _not___TWO_copy_ne_zero;
                                        end;
                                        
                                        while __not___TWO_copy_ne_zero_holder not 0 do;
                                            incr _not___TWO_copy_ne_zero;
                                            decr __not___TWO_copy_ne_zero_holder;
                                        end;
                                    #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                
                                clear __TWO_copy_ne_zero;
                                incr __TWO_copy_ne_zero;
                                
                                while __not___TWO_copy_ne_zero_copy not 0 do;
                                    clear __TWO_copy_ne_zero;
                                    clear __not___TWO_copy_ne_zero_copy;
                                end;
                            #< done __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                        #< done __TWO_copy_ne_zero = __TWO_copy != 0;
                        #> _neither_are_zero = __TWO_copy_ne_zero and _remainder_copy_ne_zero;
                            # DeMorgan's:
                            #  (X and Y) = not ((not X) or (not Y))
                            #> _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                #> ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                    clear ___TWO_copy_ne_zero_copy;
                                    #> ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                        clear ___TWO_copy_ne_zero_holder;
                                        
                                        while __TWO_copy_ne_zero not 0 do;
                                            incr ___TWO_copy_ne_zero_copy;
                                            incr ___TWO_copy_ne_zero_holder;
                                            decr __TWO_copy_ne_zero;
                                        end;
                                        
                                        while ___TWO_copy_ne_zero_holder not 0 do;
                                            incr __TWO_copy_ne_zero;
                                            decr ___TWO_copy_ne_zero_holder;
                                        end;
                                    #< done ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                #< done ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                
                                clear _not___TWO_copy_ne_zero;
                                incr _not___TWO_copy_ne_zero;
                                
                                while ___TWO_copy_ne_zero_copy not 0 do;
                                    clear _not___TWO_copy_ne_zero;
                                    clear ___TWO_copy_ne_zero_copy;
                                end;
                            #< done _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                            #> _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                                #> __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                    clear __remainder_copy_ne_zero_copy;
                                    #> __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                        clear __remainder_copy_ne_zero_holder;
                                        
                                        while _remainder_copy_ne_zero not 0 do;
                                            incr __remainder_copy_ne_zero_copy;
                                            incr __remainder_copy_ne_zero_holder;
                                            decr _remainder_copy_ne_zero;
                                        end;
                                        
                                        while __remainder_copy_ne_zero_holder not 0 do;
                                            incr _remainder_copy_ne_zero;
                                            decr __remainder_copy_ne_zero_holder;
                                        end;
                                    #< done __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                #< done __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                
                                clear _not__remainder_copy_ne_zero;
                                incr _not__remainder_copy_ne_zero;
                                
                                while __remainder_copy_ne_zero_copy not 0 do;
                                    clear _not__remainder_copy_ne_zero;
                                    clear __remainder_copy_ne_zero_copy;
                                end;
                            #< done _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                            #> _inner_or = _not___TWO_copy_ne_zero or _not__remainder_copy_ne_zero;
                                #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                    clear __not___TWO_copy_ne_zero_copy;
                                    #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_holder;
                                        
                                        while _not___TWO_copy_ne_zero not 0 do;
                                            incr __not___TWO_copy_ne_zero_copy;
                                            incr __not___TWO_copy_ne_zero_holder;
                                            decr _not___TWO_copy_ne_zero;
                                        end;
                                        
                                        while __not___TWO_copy_ne_zero_holder not 0 do;
                                            incr _not___TWO_copy_ne_zero;
                                            decr __not___TWO_copy_ne_zero_holder;
                                        end;
                                    #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_copy;
                                    #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_holder;
                                        
                                        while _not__remainder_copy_ne_zero not 0 do;
                                            incr __not__remainder_copy_ne_zero_copy;
                                            incr __not__remainder_copy_ne_zero_holder;
                                            decr _not__remainder_copy_ne_zero;
                                        end;
                                        
                                        while __not__remainder_copy_ne_zero_holder not 0 do;
                                            incr _not__remainder_copy_ne_zero;
                                            decr __not__remainder_copy_ne_zero_holder;
                                        end;
                                    #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not___TWO_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___TWO_copy_ne_zero_copy;
                                end;
                                
                                while __not__remainder_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__remainder_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not___TWO_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                        #< done _neither_are_zero = __TWO_copy_ne_zero and _remainder_copy_ne_zero;
                        while _neither_are_zero not 0 do;
                            decr _remainder_copy;
                            decr __TWO_copy;
                            
                            #> _remainder_copy_ne_zero = _remainder_copy != 0;
                                #> _not__remainder_copy_ne_zero = _remainder_copy == 0;
                                    #> __remainder_copy_copy = _remainder_copy;
                                        clear __remainder_copy_copy;
                                        #> __remainder_copy_copy += _remainder_copy;
                                            clear __remainder_copy_holder;
                                            
                                            while _remainder_copy not 0 do;
                                                incr __remainder_copy_copy;
                                                incr __remainder_copy_holder;
                                                decr _remainder_copy;
                                            end;
                                            
                                            while __remainder_copy_holder not 0 do;
                                                incr _remainder_copy;
                                                decr __remainder_copy_holder;
                                            end;
                                        #< done __remainder_copy_copy += _remainder_copy;
                                    #< done __remainder_copy_copy = _remainder_copy;
                                    
                                    clear _not__remainder_copy_ne_zero;
                                    incr _not__remainder_copy_ne_zero;
                                    while __remainder_copy_copy not 0 do;
                                        clear _not__remainder_copy_ne_zero;
                                        clear __remainder_copy_copy;
                                    end;
                                #< done _not__remainder_copy_ne_zero = _remainder_copy == 0;
                                #> _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                                    #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_copy;
                                        #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                            clear __not__remainder_copy_ne_zero_holder;
                                            
                                            while _not__remainder_copy_ne_zero not 0 do;
                                                incr __not__remainder_copy_ne_zero_copy;
                                                incr __not__remainder_copy_ne_zero_holder;
                                                decr _not__remainder_copy_ne_zero;
                                            end;
                                            
                                            while __not__remainder_copy_ne_zero_holder not 0 do;
                                                incr _not__remainder_copy_ne_zero;
                                                decr __not__remainder_copy_ne_zero_holder;
                                            end;
                                        #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                    #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                    
                                    clear _remainder_copy_ne_zero;
                                    incr _remainder_copy_ne_zero;
                                    
                                    while __not__remainder_copy_ne_zero_copy not 0 do;
                                        clear _remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_copy;
                                    end;
                                #< done _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                            #< done _remainder_copy_ne_zero = _remainder_copy != 0;
                            #> __TWO_copy_ne_zero = __TWO_copy != 0;
                                #> _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                    #> ___TWO_copy_copy = __TWO_copy;
                                        clear ___TWO_copy_copy;
                                        #> ___TWO_copy_copy += __TWO_copy;
                                            clear ___TWO_copy_holder;
                                            
                                            while __TWO_copy not 0 do;
                                                incr ___TWO_copy_copy;
                                                incr ___TWO_copy_holder;
                                                decr __TWO_copy;
                                            end;
                                            
                                            while ___TWO_copy_holder not 0 do;
                                                incr __TWO_copy;
                                                decr ___TWO_copy_holder;
                                            end;
                                        #< done ___TWO_copy_copy += __TWO_copy;
                                    #< done ___TWO_copy_copy = __TWO_copy;
                                    
                                    clear _not___TWO_copy_ne_zero;
                                    incr _not___TWO_copy_ne_zero;
                                    while ___TWO_copy_copy not 0 do;
                                        clear _not___TWO_copy_ne_zero;
                                        clear ___TWO_copy_copy;
                                    end;
                                #< done _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                #> __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                    #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_copy;
                                        #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_holder;
                                            
                                            while _not___TWO_copy_ne_zero not 0 do;
                                                incr __not___TWO_copy_ne_zero_copy;
                                                incr __not___TWO_copy_ne_zero_holder;
                                                decr _not___TWO_copy_ne_zero;
                                            end;
                                            
                                            while __not___TWO_copy_ne_zero_holder not 0 do;
                                                incr _not___TWO_copy_ne_zero;
                                                decr __not___TWO_copy_ne_zero_holder;
                                            end;
                                        #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                    #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                    
                                    clear __TWO_copy_ne_zero;
                                    incr __TWO_copy_ne_zero;
                                    
                                    while __not___TWO_copy_ne_zero_copy not 0 do;
                                        clear __TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_copy;
                                    end;
                                #< done __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                            #< done __TWO_copy_ne_zero = __TWO_copy != 0;
                            #> _neither_are_zero = __TWO_copy_ne_zero and _remainder_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                    #> ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                        clear ___TWO_copy_ne_zero_copy;
                                        #> ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                            clear ___TWO_copy_ne_zero_holder;
                                            
                                            while __TWO_copy_ne_zero not 0 do;
                                                incr ___TWO_copy_ne_zero_copy;
                                                incr ___TWO_copy_ne_zero_holder;
                                                decr __TWO_copy_ne_zero;
                                            end;
                                            
                                            while ___TWO_copy_ne_zero_holder not 0 do;
                                                incr __TWO_copy_ne_zero;
                                                decr ___TWO_copy_ne_zero_holder;
                                            end;
                                        #< done ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                    #< done ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                    
                                    clear _not___TWO_copy_ne_zero;
                                    incr _not___TWO_copy_ne_zero;
                                    
                                    while ___TWO_copy_ne_zero_copy not 0 do;
                                        clear _not___TWO_copy_ne_zero;
                                        clear ___TWO_copy_ne_zero_copy;
                                    end;
                                #< done _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                #> _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                                    #> __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                        clear __remainder_copy_ne_zero_copy;
                                        #> __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                            clear __remainder_copy_ne_zero_holder;
                                            
                                            while _remainder_copy_ne_zero not 0 do;
                                                incr __remainder_copy_ne_zero_copy;
                                                incr __remainder_copy_ne_zero_holder;
                                                decr _remainder_copy_ne_zero;
                                            end;
                                            
                                            while __remainder_copy_ne_zero_holder not 0 do;
                                                incr _remainder_copy_ne_zero;
                                                decr __remainder_copy_ne_zero_holder;
                                            end;
                                        #< done __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                    #< done __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                    
                                    clear _not__remainder_copy_ne_zero;
                                    incr _not__remainder_copy_ne_zero;
                                    
                                    while __remainder_copy_ne_zero_copy not 0 do;
                                        clear _not__remainder_copy_ne_zero;
                                        clear __remainder_copy_ne_zero_copy;
                                    end;
                                #< done _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                                #> _inner_or = _not___TWO_copy_ne_zero or _not__remainder_copy_ne_zero;
                                    #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_copy;
                                        #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_holder;
                                            
                                            while _not___TWO_copy_ne_zero not 0 do;
                                                incr __not___TWO_copy_ne_zero_copy;
                                                incr __not___TWO_copy_ne_zero_holder;
                                                decr _not___TWO_copy_ne_zero;
                                            end;
                                            
                                            while __not___TWO_copy_ne_zero_holder not 0 do;
                                                incr _not___TWO_copy_ne_zero;
                                                decr __not___TWO_copy_ne_zero_holder;
                                            end;
                                        #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                    #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                    #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_copy;
                                        #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                            clear __not__remainder_copy_ne_zero_holder;
                                            
                                            while _not__remainder_copy_ne_zero not 0 do;
                                                incr __not__remainder_copy_ne_zero_copy;
                                                incr __not__remainder_copy_ne_zero_holder;
                                                decr _not__remainder_copy_ne_zero;
                                            end;
                                            
                                            while __not__remainder_copy_ne_zero_holder not 0 do;
                                                incr _not__remainder_copy_ne_zero;
                                                decr __not__remainder_copy_ne_zero_holder;
                                            end;
                                        #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                    #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not___TWO_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___TWO_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not__remainder_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not__remainder_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not___TWO_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                            #< done _neither_are_zero = __TWO_copy_ne_zero and _remainder_copy_ne_zero;
                        end;
                        
                        
                        clear _difference;
                        
                        while __TWO_copy_ne_zero not 0 do;
                            # __TWO_copy_ne_zero is True, so _TWO must be the larger
                            #> _difference = __TWO_copy;
                                clear _difference;
                                #> _difference += __TWO_copy;
                                    clear ___TWO_copy_holder;
                                    
                                    while __TWO_copy not 0 do;
                                        incr _difference;
                                        incr ___TWO_copy_holder;
                                        decr __TWO_copy;
                                    end;
                                    
                                    while ___TWO_copy_holder not 0 do;
                                        incr __TWO_copy;
                                        decr ___TWO_copy_holder;
                                    end;
                                #< done _difference += __TWO_copy;
                            #< done _difference = __TWO_copy;
                            clear __TWO_copy_ne_zero;
                        end;
                        
                        while _remainder_copy_ne_zero not 0 do;
                            # _remainder_copy_ne_zero is True, so remainder must be the larger
                            #> _difference = _remainder_copy;
                                clear _difference;
                                #> _difference += _remainder_copy;
                                    clear __remainder_copy_holder;
                                    
                                    while _remainder_copy not 0 do;
                                        incr _difference;
                                        incr __remainder_copy_holder;
                                        decr _remainder_copy;
                                    end;
                                    
                                    while __remainder_copy_holder not 0 do;
                                        incr _remainder_copy;
                                        decr __remainder_copy_holder;
                                    end;
                                #< done _difference += _remainder_copy;
                            #< done _difference = _remainder_copy;
                            clear _remainder_copy_ne_zero;
                        end;
                    #< done _difference = abs(remainder - _TWO);
                    clear _remainder_eq__TWO;
                    incr _remainder_eq__TWO;
                    while _difference not 0 do;
                        clear _remainder_eq__TWO;
                        clear _difference;
                    end;
                    
                    # If remainder == _TWO, _remainder_eq__TWO = 1. Otherwise, _remainder_eq__TWO = 0
                #< done _remainder_eq__TWO = remainder == _TWO;
                #> _remainder_ge__TWO = _remainder_gt__TWO or _remainder_eq__TWO;
                    #> __remainder_gt__TWO_copy = _remainder_gt__TWO;
                        clear __remainder_gt__TWO_copy;
                        #> __remainder_gt__TWO_copy += _remainder_gt__TWO;
                            clear __remainder_gt__TWO_holder;
                            
                            while _remainder_gt__TWO not 0 do;
                                incr __remainder_gt__TWO_copy;
                                incr __remainder_gt__TWO_holder;
                                decr _remainder_gt__TWO;
                            end;
                            
                            while __remainder_gt__TWO_holder not 0 do;
                                incr _remainder_gt__TWO;
                                decr __remainder_gt__TWO_holder;
                            end;
                        #< done __remainder_gt__TWO_copy += _remainder_gt__TWO;
                    #< done __remainder_gt__TWO_copy = _remainder_gt__TWO;
                    #> __remainder_eq__TWO_copy = _remainder_eq__TWO;
                        clear __remainder_eq__TWO_copy;
                        #> __remainder_eq__TWO_copy += _remainder_eq__TWO;
                            clear __remainder_eq__TWO_holder;
                            
                            while _remainder_eq__TWO not 0 do;
                                incr __remainder_eq__TWO_copy;
                                incr __remainder_eq__TWO_holder;
                                decr _remainder_eq__TWO;
                            end;
                            
                            while __remainder_eq__TWO_holder not 0 do;
                                incr _remainder_eq__TWO;
                                decr __remainder_eq__TWO_holder;
                            end;
                        #< done __remainder_eq__TWO_copy += _remainder_eq__TWO;
                    #< done __remainder_eq__TWO_copy = _remainder_eq__TWO;
                    clear _remainder_ge__TWO;
                    
                    while __remainder_gt__TWO_copy not 0 do;
                        clear _remainder_ge__TWO;
                        incr _remainder_ge__TWO;
                        clear __remainder_gt__TWO_copy;
                    end;
                    
                    while __remainder_eq__TWO_copy not 0 do;
                        clear _remainder_ge__TWO;
                        incr _remainder_ge__TWO;
                        clear __remainder_eq__TWO_copy;
                    end;
                #< done _remainder_ge__TWO = _remainder_gt__TWO or _remainder_eq__TWO;
            #< done _remainder_ge__TWO = remainder >= _TWO;
            while _remainder_ge__TWO not 0 do;
                incr X_copy_over_two;
                #> remainder -= _TWO;
                    clear __TWO_holder;
                    
                    while _TWO not 0 do;
                        decr remainder;
                        incr __TWO_holder;
                        decr _TWO;
                    end;
                    
                    while __TWO_holder not 0 do;
                        incr _TWO;
                        decr __TWO_holder;
                    end;
                #< done remainder -= _TWO;
                
                #> _remainder_ge__TWO = remainder >= _TWO;
                    #> _remainder_gt__TWO = remainder > _TWO;
                        #> _remainder_copy = remainder;
                            clear _remainder_copy;
                            #> _remainder_copy += remainder;
                                clear _remainder_holder;
                                
                                while remainder not 0 do;
                                    incr _remainder_copy;
                                    incr _remainder_holder;
                                    decr remainder;
                                end;
                                
                                while _remainder_holder not 0 do;
                                    incr remainder;
                                    decr _remainder_holder;
                                end;
                            #< done _remainder_copy += remainder;
                        #< done _remainder_copy = remainder;
                        #> __TWO_copy = _TWO;
                            clear __TWO_copy;
                            #> __TWO_copy += _TWO;
                                clear __TWO_holder;
                                
                                while _TWO not 0 do;
                                    incr __TWO_copy;
                                    incr __TWO_holder;
                                    decr _TWO;
                                end;
                                
                                while __TWO_holder not 0 do;
                                    incr _TWO;
                                    decr __TWO_holder;
                                end;
                            #< done __TWO_copy += _TWO;
                        #< done __TWO_copy = _TWO;
                        
                        #> _difference = abs(_remainder_copy - __TWO_copy);
                            #> __remainder_copy_copy = _remainder_copy;
                                clear __remainder_copy_copy;
                                #> __remainder_copy_copy += _remainder_copy;
                                    clear __remainder_copy_holder;
                                    
                                    while _remainder_copy not 0 do;
                                        incr __remainder_copy_copy;
                                        incr __remainder_copy_holder;
                                        decr _remainder_copy;
                                    end;
                                    
                                    while __remainder_copy_holder not 0 do;
                                        incr _remainder_copy;
                                        decr __remainder_copy_holder;
                                    end;
                                #< done __remainder_copy_copy += _remainder_copy;
                            #< done __remainder_copy_copy = _remainder_copy;
                            #> ___TWO_copy_copy = __TWO_copy;
                                clear ___TWO_copy_copy;
                                #> ___TWO_copy_copy += __TWO_copy;
                                    clear ___TWO_copy_holder;
                                    
                                    while __TWO_copy not 0 do;
                                        incr ___TWO_copy_copy;
                                        incr ___TWO_copy_holder;
                                        decr __TWO_copy;
                                    end;
                                    
                                    while ___TWO_copy_holder not 0 do;
                                        incr __TWO_copy;
                                        decr ___TWO_copy_holder;
                                    end;
                                #< done ___TWO_copy_copy += __TWO_copy;
                            #< done ___TWO_copy_copy = __TWO_copy;
                            
                            #> __remainder_copy_copy_ne_zero = __remainder_copy_copy != 0;
                                #> _not___remainder_copy_copy_ne_zero = __remainder_copy_copy == 0;
                                    #> ___remainder_copy_copy_copy = __remainder_copy_copy;
                                        clear ___remainder_copy_copy_copy;
                                        #> ___remainder_copy_copy_copy += __remainder_copy_copy;
                                            clear ___remainder_copy_copy_holder;
                                            
                                            while __remainder_copy_copy not 0 do;
                                                incr ___remainder_copy_copy_copy;
                                                incr ___remainder_copy_copy_holder;
                                                decr __remainder_copy_copy;
                                            end;
                                            
                                            while ___remainder_copy_copy_holder not 0 do;
                                                incr __remainder_copy_copy;
                                                decr ___remainder_copy_copy_holder;
                                            end;
                                        #< done ___remainder_copy_copy_copy += __remainder_copy_copy;
                                    #< done ___remainder_copy_copy_copy = __remainder_copy_copy;
                                    
                                    clear _not___remainder_copy_copy_ne_zero;
                                    incr _not___remainder_copy_copy_ne_zero;
                                    while ___remainder_copy_copy_copy not 0 do;
                                        clear _not___remainder_copy_copy_ne_zero;
                                        clear ___remainder_copy_copy_copy;
                                    end;
                                #< done _not___remainder_copy_copy_ne_zero = __remainder_copy_copy == 0;
                                #> __remainder_copy_copy_ne_zero = not _not___remainder_copy_copy_ne_zero;
                                    #> __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                        clear __not___remainder_copy_copy_ne_zero_copy;
                                        #> __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                            clear __not___remainder_copy_copy_ne_zero_holder;
                                            
                                            while _not___remainder_copy_copy_ne_zero not 0 do;
                                                incr __not___remainder_copy_copy_ne_zero_copy;
                                                incr __not___remainder_copy_copy_ne_zero_holder;
                                                decr _not___remainder_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___remainder_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___remainder_copy_copy_ne_zero;
                                                decr __not___remainder_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                    #< done __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                    
                                    clear __remainder_copy_copy_ne_zero;
                                    incr __remainder_copy_copy_ne_zero;
                                    
                                    while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                        clear __remainder_copy_copy_ne_zero;
                                        clear __not___remainder_copy_copy_ne_zero_copy;
                                    end;
                                #< done __remainder_copy_copy_ne_zero = not _not___remainder_copy_copy_ne_zero;
                            #< done __remainder_copy_copy_ne_zero = __remainder_copy_copy != 0;
                            #> ___TWO_copy_copy_ne_zero = ___TWO_copy_copy != 0;
                                #> _not____TWO_copy_copy_ne_zero = ___TWO_copy_copy == 0;
                                    #> ____TWO_copy_copy_copy = ___TWO_copy_copy;
                                        clear ____TWO_copy_copy_copy;
                                        #> ____TWO_copy_copy_copy += ___TWO_copy_copy;
                                            clear ____TWO_copy_copy_holder;
                                            
                                            while ___TWO_copy_copy not 0 do;
                                                incr ____TWO_copy_copy_copy;
                                                incr ____TWO_copy_copy_holder;
                                                decr ___TWO_copy_copy;
                                            end;
                                            
                                            while ____TWO_copy_copy_holder not 0 do;
                                                incr ___TWO_copy_copy;
                                                decr ____TWO_copy_copy_holder;
                                            end;
                                        #< done ____TWO_copy_copy_copy += ___TWO_copy_copy;
                                    #< done ____TWO_copy_copy_copy = ___TWO_copy_copy;
                                    
                                    clear _not____TWO_copy_copy_ne_zero;
                                    incr _not____TWO_copy_copy_ne_zero;
                                    while ____TWO_copy_copy_copy not 0 do;
                                        clear _not____TWO_copy_copy_ne_zero;
                                        clear ____TWO_copy_copy_copy;
                                    end;
                                #< done _not____TWO_copy_copy_ne_zero = ___TWO_copy_copy == 0;
                                #> ___TWO_copy_copy_ne_zero = not _not____TWO_copy_copy_ne_zero;
                                    #> __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                        clear __not____TWO_copy_copy_ne_zero_copy;
                                        #> __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                            clear __not____TWO_copy_copy_ne_zero_holder;
                                            
                                            while _not____TWO_copy_copy_ne_zero not 0 do;
                                                incr __not____TWO_copy_copy_ne_zero_copy;
                                                incr __not____TWO_copy_copy_ne_zero_holder;
                                                decr _not____TWO_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not____TWO_copy_copy_ne_zero_holder not 0 do;
                                                incr _not____TWO_copy_copy_ne_zero;
                                                decr __not____TWO_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                    #< done __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                    
                                    clear ___TWO_copy_copy_ne_zero;
                                    incr ___TWO_copy_copy_ne_zero;
                                    
                                    while __not____TWO_copy_copy_ne_zero_copy not 0 do;
                                        clear ___TWO_copy_copy_ne_zero;
                                        clear __not____TWO_copy_copy_ne_zero_copy;
                                    end;
                                #< done ___TWO_copy_copy_ne_zero = not _not____TWO_copy_copy_ne_zero;
                            #< done ___TWO_copy_copy_ne_zero = ___TWO_copy_copy != 0;
                            #> _neither_are_zero = ___TWO_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not____TWO_copy_copy_ne_zero = not ___TWO_copy_copy_ne_zero;
                                    #> ____TWO_copy_copy_ne_zero_copy = ___TWO_copy_copy_ne_zero;
                                        clear ____TWO_copy_copy_ne_zero_copy;
                                        #> ____TWO_copy_copy_ne_zero_copy += ___TWO_copy_copy_ne_zero;
                                            clear ____TWO_copy_copy_ne_zero_holder;
                                            
                                            while ___TWO_copy_copy_ne_zero not 0 do;
                                                incr ____TWO_copy_copy_ne_zero_copy;
                                                incr ____TWO_copy_copy_ne_zero_holder;
                                                decr ___TWO_copy_copy_ne_zero;
                                            end;
                                            
                                            while ____TWO_copy_copy_ne_zero_holder not 0 do;
                                                incr ___TWO_copy_copy_ne_zero;
                                                decr ____TWO_copy_copy_ne_zero_holder;
                                            end;
                                        #< done ____TWO_copy_copy_ne_zero_copy += ___TWO_copy_copy_ne_zero;
                                    #< done ____TWO_copy_copy_ne_zero_copy = ___TWO_copy_copy_ne_zero;
                                    
                                    clear _not____TWO_copy_copy_ne_zero;
                                    incr _not____TWO_copy_copy_ne_zero;
                                    
                                    while ____TWO_copy_copy_ne_zero_copy not 0 do;
                                        clear _not____TWO_copy_copy_ne_zero;
                                        clear ____TWO_copy_copy_ne_zero_copy;
                                    end;
                                #< done _not____TWO_copy_copy_ne_zero = not ___TWO_copy_copy_ne_zero;
                                #> _not___remainder_copy_copy_ne_zero = not __remainder_copy_copy_ne_zero;
                                    #> ___remainder_copy_copy_ne_zero_copy = __remainder_copy_copy_ne_zero;
                                        clear ___remainder_copy_copy_ne_zero_copy;
                                        #> ___remainder_copy_copy_ne_zero_copy += __remainder_copy_copy_ne_zero;
                                            clear ___remainder_copy_copy_ne_zero_holder;
                                            
                                            while __remainder_copy_copy_ne_zero not 0 do;
                                                incr ___remainder_copy_copy_ne_zero_copy;
                                                incr ___remainder_copy_copy_ne_zero_holder;
                                                decr __remainder_copy_copy_ne_zero;
                                            end;
                                            
                                            while ___remainder_copy_copy_ne_zero_holder not 0 do;
                                                incr __remainder_copy_copy_ne_zero;
                                                decr ___remainder_copy_copy_ne_zero_holder;
                                            end;
                                        #< done ___remainder_copy_copy_ne_zero_copy += __remainder_copy_copy_ne_zero;
                                    #< done ___remainder_copy_copy_ne_zero_copy = __remainder_copy_copy_ne_zero;
                                    
                                    clear _not___remainder_copy_copy_ne_zero;
                                    incr _not___remainder_copy_copy_ne_zero;
                                    
                                    while ___remainder_copy_copy_ne_zero_copy not 0 do;
                                        clear _not___remainder_copy_copy_ne_zero;
                                        clear ___remainder_copy_copy_ne_zero_copy;
                                    end;
                                #< done _not___remainder_copy_copy_ne_zero = not __remainder_copy_copy_ne_zero;
                                #> _inner_or = _not____TWO_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
                                    #> __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                        clear __not____TWO_copy_copy_ne_zero_copy;
                                        #> __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                            clear __not____TWO_copy_copy_ne_zero_holder;
                                            
                                            while _not____TWO_copy_copy_ne_zero not 0 do;
                                                incr __not____TWO_copy_copy_ne_zero_copy;
                                                incr __not____TWO_copy_copy_ne_zero_holder;
                                                decr _not____TWO_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not____TWO_copy_copy_ne_zero_holder not 0 do;
                                                incr _not____TWO_copy_copy_ne_zero;
                                                decr __not____TWO_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                    #< done __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                    #> __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                        clear __not___remainder_copy_copy_ne_zero_copy;
                                        #> __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                            clear __not___remainder_copy_copy_ne_zero_holder;
                                            
                                            while _not___remainder_copy_copy_ne_zero not 0 do;
                                                incr __not___remainder_copy_copy_ne_zero_copy;
                                                incr __not___remainder_copy_copy_ne_zero_holder;
                                                decr _not___remainder_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___remainder_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___remainder_copy_copy_ne_zero;
                                                decr __not___remainder_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                    #< done __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not____TWO_copy_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not____TWO_copy_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___remainder_copy_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not____TWO_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
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
                            #< done _neither_are_zero = ___TWO_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                            while _neither_are_zero not 0 do;
                                decr __remainder_copy_copy;
                                decr ___TWO_copy_copy;
                                
                                #> __remainder_copy_copy_ne_zero = __remainder_copy_copy != 0;
                                    #> _not___remainder_copy_copy_ne_zero = __remainder_copy_copy == 0;
                                        #> ___remainder_copy_copy_copy = __remainder_copy_copy;
                                            clear ___remainder_copy_copy_copy;
                                            #> ___remainder_copy_copy_copy += __remainder_copy_copy;
                                                clear ___remainder_copy_copy_holder;
                                                
                                                while __remainder_copy_copy not 0 do;
                                                    incr ___remainder_copy_copy_copy;
                                                    incr ___remainder_copy_copy_holder;
                                                    decr __remainder_copy_copy;
                                                end;
                                                
                                                while ___remainder_copy_copy_holder not 0 do;
                                                    incr __remainder_copy_copy;
                                                    decr ___remainder_copy_copy_holder;
                                                end;
                                            #< done ___remainder_copy_copy_copy += __remainder_copy_copy;
                                        #< done ___remainder_copy_copy_copy = __remainder_copy_copy;
                                        
                                        clear _not___remainder_copy_copy_ne_zero;
                                        incr _not___remainder_copy_copy_ne_zero;
                                        while ___remainder_copy_copy_copy not 0 do;
                                            clear _not___remainder_copy_copy_ne_zero;
                                            clear ___remainder_copy_copy_copy;
                                        end;
                                    #< done _not___remainder_copy_copy_ne_zero = __remainder_copy_copy == 0;
                                    #> __remainder_copy_copy_ne_zero = not _not___remainder_copy_copy_ne_zero;
                                        #> __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                            clear __not___remainder_copy_copy_ne_zero_copy;
                                            #> __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                                clear __not___remainder_copy_copy_ne_zero_holder;
                                                
                                                while _not___remainder_copy_copy_ne_zero not 0 do;
                                                    incr __not___remainder_copy_copy_ne_zero_copy;
                                                    incr __not___remainder_copy_copy_ne_zero_holder;
                                                    decr _not___remainder_copy_copy_ne_zero;
                                                end;
                                                
                                                while __not___remainder_copy_copy_ne_zero_holder not 0 do;
                                                    incr _not___remainder_copy_copy_ne_zero;
                                                    decr __not___remainder_copy_copy_ne_zero_holder;
                                                end;
                                            #< done __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                        #< done __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                        
                                        clear __remainder_copy_copy_ne_zero;
                                        incr __remainder_copy_copy_ne_zero;
                                        
                                        while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                            clear __remainder_copy_copy_ne_zero;
                                            clear __not___remainder_copy_copy_ne_zero_copy;
                                        end;
                                    #< done __remainder_copy_copy_ne_zero = not _not___remainder_copy_copy_ne_zero;
                                #< done __remainder_copy_copy_ne_zero = __remainder_copy_copy != 0;
                                #> ___TWO_copy_copy_ne_zero = ___TWO_copy_copy != 0;
                                    #> _not____TWO_copy_copy_ne_zero = ___TWO_copy_copy == 0;
                                        #> ____TWO_copy_copy_copy = ___TWO_copy_copy;
                                            clear ____TWO_copy_copy_copy;
                                            #> ____TWO_copy_copy_copy += ___TWO_copy_copy;
                                                clear ____TWO_copy_copy_holder;
                                                
                                                while ___TWO_copy_copy not 0 do;
                                                    incr ____TWO_copy_copy_copy;
                                                    incr ____TWO_copy_copy_holder;
                                                    decr ___TWO_copy_copy;
                                                end;
                                                
                                                while ____TWO_copy_copy_holder not 0 do;
                                                    incr ___TWO_copy_copy;
                                                    decr ____TWO_copy_copy_holder;
                                                end;
                                            #< done ____TWO_copy_copy_copy += ___TWO_copy_copy;
                                        #< done ____TWO_copy_copy_copy = ___TWO_copy_copy;
                                        
                                        clear _not____TWO_copy_copy_ne_zero;
                                        incr _not____TWO_copy_copy_ne_zero;
                                        while ____TWO_copy_copy_copy not 0 do;
                                            clear _not____TWO_copy_copy_ne_zero;
                                            clear ____TWO_copy_copy_copy;
                                        end;
                                    #< done _not____TWO_copy_copy_ne_zero = ___TWO_copy_copy == 0;
                                    #> ___TWO_copy_copy_ne_zero = not _not____TWO_copy_copy_ne_zero;
                                        #> __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                            clear __not____TWO_copy_copy_ne_zero_copy;
                                            #> __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                                clear __not____TWO_copy_copy_ne_zero_holder;
                                                
                                                while _not____TWO_copy_copy_ne_zero not 0 do;
                                                    incr __not____TWO_copy_copy_ne_zero_copy;
                                                    incr __not____TWO_copy_copy_ne_zero_holder;
                                                    decr _not____TWO_copy_copy_ne_zero;
                                                end;
                                                
                                                while __not____TWO_copy_copy_ne_zero_holder not 0 do;
                                                    incr _not____TWO_copy_copy_ne_zero;
                                                    decr __not____TWO_copy_copy_ne_zero_holder;
                                                end;
                                            #< done __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                        #< done __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                        
                                        clear ___TWO_copy_copy_ne_zero;
                                        incr ___TWO_copy_copy_ne_zero;
                                        
                                        while __not____TWO_copy_copy_ne_zero_copy not 0 do;
                                            clear ___TWO_copy_copy_ne_zero;
                                            clear __not____TWO_copy_copy_ne_zero_copy;
                                        end;
                                    #< done ___TWO_copy_copy_ne_zero = not _not____TWO_copy_copy_ne_zero;
                                #< done ___TWO_copy_copy_ne_zero = ___TWO_copy_copy != 0;
                                #> _neither_are_zero = ___TWO_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not____TWO_copy_copy_ne_zero = not ___TWO_copy_copy_ne_zero;
                                        #> ____TWO_copy_copy_ne_zero_copy = ___TWO_copy_copy_ne_zero;
                                            clear ____TWO_copy_copy_ne_zero_copy;
                                            #> ____TWO_copy_copy_ne_zero_copy += ___TWO_copy_copy_ne_zero;
                                                clear ____TWO_copy_copy_ne_zero_holder;
                                                
                                                while ___TWO_copy_copy_ne_zero not 0 do;
                                                    incr ____TWO_copy_copy_ne_zero_copy;
                                                    incr ____TWO_copy_copy_ne_zero_holder;
                                                    decr ___TWO_copy_copy_ne_zero;
                                                end;
                                                
                                                while ____TWO_copy_copy_ne_zero_holder not 0 do;
                                                    incr ___TWO_copy_copy_ne_zero;
                                                    decr ____TWO_copy_copy_ne_zero_holder;
                                                end;
                                            #< done ____TWO_copy_copy_ne_zero_copy += ___TWO_copy_copy_ne_zero;
                                        #< done ____TWO_copy_copy_ne_zero_copy = ___TWO_copy_copy_ne_zero;
                                        
                                        clear _not____TWO_copy_copy_ne_zero;
                                        incr _not____TWO_copy_copy_ne_zero;
                                        
                                        while ____TWO_copy_copy_ne_zero_copy not 0 do;
                                            clear _not____TWO_copy_copy_ne_zero;
                                            clear ____TWO_copy_copy_ne_zero_copy;
                                        end;
                                    #< done _not____TWO_copy_copy_ne_zero = not ___TWO_copy_copy_ne_zero;
                                    #> _not___remainder_copy_copy_ne_zero = not __remainder_copy_copy_ne_zero;
                                        #> ___remainder_copy_copy_ne_zero_copy = __remainder_copy_copy_ne_zero;
                                            clear ___remainder_copy_copy_ne_zero_copy;
                                            #> ___remainder_copy_copy_ne_zero_copy += __remainder_copy_copy_ne_zero;
                                                clear ___remainder_copy_copy_ne_zero_holder;
                                                
                                                while __remainder_copy_copy_ne_zero not 0 do;
                                                    incr ___remainder_copy_copy_ne_zero_copy;
                                                    incr ___remainder_copy_copy_ne_zero_holder;
                                                    decr __remainder_copy_copy_ne_zero;
                                                end;
                                                
                                                while ___remainder_copy_copy_ne_zero_holder not 0 do;
                                                    incr __remainder_copy_copy_ne_zero;
                                                    decr ___remainder_copy_copy_ne_zero_holder;
                                                end;
                                            #< done ___remainder_copy_copy_ne_zero_copy += __remainder_copy_copy_ne_zero;
                                        #< done ___remainder_copy_copy_ne_zero_copy = __remainder_copy_copy_ne_zero;
                                        
                                        clear _not___remainder_copy_copy_ne_zero;
                                        incr _not___remainder_copy_copy_ne_zero;
                                        
                                        while ___remainder_copy_copy_ne_zero_copy not 0 do;
                                            clear _not___remainder_copy_copy_ne_zero;
                                            clear ___remainder_copy_copy_ne_zero_copy;
                                        end;
                                    #< done _not___remainder_copy_copy_ne_zero = not __remainder_copy_copy_ne_zero;
                                    #> _inner_or = _not____TWO_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
                                        #> __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                            clear __not____TWO_copy_copy_ne_zero_copy;
                                            #> __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                                clear __not____TWO_copy_copy_ne_zero_holder;
                                                
                                                while _not____TWO_copy_copy_ne_zero not 0 do;
                                                    incr __not____TWO_copy_copy_ne_zero_copy;
                                                    incr __not____TWO_copy_copy_ne_zero_holder;
                                                    decr _not____TWO_copy_copy_ne_zero;
                                                end;
                                                
                                                while __not____TWO_copy_copy_ne_zero_holder not 0 do;
                                                    incr _not____TWO_copy_copy_ne_zero;
                                                    decr __not____TWO_copy_copy_ne_zero_holder;
                                                end;
                                            #< done __not____TWO_copy_copy_ne_zero_copy += _not____TWO_copy_copy_ne_zero;
                                        #< done __not____TWO_copy_copy_ne_zero_copy = _not____TWO_copy_copy_ne_zero;
                                        #> __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                            clear __not___remainder_copy_copy_ne_zero_copy;
                                            #> __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                                clear __not___remainder_copy_copy_ne_zero_holder;
                                                
                                                while _not___remainder_copy_copy_ne_zero not 0 do;
                                                    incr __not___remainder_copy_copy_ne_zero_copy;
                                                    incr __not___remainder_copy_copy_ne_zero_holder;
                                                    decr _not___remainder_copy_copy_ne_zero;
                                                end;
                                                
                                                while __not___remainder_copy_copy_ne_zero_holder not 0 do;
                                                    incr _not___remainder_copy_copy_ne_zero;
                                                    decr __not___remainder_copy_copy_ne_zero_holder;
                                                end;
                                            #< done __not___remainder_copy_copy_ne_zero_copy += _not___remainder_copy_copy_ne_zero;
                                        #< done __not___remainder_copy_copy_ne_zero_copy = _not___remainder_copy_copy_ne_zero;
                                        clear _inner_or;
                                        
                                        while __not____TWO_copy_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not____TWO_copy_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___remainder_copy_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not____TWO_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
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
                                #< done _neither_are_zero = ___TWO_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                            end;
                            
                            
                            clear _difference;
                            
                            while ___TWO_copy_copy_ne_zero not 0 do;
                                # ___TWO_copy_copy_ne_zero is True, so __TWO_copy must be the larger
                                #> _difference = ___TWO_copy_copy;
                                    clear _difference;
                                    #> _difference += ___TWO_copy_copy;
                                        clear ____TWO_copy_copy_holder;
                                        
                                        while ___TWO_copy_copy not 0 do;
                                            incr _difference;
                                            incr ____TWO_copy_copy_holder;
                                            decr ___TWO_copy_copy;
                                        end;
                                        
                                        while ____TWO_copy_copy_holder not 0 do;
                                            incr ___TWO_copy_copy;
                                            decr ____TWO_copy_copy_holder;
                                        end;
                                    #< done _difference += ___TWO_copy_copy;
                                #< done _difference = ___TWO_copy_copy;
                                clear ___TWO_copy_copy_ne_zero;
                            end;
                            
                            while __remainder_copy_copy_ne_zero not 0 do;
                                # __remainder_copy_copy_ne_zero is True, so _remainder_copy must be the larger
                                #> _difference = __remainder_copy_copy;
                                    clear _difference;
                                    #> _difference += __remainder_copy_copy;
                                        clear ___remainder_copy_copy_holder;
                                        
                                        while __remainder_copy_copy not 0 do;
                                            incr _difference;
                                            incr ___remainder_copy_copy_holder;
                                            decr __remainder_copy_copy;
                                        end;
                                        
                                        while ___remainder_copy_copy_holder not 0 do;
                                            incr __remainder_copy_copy;
                                            decr ___remainder_copy_copy_holder;
                                        end;
                                    #< done _difference += __remainder_copy_copy;
                                #< done _difference = __remainder_copy_copy;
                                clear __remainder_copy_copy_ne_zero;
                            end;
                        #< done _difference = abs(_remainder_copy - __TWO_copy);
                        #> _remainder_plus_difference = _remainder_copy + _difference;
                            #> __remainder_copy_copy = _remainder_copy;
                                clear __remainder_copy_copy;
                                #> __remainder_copy_copy += _remainder_copy;
                                    clear __remainder_copy_holder;
                                    
                                    while _remainder_copy not 0 do;
                                        incr __remainder_copy_copy;
                                        incr __remainder_copy_holder;
                                        decr _remainder_copy;
                                    end;
                                    
                                    while __remainder_copy_holder not 0 do;
                                        incr _remainder_copy;
                                        decr __remainder_copy_holder;
                                    end;
                                #< done __remainder_copy_copy += _remainder_copy;
                            #< done __remainder_copy_copy = _remainder_copy;
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
                            clear _remainder_plus_difference;
                            #> _remainder_plus_difference += __remainder_copy_copy;
                                clear ___remainder_copy_copy_holder;
                                
                                while __remainder_copy_copy not 0 do;
                                    incr _remainder_plus_difference;
                                    incr ___remainder_copy_copy_holder;
                                    decr __remainder_copy_copy;
                                end;
                                
                                while ___remainder_copy_copy_holder not 0 do;
                                    incr __remainder_copy_copy;
                                    decr ___remainder_copy_copy_holder;
                                end;
                            #< done _remainder_plus_difference += __remainder_copy_copy;
                            #> _remainder_plus_difference += __difference_copy;
                                clear ___difference_copy_holder;
                                
                                while __difference_copy not 0 do;
                                    incr _remainder_plus_difference;
                                    incr ___difference_copy_holder;
                                    decr __difference_copy;
                                end;
                                
                                while ___difference_copy_holder not 0 do;
                                    incr __difference_copy;
                                    decr ___difference_copy_holder;
                                end;
                            #< done _remainder_plus_difference += __difference_copy;
                        #< done _remainder_plus_difference = _remainder_copy + _difference;
                        #> _remainder_plus_difference_eq__TWO = _remainder_plus_difference == _TWO;
                            #> _difference = abs(_remainder_plus_difference - _TWO);
                                #> __remainder_plus_difference_copy = _remainder_plus_difference;
                                    clear __remainder_plus_difference_copy;
                                    #> __remainder_plus_difference_copy += _remainder_plus_difference;
                                        clear __remainder_plus_difference_holder;
                                        
                                        while _remainder_plus_difference not 0 do;
                                            incr __remainder_plus_difference_copy;
                                            incr __remainder_plus_difference_holder;
                                            decr _remainder_plus_difference;
                                        end;
                                        
                                        while __remainder_plus_difference_holder not 0 do;
                                            incr _remainder_plus_difference;
                                            decr __remainder_plus_difference_holder;
                                        end;
                                    #< done __remainder_plus_difference_copy += _remainder_plus_difference;
                                #< done __remainder_plus_difference_copy = _remainder_plus_difference;
                                #> __TWO_copy = _TWO;
                                    clear __TWO_copy;
                                    #> __TWO_copy += _TWO;
                                        clear __TWO_holder;
                                        
                                        while _TWO not 0 do;
                                            incr __TWO_copy;
                                            incr __TWO_holder;
                                            decr _TWO;
                                        end;
                                        
                                        while __TWO_holder not 0 do;
                                            incr _TWO;
                                            decr __TWO_holder;
                                        end;
                                    #< done __TWO_copy += _TWO;
                                #< done __TWO_copy = _TWO;
                                
                                #> __remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy != 0;
                                    #> _not___remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy == 0;
                                        #> ___remainder_plus_difference_copy_copy = __remainder_plus_difference_copy;
                                            clear ___remainder_plus_difference_copy_copy;
                                            #> ___remainder_plus_difference_copy_copy += __remainder_plus_difference_copy;
                                                clear ___remainder_plus_difference_copy_holder;
                                                
                                                while __remainder_plus_difference_copy not 0 do;
                                                    incr ___remainder_plus_difference_copy_copy;
                                                    incr ___remainder_plus_difference_copy_holder;
                                                    decr __remainder_plus_difference_copy;
                                                end;
                                                
                                                while ___remainder_plus_difference_copy_holder not 0 do;
                                                    incr __remainder_plus_difference_copy;
                                                    decr ___remainder_plus_difference_copy_holder;
                                                end;
                                            #< done ___remainder_plus_difference_copy_copy += __remainder_plus_difference_copy;
                                        #< done ___remainder_plus_difference_copy_copy = __remainder_plus_difference_copy;
                                        
                                        clear _not___remainder_plus_difference_copy_ne_zero;
                                        incr _not___remainder_plus_difference_copy_ne_zero;
                                        while ___remainder_plus_difference_copy_copy not 0 do;
                                            clear _not___remainder_plus_difference_copy_ne_zero;
                                            clear ___remainder_plus_difference_copy_copy;
                                        end;
                                    #< done _not___remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy == 0;
                                    #> __remainder_plus_difference_copy_ne_zero = not _not___remainder_plus_difference_copy_ne_zero;
                                        #> __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                            clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                            #> __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                                clear __not___remainder_plus_difference_copy_ne_zero_holder;
                                                
                                                while _not___remainder_plus_difference_copy_ne_zero not 0 do;
                                                    incr __not___remainder_plus_difference_copy_ne_zero_copy;
                                                    incr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                    decr _not___remainder_plus_difference_copy_ne_zero;
                                                end;
                                                
                                                while __not___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                    incr _not___remainder_plus_difference_copy_ne_zero;
                                                    decr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                end;
                                            #< done __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                        #< done __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                        
                                        clear __remainder_plus_difference_copy_ne_zero;
                                        incr __remainder_plus_difference_copy_ne_zero;
                                        
                                        while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear __remainder_plus_difference_copy_ne_zero;
                                            clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done __remainder_plus_difference_copy_ne_zero = not _not___remainder_plus_difference_copy_ne_zero;
                                #< done __remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy != 0;
                                #> __TWO_copy_ne_zero = __TWO_copy != 0;
                                    #> _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                        #> ___TWO_copy_copy = __TWO_copy;
                                            clear ___TWO_copy_copy;
                                            #> ___TWO_copy_copy += __TWO_copy;
                                                clear ___TWO_copy_holder;
                                                
                                                while __TWO_copy not 0 do;
                                                    incr ___TWO_copy_copy;
                                                    incr ___TWO_copy_holder;
                                                    decr __TWO_copy;
                                                end;
                                                
                                                while ___TWO_copy_holder not 0 do;
                                                    incr __TWO_copy;
                                                    decr ___TWO_copy_holder;
                                                end;
                                            #< done ___TWO_copy_copy += __TWO_copy;
                                        #< done ___TWO_copy_copy = __TWO_copy;
                                        
                                        clear _not___TWO_copy_ne_zero;
                                        incr _not___TWO_copy_ne_zero;
                                        while ___TWO_copy_copy not 0 do;
                                            clear _not___TWO_copy_ne_zero;
                                            clear ___TWO_copy_copy;
                                        end;
                                    #< done _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                    #> __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                        #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_copy;
                                            #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                                clear __not___TWO_copy_ne_zero_holder;
                                                
                                                while _not___TWO_copy_ne_zero not 0 do;
                                                    incr __not___TWO_copy_ne_zero_copy;
                                                    incr __not___TWO_copy_ne_zero_holder;
                                                    decr _not___TWO_copy_ne_zero;
                                                end;
                                                
                                                while __not___TWO_copy_ne_zero_holder not 0 do;
                                                    incr _not___TWO_copy_ne_zero;
                                                    decr __not___TWO_copy_ne_zero_holder;
                                                end;
                                            #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                        #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        
                                        clear __TWO_copy_ne_zero;
                                        incr __TWO_copy_ne_zero;
                                        
                                        while __not___TWO_copy_ne_zero_copy not 0 do;
                                            clear __TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_copy;
                                        end;
                                    #< done __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                #< done __TWO_copy_ne_zero = __TWO_copy != 0;
                                #> _neither_are_zero = __TWO_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                        #> ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                            clear ___TWO_copy_ne_zero_copy;
                                            #> ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                                clear ___TWO_copy_ne_zero_holder;
                                                
                                                while __TWO_copy_ne_zero not 0 do;
                                                    incr ___TWO_copy_ne_zero_copy;
                                                    incr ___TWO_copy_ne_zero_holder;
                                                    decr __TWO_copy_ne_zero;
                                                end;
                                                
                                                while ___TWO_copy_ne_zero_holder not 0 do;
                                                    incr __TWO_copy_ne_zero;
                                                    decr ___TWO_copy_ne_zero_holder;
                                                end;
                                            #< done ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                        #< done ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                        
                                        clear _not___TWO_copy_ne_zero;
                                        incr _not___TWO_copy_ne_zero;
                                        
                                        while ___TWO_copy_ne_zero_copy not 0 do;
                                            clear _not___TWO_copy_ne_zero;
                                            clear ___TWO_copy_ne_zero_copy;
                                        end;
                                    #< done _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                    #> _not___remainder_plus_difference_copy_ne_zero = not __remainder_plus_difference_copy_ne_zero;
                                        #> ___remainder_plus_difference_copy_ne_zero_copy = __remainder_plus_difference_copy_ne_zero;
                                            clear ___remainder_plus_difference_copy_ne_zero_copy;
                                            #> ___remainder_plus_difference_copy_ne_zero_copy += __remainder_plus_difference_copy_ne_zero;
                                                clear ___remainder_plus_difference_copy_ne_zero_holder;
                                                
                                                while __remainder_plus_difference_copy_ne_zero not 0 do;
                                                    incr ___remainder_plus_difference_copy_ne_zero_copy;
                                                    incr ___remainder_plus_difference_copy_ne_zero_holder;
                                                    decr __remainder_plus_difference_copy_ne_zero;
                                                end;
                                                
                                                while ___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                    incr __remainder_plus_difference_copy_ne_zero;
                                                    decr ___remainder_plus_difference_copy_ne_zero_holder;
                                                end;
                                            #< done ___remainder_plus_difference_copy_ne_zero_copy += __remainder_plus_difference_copy_ne_zero;
                                        #< done ___remainder_plus_difference_copy_ne_zero_copy = __remainder_plus_difference_copy_ne_zero;
                                        
                                        clear _not___remainder_plus_difference_copy_ne_zero;
                                        incr _not___remainder_plus_difference_copy_ne_zero;
                                        
                                        while ___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear _not___remainder_plus_difference_copy_ne_zero;
                                            clear ___remainder_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done _not___remainder_plus_difference_copy_ne_zero = not __remainder_plus_difference_copy_ne_zero;
                                    #> _inner_or = _not___TWO_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
                                        #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_copy;
                                            #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                                clear __not___TWO_copy_ne_zero_holder;
                                                
                                                while _not___TWO_copy_ne_zero not 0 do;
                                                    incr __not___TWO_copy_ne_zero_copy;
                                                    incr __not___TWO_copy_ne_zero_holder;
                                                    decr _not___TWO_copy_ne_zero;
                                                end;
                                                
                                                while __not___TWO_copy_ne_zero_holder not 0 do;
                                                    incr _not___TWO_copy_ne_zero;
                                                    decr __not___TWO_copy_ne_zero_holder;
                                                end;
                                            #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                        #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        #> __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                            clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                            #> __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                                clear __not___remainder_plus_difference_copy_ne_zero_holder;
                                                
                                                while _not___remainder_plus_difference_copy_ne_zero not 0 do;
                                                    incr __not___remainder_plus_difference_copy_ne_zero_copy;
                                                    incr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                    decr _not___remainder_plus_difference_copy_ne_zero;
                                                end;
                                                
                                                while __not___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                    incr _not___remainder_plus_difference_copy_ne_zero;
                                                    decr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                end;
                                            #< done __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                        #< done __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                        clear _inner_or;
                                        
                                        while __not___TWO_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___TWO_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not___TWO_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
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
                                #< done _neither_are_zero = __TWO_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                while _neither_are_zero not 0 do;
                                    decr __remainder_plus_difference_copy;
                                    decr __TWO_copy;
                                    
                                    #> __remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy != 0;
                                        #> _not___remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy == 0;
                                            #> ___remainder_plus_difference_copy_copy = __remainder_plus_difference_copy;
                                                clear ___remainder_plus_difference_copy_copy;
                                                #> ___remainder_plus_difference_copy_copy += __remainder_plus_difference_copy;
                                                    clear ___remainder_plus_difference_copy_holder;
                                                    
                                                    while __remainder_plus_difference_copy not 0 do;
                                                        incr ___remainder_plus_difference_copy_copy;
                                                        incr ___remainder_plus_difference_copy_holder;
                                                        decr __remainder_plus_difference_copy;
                                                    end;
                                                    
                                                    while ___remainder_plus_difference_copy_holder not 0 do;
                                                        incr __remainder_plus_difference_copy;
                                                        decr ___remainder_plus_difference_copy_holder;
                                                    end;
                                                #< done ___remainder_plus_difference_copy_copy += __remainder_plus_difference_copy;
                                            #< done ___remainder_plus_difference_copy_copy = __remainder_plus_difference_copy;
                                            
                                            clear _not___remainder_plus_difference_copy_ne_zero;
                                            incr _not___remainder_plus_difference_copy_ne_zero;
                                            while ___remainder_plus_difference_copy_copy not 0 do;
                                                clear _not___remainder_plus_difference_copy_ne_zero;
                                                clear ___remainder_plus_difference_copy_copy;
                                            end;
                                        #< done _not___remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy == 0;
                                        #> __remainder_plus_difference_copy_ne_zero = not _not___remainder_plus_difference_copy_ne_zero;
                                            #> __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                                clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                                #> __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                                    clear __not___remainder_plus_difference_copy_ne_zero_holder;
                                                    
                                                    while _not___remainder_plus_difference_copy_ne_zero not 0 do;
                                                        incr __not___remainder_plus_difference_copy_ne_zero_copy;
                                                        incr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                        decr _not___remainder_plus_difference_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                        incr _not___remainder_plus_difference_copy_ne_zero;
                                                        decr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                    end;
                                                #< done __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                            #< done __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                            
                                            clear __remainder_plus_difference_copy_ne_zero;
                                            incr __remainder_plus_difference_copy_ne_zero;
                                            
                                            while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                                clear __remainder_plus_difference_copy_ne_zero;
                                                clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                            end;
                                        #< done __remainder_plus_difference_copy_ne_zero = not _not___remainder_plus_difference_copy_ne_zero;
                                    #< done __remainder_plus_difference_copy_ne_zero = __remainder_plus_difference_copy != 0;
                                    #> __TWO_copy_ne_zero = __TWO_copy != 0;
                                        #> _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                            #> ___TWO_copy_copy = __TWO_copy;
                                                clear ___TWO_copy_copy;
                                                #> ___TWO_copy_copy += __TWO_copy;
                                                    clear ___TWO_copy_holder;
                                                    
                                                    while __TWO_copy not 0 do;
                                                        incr ___TWO_copy_copy;
                                                        incr ___TWO_copy_holder;
                                                        decr __TWO_copy;
                                                    end;
                                                    
                                                    while ___TWO_copy_holder not 0 do;
                                                        incr __TWO_copy;
                                                        decr ___TWO_copy_holder;
                                                    end;
                                                #< done ___TWO_copy_copy += __TWO_copy;
                                            #< done ___TWO_copy_copy = __TWO_copy;
                                            
                                            clear _not___TWO_copy_ne_zero;
                                            incr _not___TWO_copy_ne_zero;
                                            while ___TWO_copy_copy not 0 do;
                                                clear _not___TWO_copy_ne_zero;
                                                clear ___TWO_copy_copy;
                                            end;
                                        #< done _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                        #> __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                            #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                                clear __not___TWO_copy_ne_zero_copy;
                                                #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                                    clear __not___TWO_copy_ne_zero_holder;
                                                    
                                                    while _not___TWO_copy_ne_zero not 0 do;
                                                        incr __not___TWO_copy_ne_zero_copy;
                                                        incr __not___TWO_copy_ne_zero_holder;
                                                        decr _not___TWO_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not___TWO_copy_ne_zero_holder not 0 do;
                                                        incr _not___TWO_copy_ne_zero;
                                                        decr __not___TWO_copy_ne_zero_holder;
                                                    end;
                                                #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                            #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                            
                                            clear __TWO_copy_ne_zero;
                                            incr __TWO_copy_ne_zero;
                                            
                                            while __not___TWO_copy_ne_zero_copy not 0 do;
                                                clear __TWO_copy_ne_zero;
                                                clear __not___TWO_copy_ne_zero_copy;
                                            end;
                                        #< done __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                    #< done __TWO_copy_ne_zero = __TWO_copy != 0;
                                    #> _neither_are_zero = __TWO_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                        # DeMorgan's:
                                        #  (X and Y) = not ((not X) or (not Y))
                                        #> _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                            #> ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                                clear ___TWO_copy_ne_zero_copy;
                                                #> ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                                    clear ___TWO_copy_ne_zero_holder;
                                                    
                                                    while __TWO_copy_ne_zero not 0 do;
                                                        incr ___TWO_copy_ne_zero_copy;
                                                        incr ___TWO_copy_ne_zero_holder;
                                                        decr __TWO_copy_ne_zero;
                                                    end;
                                                    
                                                    while ___TWO_copy_ne_zero_holder not 0 do;
                                                        incr __TWO_copy_ne_zero;
                                                        decr ___TWO_copy_ne_zero_holder;
                                                    end;
                                                #< done ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                            #< done ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                            
                                            clear _not___TWO_copy_ne_zero;
                                            incr _not___TWO_copy_ne_zero;
                                            
                                            while ___TWO_copy_ne_zero_copy not 0 do;
                                                clear _not___TWO_copy_ne_zero;
                                                clear ___TWO_copy_ne_zero_copy;
                                            end;
                                        #< done _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                        #> _not___remainder_plus_difference_copy_ne_zero = not __remainder_plus_difference_copy_ne_zero;
                                            #> ___remainder_plus_difference_copy_ne_zero_copy = __remainder_plus_difference_copy_ne_zero;
                                                clear ___remainder_plus_difference_copy_ne_zero_copy;
                                                #> ___remainder_plus_difference_copy_ne_zero_copy += __remainder_plus_difference_copy_ne_zero;
                                                    clear ___remainder_plus_difference_copy_ne_zero_holder;
                                                    
                                                    while __remainder_plus_difference_copy_ne_zero not 0 do;
                                                        incr ___remainder_plus_difference_copy_ne_zero_copy;
                                                        incr ___remainder_plus_difference_copy_ne_zero_holder;
                                                        decr __remainder_plus_difference_copy_ne_zero;
                                                    end;
                                                    
                                                    while ___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                        incr __remainder_plus_difference_copy_ne_zero;
                                                        decr ___remainder_plus_difference_copy_ne_zero_holder;
                                                    end;
                                                #< done ___remainder_plus_difference_copy_ne_zero_copy += __remainder_plus_difference_copy_ne_zero;
                                            #< done ___remainder_plus_difference_copy_ne_zero_copy = __remainder_plus_difference_copy_ne_zero;
                                            
                                            clear _not___remainder_plus_difference_copy_ne_zero;
                                            incr _not___remainder_plus_difference_copy_ne_zero;
                                            
                                            while ___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                                clear _not___remainder_plus_difference_copy_ne_zero;
                                                clear ___remainder_plus_difference_copy_ne_zero_copy;
                                            end;
                                        #< done _not___remainder_plus_difference_copy_ne_zero = not __remainder_plus_difference_copy_ne_zero;
                                        #> _inner_or = _not___TWO_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
                                            #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                                clear __not___TWO_copy_ne_zero_copy;
                                                #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                                    clear __not___TWO_copy_ne_zero_holder;
                                                    
                                                    while _not___TWO_copy_ne_zero not 0 do;
                                                        incr __not___TWO_copy_ne_zero_copy;
                                                        incr __not___TWO_copy_ne_zero_holder;
                                                        decr _not___TWO_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not___TWO_copy_ne_zero_holder not 0 do;
                                                        incr _not___TWO_copy_ne_zero;
                                                        decr __not___TWO_copy_ne_zero_holder;
                                                    end;
                                                #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                            #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                            #> __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                                clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                                #> __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                                    clear __not___remainder_plus_difference_copy_ne_zero_holder;
                                                    
                                                    while _not___remainder_plus_difference_copy_ne_zero not 0 do;
                                                        incr __not___remainder_plus_difference_copy_ne_zero_copy;
                                                        incr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                        decr _not___remainder_plus_difference_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not___remainder_plus_difference_copy_ne_zero_holder not 0 do;
                                                        incr _not___remainder_plus_difference_copy_ne_zero;
                                                        decr __not___remainder_plus_difference_copy_ne_zero_holder;
                                                    end;
                                                #< done __not___remainder_plus_difference_copy_ne_zero_copy += _not___remainder_plus_difference_copy_ne_zero;
                                            #< done __not___remainder_plus_difference_copy_ne_zero_copy = _not___remainder_plus_difference_copy_ne_zero;
                                            clear _inner_or;
                                            
                                            while __not___TWO_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not___TWO_copy_ne_zero_copy;
                                            end;
                                            
                                            while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                            end;
                                        #< done _inner_or = _not___TWO_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
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
                                    #< done _neither_are_zero = __TWO_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                end;
                                
                                
                                clear _difference;
                                
                                while __TWO_copy_ne_zero not 0 do;
                                    # __TWO_copy_ne_zero is True, so _TWO must be the larger
                                    #> _difference = __TWO_copy;
                                        clear _difference;
                                        #> _difference += __TWO_copy;
                                            clear ___TWO_copy_holder;
                                            
                                            while __TWO_copy not 0 do;
                                                incr _difference;
                                                incr ___TWO_copy_holder;
                                                decr __TWO_copy;
                                            end;
                                            
                                            while ___TWO_copy_holder not 0 do;
                                                incr __TWO_copy;
                                                decr ___TWO_copy_holder;
                                            end;
                                        #< done _difference += __TWO_copy;
                                    #< done _difference = __TWO_copy;
                                    clear __TWO_copy_ne_zero;
                                end;
                                
                                while __remainder_plus_difference_copy_ne_zero not 0 do;
                                    # __remainder_plus_difference_copy_ne_zero is True, so _remainder_plus_difference must be the larger
                                    #> _difference = __remainder_plus_difference_copy;
                                        clear _difference;
                                        #> _difference += __remainder_plus_difference_copy;
                                            clear ___remainder_plus_difference_copy_holder;
                                            
                                            while __remainder_plus_difference_copy not 0 do;
                                                incr _difference;
                                                incr ___remainder_plus_difference_copy_holder;
                                                decr __remainder_plus_difference_copy;
                                            end;
                                            
                                            while ___remainder_plus_difference_copy_holder not 0 do;
                                                incr __remainder_plus_difference_copy;
                                                decr ___remainder_plus_difference_copy_holder;
                                            end;
                                        #< done _difference += __remainder_plus_difference_copy;
                                    #< done _difference = __remainder_plus_difference_copy;
                                    clear __remainder_plus_difference_copy_ne_zero;
                                end;
                            #< done _difference = abs(_remainder_plus_difference - _TWO);
                            clear _remainder_plus_difference_eq__TWO;
                            incr _remainder_plus_difference_eq__TWO;
                            while _difference not 0 do;
                                clear _remainder_plus_difference_eq__TWO;
                                clear _difference;
                            end;
                            
                            # If _remainder_plus_difference == _TWO, _remainder_plus_difference_eq__TWO = 1. Otherwise, _remainder_plus_difference_eq__TWO = 0
                        #< done _remainder_plus_difference_eq__TWO = _remainder_plus_difference == _TWO;
                        # If X + abs(X - Y) == Y, Y was bigger, so false
                        #> _remainder_gt__TWO = not _remainder_plus_difference_eq__TWO;
                            #> __remainder_plus_difference_eq__TWO_copy = _remainder_plus_difference_eq__TWO;
                                clear __remainder_plus_difference_eq__TWO_copy;
                                #> __remainder_plus_difference_eq__TWO_copy += _remainder_plus_difference_eq__TWO;
                                    clear __remainder_plus_difference_eq__TWO_holder;
                                    
                                    while _remainder_plus_difference_eq__TWO not 0 do;
                                        incr __remainder_plus_difference_eq__TWO_copy;
                                        incr __remainder_plus_difference_eq__TWO_holder;
                                        decr _remainder_plus_difference_eq__TWO;
                                    end;
                                    
                                    while __remainder_plus_difference_eq__TWO_holder not 0 do;
                                        incr _remainder_plus_difference_eq__TWO;
                                        decr __remainder_plus_difference_eq__TWO_holder;
                                    end;
                                #< done __remainder_plus_difference_eq__TWO_copy += _remainder_plus_difference_eq__TWO;
                            #< done __remainder_plus_difference_eq__TWO_copy = _remainder_plus_difference_eq__TWO;
                            
                            clear _remainder_gt__TWO;
                            incr _remainder_gt__TWO;
                            
                            while __remainder_plus_difference_eq__TWO_copy not 0 do;
                                clear _remainder_gt__TWO;
                                clear __remainder_plus_difference_eq__TWO_copy;
                            end;
                        #< done _remainder_gt__TWO = not _remainder_plus_difference_eq__TWO;
                    #< done _remainder_gt__TWO = remainder > _TWO;
                    #> _remainder_eq__TWO = remainder == _TWO;
                        #> _difference = abs(remainder - _TWO);
                            #> _remainder_copy = remainder;
                                clear _remainder_copy;
                                #> _remainder_copy += remainder;
                                    clear _remainder_holder;
                                    
                                    while remainder not 0 do;
                                        incr _remainder_copy;
                                        incr _remainder_holder;
                                        decr remainder;
                                    end;
                                    
                                    while _remainder_holder not 0 do;
                                        incr remainder;
                                        decr _remainder_holder;
                                    end;
                                #< done _remainder_copy += remainder;
                            #< done _remainder_copy = remainder;
                            #> __TWO_copy = _TWO;
                                clear __TWO_copy;
                                #> __TWO_copy += _TWO;
                                    clear __TWO_holder;
                                    
                                    while _TWO not 0 do;
                                        incr __TWO_copy;
                                        incr __TWO_holder;
                                        decr _TWO;
                                    end;
                                    
                                    while __TWO_holder not 0 do;
                                        incr _TWO;
                                        decr __TWO_holder;
                                    end;
                                #< done __TWO_copy += _TWO;
                            #< done __TWO_copy = _TWO;
                            
                            #> _remainder_copy_ne_zero = _remainder_copy != 0;
                                #> _not__remainder_copy_ne_zero = _remainder_copy == 0;
                                    #> __remainder_copy_copy = _remainder_copy;
                                        clear __remainder_copy_copy;
                                        #> __remainder_copy_copy += _remainder_copy;
                                            clear __remainder_copy_holder;
                                            
                                            while _remainder_copy not 0 do;
                                                incr __remainder_copy_copy;
                                                incr __remainder_copy_holder;
                                                decr _remainder_copy;
                                            end;
                                            
                                            while __remainder_copy_holder not 0 do;
                                                incr _remainder_copy;
                                                decr __remainder_copy_holder;
                                            end;
                                        #< done __remainder_copy_copy += _remainder_copy;
                                    #< done __remainder_copy_copy = _remainder_copy;
                                    
                                    clear _not__remainder_copy_ne_zero;
                                    incr _not__remainder_copy_ne_zero;
                                    while __remainder_copy_copy not 0 do;
                                        clear _not__remainder_copy_ne_zero;
                                        clear __remainder_copy_copy;
                                    end;
                                #< done _not__remainder_copy_ne_zero = _remainder_copy == 0;
                                #> _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                                    #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_copy;
                                        #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                            clear __not__remainder_copy_ne_zero_holder;
                                            
                                            while _not__remainder_copy_ne_zero not 0 do;
                                                incr __not__remainder_copy_ne_zero_copy;
                                                incr __not__remainder_copy_ne_zero_holder;
                                                decr _not__remainder_copy_ne_zero;
                                            end;
                                            
                                            while __not__remainder_copy_ne_zero_holder not 0 do;
                                                incr _not__remainder_copy_ne_zero;
                                                decr __not__remainder_copy_ne_zero_holder;
                                            end;
                                        #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                    #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                    
                                    clear _remainder_copy_ne_zero;
                                    incr _remainder_copy_ne_zero;
                                    
                                    while __not__remainder_copy_ne_zero_copy not 0 do;
                                        clear _remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_copy;
                                    end;
                                #< done _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                            #< done _remainder_copy_ne_zero = _remainder_copy != 0;
                            #> __TWO_copy_ne_zero = __TWO_copy != 0;
                                #> _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                    #> ___TWO_copy_copy = __TWO_copy;
                                        clear ___TWO_copy_copy;
                                        #> ___TWO_copy_copy += __TWO_copy;
                                            clear ___TWO_copy_holder;
                                            
                                            while __TWO_copy not 0 do;
                                                incr ___TWO_copy_copy;
                                                incr ___TWO_copy_holder;
                                                decr __TWO_copy;
                                            end;
                                            
                                            while ___TWO_copy_holder not 0 do;
                                                incr __TWO_copy;
                                                decr ___TWO_copy_holder;
                                            end;
                                        #< done ___TWO_copy_copy += __TWO_copy;
                                    #< done ___TWO_copy_copy = __TWO_copy;
                                    
                                    clear _not___TWO_copy_ne_zero;
                                    incr _not___TWO_copy_ne_zero;
                                    while ___TWO_copy_copy not 0 do;
                                        clear _not___TWO_copy_ne_zero;
                                        clear ___TWO_copy_copy;
                                    end;
                                #< done _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                #> __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                    #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_copy;
                                        #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_holder;
                                            
                                            while _not___TWO_copy_ne_zero not 0 do;
                                                incr __not___TWO_copy_ne_zero_copy;
                                                incr __not___TWO_copy_ne_zero_holder;
                                                decr _not___TWO_copy_ne_zero;
                                            end;
                                            
                                            while __not___TWO_copy_ne_zero_holder not 0 do;
                                                incr _not___TWO_copy_ne_zero;
                                                decr __not___TWO_copy_ne_zero_holder;
                                            end;
                                        #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                    #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                    
                                    clear __TWO_copy_ne_zero;
                                    incr __TWO_copy_ne_zero;
                                    
                                    while __not___TWO_copy_ne_zero_copy not 0 do;
                                        clear __TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_copy;
                                    end;
                                #< done __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                            #< done __TWO_copy_ne_zero = __TWO_copy != 0;
                            #> _neither_are_zero = __TWO_copy_ne_zero and _remainder_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                    #> ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                        clear ___TWO_copy_ne_zero_copy;
                                        #> ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                            clear ___TWO_copy_ne_zero_holder;
                                            
                                            while __TWO_copy_ne_zero not 0 do;
                                                incr ___TWO_copy_ne_zero_copy;
                                                incr ___TWO_copy_ne_zero_holder;
                                                decr __TWO_copy_ne_zero;
                                            end;
                                            
                                            while ___TWO_copy_ne_zero_holder not 0 do;
                                                incr __TWO_copy_ne_zero;
                                                decr ___TWO_copy_ne_zero_holder;
                                            end;
                                        #< done ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                    #< done ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                    
                                    clear _not___TWO_copy_ne_zero;
                                    incr _not___TWO_copy_ne_zero;
                                    
                                    while ___TWO_copy_ne_zero_copy not 0 do;
                                        clear _not___TWO_copy_ne_zero;
                                        clear ___TWO_copy_ne_zero_copy;
                                    end;
                                #< done _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                #> _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                                    #> __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                        clear __remainder_copy_ne_zero_copy;
                                        #> __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                            clear __remainder_copy_ne_zero_holder;
                                            
                                            while _remainder_copy_ne_zero not 0 do;
                                                incr __remainder_copy_ne_zero_copy;
                                                incr __remainder_copy_ne_zero_holder;
                                                decr _remainder_copy_ne_zero;
                                            end;
                                            
                                            while __remainder_copy_ne_zero_holder not 0 do;
                                                incr _remainder_copy_ne_zero;
                                                decr __remainder_copy_ne_zero_holder;
                                            end;
                                        #< done __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                    #< done __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                    
                                    clear _not__remainder_copy_ne_zero;
                                    incr _not__remainder_copy_ne_zero;
                                    
                                    while __remainder_copy_ne_zero_copy not 0 do;
                                        clear _not__remainder_copy_ne_zero;
                                        clear __remainder_copy_ne_zero_copy;
                                    end;
                                #< done _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                                #> _inner_or = _not___TWO_copy_ne_zero or _not__remainder_copy_ne_zero;
                                    #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        clear __not___TWO_copy_ne_zero_copy;
                                        #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_holder;
                                            
                                            while _not___TWO_copy_ne_zero not 0 do;
                                                incr __not___TWO_copy_ne_zero_copy;
                                                incr __not___TWO_copy_ne_zero_holder;
                                                decr _not___TWO_copy_ne_zero;
                                            end;
                                            
                                            while __not___TWO_copy_ne_zero_holder not 0 do;
                                                incr _not___TWO_copy_ne_zero;
                                                decr __not___TWO_copy_ne_zero_holder;
                                            end;
                                        #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                    #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                    #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_copy;
                                        #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                            clear __not__remainder_copy_ne_zero_holder;
                                            
                                            while _not__remainder_copy_ne_zero not 0 do;
                                                incr __not__remainder_copy_ne_zero_copy;
                                                incr __not__remainder_copy_ne_zero_holder;
                                                decr _not__remainder_copy_ne_zero;
                                            end;
                                            
                                            while __not__remainder_copy_ne_zero_holder not 0 do;
                                                incr _not__remainder_copy_ne_zero;
                                                decr __not__remainder_copy_ne_zero_holder;
                                            end;
                                        #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                    #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not___TWO_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___TWO_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not__remainder_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not__remainder_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not___TWO_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                            #< done _neither_are_zero = __TWO_copy_ne_zero and _remainder_copy_ne_zero;
                            while _neither_are_zero not 0 do;
                                decr _remainder_copy;
                                decr __TWO_copy;
                                
                                #> _remainder_copy_ne_zero = _remainder_copy != 0;
                                    #> _not__remainder_copy_ne_zero = _remainder_copy == 0;
                                        #> __remainder_copy_copy = _remainder_copy;
                                            clear __remainder_copy_copy;
                                            #> __remainder_copy_copy += _remainder_copy;
                                                clear __remainder_copy_holder;
                                                
                                                while _remainder_copy not 0 do;
                                                    incr __remainder_copy_copy;
                                                    incr __remainder_copy_holder;
                                                    decr _remainder_copy;
                                                end;
                                                
                                                while __remainder_copy_holder not 0 do;
                                                    incr _remainder_copy;
                                                    decr __remainder_copy_holder;
                                                end;
                                            #< done __remainder_copy_copy += _remainder_copy;
                                        #< done __remainder_copy_copy = _remainder_copy;
                                        
                                        clear _not__remainder_copy_ne_zero;
                                        incr _not__remainder_copy_ne_zero;
                                        while __remainder_copy_copy not 0 do;
                                            clear _not__remainder_copy_ne_zero;
                                            clear __remainder_copy_copy;
                                        end;
                                    #< done _not__remainder_copy_ne_zero = _remainder_copy == 0;
                                    #> _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                                        #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                            clear __not__remainder_copy_ne_zero_copy;
                                            #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                                clear __not__remainder_copy_ne_zero_holder;
                                                
                                                while _not__remainder_copy_ne_zero not 0 do;
                                                    incr __not__remainder_copy_ne_zero_copy;
                                                    incr __not__remainder_copy_ne_zero_holder;
                                                    decr _not__remainder_copy_ne_zero;
                                                end;
                                                
                                                while __not__remainder_copy_ne_zero_holder not 0 do;
                                                    incr _not__remainder_copy_ne_zero;
                                                    decr __not__remainder_copy_ne_zero_holder;
                                                end;
                                            #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                        #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                        
                                        clear _remainder_copy_ne_zero;
                                        incr _remainder_copy_ne_zero;
                                        
                                        while __not__remainder_copy_ne_zero_copy not 0 do;
                                            clear _remainder_copy_ne_zero;
                                            clear __not__remainder_copy_ne_zero_copy;
                                        end;
                                    #< done _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                                #< done _remainder_copy_ne_zero = _remainder_copy != 0;
                                #> __TWO_copy_ne_zero = __TWO_copy != 0;
                                    #> _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                        #> ___TWO_copy_copy = __TWO_copy;
                                            clear ___TWO_copy_copy;
                                            #> ___TWO_copy_copy += __TWO_copy;
                                                clear ___TWO_copy_holder;
                                                
                                                while __TWO_copy not 0 do;
                                                    incr ___TWO_copy_copy;
                                                    incr ___TWO_copy_holder;
                                                    decr __TWO_copy;
                                                end;
                                                
                                                while ___TWO_copy_holder not 0 do;
                                                    incr __TWO_copy;
                                                    decr ___TWO_copy_holder;
                                                end;
                                            #< done ___TWO_copy_copy += __TWO_copy;
                                        #< done ___TWO_copy_copy = __TWO_copy;
                                        
                                        clear _not___TWO_copy_ne_zero;
                                        incr _not___TWO_copy_ne_zero;
                                        while ___TWO_copy_copy not 0 do;
                                            clear _not___TWO_copy_ne_zero;
                                            clear ___TWO_copy_copy;
                                        end;
                                    #< done _not___TWO_copy_ne_zero = __TWO_copy == 0;
                                    #> __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                        #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_copy;
                                            #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                                clear __not___TWO_copy_ne_zero_holder;
                                                
                                                while _not___TWO_copy_ne_zero not 0 do;
                                                    incr __not___TWO_copy_ne_zero_copy;
                                                    incr __not___TWO_copy_ne_zero_holder;
                                                    decr _not___TWO_copy_ne_zero;
                                                end;
                                                
                                                while __not___TWO_copy_ne_zero_holder not 0 do;
                                                    incr _not___TWO_copy_ne_zero;
                                                    decr __not___TWO_copy_ne_zero_holder;
                                                end;
                                            #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                        #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        
                                        clear __TWO_copy_ne_zero;
                                        incr __TWO_copy_ne_zero;
                                        
                                        while __not___TWO_copy_ne_zero_copy not 0 do;
                                            clear __TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_copy;
                                        end;
                                    #< done __TWO_copy_ne_zero = not _not___TWO_copy_ne_zero;
                                #< done __TWO_copy_ne_zero = __TWO_copy != 0;
                                #> _neither_are_zero = __TWO_copy_ne_zero and _remainder_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                        #> ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                            clear ___TWO_copy_ne_zero_copy;
                                            #> ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                                clear ___TWO_copy_ne_zero_holder;
                                                
                                                while __TWO_copy_ne_zero not 0 do;
                                                    incr ___TWO_copy_ne_zero_copy;
                                                    incr ___TWO_copy_ne_zero_holder;
                                                    decr __TWO_copy_ne_zero;
                                                end;
                                                
                                                while ___TWO_copy_ne_zero_holder not 0 do;
                                                    incr __TWO_copy_ne_zero;
                                                    decr ___TWO_copy_ne_zero_holder;
                                                end;
                                            #< done ___TWO_copy_ne_zero_copy += __TWO_copy_ne_zero;
                                        #< done ___TWO_copy_ne_zero_copy = __TWO_copy_ne_zero;
                                        
                                        clear _not___TWO_copy_ne_zero;
                                        incr _not___TWO_copy_ne_zero;
                                        
                                        while ___TWO_copy_ne_zero_copy not 0 do;
                                            clear _not___TWO_copy_ne_zero;
                                            clear ___TWO_copy_ne_zero_copy;
                                        end;
                                    #< done _not___TWO_copy_ne_zero = not __TWO_copy_ne_zero;
                                    #> _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                                        #> __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                            clear __remainder_copy_ne_zero_copy;
                                            #> __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                                clear __remainder_copy_ne_zero_holder;
                                                
                                                while _remainder_copy_ne_zero not 0 do;
                                                    incr __remainder_copy_ne_zero_copy;
                                                    incr __remainder_copy_ne_zero_holder;
                                                    decr _remainder_copy_ne_zero;
                                                end;
                                                
                                                while __remainder_copy_ne_zero_holder not 0 do;
                                                    incr _remainder_copy_ne_zero;
                                                    decr __remainder_copy_ne_zero_holder;
                                                end;
                                            #< done __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                        #< done __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                        
                                        clear _not__remainder_copy_ne_zero;
                                        incr _not__remainder_copy_ne_zero;
                                        
                                        while __remainder_copy_ne_zero_copy not 0 do;
                                            clear _not__remainder_copy_ne_zero;
                                            clear __remainder_copy_ne_zero_copy;
                                        end;
                                    #< done _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                                    #> _inner_or = _not___TWO_copy_ne_zero or _not__remainder_copy_ne_zero;
                                        #> __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                            clear __not___TWO_copy_ne_zero_copy;
                                            #> __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                                clear __not___TWO_copy_ne_zero_holder;
                                                
                                                while _not___TWO_copy_ne_zero not 0 do;
                                                    incr __not___TWO_copy_ne_zero_copy;
                                                    incr __not___TWO_copy_ne_zero_holder;
                                                    decr _not___TWO_copy_ne_zero;
                                                end;
                                                
                                                while __not___TWO_copy_ne_zero_holder not 0 do;
                                                    incr _not___TWO_copy_ne_zero;
                                                    decr __not___TWO_copy_ne_zero_holder;
                                                end;
                                            #< done __not___TWO_copy_ne_zero_copy += _not___TWO_copy_ne_zero;
                                        #< done __not___TWO_copy_ne_zero_copy = _not___TWO_copy_ne_zero;
                                        #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                            clear __not__remainder_copy_ne_zero_copy;
                                            #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                                clear __not__remainder_copy_ne_zero_holder;
                                                
                                                while _not__remainder_copy_ne_zero not 0 do;
                                                    incr __not__remainder_copy_ne_zero_copy;
                                                    incr __not__remainder_copy_ne_zero_holder;
                                                    decr _not__remainder_copy_ne_zero;
                                                end;
                                                
                                                while __not__remainder_copy_ne_zero_holder not 0 do;
                                                    incr _not__remainder_copy_ne_zero;
                                                    decr __not__remainder_copy_ne_zero_holder;
                                                end;
                                            #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                        #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                        clear _inner_or;
                                        
                                        while __not___TWO_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___TWO_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not__remainder_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not__remainder_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not___TWO_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                                #< done _neither_are_zero = __TWO_copy_ne_zero and _remainder_copy_ne_zero;
                            end;
                            
                            
                            clear _difference;
                            
                            while __TWO_copy_ne_zero not 0 do;
                                # __TWO_copy_ne_zero is True, so _TWO must be the larger
                                #> _difference = __TWO_copy;
                                    clear _difference;
                                    #> _difference += __TWO_copy;
                                        clear ___TWO_copy_holder;
                                        
                                        while __TWO_copy not 0 do;
                                            incr _difference;
                                            incr ___TWO_copy_holder;
                                            decr __TWO_copy;
                                        end;
                                        
                                        while ___TWO_copy_holder not 0 do;
                                            incr __TWO_copy;
                                            decr ___TWO_copy_holder;
                                        end;
                                    #< done _difference += __TWO_copy;
                                #< done _difference = __TWO_copy;
                                clear __TWO_copy_ne_zero;
                            end;
                            
                            while _remainder_copy_ne_zero not 0 do;
                                # _remainder_copy_ne_zero is True, so remainder must be the larger
                                #> _difference = _remainder_copy;
                                    clear _difference;
                                    #> _difference += _remainder_copy;
                                        clear __remainder_copy_holder;
                                        
                                        while _remainder_copy not 0 do;
                                            incr _difference;
                                            incr __remainder_copy_holder;
                                            decr _remainder_copy;
                                        end;
                                        
                                        while __remainder_copy_holder not 0 do;
                                            incr _remainder_copy;
                                            decr __remainder_copy_holder;
                                        end;
                                    #< done _difference += _remainder_copy;
                                #< done _difference = _remainder_copy;
                                clear _remainder_copy_ne_zero;
                            end;
                        #< done _difference = abs(remainder - _TWO);
                        clear _remainder_eq__TWO;
                        incr _remainder_eq__TWO;
                        while _difference not 0 do;
                            clear _remainder_eq__TWO;
                            clear _difference;
                        end;
                        
                        # If remainder == _TWO, _remainder_eq__TWO = 1. Otherwise, _remainder_eq__TWO = 0
                    #< done _remainder_eq__TWO = remainder == _TWO;
                    #> _remainder_ge__TWO = _remainder_gt__TWO or _remainder_eq__TWO;
                        #> __remainder_gt__TWO_copy = _remainder_gt__TWO;
                            clear __remainder_gt__TWO_copy;
                            #> __remainder_gt__TWO_copy += _remainder_gt__TWO;
                                clear __remainder_gt__TWO_holder;
                                
                                while _remainder_gt__TWO not 0 do;
                                    incr __remainder_gt__TWO_copy;
                                    incr __remainder_gt__TWO_holder;
                                    decr _remainder_gt__TWO;
                                end;
                                
                                while __remainder_gt__TWO_holder not 0 do;
                                    incr _remainder_gt__TWO;
                                    decr __remainder_gt__TWO_holder;
                                end;
                            #< done __remainder_gt__TWO_copy += _remainder_gt__TWO;
                        #< done __remainder_gt__TWO_copy = _remainder_gt__TWO;
                        #> __remainder_eq__TWO_copy = _remainder_eq__TWO;
                            clear __remainder_eq__TWO_copy;
                            #> __remainder_eq__TWO_copy += _remainder_eq__TWO;
                                clear __remainder_eq__TWO_holder;
                                
                                while _remainder_eq__TWO not 0 do;
                                    incr __remainder_eq__TWO_copy;
                                    incr __remainder_eq__TWO_holder;
                                    decr _remainder_eq__TWO;
                                end;
                                
                                while __remainder_eq__TWO_holder not 0 do;
                                    incr _remainder_eq__TWO;
                                    decr __remainder_eq__TWO_holder;
                                end;
                            #< done __remainder_eq__TWO_copy += _remainder_eq__TWO;
                        #< done __remainder_eq__TWO_copy = _remainder_eq__TWO;
                        clear _remainder_ge__TWO;
                        
                        while __remainder_gt__TWO_copy not 0 do;
                            clear _remainder_ge__TWO;
                            incr _remainder_ge__TWO;
                            clear __remainder_gt__TWO_copy;
                        end;
                        
                        while __remainder_eq__TWO_copy not 0 do;
                            clear _remainder_ge__TWO;
                            incr _remainder_ge__TWO;
                            clear __remainder_eq__TWO_copy;
                        end;
                    #< done _remainder_ge__TWO = _remainder_gt__TWO or _remainder_eq__TWO;
                #< done _remainder_ge__TWO = remainder >= _TWO;
            end;
        #< done X_copy_over_two r remainder = X_copy / _TWO;
        #> X_copy_is_even = remainder == _ZERO;
            #> _difference = abs(remainder - _ZERO);
                #> _remainder_copy = remainder;
                    clear _remainder_copy;
                    #> _remainder_copy += remainder;
                        clear _remainder_holder;
                        
                        while remainder not 0 do;
                            incr _remainder_copy;
                            incr _remainder_holder;
                            decr remainder;
                        end;
                        
                        while _remainder_holder not 0 do;
                            incr remainder;
                            decr _remainder_holder;
                        end;
                    #< done _remainder_copy += remainder;
                #< done _remainder_copy = remainder;
                #> __ZERO_copy = _ZERO;
                    clear __ZERO_copy;
                    #> __ZERO_copy += _ZERO;
                        clear __ZERO_holder;
                        
                        while _ZERO not 0 do;
                            incr __ZERO_copy;
                            incr __ZERO_holder;
                            decr _ZERO;
                        end;
                        
                        while __ZERO_holder not 0 do;
                            incr _ZERO;
                            decr __ZERO_holder;
                        end;
                    #< done __ZERO_copy += _ZERO;
                #< done __ZERO_copy = _ZERO;
                
                #> _remainder_copy_ne_zero = _remainder_copy != 0;
                    #> _not__remainder_copy_ne_zero = _remainder_copy == 0;
                        #> __remainder_copy_copy = _remainder_copy;
                            clear __remainder_copy_copy;
                            #> __remainder_copy_copy += _remainder_copy;
                                clear __remainder_copy_holder;
                                
                                while _remainder_copy not 0 do;
                                    incr __remainder_copy_copy;
                                    incr __remainder_copy_holder;
                                    decr _remainder_copy;
                                end;
                                
                                while __remainder_copy_holder not 0 do;
                                    incr _remainder_copy;
                                    decr __remainder_copy_holder;
                                end;
                            #< done __remainder_copy_copy += _remainder_copy;
                        #< done __remainder_copy_copy = _remainder_copy;
                        
                        clear _not__remainder_copy_ne_zero;
                        incr _not__remainder_copy_ne_zero;
                        while __remainder_copy_copy not 0 do;
                            clear _not__remainder_copy_ne_zero;
                            clear __remainder_copy_copy;
                        end;
                    #< done _not__remainder_copy_ne_zero = _remainder_copy == 0;
                    #> _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                        #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                            clear __not__remainder_copy_ne_zero_copy;
                            #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                clear __not__remainder_copy_ne_zero_holder;
                                
                                while _not__remainder_copy_ne_zero not 0 do;
                                    incr __not__remainder_copy_ne_zero_copy;
                                    incr __not__remainder_copy_ne_zero_holder;
                                    decr _not__remainder_copy_ne_zero;
                                end;
                                
                                while __not__remainder_copy_ne_zero_holder not 0 do;
                                    incr _not__remainder_copy_ne_zero;
                                    decr __not__remainder_copy_ne_zero_holder;
                                end;
                            #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                        #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                        
                        clear _remainder_copy_ne_zero;
                        incr _remainder_copy_ne_zero;
                        
                        while __not__remainder_copy_ne_zero_copy not 0 do;
                            clear _remainder_copy_ne_zero;
                            clear __not__remainder_copy_ne_zero_copy;
                        end;
                    #< done _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                #< done _remainder_copy_ne_zero = _remainder_copy != 0;
                #> __ZERO_copy_ne_zero = __ZERO_copy != 0;
                    #> _not___ZERO_copy_ne_zero = __ZERO_copy == 0;
                        #> ___ZERO_copy_copy = __ZERO_copy;
                            clear ___ZERO_copy_copy;
                            #> ___ZERO_copy_copy += __ZERO_copy;
                                clear ___ZERO_copy_holder;
                                
                                while __ZERO_copy not 0 do;
                                    incr ___ZERO_copy_copy;
                                    incr ___ZERO_copy_holder;
                                    decr __ZERO_copy;
                                end;
                                
                                while ___ZERO_copy_holder not 0 do;
                                    incr __ZERO_copy;
                                    decr ___ZERO_copy_holder;
                                end;
                            #< done ___ZERO_copy_copy += __ZERO_copy;
                        #< done ___ZERO_copy_copy = __ZERO_copy;
                        
                        clear _not___ZERO_copy_ne_zero;
                        incr _not___ZERO_copy_ne_zero;
                        while ___ZERO_copy_copy not 0 do;
                            clear _not___ZERO_copy_ne_zero;
                            clear ___ZERO_copy_copy;
                        end;
                    #< done _not___ZERO_copy_ne_zero = __ZERO_copy == 0;
                    #> __ZERO_copy_ne_zero = not _not___ZERO_copy_ne_zero;
                        #> __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                            clear __not___ZERO_copy_ne_zero_copy;
                            #> __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                clear __not___ZERO_copy_ne_zero_holder;
                                
                                while _not___ZERO_copy_ne_zero not 0 do;
                                    incr __not___ZERO_copy_ne_zero_copy;
                                    incr __not___ZERO_copy_ne_zero_holder;
                                    decr _not___ZERO_copy_ne_zero;
                                end;
                                
                                while __not___ZERO_copy_ne_zero_holder not 0 do;
                                    incr _not___ZERO_copy_ne_zero;
                                    decr __not___ZERO_copy_ne_zero_holder;
                                end;
                            #< done __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                        #< done __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                        
                        clear __ZERO_copy_ne_zero;
                        incr __ZERO_copy_ne_zero;
                        
                        while __not___ZERO_copy_ne_zero_copy not 0 do;
                            clear __ZERO_copy_ne_zero;
                            clear __not___ZERO_copy_ne_zero_copy;
                        end;
                    #< done __ZERO_copy_ne_zero = not _not___ZERO_copy_ne_zero;
                #< done __ZERO_copy_ne_zero = __ZERO_copy != 0;
                #> _neither_are_zero = __ZERO_copy_ne_zero and _remainder_copy_ne_zero;
                    # DeMorgan's:
                    #  (X and Y) = not ((not X) or (not Y))
                    #> _not___ZERO_copy_ne_zero = not __ZERO_copy_ne_zero;
                        #> ___ZERO_copy_ne_zero_copy = __ZERO_copy_ne_zero;
                            clear ___ZERO_copy_ne_zero_copy;
                            #> ___ZERO_copy_ne_zero_copy += __ZERO_copy_ne_zero;
                                clear ___ZERO_copy_ne_zero_holder;
                                
                                while __ZERO_copy_ne_zero not 0 do;
                                    incr ___ZERO_copy_ne_zero_copy;
                                    incr ___ZERO_copy_ne_zero_holder;
                                    decr __ZERO_copy_ne_zero;
                                end;
                                
                                while ___ZERO_copy_ne_zero_holder not 0 do;
                                    incr __ZERO_copy_ne_zero;
                                    decr ___ZERO_copy_ne_zero_holder;
                                end;
                            #< done ___ZERO_copy_ne_zero_copy += __ZERO_copy_ne_zero;
                        #< done ___ZERO_copy_ne_zero_copy = __ZERO_copy_ne_zero;
                        
                        clear _not___ZERO_copy_ne_zero;
                        incr _not___ZERO_copy_ne_zero;
                        
                        while ___ZERO_copy_ne_zero_copy not 0 do;
                            clear _not___ZERO_copy_ne_zero;
                            clear ___ZERO_copy_ne_zero_copy;
                        end;
                    #< done _not___ZERO_copy_ne_zero = not __ZERO_copy_ne_zero;
                    #> _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                        #> __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                            clear __remainder_copy_ne_zero_copy;
                            #> __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                clear __remainder_copy_ne_zero_holder;
                                
                                while _remainder_copy_ne_zero not 0 do;
                                    incr __remainder_copy_ne_zero_copy;
                                    incr __remainder_copy_ne_zero_holder;
                                    decr _remainder_copy_ne_zero;
                                end;
                                
                                while __remainder_copy_ne_zero_holder not 0 do;
                                    incr _remainder_copy_ne_zero;
                                    decr __remainder_copy_ne_zero_holder;
                                end;
                            #< done __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                        #< done __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                        
                        clear _not__remainder_copy_ne_zero;
                        incr _not__remainder_copy_ne_zero;
                        
                        while __remainder_copy_ne_zero_copy not 0 do;
                            clear _not__remainder_copy_ne_zero;
                            clear __remainder_copy_ne_zero_copy;
                        end;
                    #< done _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                    #> _inner_or = _not___ZERO_copy_ne_zero or _not__remainder_copy_ne_zero;
                        #> __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                            clear __not___ZERO_copy_ne_zero_copy;
                            #> __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                clear __not___ZERO_copy_ne_zero_holder;
                                
                                while _not___ZERO_copy_ne_zero not 0 do;
                                    incr __not___ZERO_copy_ne_zero_copy;
                                    incr __not___ZERO_copy_ne_zero_holder;
                                    decr _not___ZERO_copy_ne_zero;
                                end;
                                
                                while __not___ZERO_copy_ne_zero_holder not 0 do;
                                    incr _not___ZERO_copy_ne_zero;
                                    decr __not___ZERO_copy_ne_zero_holder;
                                end;
                            #< done __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                        #< done __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                        #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                            clear __not__remainder_copy_ne_zero_copy;
                            #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                clear __not__remainder_copy_ne_zero_holder;
                                
                                while _not__remainder_copy_ne_zero not 0 do;
                                    incr __not__remainder_copy_ne_zero_copy;
                                    incr __not__remainder_copy_ne_zero_holder;
                                    decr _not__remainder_copy_ne_zero;
                                end;
                                
                                while __not__remainder_copy_ne_zero_holder not 0 do;
                                    incr _not__remainder_copy_ne_zero;
                                    decr __not__remainder_copy_ne_zero_holder;
                                end;
                            #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                        #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                        clear _inner_or;
                        
                        while __not___ZERO_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not___ZERO_copy_ne_zero_copy;
                        end;
                        
                        while __not__remainder_copy_ne_zero_copy not 0 do;
                            clear _inner_or;
                            incr _inner_or;
                            clear __not__remainder_copy_ne_zero_copy;
                        end;
                    #< done _inner_or = _not___ZERO_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                #< done _neither_are_zero = __ZERO_copy_ne_zero and _remainder_copy_ne_zero;
                while _neither_are_zero not 0 do;
                    decr _remainder_copy;
                    decr __ZERO_copy;
                    
                    #> _remainder_copy_ne_zero = _remainder_copy != 0;
                        #> _not__remainder_copy_ne_zero = _remainder_copy == 0;
                            #> __remainder_copy_copy = _remainder_copy;
                                clear __remainder_copy_copy;
                                #> __remainder_copy_copy += _remainder_copy;
                                    clear __remainder_copy_holder;
                                    
                                    while _remainder_copy not 0 do;
                                        incr __remainder_copy_copy;
                                        incr __remainder_copy_holder;
                                        decr _remainder_copy;
                                    end;
                                    
                                    while __remainder_copy_holder not 0 do;
                                        incr _remainder_copy;
                                        decr __remainder_copy_holder;
                                    end;
                                #< done __remainder_copy_copy += _remainder_copy;
                            #< done __remainder_copy_copy = _remainder_copy;
                            
                            clear _not__remainder_copy_ne_zero;
                            incr _not__remainder_copy_ne_zero;
                            while __remainder_copy_copy not 0 do;
                                clear _not__remainder_copy_ne_zero;
                                clear __remainder_copy_copy;
                            end;
                        #< done _not__remainder_copy_ne_zero = _remainder_copy == 0;
                        #> _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                            #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                clear __not__remainder_copy_ne_zero_copy;
                                #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_holder;
                                    
                                    while _not__remainder_copy_ne_zero not 0 do;
                                        incr __not__remainder_copy_ne_zero_copy;
                                        incr __not__remainder_copy_ne_zero_holder;
                                        decr _not__remainder_copy_ne_zero;
                                    end;
                                    
                                    while __not__remainder_copy_ne_zero_holder not 0 do;
                                        incr _not__remainder_copy_ne_zero;
                                        decr __not__remainder_copy_ne_zero_holder;
                                    end;
                                #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                            #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                            
                            clear _remainder_copy_ne_zero;
                            incr _remainder_copy_ne_zero;
                            
                            while __not__remainder_copy_ne_zero_copy not 0 do;
                                clear _remainder_copy_ne_zero;
                                clear __not__remainder_copy_ne_zero_copy;
                            end;
                        #< done _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                    #< done _remainder_copy_ne_zero = _remainder_copy != 0;
                    #> __ZERO_copy_ne_zero = __ZERO_copy != 0;
                        #> _not___ZERO_copy_ne_zero = __ZERO_copy == 0;
                            #> ___ZERO_copy_copy = __ZERO_copy;
                                clear ___ZERO_copy_copy;
                                #> ___ZERO_copy_copy += __ZERO_copy;
                                    clear ___ZERO_copy_holder;
                                    
                                    while __ZERO_copy not 0 do;
                                        incr ___ZERO_copy_copy;
                                        incr ___ZERO_copy_holder;
                                        decr __ZERO_copy;
                                    end;
                                    
                                    while ___ZERO_copy_holder not 0 do;
                                        incr __ZERO_copy;
                                        decr ___ZERO_copy_holder;
                                    end;
                                #< done ___ZERO_copy_copy += __ZERO_copy;
                            #< done ___ZERO_copy_copy = __ZERO_copy;
                            
                            clear _not___ZERO_copy_ne_zero;
                            incr _not___ZERO_copy_ne_zero;
                            while ___ZERO_copy_copy not 0 do;
                                clear _not___ZERO_copy_ne_zero;
                                clear ___ZERO_copy_copy;
                            end;
                        #< done _not___ZERO_copy_ne_zero = __ZERO_copy == 0;
                        #> __ZERO_copy_ne_zero = not _not___ZERO_copy_ne_zero;
                            #> __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                                clear __not___ZERO_copy_ne_zero_copy;
                                #> __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                    clear __not___ZERO_copy_ne_zero_holder;
                                    
                                    while _not___ZERO_copy_ne_zero not 0 do;
                                        incr __not___ZERO_copy_ne_zero_copy;
                                        incr __not___ZERO_copy_ne_zero_holder;
                                        decr _not___ZERO_copy_ne_zero;
                                    end;
                                    
                                    while __not___ZERO_copy_ne_zero_holder not 0 do;
                                        incr _not___ZERO_copy_ne_zero;
                                        decr __not___ZERO_copy_ne_zero_holder;
                                    end;
                                #< done __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                            #< done __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                            
                            clear __ZERO_copy_ne_zero;
                            incr __ZERO_copy_ne_zero;
                            
                            while __not___ZERO_copy_ne_zero_copy not 0 do;
                                clear __ZERO_copy_ne_zero;
                                clear __not___ZERO_copy_ne_zero_copy;
                            end;
                        #< done __ZERO_copy_ne_zero = not _not___ZERO_copy_ne_zero;
                    #< done __ZERO_copy_ne_zero = __ZERO_copy != 0;
                    #> _neither_are_zero = __ZERO_copy_ne_zero and _remainder_copy_ne_zero;
                        # DeMorgan's:
                        #  (X and Y) = not ((not X) or (not Y))
                        #> _not___ZERO_copy_ne_zero = not __ZERO_copy_ne_zero;
                            #> ___ZERO_copy_ne_zero_copy = __ZERO_copy_ne_zero;
                                clear ___ZERO_copy_ne_zero_copy;
                                #> ___ZERO_copy_ne_zero_copy += __ZERO_copy_ne_zero;
                                    clear ___ZERO_copy_ne_zero_holder;
                                    
                                    while __ZERO_copy_ne_zero not 0 do;
                                        incr ___ZERO_copy_ne_zero_copy;
                                        incr ___ZERO_copy_ne_zero_holder;
                                        decr __ZERO_copy_ne_zero;
                                    end;
                                    
                                    while ___ZERO_copy_ne_zero_holder not 0 do;
                                        incr __ZERO_copy_ne_zero;
                                        decr ___ZERO_copy_ne_zero_holder;
                                    end;
                                #< done ___ZERO_copy_ne_zero_copy += __ZERO_copy_ne_zero;
                            #< done ___ZERO_copy_ne_zero_copy = __ZERO_copy_ne_zero;
                            
                            clear _not___ZERO_copy_ne_zero;
                            incr _not___ZERO_copy_ne_zero;
                            
                            while ___ZERO_copy_ne_zero_copy not 0 do;
                                clear _not___ZERO_copy_ne_zero;
                                clear ___ZERO_copy_ne_zero_copy;
                            end;
                        #< done _not___ZERO_copy_ne_zero = not __ZERO_copy_ne_zero;
                        #> _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                            #> __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                clear __remainder_copy_ne_zero_copy;
                                #> __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                    clear __remainder_copy_ne_zero_holder;
                                    
                                    while _remainder_copy_ne_zero not 0 do;
                                        incr __remainder_copy_ne_zero_copy;
                                        incr __remainder_copy_ne_zero_holder;
                                        decr _remainder_copy_ne_zero;
                                    end;
                                    
                                    while __remainder_copy_ne_zero_holder not 0 do;
                                        incr _remainder_copy_ne_zero;
                                        decr __remainder_copy_ne_zero_holder;
                                    end;
                                #< done __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                            #< done __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                            
                            clear _not__remainder_copy_ne_zero;
                            incr _not__remainder_copy_ne_zero;
                            
                            while __remainder_copy_ne_zero_copy not 0 do;
                                clear _not__remainder_copy_ne_zero;
                                clear __remainder_copy_ne_zero_copy;
                            end;
                        #< done _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                        #> _inner_or = _not___ZERO_copy_ne_zero or _not__remainder_copy_ne_zero;
                            #> __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                                clear __not___ZERO_copy_ne_zero_copy;
                                #> __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                    clear __not___ZERO_copy_ne_zero_holder;
                                    
                                    while _not___ZERO_copy_ne_zero not 0 do;
                                        incr __not___ZERO_copy_ne_zero_copy;
                                        incr __not___ZERO_copy_ne_zero_holder;
                                        decr _not___ZERO_copy_ne_zero;
                                    end;
                                    
                                    while __not___ZERO_copy_ne_zero_holder not 0 do;
                                        incr _not___ZERO_copy_ne_zero;
                                        decr __not___ZERO_copy_ne_zero_holder;
                                    end;
                                #< done __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                            #< done __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                            #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                clear __not__remainder_copy_ne_zero_copy;
                                #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_holder;
                                    
                                    while _not__remainder_copy_ne_zero not 0 do;
                                        incr __not__remainder_copy_ne_zero_copy;
                                        incr __not__remainder_copy_ne_zero_holder;
                                        decr _not__remainder_copy_ne_zero;
                                    end;
                                    
                                    while __not__remainder_copy_ne_zero_holder not 0 do;
                                        incr _not__remainder_copy_ne_zero;
                                        decr __not__remainder_copy_ne_zero_holder;
                                    end;
                                #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                            #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                            clear _inner_or;
                            
                            while __not___ZERO_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not___ZERO_copy_ne_zero_copy;
                            end;
                            
                            while __not__remainder_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not__remainder_copy_ne_zero_copy;
                            end;
                        #< done _inner_or = _not___ZERO_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                    #< done _neither_are_zero = __ZERO_copy_ne_zero and _remainder_copy_ne_zero;
                end;
                
                
                clear _difference;
                
                while __ZERO_copy_ne_zero not 0 do;
                    # __ZERO_copy_ne_zero is True, so _ZERO must be the larger
                    #> _difference = __ZERO_copy;
                        clear _difference;
                        #> _difference += __ZERO_copy;
                            clear ___ZERO_copy_holder;
                            
                            while __ZERO_copy not 0 do;
                                incr _difference;
                                incr ___ZERO_copy_holder;
                                decr __ZERO_copy;
                            end;
                            
                            while ___ZERO_copy_holder not 0 do;
                                incr __ZERO_copy;
                                decr ___ZERO_copy_holder;
                            end;
                        #< done _difference += __ZERO_copy;
                    #< done _difference = __ZERO_copy;
                    clear __ZERO_copy_ne_zero;
                end;
                
                while _remainder_copy_ne_zero not 0 do;
                    # _remainder_copy_ne_zero is True, so remainder must be the larger
                    #> _difference = _remainder_copy;
                        clear _difference;
                        #> _difference += _remainder_copy;
                            clear __remainder_copy_holder;
                            
                            while _remainder_copy not 0 do;
                                incr _difference;
                                incr __remainder_copy_holder;
                                decr _remainder_copy;
                            end;
                            
                            while __remainder_copy_holder not 0 do;
                                incr _remainder_copy;
                                decr __remainder_copy_holder;
                            end;
                        #< done _difference += _remainder_copy;
                    #< done _difference = _remainder_copy;
                    clear _remainder_copy_ne_zero;
                end;
            #< done _difference = abs(remainder - _ZERO);
            clear X_copy_is_even;
            incr X_copy_is_even;
            while _difference not 0 do;
                clear X_copy_is_even;
                clear _difference;
            end;
            
            # If remainder == _ZERO, X_copy_is_even = 1. Otherwise, X_copy_is_even = 0
        #< done X_copy_is_even = remainder == _ZERO;
        #> X_copy_is_odd = remainder != _ZERO;
            #> _not_X_copy_is_odd = remainder == _ZERO;
                #> _difference = abs(remainder - _ZERO);
                    #> _remainder_copy = remainder;
                        clear _remainder_copy;
                        #> _remainder_copy += remainder;
                            clear _remainder_holder;
                            
                            while remainder not 0 do;
                                incr _remainder_copy;
                                incr _remainder_holder;
                                decr remainder;
                            end;
                            
                            while _remainder_holder not 0 do;
                                incr remainder;
                                decr _remainder_holder;
                            end;
                        #< done _remainder_copy += remainder;
                    #< done _remainder_copy = remainder;
                    #> __ZERO_copy = _ZERO;
                        clear __ZERO_copy;
                        #> __ZERO_copy += _ZERO;
                            clear __ZERO_holder;
                            
                            while _ZERO not 0 do;
                                incr __ZERO_copy;
                                incr __ZERO_holder;
                                decr _ZERO;
                            end;
                            
                            while __ZERO_holder not 0 do;
                                incr _ZERO;
                                decr __ZERO_holder;
                            end;
                        #< done __ZERO_copy += _ZERO;
                    #< done __ZERO_copy = _ZERO;
                    
                    #> _remainder_copy_ne_zero = _remainder_copy != 0;
                        #> _not__remainder_copy_ne_zero = _remainder_copy == 0;
                            #> __remainder_copy_copy = _remainder_copy;
                                clear __remainder_copy_copy;
                                #> __remainder_copy_copy += _remainder_copy;
                                    clear __remainder_copy_holder;
                                    
                                    while _remainder_copy not 0 do;
                                        incr __remainder_copy_copy;
                                        incr __remainder_copy_holder;
                                        decr _remainder_copy;
                                    end;
                                    
                                    while __remainder_copy_holder not 0 do;
                                        incr _remainder_copy;
                                        decr __remainder_copy_holder;
                                    end;
                                #< done __remainder_copy_copy += _remainder_copy;
                            #< done __remainder_copy_copy = _remainder_copy;
                            
                            clear _not__remainder_copy_ne_zero;
                            incr _not__remainder_copy_ne_zero;
                            while __remainder_copy_copy not 0 do;
                                clear _not__remainder_copy_ne_zero;
                                clear __remainder_copy_copy;
                            end;
                        #< done _not__remainder_copy_ne_zero = _remainder_copy == 0;
                        #> _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                            #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                clear __not__remainder_copy_ne_zero_copy;
                                #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_holder;
                                    
                                    while _not__remainder_copy_ne_zero not 0 do;
                                        incr __not__remainder_copy_ne_zero_copy;
                                        incr __not__remainder_copy_ne_zero_holder;
                                        decr _not__remainder_copy_ne_zero;
                                    end;
                                    
                                    while __not__remainder_copy_ne_zero_holder not 0 do;
                                        incr _not__remainder_copy_ne_zero;
                                        decr __not__remainder_copy_ne_zero_holder;
                                    end;
                                #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                            #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                            
                            clear _remainder_copy_ne_zero;
                            incr _remainder_copy_ne_zero;
                            
                            while __not__remainder_copy_ne_zero_copy not 0 do;
                                clear _remainder_copy_ne_zero;
                                clear __not__remainder_copy_ne_zero_copy;
                            end;
                        #< done _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                    #< done _remainder_copy_ne_zero = _remainder_copy != 0;
                    #> __ZERO_copy_ne_zero = __ZERO_copy != 0;
                        #> _not___ZERO_copy_ne_zero = __ZERO_copy == 0;
                            #> ___ZERO_copy_copy = __ZERO_copy;
                                clear ___ZERO_copy_copy;
                                #> ___ZERO_copy_copy += __ZERO_copy;
                                    clear ___ZERO_copy_holder;
                                    
                                    while __ZERO_copy not 0 do;
                                        incr ___ZERO_copy_copy;
                                        incr ___ZERO_copy_holder;
                                        decr __ZERO_copy;
                                    end;
                                    
                                    while ___ZERO_copy_holder not 0 do;
                                        incr __ZERO_copy;
                                        decr ___ZERO_copy_holder;
                                    end;
                                #< done ___ZERO_copy_copy += __ZERO_copy;
                            #< done ___ZERO_copy_copy = __ZERO_copy;
                            
                            clear _not___ZERO_copy_ne_zero;
                            incr _not___ZERO_copy_ne_zero;
                            while ___ZERO_copy_copy not 0 do;
                                clear _not___ZERO_copy_ne_zero;
                                clear ___ZERO_copy_copy;
                            end;
                        #< done _not___ZERO_copy_ne_zero = __ZERO_copy == 0;
                        #> __ZERO_copy_ne_zero = not _not___ZERO_copy_ne_zero;
                            #> __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                                clear __not___ZERO_copy_ne_zero_copy;
                                #> __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                    clear __not___ZERO_copy_ne_zero_holder;
                                    
                                    while _not___ZERO_copy_ne_zero not 0 do;
                                        incr __not___ZERO_copy_ne_zero_copy;
                                        incr __not___ZERO_copy_ne_zero_holder;
                                        decr _not___ZERO_copy_ne_zero;
                                    end;
                                    
                                    while __not___ZERO_copy_ne_zero_holder not 0 do;
                                        incr _not___ZERO_copy_ne_zero;
                                        decr __not___ZERO_copy_ne_zero_holder;
                                    end;
                                #< done __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                            #< done __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                            
                            clear __ZERO_copy_ne_zero;
                            incr __ZERO_copy_ne_zero;
                            
                            while __not___ZERO_copy_ne_zero_copy not 0 do;
                                clear __ZERO_copy_ne_zero;
                                clear __not___ZERO_copy_ne_zero_copy;
                            end;
                        #< done __ZERO_copy_ne_zero = not _not___ZERO_copy_ne_zero;
                    #< done __ZERO_copy_ne_zero = __ZERO_copy != 0;
                    #> _neither_are_zero = __ZERO_copy_ne_zero and _remainder_copy_ne_zero;
                        # DeMorgan's:
                        #  (X and Y) = not ((not X) or (not Y))
                        #> _not___ZERO_copy_ne_zero = not __ZERO_copy_ne_zero;
                            #> ___ZERO_copy_ne_zero_copy = __ZERO_copy_ne_zero;
                                clear ___ZERO_copy_ne_zero_copy;
                                #> ___ZERO_copy_ne_zero_copy += __ZERO_copy_ne_zero;
                                    clear ___ZERO_copy_ne_zero_holder;
                                    
                                    while __ZERO_copy_ne_zero not 0 do;
                                        incr ___ZERO_copy_ne_zero_copy;
                                        incr ___ZERO_copy_ne_zero_holder;
                                        decr __ZERO_copy_ne_zero;
                                    end;
                                    
                                    while ___ZERO_copy_ne_zero_holder not 0 do;
                                        incr __ZERO_copy_ne_zero;
                                        decr ___ZERO_copy_ne_zero_holder;
                                    end;
                                #< done ___ZERO_copy_ne_zero_copy += __ZERO_copy_ne_zero;
                            #< done ___ZERO_copy_ne_zero_copy = __ZERO_copy_ne_zero;
                            
                            clear _not___ZERO_copy_ne_zero;
                            incr _not___ZERO_copy_ne_zero;
                            
                            while ___ZERO_copy_ne_zero_copy not 0 do;
                                clear _not___ZERO_copy_ne_zero;
                                clear ___ZERO_copy_ne_zero_copy;
                            end;
                        #< done _not___ZERO_copy_ne_zero = not __ZERO_copy_ne_zero;
                        #> _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                            #> __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                clear __remainder_copy_ne_zero_copy;
                                #> __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                    clear __remainder_copy_ne_zero_holder;
                                    
                                    while _remainder_copy_ne_zero not 0 do;
                                        incr __remainder_copy_ne_zero_copy;
                                        incr __remainder_copy_ne_zero_holder;
                                        decr _remainder_copy_ne_zero;
                                    end;
                                    
                                    while __remainder_copy_ne_zero_holder not 0 do;
                                        incr _remainder_copy_ne_zero;
                                        decr __remainder_copy_ne_zero_holder;
                                    end;
                                #< done __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                            #< done __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                            
                            clear _not__remainder_copy_ne_zero;
                            incr _not__remainder_copy_ne_zero;
                            
                            while __remainder_copy_ne_zero_copy not 0 do;
                                clear _not__remainder_copy_ne_zero;
                                clear __remainder_copy_ne_zero_copy;
                            end;
                        #< done _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                        #> _inner_or = _not___ZERO_copy_ne_zero or _not__remainder_copy_ne_zero;
                            #> __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                                clear __not___ZERO_copy_ne_zero_copy;
                                #> __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                    clear __not___ZERO_copy_ne_zero_holder;
                                    
                                    while _not___ZERO_copy_ne_zero not 0 do;
                                        incr __not___ZERO_copy_ne_zero_copy;
                                        incr __not___ZERO_copy_ne_zero_holder;
                                        decr _not___ZERO_copy_ne_zero;
                                    end;
                                    
                                    while __not___ZERO_copy_ne_zero_holder not 0 do;
                                        incr _not___ZERO_copy_ne_zero;
                                        decr __not___ZERO_copy_ne_zero_holder;
                                    end;
                                #< done __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                            #< done __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                            #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                clear __not__remainder_copy_ne_zero_copy;
                                #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_holder;
                                    
                                    while _not__remainder_copy_ne_zero not 0 do;
                                        incr __not__remainder_copy_ne_zero_copy;
                                        incr __not__remainder_copy_ne_zero_holder;
                                        decr _not__remainder_copy_ne_zero;
                                    end;
                                    
                                    while __not__remainder_copy_ne_zero_holder not 0 do;
                                        incr _not__remainder_copy_ne_zero;
                                        decr __not__remainder_copy_ne_zero_holder;
                                    end;
                                #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                            #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                            clear _inner_or;
                            
                            while __not___ZERO_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not___ZERO_copy_ne_zero_copy;
                            end;
                            
                            while __not__remainder_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not__remainder_copy_ne_zero_copy;
                            end;
                        #< done _inner_or = _not___ZERO_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                    #< done _neither_are_zero = __ZERO_copy_ne_zero and _remainder_copy_ne_zero;
                    while _neither_are_zero not 0 do;
                        decr _remainder_copy;
                        decr __ZERO_copy;
                        
                        #> _remainder_copy_ne_zero = _remainder_copy != 0;
                            #> _not__remainder_copy_ne_zero = _remainder_copy == 0;
                                #> __remainder_copy_copy = _remainder_copy;
                                    clear __remainder_copy_copy;
                                    #> __remainder_copy_copy += _remainder_copy;
                                        clear __remainder_copy_holder;
                                        
                                        while _remainder_copy not 0 do;
                                            incr __remainder_copy_copy;
                                            incr __remainder_copy_holder;
                                            decr _remainder_copy;
                                        end;
                                        
                                        while __remainder_copy_holder not 0 do;
                                            incr _remainder_copy;
                                            decr __remainder_copy_holder;
                                        end;
                                    #< done __remainder_copy_copy += _remainder_copy;
                                #< done __remainder_copy_copy = _remainder_copy;
                                
                                clear _not__remainder_copy_ne_zero;
                                incr _not__remainder_copy_ne_zero;
                                while __remainder_copy_copy not 0 do;
                                    clear _not__remainder_copy_ne_zero;
                                    clear __remainder_copy_copy;
                                end;
                            #< done _not__remainder_copy_ne_zero = _remainder_copy == 0;
                            #> _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                                #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_copy;
                                    #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_holder;
                                        
                                        while _not__remainder_copy_ne_zero not 0 do;
                                            incr __not__remainder_copy_ne_zero_copy;
                                            incr __not__remainder_copy_ne_zero_holder;
                                            decr _not__remainder_copy_ne_zero;
                                        end;
                                        
                                        while __not__remainder_copy_ne_zero_holder not 0 do;
                                            incr _not__remainder_copy_ne_zero;
                                            decr __not__remainder_copy_ne_zero_holder;
                                        end;
                                    #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                
                                clear _remainder_copy_ne_zero;
                                incr _remainder_copy_ne_zero;
                                
                                while __not__remainder_copy_ne_zero_copy not 0 do;
                                    clear _remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_copy;
                                end;
                            #< done _remainder_copy_ne_zero = not _not__remainder_copy_ne_zero;
                        #< done _remainder_copy_ne_zero = _remainder_copy != 0;
                        #> __ZERO_copy_ne_zero = __ZERO_copy != 0;
                            #> _not___ZERO_copy_ne_zero = __ZERO_copy == 0;
                                #> ___ZERO_copy_copy = __ZERO_copy;
                                    clear ___ZERO_copy_copy;
                                    #> ___ZERO_copy_copy += __ZERO_copy;
                                        clear ___ZERO_copy_holder;
                                        
                                        while __ZERO_copy not 0 do;
                                            incr ___ZERO_copy_copy;
                                            incr ___ZERO_copy_holder;
                                            decr __ZERO_copy;
                                        end;
                                        
                                        while ___ZERO_copy_holder not 0 do;
                                            incr __ZERO_copy;
                                            decr ___ZERO_copy_holder;
                                        end;
                                    #< done ___ZERO_copy_copy += __ZERO_copy;
                                #< done ___ZERO_copy_copy = __ZERO_copy;
                                
                                clear _not___ZERO_copy_ne_zero;
                                incr _not___ZERO_copy_ne_zero;
                                while ___ZERO_copy_copy not 0 do;
                                    clear _not___ZERO_copy_ne_zero;
                                    clear ___ZERO_copy_copy;
                                end;
                            #< done _not___ZERO_copy_ne_zero = __ZERO_copy == 0;
                            #> __ZERO_copy_ne_zero = not _not___ZERO_copy_ne_zero;
                                #> __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                                    clear __not___ZERO_copy_ne_zero_copy;
                                    #> __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                        clear __not___ZERO_copy_ne_zero_holder;
                                        
                                        while _not___ZERO_copy_ne_zero not 0 do;
                                            incr __not___ZERO_copy_ne_zero_copy;
                                            incr __not___ZERO_copy_ne_zero_holder;
                                            decr _not___ZERO_copy_ne_zero;
                                        end;
                                        
                                        while __not___ZERO_copy_ne_zero_holder not 0 do;
                                            incr _not___ZERO_copy_ne_zero;
                                            decr __not___ZERO_copy_ne_zero_holder;
                                        end;
                                    #< done __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                #< done __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                                
                                clear __ZERO_copy_ne_zero;
                                incr __ZERO_copy_ne_zero;
                                
                                while __not___ZERO_copy_ne_zero_copy not 0 do;
                                    clear __ZERO_copy_ne_zero;
                                    clear __not___ZERO_copy_ne_zero_copy;
                                end;
                            #< done __ZERO_copy_ne_zero = not _not___ZERO_copy_ne_zero;
                        #< done __ZERO_copy_ne_zero = __ZERO_copy != 0;
                        #> _neither_are_zero = __ZERO_copy_ne_zero and _remainder_copy_ne_zero;
                            # DeMorgan's:
                            #  (X and Y) = not ((not X) or (not Y))
                            #> _not___ZERO_copy_ne_zero = not __ZERO_copy_ne_zero;
                                #> ___ZERO_copy_ne_zero_copy = __ZERO_copy_ne_zero;
                                    clear ___ZERO_copy_ne_zero_copy;
                                    #> ___ZERO_copy_ne_zero_copy += __ZERO_copy_ne_zero;
                                        clear ___ZERO_copy_ne_zero_holder;
                                        
                                        while __ZERO_copy_ne_zero not 0 do;
                                            incr ___ZERO_copy_ne_zero_copy;
                                            incr ___ZERO_copy_ne_zero_holder;
                                            decr __ZERO_copy_ne_zero;
                                        end;
                                        
                                        while ___ZERO_copy_ne_zero_holder not 0 do;
                                            incr __ZERO_copy_ne_zero;
                                            decr ___ZERO_copy_ne_zero_holder;
                                        end;
                                    #< done ___ZERO_copy_ne_zero_copy += __ZERO_copy_ne_zero;
                                #< done ___ZERO_copy_ne_zero_copy = __ZERO_copy_ne_zero;
                                
                                clear _not___ZERO_copy_ne_zero;
                                incr _not___ZERO_copy_ne_zero;
                                
                                while ___ZERO_copy_ne_zero_copy not 0 do;
                                    clear _not___ZERO_copy_ne_zero;
                                    clear ___ZERO_copy_ne_zero_copy;
                                end;
                            #< done _not___ZERO_copy_ne_zero = not __ZERO_copy_ne_zero;
                            #> _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                                #> __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                    clear __remainder_copy_ne_zero_copy;
                                    #> __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                        clear __remainder_copy_ne_zero_holder;
                                        
                                        while _remainder_copy_ne_zero not 0 do;
                                            incr __remainder_copy_ne_zero_copy;
                                            incr __remainder_copy_ne_zero_holder;
                                            decr _remainder_copy_ne_zero;
                                        end;
                                        
                                        while __remainder_copy_ne_zero_holder not 0 do;
                                            incr _remainder_copy_ne_zero;
                                            decr __remainder_copy_ne_zero_holder;
                                        end;
                                    #< done __remainder_copy_ne_zero_copy += _remainder_copy_ne_zero;
                                #< done __remainder_copy_ne_zero_copy = _remainder_copy_ne_zero;
                                
                                clear _not__remainder_copy_ne_zero;
                                incr _not__remainder_copy_ne_zero;
                                
                                while __remainder_copy_ne_zero_copy not 0 do;
                                    clear _not__remainder_copy_ne_zero;
                                    clear __remainder_copy_ne_zero_copy;
                                end;
                            #< done _not__remainder_copy_ne_zero = not _remainder_copy_ne_zero;
                            #> _inner_or = _not___ZERO_copy_ne_zero or _not__remainder_copy_ne_zero;
                                #> __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                                    clear __not___ZERO_copy_ne_zero_copy;
                                    #> __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                        clear __not___ZERO_copy_ne_zero_holder;
                                        
                                        while _not___ZERO_copy_ne_zero not 0 do;
                                            incr __not___ZERO_copy_ne_zero_copy;
                                            incr __not___ZERO_copy_ne_zero_holder;
                                            decr _not___ZERO_copy_ne_zero;
                                        end;
                                        
                                        while __not___ZERO_copy_ne_zero_holder not 0 do;
                                            incr _not___ZERO_copy_ne_zero;
                                            decr __not___ZERO_copy_ne_zero_holder;
                                        end;
                                    #< done __not___ZERO_copy_ne_zero_copy += _not___ZERO_copy_ne_zero;
                                #< done __not___ZERO_copy_ne_zero_copy = _not___ZERO_copy_ne_zero;
                                #> __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                    clear __not__remainder_copy_ne_zero_copy;
                                    #> __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                        clear __not__remainder_copy_ne_zero_holder;
                                        
                                        while _not__remainder_copy_ne_zero not 0 do;
                                            incr __not__remainder_copy_ne_zero_copy;
                                            incr __not__remainder_copy_ne_zero_holder;
                                            decr _not__remainder_copy_ne_zero;
                                        end;
                                        
                                        while __not__remainder_copy_ne_zero_holder not 0 do;
                                            incr _not__remainder_copy_ne_zero;
                                            decr __not__remainder_copy_ne_zero_holder;
                                        end;
                                    #< done __not__remainder_copy_ne_zero_copy += _not__remainder_copy_ne_zero;
                                #< done __not__remainder_copy_ne_zero_copy = _not__remainder_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not___ZERO_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___ZERO_copy_ne_zero_copy;
                                end;
                                
                                while __not__remainder_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__remainder_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not___ZERO_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                        #< done _neither_are_zero = __ZERO_copy_ne_zero and _remainder_copy_ne_zero;
                    end;
                    
                    
                    clear _difference;
                    
                    while __ZERO_copy_ne_zero not 0 do;
                        # __ZERO_copy_ne_zero is True, so _ZERO must be the larger
                        #> _difference = __ZERO_copy;
                            clear _difference;
                            #> _difference += __ZERO_copy;
                                clear ___ZERO_copy_holder;
                                
                                while __ZERO_copy not 0 do;
                                    incr _difference;
                                    incr ___ZERO_copy_holder;
                                    decr __ZERO_copy;
                                end;
                                
                                while ___ZERO_copy_holder not 0 do;
                                    incr __ZERO_copy;
                                    decr ___ZERO_copy_holder;
                                end;
                            #< done _difference += __ZERO_copy;
                        #< done _difference = __ZERO_copy;
                        clear __ZERO_copy_ne_zero;
                    end;
                    
                    while _remainder_copy_ne_zero not 0 do;
                        # _remainder_copy_ne_zero is True, so remainder must be the larger
                        #> _difference = _remainder_copy;
                            clear _difference;
                            #> _difference += _remainder_copy;
                                clear __remainder_copy_holder;
                                
                                while _remainder_copy not 0 do;
                                    incr _difference;
                                    incr __remainder_copy_holder;
                                    decr _remainder_copy;
                                end;
                                
                                while __remainder_copy_holder not 0 do;
                                    incr _remainder_copy;
                                    decr __remainder_copy_holder;
                                end;
                            #< done _difference += _remainder_copy;
                        #< done _difference = _remainder_copy;
                        clear _remainder_copy_ne_zero;
                    end;
                #< done _difference = abs(remainder - _ZERO);
                clear _not_X_copy_is_odd;
                incr _not_X_copy_is_odd;
                while _difference not 0 do;
                    clear _not_X_copy_is_odd;
                    clear _difference;
                end;
                
                # If remainder == _ZERO, _not_X_copy_is_odd = 1. Otherwise, _not_X_copy_is_odd = 0
            #< done _not_X_copy_is_odd = remainder == _ZERO;
            #> X_copy_is_odd = not _not_X_copy_is_odd;
                #> __not_X_copy_is_odd_copy = _not_X_copy_is_odd;
                    clear __not_X_copy_is_odd_copy;
                    #> __not_X_copy_is_odd_copy += _not_X_copy_is_odd;
                        clear __not_X_copy_is_odd_holder;
                        
                        while _not_X_copy_is_odd not 0 do;
                            incr __not_X_copy_is_odd_copy;
                            incr __not_X_copy_is_odd_holder;
                            decr _not_X_copy_is_odd;
                        end;
                        
                        while __not_X_copy_is_odd_holder not 0 do;
                            incr _not_X_copy_is_odd;
                            decr __not_X_copy_is_odd_holder;
                        end;
                    #< done __not_X_copy_is_odd_copy += _not_X_copy_is_odd;
                #< done __not_X_copy_is_odd_copy = _not_X_copy_is_odd;
                
                clear X_copy_is_odd;
                incr X_copy_is_odd;
                
                while __not_X_copy_is_odd_copy not 0 do;
                    clear X_copy_is_odd;
                    clear __not_X_copy_is_odd_copy;
                end;
            #< done X_copy_is_odd = not _not_X_copy_is_odd;
        #< done X_copy_is_odd = remainder != _ZERO;
        
        while X_copy_is_even not 0 do;
            #> X_copy = X_copy_over_two;
                clear X_copy;
                #> X_copy += X_copy_over_two;
                    clear _X_copy_over_two_holder;
                    
                    while X_copy_over_two not 0 do;
                        incr X_copy;
                        incr _X_copy_over_two_holder;
                        decr X_copy_over_two;
                    end;
                    
                    while _X_copy_over_two_holder not 0 do;
                        incr X_copy_over_two;
                        decr _X_copy_over_two_holder;
                    end;
                #< done X_copy += X_copy_over_two;
            #< done X_copy = X_copy_over_two;
            clear X_copy_is_even;
        end;
        
        while X_copy_is_odd not 0 do;
            #> X_copy = X_copy * _THREE;
                #> _X_copy_copy = X_copy;
                    clear _X_copy_copy;
                    #> _X_copy_copy += X_copy;
                        clear _X_copy_holder;
                        
                        while X_copy not 0 do;
                            incr _X_copy_copy;
                            incr _X_copy_holder;
                            decr X_copy;
                        end;
                        
                        while _X_copy_holder not 0 do;
                            incr X_copy;
                            decr _X_copy_holder;
                        end;
                    #< done _X_copy_copy += X_copy;
                #< done _X_copy_copy = X_copy;
                #> __THREE_copy = _THREE;
                    clear __THREE_copy;
                    #> __THREE_copy += _THREE;
                        clear __THREE_holder;
                        
                        while _THREE not 0 do;
                            incr __THREE_copy;
                            incr __THREE_holder;
                            decr _THREE;
                        end;
                        
                        while __THREE_holder not 0 do;
                            incr _THREE;
                            decr __THREE_holder;
                        end;
                    #< done __THREE_copy += _THREE;
                #< done __THREE_copy = _THREE;
                clear X_copy;
                while _X_copy_copy not 0 do;
                    #> X_copy += __THREE_copy;
                        clear ___THREE_copy_holder;
                        
                        while __THREE_copy not 0 do;
                            incr X_copy;
                            incr ___THREE_copy_holder;
                            decr __THREE_copy;
                        end;
                        
                        while ___THREE_copy_holder not 0 do;
                            incr __THREE_copy;
                            decr ___THREE_copy_holder;
                        end;
                    #< done X_copy += __THREE_copy;
                    decr _X_copy_copy;
                end;
                # Note: this is faster if X_copy is larger than _THREE
            #< done X_copy = X_copy * _THREE;
            #> X_copy += _ONE;
                clear __ONE_holder;
                
                while _ONE not 0 do;
                    incr X_copy;
                    incr __ONE_holder;
                    decr _ONE;
                end;
                
                while __ONE_holder not 0 do;
                    incr _ONE;
                    decr __ONE_holder;
                end;
            #< done X_copy += _ONE;
            clear X_copy_is_odd;
        end;
        
        decr X_copy;
    end;
    print _ONE;
    
    print;
    incr X;
end;