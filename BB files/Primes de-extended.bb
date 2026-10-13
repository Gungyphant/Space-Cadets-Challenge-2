clear potential_prime;
incr potential_prime;
incr potential_prime;
# As the only even prime, 2 would otherwise be ignored
print potential_prime;
incr potential_prime;

while potential_prime not 0 do;
    clear is_prime;
    incr is_prime;
    
    clear divisor;
    incr divisor;
    incr divisor;
    incr divisor;
    
    #> divisor_lt_potential_prime = divisor < potential_prime;
        #> _divisor_ge_potential_prime = divisor >= potential_prime;
            #> _divisor_gt_potential_prime = divisor > potential_prime;
                #> _divisor_copy = divisor;
                    clear _divisor_copy;
                    #> _divisor_copy += divisor;
                        clear _divisor_holder;
                        
                        while divisor not 0 do;
                            incr _divisor_copy;
                            incr _divisor_holder;
                            decr divisor;
                        end;
                        
                        while _divisor_holder not 0 do;
                            incr divisor;
                            decr _divisor_holder;
                        end;
                    #< done _divisor_copy += divisor;
                #< done _divisor_copy = divisor;
                #> _potential_prime_copy = potential_prime;
                    clear _potential_prime_copy;
                    #> _potential_prime_copy += potential_prime;
                        clear _potential_prime_holder;
                        
                        while potential_prime not 0 do;
                            incr _potential_prime_copy;
                            incr _potential_prime_holder;
                            decr potential_prime;
                        end;
                        
                        while _potential_prime_holder not 0 do;
                            incr potential_prime;
                            decr _potential_prime_holder;
                        end;
                    #< done _potential_prime_copy += potential_prime;
                #< done _potential_prime_copy = potential_prime;
                
                #> _difference = abs(_divisor_copy - _potential_prime_copy);
                    #> __divisor_copy_copy = _divisor_copy;
                        clear __divisor_copy_copy;
                        #> __divisor_copy_copy += _divisor_copy;
                            clear __divisor_copy_holder;
                            
                            while _divisor_copy not 0 do;
                                incr __divisor_copy_copy;
                                incr __divisor_copy_holder;
                                decr _divisor_copy;
                            end;
                            
                            while __divisor_copy_holder not 0 do;
                                incr _divisor_copy;
                                decr __divisor_copy_holder;
                            end;
                        #< done __divisor_copy_copy += _divisor_copy;
                    #< done __divisor_copy_copy = _divisor_copy;
                    #> __potential_prime_copy_copy = _potential_prime_copy;
                        clear __potential_prime_copy_copy;
                        #> __potential_prime_copy_copy += _potential_prime_copy;
                            clear __potential_prime_copy_holder;
                            
                            while _potential_prime_copy not 0 do;
                                incr __potential_prime_copy_copy;
                                incr __potential_prime_copy_holder;
                                decr _potential_prime_copy;
                            end;
                            
                            while __potential_prime_copy_holder not 0 do;
                                incr _potential_prime_copy;
                                decr __potential_prime_copy_holder;
                            end;
                        #< done __potential_prime_copy_copy += _potential_prime_copy;
                    #< done __potential_prime_copy_copy = _potential_prime_copy;
                    
                    #> __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                        #> _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                            #> ___divisor_copy_copy_copy = __divisor_copy_copy;
                                clear ___divisor_copy_copy_copy;
                                #> ___divisor_copy_copy_copy += __divisor_copy_copy;
                                    clear ___divisor_copy_copy_holder;
                                    
                                    while __divisor_copy_copy not 0 do;
                                        incr ___divisor_copy_copy_copy;
                                        incr ___divisor_copy_copy_holder;
                                        decr __divisor_copy_copy;
                                    end;
                                    
                                    while ___divisor_copy_copy_holder not 0 do;
                                        incr __divisor_copy_copy;
                                        decr ___divisor_copy_copy_holder;
                                    end;
                                #< done ___divisor_copy_copy_copy += __divisor_copy_copy;
                            #< done ___divisor_copy_copy_copy = __divisor_copy_copy;
                            
                            clear _not___divisor_copy_copy_ne_zero;
                            incr _not___divisor_copy_copy_ne_zero;
                            while ___divisor_copy_copy_copy not 0 do;
                                clear _not___divisor_copy_copy_ne_zero;
                                clear ___divisor_copy_copy_copy;
                            end;
                        #< done _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                        #> __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                            #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                clear __not___divisor_copy_copy_ne_zero_copy;
                                #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                    clear __not___divisor_copy_copy_ne_zero_holder;
                                    
                                    while _not___divisor_copy_copy_ne_zero not 0 do;
                                        incr __not___divisor_copy_copy_ne_zero_copy;
                                        incr __not___divisor_copy_copy_ne_zero_holder;
                                        decr _not___divisor_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___divisor_copy_copy_ne_zero;
                                        decr __not___divisor_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                            #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                            
                            clear __divisor_copy_copy_ne_zero;
                            incr __divisor_copy_copy_ne_zero;
                            
                            while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                clear __divisor_copy_copy_ne_zero;
                                clear __not___divisor_copy_copy_ne_zero_copy;
                            end;
                        #< done __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                    #< done __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                    #> __potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy != 0;
                        #> _not___potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy == 0;
                            #> ___potential_prime_copy_copy_copy = __potential_prime_copy_copy;
                                clear ___potential_prime_copy_copy_copy;
                                #> ___potential_prime_copy_copy_copy += __potential_prime_copy_copy;
                                    clear ___potential_prime_copy_copy_holder;
                                    
                                    while __potential_prime_copy_copy not 0 do;
                                        incr ___potential_prime_copy_copy_copy;
                                        incr ___potential_prime_copy_copy_holder;
                                        decr __potential_prime_copy_copy;
                                    end;
                                    
                                    while ___potential_prime_copy_copy_holder not 0 do;
                                        incr __potential_prime_copy_copy;
                                        decr ___potential_prime_copy_copy_holder;
                                    end;
                                #< done ___potential_prime_copy_copy_copy += __potential_prime_copy_copy;
                            #< done ___potential_prime_copy_copy_copy = __potential_prime_copy_copy;
                            
                            clear _not___potential_prime_copy_copy_ne_zero;
                            incr _not___potential_prime_copy_copy_ne_zero;
                            while ___potential_prime_copy_copy_copy not 0 do;
                                clear _not___potential_prime_copy_copy_ne_zero;
                                clear ___potential_prime_copy_copy_copy;
                            end;
                        #< done _not___potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy == 0;
                        #> __potential_prime_copy_copy_ne_zero = not _not___potential_prime_copy_copy_ne_zero;
                            #> __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                clear __not___potential_prime_copy_copy_ne_zero_copy;
                                #> __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                    clear __not___potential_prime_copy_copy_ne_zero_holder;
                                    
                                    while _not___potential_prime_copy_copy_ne_zero not 0 do;
                                        incr __not___potential_prime_copy_copy_ne_zero_copy;
                                        incr __not___potential_prime_copy_copy_ne_zero_holder;
                                        decr _not___potential_prime_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___potential_prime_copy_copy_ne_zero;
                                        decr __not___potential_prime_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                            #< done __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                            
                            clear __potential_prime_copy_copy_ne_zero;
                            incr __potential_prime_copy_copy_ne_zero;
                            
                            while __not___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                clear __potential_prime_copy_copy_ne_zero;
                                clear __not___potential_prime_copy_copy_ne_zero_copy;
                            end;
                        #< done __potential_prime_copy_copy_ne_zero = not _not___potential_prime_copy_copy_ne_zero;
                    #< done __potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy != 0;
                    #> _neither_are_zero = __potential_prime_copy_copy_ne_zero and __divisor_copy_copy_ne_zero;
                        # DeMorgan's:
                        #  (X and Y) = not ((not X) or (not Y))
                        #> _not___potential_prime_copy_copy_ne_zero = not __potential_prime_copy_copy_ne_zero;
                            #> ___potential_prime_copy_copy_ne_zero_copy = __potential_prime_copy_copy_ne_zero;
                                clear ___potential_prime_copy_copy_ne_zero_copy;
                                #> ___potential_prime_copy_copy_ne_zero_copy += __potential_prime_copy_copy_ne_zero;
                                    clear ___potential_prime_copy_copy_ne_zero_holder;
                                    
                                    while __potential_prime_copy_copy_ne_zero not 0 do;
                                        incr ___potential_prime_copy_copy_ne_zero_copy;
                                        incr ___potential_prime_copy_copy_ne_zero_holder;
                                        decr __potential_prime_copy_copy_ne_zero;
                                    end;
                                    
                                    while ___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                        incr __potential_prime_copy_copy_ne_zero;
                                        decr ___potential_prime_copy_copy_ne_zero_holder;
                                    end;
                                #< done ___potential_prime_copy_copy_ne_zero_copy += __potential_prime_copy_copy_ne_zero;
                            #< done ___potential_prime_copy_copy_ne_zero_copy = __potential_prime_copy_copy_ne_zero;
                            
                            clear _not___potential_prime_copy_copy_ne_zero;
                            incr _not___potential_prime_copy_copy_ne_zero;
                            
                            while ___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                clear _not___potential_prime_copy_copy_ne_zero;
                                clear ___potential_prime_copy_copy_ne_zero_copy;
                            end;
                        #< done _not___potential_prime_copy_copy_ne_zero = not __potential_prime_copy_copy_ne_zero;
                        #> _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                            #> ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                clear ___divisor_copy_copy_ne_zero_copy;
                                #> ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                    clear ___divisor_copy_copy_ne_zero_holder;
                                    
                                    while __divisor_copy_copy_ne_zero not 0 do;
                                        incr ___divisor_copy_copy_ne_zero_copy;
                                        incr ___divisor_copy_copy_ne_zero_holder;
                                        decr __divisor_copy_copy_ne_zero;
                                    end;
                                    
                                    while ___divisor_copy_copy_ne_zero_holder not 0 do;
                                        incr __divisor_copy_copy_ne_zero;
                                        decr ___divisor_copy_copy_ne_zero_holder;
                                    end;
                                #< done ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                            #< done ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                            
                            clear _not___divisor_copy_copy_ne_zero;
                            incr _not___divisor_copy_copy_ne_zero;
                            
                            while ___divisor_copy_copy_ne_zero_copy not 0 do;
                                clear _not___divisor_copy_copy_ne_zero;
                                clear ___divisor_copy_copy_ne_zero_copy;
                            end;
                        #< done _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                        #> _inner_or = _not___potential_prime_copy_copy_ne_zero or _not___divisor_copy_copy_ne_zero;
                            #> __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                clear __not___potential_prime_copy_copy_ne_zero_copy;
                                #> __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                    clear __not___potential_prime_copy_copy_ne_zero_holder;
                                    
                                    while _not___potential_prime_copy_copy_ne_zero not 0 do;
                                        incr __not___potential_prime_copy_copy_ne_zero_copy;
                                        incr __not___potential_prime_copy_copy_ne_zero_holder;
                                        decr _not___potential_prime_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___potential_prime_copy_copy_ne_zero;
                                        decr __not___potential_prime_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                            #< done __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                            #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                clear __not___divisor_copy_copy_ne_zero_copy;
                                #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                    clear __not___divisor_copy_copy_ne_zero_holder;
                                    
                                    while _not___divisor_copy_copy_ne_zero not 0 do;
                                        incr __not___divisor_copy_copy_ne_zero_copy;
                                        incr __not___divisor_copy_copy_ne_zero_holder;
                                        decr _not___divisor_copy_copy_ne_zero;
                                    end;
                                    
                                    while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                        incr _not___divisor_copy_copy_ne_zero;
                                        decr __not___divisor_copy_copy_ne_zero_holder;
                                    end;
                                #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                            #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                            clear _inner_or;
                            
                            while __not___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not___potential_prime_copy_copy_ne_zero_copy;
                            end;
                            
                            while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not___divisor_copy_copy_ne_zero_copy;
                            end;
                        #< done _inner_or = _not___potential_prime_copy_copy_ne_zero or _not___divisor_copy_copy_ne_zero;
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
                    #< done _neither_are_zero = __potential_prime_copy_copy_ne_zero and __divisor_copy_copy_ne_zero;
                    while _neither_are_zero not 0 do;
                        decr __divisor_copy_copy;
                        decr __potential_prime_copy_copy;
                        
                        #> __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                            #> _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                #> ___divisor_copy_copy_copy = __divisor_copy_copy;
                                    clear ___divisor_copy_copy_copy;
                                    #> ___divisor_copy_copy_copy += __divisor_copy_copy;
                                        clear ___divisor_copy_copy_holder;
                                        
                                        while __divisor_copy_copy not 0 do;
                                            incr ___divisor_copy_copy_copy;
                                            incr ___divisor_copy_copy_holder;
                                            decr __divisor_copy_copy;
                                        end;
                                        
                                        while ___divisor_copy_copy_holder not 0 do;
                                            incr __divisor_copy_copy;
                                            decr ___divisor_copy_copy_holder;
                                        end;
                                    #< done ___divisor_copy_copy_copy += __divisor_copy_copy;
                                #< done ___divisor_copy_copy_copy = __divisor_copy_copy;
                                
                                clear _not___divisor_copy_copy_ne_zero;
                                incr _not___divisor_copy_copy_ne_zero;
                                while ___divisor_copy_copy_copy not 0 do;
                                    clear _not___divisor_copy_copy_ne_zero;
                                    clear ___divisor_copy_copy_copy;
                                end;
                            #< done _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                            #> __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                    clear __not___divisor_copy_copy_ne_zero_copy;
                                    #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_holder;
                                        
                                        while _not___divisor_copy_copy_ne_zero not 0 do;
                                            incr __not___divisor_copy_copy_ne_zero_copy;
                                            incr __not___divisor_copy_copy_ne_zero_holder;
                                            decr _not___divisor_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___divisor_copy_copy_ne_zero;
                                            decr __not___divisor_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                
                                clear __divisor_copy_copy_ne_zero;
                                incr __divisor_copy_copy_ne_zero;
                                
                                while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                    clear __divisor_copy_copy_ne_zero;
                                    clear __not___divisor_copy_copy_ne_zero_copy;
                                end;
                            #< done __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                        #< done __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                        #> __potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy != 0;
                            #> _not___potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy == 0;
                                #> ___potential_prime_copy_copy_copy = __potential_prime_copy_copy;
                                    clear ___potential_prime_copy_copy_copy;
                                    #> ___potential_prime_copy_copy_copy += __potential_prime_copy_copy;
                                        clear ___potential_prime_copy_copy_holder;
                                        
                                        while __potential_prime_copy_copy not 0 do;
                                            incr ___potential_prime_copy_copy_copy;
                                            incr ___potential_prime_copy_copy_holder;
                                            decr __potential_prime_copy_copy;
                                        end;
                                        
                                        while ___potential_prime_copy_copy_holder not 0 do;
                                            incr __potential_prime_copy_copy;
                                            decr ___potential_prime_copy_copy_holder;
                                        end;
                                    #< done ___potential_prime_copy_copy_copy += __potential_prime_copy_copy;
                                #< done ___potential_prime_copy_copy_copy = __potential_prime_copy_copy;
                                
                                clear _not___potential_prime_copy_copy_ne_zero;
                                incr _not___potential_prime_copy_copy_ne_zero;
                                while ___potential_prime_copy_copy_copy not 0 do;
                                    clear _not___potential_prime_copy_copy_ne_zero;
                                    clear ___potential_prime_copy_copy_copy;
                                end;
                            #< done _not___potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy == 0;
                            #> __potential_prime_copy_copy_ne_zero = not _not___potential_prime_copy_copy_ne_zero;
                                #> __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                    clear __not___potential_prime_copy_copy_ne_zero_copy;
                                    #> __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                        clear __not___potential_prime_copy_copy_ne_zero_holder;
                                        
                                        while _not___potential_prime_copy_copy_ne_zero not 0 do;
                                            incr __not___potential_prime_copy_copy_ne_zero_copy;
                                            incr __not___potential_prime_copy_copy_ne_zero_holder;
                                            decr _not___potential_prime_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___potential_prime_copy_copy_ne_zero;
                                            decr __not___potential_prime_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                #< done __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                
                                clear __potential_prime_copy_copy_ne_zero;
                                incr __potential_prime_copy_copy_ne_zero;
                                
                                while __not___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                    clear __potential_prime_copy_copy_ne_zero;
                                    clear __not___potential_prime_copy_copy_ne_zero_copy;
                                end;
                            #< done __potential_prime_copy_copy_ne_zero = not _not___potential_prime_copy_copy_ne_zero;
                        #< done __potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy != 0;
                        #> _neither_are_zero = __potential_prime_copy_copy_ne_zero and __divisor_copy_copy_ne_zero;
                            # DeMorgan's:
                            #  (X and Y) = not ((not X) or (not Y))
                            #> _not___potential_prime_copy_copy_ne_zero = not __potential_prime_copy_copy_ne_zero;
                                #> ___potential_prime_copy_copy_ne_zero_copy = __potential_prime_copy_copy_ne_zero;
                                    clear ___potential_prime_copy_copy_ne_zero_copy;
                                    #> ___potential_prime_copy_copy_ne_zero_copy += __potential_prime_copy_copy_ne_zero;
                                        clear ___potential_prime_copy_copy_ne_zero_holder;
                                        
                                        while __potential_prime_copy_copy_ne_zero not 0 do;
                                            incr ___potential_prime_copy_copy_ne_zero_copy;
                                            incr ___potential_prime_copy_copy_ne_zero_holder;
                                            decr __potential_prime_copy_copy_ne_zero;
                                        end;
                                        
                                        while ___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                            incr __potential_prime_copy_copy_ne_zero;
                                            decr ___potential_prime_copy_copy_ne_zero_holder;
                                        end;
                                    #< done ___potential_prime_copy_copy_ne_zero_copy += __potential_prime_copy_copy_ne_zero;
                                #< done ___potential_prime_copy_copy_ne_zero_copy = __potential_prime_copy_copy_ne_zero;
                                
                                clear _not___potential_prime_copy_copy_ne_zero;
                                incr _not___potential_prime_copy_copy_ne_zero;
                                
                                while ___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                    clear _not___potential_prime_copy_copy_ne_zero;
                                    clear ___potential_prime_copy_copy_ne_zero_copy;
                                end;
                            #< done _not___potential_prime_copy_copy_ne_zero = not __potential_prime_copy_copy_ne_zero;
                            #> _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                                #> ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                    clear ___divisor_copy_copy_ne_zero_copy;
                                    #> ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                        clear ___divisor_copy_copy_ne_zero_holder;
                                        
                                        while __divisor_copy_copy_ne_zero not 0 do;
                                            incr ___divisor_copy_copy_ne_zero_copy;
                                            incr ___divisor_copy_copy_ne_zero_holder;
                                            decr __divisor_copy_copy_ne_zero;
                                        end;
                                        
                                        while ___divisor_copy_copy_ne_zero_holder not 0 do;
                                            incr __divisor_copy_copy_ne_zero;
                                            decr ___divisor_copy_copy_ne_zero_holder;
                                        end;
                                    #< done ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                #< done ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                
                                clear _not___divisor_copy_copy_ne_zero;
                                incr _not___divisor_copy_copy_ne_zero;
                                
                                while ___divisor_copy_copy_ne_zero_copy not 0 do;
                                    clear _not___divisor_copy_copy_ne_zero;
                                    clear ___divisor_copy_copy_ne_zero_copy;
                                end;
                            #< done _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                            #> _inner_or = _not___potential_prime_copy_copy_ne_zero or _not___divisor_copy_copy_ne_zero;
                                #> __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                    clear __not___potential_prime_copy_copy_ne_zero_copy;
                                    #> __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                        clear __not___potential_prime_copy_copy_ne_zero_holder;
                                        
                                        while _not___potential_prime_copy_copy_ne_zero not 0 do;
                                            incr __not___potential_prime_copy_copy_ne_zero_copy;
                                            incr __not___potential_prime_copy_copy_ne_zero_holder;
                                            decr _not___potential_prime_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___potential_prime_copy_copy_ne_zero;
                                            decr __not___potential_prime_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                #< done __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                    clear __not___divisor_copy_copy_ne_zero_copy;
                                    #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_holder;
                                        
                                        while _not___divisor_copy_copy_ne_zero not 0 do;
                                            incr __not___divisor_copy_copy_ne_zero_copy;
                                            incr __not___divisor_copy_copy_ne_zero_holder;
                                            decr _not___divisor_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___divisor_copy_copy_ne_zero;
                                            decr __not___divisor_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___potential_prime_copy_copy_ne_zero_copy;
                                end;
                                
                                while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___divisor_copy_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not___potential_prime_copy_copy_ne_zero or _not___divisor_copy_copy_ne_zero;
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
                        #< done _neither_are_zero = __potential_prime_copy_copy_ne_zero and __divisor_copy_copy_ne_zero;
                    end;
                    
                    
                    clear _difference;
                    
                    while __potential_prime_copy_copy_ne_zero not 0 do;
                        # __potential_prime_copy_copy_ne_zero is True, so _potential_prime_copy must be the larger
                        #> _difference = __potential_prime_copy_copy;
                            clear _difference;
                            #> _difference += __potential_prime_copy_copy;
                                clear ___potential_prime_copy_copy_holder;
                                
                                while __potential_prime_copy_copy not 0 do;
                                    incr _difference;
                                    incr ___potential_prime_copy_copy_holder;
                                    decr __potential_prime_copy_copy;
                                end;
                                
                                while ___potential_prime_copy_copy_holder not 0 do;
                                    incr __potential_prime_copy_copy;
                                    decr ___potential_prime_copy_copy_holder;
                                end;
                            #< done _difference += __potential_prime_copy_copy;
                        #< done _difference = __potential_prime_copy_copy;
                        clear __potential_prime_copy_copy_ne_zero;
                    end;
                    
                    while __divisor_copy_copy_ne_zero not 0 do;
                        # __divisor_copy_copy_ne_zero is True, so _divisor_copy must be the larger
                        #> _difference = __divisor_copy_copy;
                            clear _difference;
                            #> _difference += __divisor_copy_copy;
                                clear ___divisor_copy_copy_holder;
                                
                                while __divisor_copy_copy not 0 do;
                                    incr _difference;
                                    incr ___divisor_copy_copy_holder;
                                    decr __divisor_copy_copy;
                                end;
                                
                                while ___divisor_copy_copy_holder not 0 do;
                                    incr __divisor_copy_copy;
                                    decr ___divisor_copy_copy_holder;
                                end;
                            #< done _difference += __divisor_copy_copy;
                        #< done _difference = __divisor_copy_copy;
                        clear __divisor_copy_copy_ne_zero;
                    end;
                #< done _difference = abs(_divisor_copy - _potential_prime_copy);
                #> _divisor_plus_difference = _divisor_copy + _difference;
                    #> __divisor_copy_copy = _divisor_copy;
                        clear __divisor_copy_copy;
                        #> __divisor_copy_copy += _divisor_copy;
                            clear __divisor_copy_holder;
                            
                            while _divisor_copy not 0 do;
                                incr __divisor_copy_copy;
                                incr __divisor_copy_holder;
                                decr _divisor_copy;
                            end;
                            
                            while __divisor_copy_holder not 0 do;
                                incr _divisor_copy;
                                decr __divisor_copy_holder;
                            end;
                        #< done __divisor_copy_copy += _divisor_copy;
                    #< done __divisor_copy_copy = _divisor_copy;
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
                    clear _divisor_plus_difference;
                    #> _divisor_plus_difference += __divisor_copy_copy;
                        clear ___divisor_copy_copy_holder;
                        
                        while __divisor_copy_copy not 0 do;
                            incr _divisor_plus_difference;
                            incr ___divisor_copy_copy_holder;
                            decr __divisor_copy_copy;
                        end;
                        
                        while ___divisor_copy_copy_holder not 0 do;
                            incr __divisor_copy_copy;
                            decr ___divisor_copy_copy_holder;
                        end;
                    #< done _divisor_plus_difference += __divisor_copy_copy;
                    #> _divisor_plus_difference += __difference_copy;
                        clear ___difference_copy_holder;
                        
                        while __difference_copy not 0 do;
                            incr _divisor_plus_difference;
                            incr ___difference_copy_holder;
                            decr __difference_copy;
                        end;
                        
                        while ___difference_copy_holder not 0 do;
                            incr __difference_copy;
                            decr ___difference_copy_holder;
                        end;
                    #< done _divisor_plus_difference += __difference_copy;
                #< done _divisor_plus_difference = _divisor_copy + _difference;
                #> _divisor_plus_difference_eq_potential_prime = _divisor_plus_difference == potential_prime;
                    #> _difference = abs(_divisor_plus_difference - potential_prime);
                        #> __divisor_plus_difference_copy = _divisor_plus_difference;
                            clear __divisor_plus_difference_copy;
                            #> __divisor_plus_difference_copy += _divisor_plus_difference;
                                clear __divisor_plus_difference_holder;
                                
                                while _divisor_plus_difference not 0 do;
                                    incr __divisor_plus_difference_copy;
                                    incr __divisor_plus_difference_holder;
                                    decr _divisor_plus_difference;
                                end;
                                
                                while __divisor_plus_difference_holder not 0 do;
                                    incr _divisor_plus_difference;
                                    decr __divisor_plus_difference_holder;
                                end;
                            #< done __divisor_plus_difference_copy += _divisor_plus_difference;
                        #< done __divisor_plus_difference_copy = _divisor_plus_difference;
                        #> _potential_prime_copy = potential_prime;
                            clear _potential_prime_copy;
                            #> _potential_prime_copy += potential_prime;
                                clear _potential_prime_holder;
                                
                                while potential_prime not 0 do;
                                    incr _potential_prime_copy;
                                    incr _potential_prime_holder;
                                    decr potential_prime;
                                end;
                                
                                while _potential_prime_holder not 0 do;
                                    incr potential_prime;
                                    decr _potential_prime_holder;
                                end;
                            #< done _potential_prime_copy += potential_prime;
                        #< done _potential_prime_copy = potential_prime;
                        
                        #> __divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy != 0;
                            #> _not___divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy == 0;
                                #> ___divisor_plus_difference_copy_copy = __divisor_plus_difference_copy;
                                    clear ___divisor_plus_difference_copy_copy;
                                    #> ___divisor_plus_difference_copy_copy += __divisor_plus_difference_copy;
                                        clear ___divisor_plus_difference_copy_holder;
                                        
                                        while __divisor_plus_difference_copy not 0 do;
                                            incr ___divisor_plus_difference_copy_copy;
                                            incr ___divisor_plus_difference_copy_holder;
                                            decr __divisor_plus_difference_copy;
                                        end;
                                        
                                        while ___divisor_plus_difference_copy_holder not 0 do;
                                            incr __divisor_plus_difference_copy;
                                            decr ___divisor_plus_difference_copy_holder;
                                        end;
                                    #< done ___divisor_plus_difference_copy_copy += __divisor_plus_difference_copy;
                                #< done ___divisor_plus_difference_copy_copy = __divisor_plus_difference_copy;
                                
                                clear _not___divisor_plus_difference_copy_ne_zero;
                                incr _not___divisor_plus_difference_copy_ne_zero;
                                while ___divisor_plus_difference_copy_copy not 0 do;
                                    clear _not___divisor_plus_difference_copy_ne_zero;
                                    clear ___divisor_plus_difference_copy_copy;
                                end;
                            #< done _not___divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy == 0;
                            #> __divisor_plus_difference_copy_ne_zero = not _not___divisor_plus_difference_copy_ne_zero;
                                #> __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                    clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                    #> __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                        clear __not___divisor_plus_difference_copy_ne_zero_holder;
                                        
                                        while _not___divisor_plus_difference_copy_ne_zero not 0 do;
                                            incr __not___divisor_plus_difference_copy_ne_zero_copy;
                                            incr __not___divisor_plus_difference_copy_ne_zero_holder;
                                            decr _not___divisor_plus_difference_copy_ne_zero;
                                        end;
                                        
                                        while __not___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                            incr _not___divisor_plus_difference_copy_ne_zero;
                                            decr __not___divisor_plus_difference_copy_ne_zero_holder;
                                        end;
                                    #< done __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                #< done __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                
                                clear __divisor_plus_difference_copy_ne_zero;
                                incr __divisor_plus_difference_copy_ne_zero;
                                
                                while __not___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                    clear __divisor_plus_difference_copy_ne_zero;
                                    clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                end;
                            #< done __divisor_plus_difference_copy_ne_zero = not _not___divisor_plus_difference_copy_ne_zero;
                        #< done __divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy != 0;
                        #> _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                            #> _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                #> __potential_prime_copy_copy = _potential_prime_copy;
                                    clear __potential_prime_copy_copy;
                                    #> __potential_prime_copy_copy += _potential_prime_copy;
                                        clear __potential_prime_copy_holder;
                                        
                                        while _potential_prime_copy not 0 do;
                                            incr __potential_prime_copy_copy;
                                            incr __potential_prime_copy_holder;
                                            decr _potential_prime_copy;
                                        end;
                                        
                                        while __potential_prime_copy_holder not 0 do;
                                            incr _potential_prime_copy;
                                            decr __potential_prime_copy_holder;
                                        end;
                                    #< done __potential_prime_copy_copy += _potential_prime_copy;
                                #< done __potential_prime_copy_copy = _potential_prime_copy;
                                
                                clear _not__potential_prime_copy_ne_zero;
                                incr _not__potential_prime_copy_ne_zero;
                                while __potential_prime_copy_copy not 0 do;
                                    clear _not__potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_copy;
                                end;
                            #< done _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                            #> _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                                #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                    #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_holder;
                                        
                                        while _not__potential_prime_copy_ne_zero not 0 do;
                                            incr __not__potential_prime_copy_ne_zero_copy;
                                            incr __not__potential_prime_copy_ne_zero_holder;
                                            decr _not__potential_prime_copy_ne_zero;
                                        end;
                                        
                                        while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                            incr _not__potential_prime_copy_ne_zero;
                                            decr __not__potential_prime_copy_ne_zero_holder;
                                        end;
                                    #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                
                                clear _potential_prime_copy_ne_zero;
                                incr _potential_prime_copy_ne_zero;
                                
                                while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                    clear _potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                end;
                            #< done _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                        #< done _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                        #> _neither_are_zero = _potential_prime_copy_ne_zero and __divisor_plus_difference_copy_ne_zero;
                            # DeMorgan's:
                            #  (X and Y) = not ((not X) or (not Y))
                            #> _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                #> __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_ne_zero_copy;
                                    #> __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_ne_zero_holder;
                                        
                                        while _potential_prime_copy_ne_zero not 0 do;
                                            incr __potential_prime_copy_ne_zero_copy;
                                            incr __potential_prime_copy_ne_zero_holder;
                                            decr _potential_prime_copy_ne_zero;
                                        end;
                                        
                                        while __potential_prime_copy_ne_zero_holder not 0 do;
                                            incr _potential_prime_copy_ne_zero;
                                            decr __potential_prime_copy_ne_zero_holder;
                                        end;
                                    #< done __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                #< done __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                
                                clear _not__potential_prime_copy_ne_zero;
                                incr _not__potential_prime_copy_ne_zero;
                                
                                while __potential_prime_copy_ne_zero_copy not 0 do;
                                    clear _not__potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_ne_zero_copy;
                                end;
                            #< done _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                            #> _not___divisor_plus_difference_copy_ne_zero = not __divisor_plus_difference_copy_ne_zero;
                                #> ___divisor_plus_difference_copy_ne_zero_copy = __divisor_plus_difference_copy_ne_zero;
                                    clear ___divisor_plus_difference_copy_ne_zero_copy;
                                    #> ___divisor_plus_difference_copy_ne_zero_copy += __divisor_plus_difference_copy_ne_zero;
                                        clear ___divisor_plus_difference_copy_ne_zero_holder;
                                        
                                        while __divisor_plus_difference_copy_ne_zero not 0 do;
                                            incr ___divisor_plus_difference_copy_ne_zero_copy;
                                            incr ___divisor_plus_difference_copy_ne_zero_holder;
                                            decr __divisor_plus_difference_copy_ne_zero;
                                        end;
                                        
                                        while ___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                            incr __divisor_plus_difference_copy_ne_zero;
                                            decr ___divisor_plus_difference_copy_ne_zero_holder;
                                        end;
                                    #< done ___divisor_plus_difference_copy_ne_zero_copy += __divisor_plus_difference_copy_ne_zero;
                                #< done ___divisor_plus_difference_copy_ne_zero_copy = __divisor_plus_difference_copy_ne_zero;
                                
                                clear _not___divisor_plus_difference_copy_ne_zero;
                                incr _not___divisor_plus_difference_copy_ne_zero;
                                
                                while ___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                    clear _not___divisor_plus_difference_copy_ne_zero;
                                    clear ___divisor_plus_difference_copy_ne_zero_copy;
                                end;
                            #< done _not___divisor_plus_difference_copy_ne_zero = not __divisor_plus_difference_copy_ne_zero;
                            #> _inner_or = _not__potential_prime_copy_ne_zero or _not___divisor_plus_difference_copy_ne_zero;
                                #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                    #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_holder;
                                        
                                        while _not__potential_prime_copy_ne_zero not 0 do;
                                            incr __not__potential_prime_copy_ne_zero_copy;
                                            incr __not__potential_prime_copy_ne_zero_holder;
                                            decr _not__potential_prime_copy_ne_zero;
                                        end;
                                        
                                        while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                            incr _not__potential_prime_copy_ne_zero;
                                            decr __not__potential_prime_copy_ne_zero_holder;
                                        end;
                                    #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                #> __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                    clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                    #> __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                        clear __not___divisor_plus_difference_copy_ne_zero_holder;
                                        
                                        while _not___divisor_plus_difference_copy_ne_zero not 0 do;
                                            incr __not___divisor_plus_difference_copy_ne_zero_copy;
                                            incr __not___divisor_plus_difference_copy_ne_zero_holder;
                                            decr _not___divisor_plus_difference_copy_ne_zero;
                                        end;
                                        
                                        while __not___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                            incr _not___divisor_plus_difference_copy_ne_zero;
                                            decr __not___divisor_plus_difference_copy_ne_zero_holder;
                                        end;
                                    #< done __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                #< done __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                end;
                                
                                while __not___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not__potential_prime_copy_ne_zero or _not___divisor_plus_difference_copy_ne_zero;
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
                        #< done _neither_are_zero = _potential_prime_copy_ne_zero and __divisor_plus_difference_copy_ne_zero;
                        while _neither_are_zero not 0 do;
                            decr __divisor_plus_difference_copy;
                            decr _potential_prime_copy;
                            
                            #> __divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy != 0;
                                #> _not___divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy == 0;
                                    #> ___divisor_plus_difference_copy_copy = __divisor_plus_difference_copy;
                                        clear ___divisor_plus_difference_copy_copy;
                                        #> ___divisor_plus_difference_copy_copy += __divisor_plus_difference_copy;
                                            clear ___divisor_plus_difference_copy_holder;
                                            
                                            while __divisor_plus_difference_copy not 0 do;
                                                incr ___divisor_plus_difference_copy_copy;
                                                incr ___divisor_plus_difference_copy_holder;
                                                decr __divisor_plus_difference_copy;
                                            end;
                                            
                                            while ___divisor_plus_difference_copy_holder not 0 do;
                                                incr __divisor_plus_difference_copy;
                                                decr ___divisor_plus_difference_copy_holder;
                                            end;
                                        #< done ___divisor_plus_difference_copy_copy += __divisor_plus_difference_copy;
                                    #< done ___divisor_plus_difference_copy_copy = __divisor_plus_difference_copy;
                                    
                                    clear _not___divisor_plus_difference_copy_ne_zero;
                                    incr _not___divisor_plus_difference_copy_ne_zero;
                                    while ___divisor_plus_difference_copy_copy not 0 do;
                                        clear _not___divisor_plus_difference_copy_ne_zero;
                                        clear ___divisor_plus_difference_copy_copy;
                                    end;
                                #< done _not___divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy == 0;
                                #> __divisor_plus_difference_copy_ne_zero = not _not___divisor_plus_difference_copy_ne_zero;
                                    #> __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                        clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                        #> __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                            clear __not___divisor_plus_difference_copy_ne_zero_holder;
                                            
                                            while _not___divisor_plus_difference_copy_ne_zero not 0 do;
                                                incr __not___divisor_plus_difference_copy_ne_zero_copy;
                                                incr __not___divisor_plus_difference_copy_ne_zero_holder;
                                                decr _not___divisor_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while __not___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr _not___divisor_plus_difference_copy_ne_zero;
                                                decr __not___divisor_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                    #< done __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                    
                                    clear __divisor_plus_difference_copy_ne_zero;
                                    incr __divisor_plus_difference_copy_ne_zero;
                                    
                                    while __not___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear __divisor_plus_difference_copy_ne_zero;
                                        clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done __divisor_plus_difference_copy_ne_zero = not _not___divisor_plus_difference_copy_ne_zero;
                            #< done __divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy != 0;
                            #> _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                                #> _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                    #> __potential_prime_copy_copy = _potential_prime_copy;
                                        clear __potential_prime_copy_copy;
                                        #> __potential_prime_copy_copy += _potential_prime_copy;
                                            clear __potential_prime_copy_holder;
                                            
                                            while _potential_prime_copy not 0 do;
                                                incr __potential_prime_copy_copy;
                                                incr __potential_prime_copy_holder;
                                                decr _potential_prime_copy;
                                            end;
                                            
                                            while __potential_prime_copy_holder not 0 do;
                                                incr _potential_prime_copy;
                                                decr __potential_prime_copy_holder;
                                            end;
                                        #< done __potential_prime_copy_copy += _potential_prime_copy;
                                    #< done __potential_prime_copy_copy = _potential_prime_copy;
                                    
                                    clear _not__potential_prime_copy_ne_zero;
                                    incr _not__potential_prime_copy_ne_zero;
                                    while __potential_prime_copy_copy not 0 do;
                                        clear _not__potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_copy;
                                    end;
                                #< done _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                #> _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                                    #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                        #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                            clear __not__potential_prime_copy_ne_zero_holder;
                                            
                                            while _not__potential_prime_copy_ne_zero not 0 do;
                                                incr __not__potential_prime_copy_ne_zero_copy;
                                                incr __not__potential_prime_copy_ne_zero_holder;
                                                decr _not__potential_prime_copy_ne_zero;
                                            end;
                                            
                                            while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                                incr _not__potential_prime_copy_ne_zero;
                                                decr __not__potential_prime_copy_ne_zero_holder;
                                            end;
                                        #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                    #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    
                                    clear _potential_prime_copy_ne_zero;
                                    incr _potential_prime_copy_ne_zero;
                                    
                                    while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                        clear _potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                    end;
                                #< done _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                            #< done _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                            #> _neither_are_zero = _potential_prime_copy_ne_zero and __divisor_plus_difference_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                    #> __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_ne_zero_copy;
                                        #> __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                            clear __potential_prime_copy_ne_zero_holder;
                                            
                                            while _potential_prime_copy_ne_zero not 0 do;
                                                incr __potential_prime_copy_ne_zero_copy;
                                                incr __potential_prime_copy_ne_zero_holder;
                                                decr _potential_prime_copy_ne_zero;
                                            end;
                                            
                                            while __potential_prime_copy_ne_zero_holder not 0 do;
                                                incr _potential_prime_copy_ne_zero;
                                                decr __potential_prime_copy_ne_zero_holder;
                                            end;
                                        #< done __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                    #< done __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                    
                                    clear _not__potential_prime_copy_ne_zero;
                                    incr _not__potential_prime_copy_ne_zero;
                                    
                                    while __potential_prime_copy_ne_zero_copy not 0 do;
                                        clear _not__potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_ne_zero_copy;
                                    end;
                                #< done _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                #> _not___divisor_plus_difference_copy_ne_zero = not __divisor_plus_difference_copy_ne_zero;
                                    #> ___divisor_plus_difference_copy_ne_zero_copy = __divisor_plus_difference_copy_ne_zero;
                                        clear ___divisor_plus_difference_copy_ne_zero_copy;
                                        #> ___divisor_plus_difference_copy_ne_zero_copy += __divisor_plus_difference_copy_ne_zero;
                                            clear ___divisor_plus_difference_copy_ne_zero_holder;
                                            
                                            while __divisor_plus_difference_copy_ne_zero not 0 do;
                                                incr ___divisor_plus_difference_copy_ne_zero_copy;
                                                incr ___divisor_plus_difference_copy_ne_zero_holder;
                                                decr __divisor_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while ___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr __divisor_plus_difference_copy_ne_zero;
                                                decr ___divisor_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done ___divisor_plus_difference_copy_ne_zero_copy += __divisor_plus_difference_copy_ne_zero;
                                    #< done ___divisor_plus_difference_copy_ne_zero_copy = __divisor_plus_difference_copy_ne_zero;
                                    
                                    clear _not___divisor_plus_difference_copy_ne_zero;
                                    incr _not___divisor_plus_difference_copy_ne_zero;
                                    
                                    while ___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear _not___divisor_plus_difference_copy_ne_zero;
                                        clear ___divisor_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done _not___divisor_plus_difference_copy_ne_zero = not __divisor_plus_difference_copy_ne_zero;
                                #> _inner_or = _not__potential_prime_copy_ne_zero or _not___divisor_plus_difference_copy_ne_zero;
                                    #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                        #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                            clear __not__potential_prime_copy_ne_zero_holder;
                                            
                                            while _not__potential_prime_copy_ne_zero not 0 do;
                                                incr __not__potential_prime_copy_ne_zero_copy;
                                                incr __not__potential_prime_copy_ne_zero_holder;
                                                decr _not__potential_prime_copy_ne_zero;
                                            end;
                                            
                                            while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                                incr _not__potential_prime_copy_ne_zero;
                                                decr __not__potential_prime_copy_ne_zero_holder;
                                            end;
                                        #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                    #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    #> __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                        clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                        #> __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                            clear __not___divisor_plus_difference_copy_ne_zero_holder;
                                            
                                            while _not___divisor_plus_difference_copy_ne_zero not 0 do;
                                                incr __not___divisor_plus_difference_copy_ne_zero_copy;
                                                incr __not___divisor_plus_difference_copy_ne_zero_holder;
                                                decr _not___divisor_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while __not___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr _not___divisor_plus_difference_copy_ne_zero;
                                                decr __not___divisor_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                    #< done __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not__potential_prime_copy_ne_zero or _not___divisor_plus_difference_copy_ne_zero;
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
                            #< done _neither_are_zero = _potential_prime_copy_ne_zero and __divisor_plus_difference_copy_ne_zero;
                        end;
                        
                        
                        clear _difference;
                        
                        while _potential_prime_copy_ne_zero not 0 do;
                            # _potential_prime_copy_ne_zero is True, so potential_prime must be the larger
                            #> _difference = _potential_prime_copy;
                                clear _difference;
                                #> _difference += _potential_prime_copy;
                                    clear __potential_prime_copy_holder;
                                    
                                    while _potential_prime_copy not 0 do;
                                        incr _difference;
                                        incr __potential_prime_copy_holder;
                                        decr _potential_prime_copy;
                                    end;
                                    
                                    while __potential_prime_copy_holder not 0 do;
                                        incr _potential_prime_copy;
                                        decr __potential_prime_copy_holder;
                                    end;
                                #< done _difference += _potential_prime_copy;
                            #< done _difference = _potential_prime_copy;
                            clear _potential_prime_copy_ne_zero;
                        end;
                        
                        while __divisor_plus_difference_copy_ne_zero not 0 do;
                            # __divisor_plus_difference_copy_ne_zero is True, so _divisor_plus_difference must be the larger
                            #> _difference = __divisor_plus_difference_copy;
                                clear _difference;
                                #> _difference += __divisor_plus_difference_copy;
                                    clear ___divisor_plus_difference_copy_holder;
                                    
                                    while __divisor_plus_difference_copy not 0 do;
                                        incr _difference;
                                        incr ___divisor_plus_difference_copy_holder;
                                        decr __divisor_plus_difference_copy;
                                    end;
                                    
                                    while ___divisor_plus_difference_copy_holder not 0 do;
                                        incr __divisor_plus_difference_copy;
                                        decr ___divisor_plus_difference_copy_holder;
                                    end;
                                #< done _difference += __divisor_plus_difference_copy;
                            #< done _difference = __divisor_plus_difference_copy;
                            clear __divisor_plus_difference_copy_ne_zero;
                        end;
                    #< done _difference = abs(_divisor_plus_difference - potential_prime);
                    clear _divisor_plus_difference_eq_potential_prime;
                    incr _divisor_plus_difference_eq_potential_prime;
                    while _difference not 0 do;
                        clear _divisor_plus_difference_eq_potential_prime;
                        clear _difference;
                    end;
                    
                    # If _divisor_plus_difference == potential_prime, _divisor_plus_difference_eq_potential_prime = 1. Otherwise, _divisor_plus_difference_eq_potential_prime = 0
                #< done _divisor_plus_difference_eq_potential_prime = _divisor_plus_difference == potential_prime;
                # If X + abs(X - Y) == Y, Y was bigger, so false
                #> _divisor_gt_potential_prime = not _divisor_plus_difference_eq_potential_prime;
                    #> __divisor_plus_difference_eq_potential_prime_copy = _divisor_plus_difference_eq_potential_prime;
                        clear __divisor_plus_difference_eq_potential_prime_copy;
                        #> __divisor_plus_difference_eq_potential_prime_copy += _divisor_plus_difference_eq_potential_prime;
                            clear __divisor_plus_difference_eq_potential_prime_holder;
                            
                            while _divisor_plus_difference_eq_potential_prime not 0 do;
                                incr __divisor_plus_difference_eq_potential_prime_copy;
                                incr __divisor_plus_difference_eq_potential_prime_holder;
                                decr _divisor_plus_difference_eq_potential_prime;
                            end;
                            
                            while __divisor_plus_difference_eq_potential_prime_holder not 0 do;
                                incr _divisor_plus_difference_eq_potential_prime;
                                decr __divisor_plus_difference_eq_potential_prime_holder;
                            end;
                        #< done __divisor_plus_difference_eq_potential_prime_copy += _divisor_plus_difference_eq_potential_prime;
                    #< done __divisor_plus_difference_eq_potential_prime_copy = _divisor_plus_difference_eq_potential_prime;
                    
                    clear _divisor_gt_potential_prime;
                    incr _divisor_gt_potential_prime;
                    
                    while __divisor_plus_difference_eq_potential_prime_copy not 0 do;
                        clear _divisor_gt_potential_prime;
                        clear __divisor_plus_difference_eq_potential_prime_copy;
                    end;
                #< done _divisor_gt_potential_prime = not _divisor_plus_difference_eq_potential_prime;
            #< done _divisor_gt_potential_prime = divisor > potential_prime;
            #> _divisor_eq_potential_prime = divisor == potential_prime;
                #> _difference = abs(divisor - potential_prime);
                    #> _divisor_copy = divisor;
                        clear _divisor_copy;
                        #> _divisor_copy += divisor;
                            clear _divisor_holder;
                            
                            while divisor not 0 do;
                                incr _divisor_copy;
                                incr _divisor_holder;
                                decr divisor;
                            end;
                            
                            while _divisor_holder not 0 do;
                                incr divisor;
                                decr _divisor_holder;
                            end;
                        #< done _divisor_copy += divisor;
                    #< done _divisor_copy = divisor;
                    #> _potential_prime_copy = potential_prime;
                        clear _potential_prime_copy;
                        #> _potential_prime_copy += potential_prime;
                            clear _potential_prime_holder;
                            
                            while potential_prime not 0 do;
                                incr _potential_prime_copy;
                                incr _potential_prime_holder;
                                decr potential_prime;
                            end;
                            
                            while _potential_prime_holder not 0 do;
                                incr potential_prime;
                                decr _potential_prime_holder;
                            end;
                        #< done _potential_prime_copy += potential_prime;
                    #< done _potential_prime_copy = potential_prime;
                    
                    #> _divisor_copy_ne_zero = _divisor_copy != 0;
                        #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                            #> __divisor_copy_copy = _divisor_copy;
                                clear __divisor_copy_copy;
                                #> __divisor_copy_copy += _divisor_copy;
                                    clear __divisor_copy_holder;
                                    
                                    while _divisor_copy not 0 do;
                                        incr __divisor_copy_copy;
                                        incr __divisor_copy_holder;
                                        decr _divisor_copy;
                                    end;
                                    
                                    while __divisor_copy_holder not 0 do;
                                        incr _divisor_copy;
                                        decr __divisor_copy_holder;
                                    end;
                                #< done __divisor_copy_copy += _divisor_copy;
                            #< done __divisor_copy_copy = _divisor_copy;
                            
                            clear _not__divisor_copy_ne_zero;
                            incr _not__divisor_copy_ne_zero;
                            while __divisor_copy_copy not 0 do;
                                clear _not__divisor_copy_ne_zero;
                                clear __divisor_copy_copy;
                            end;
                        #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                        #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                            #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                clear __not__divisor_copy_ne_zero_copy;
                                #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                    clear __not__divisor_copy_ne_zero_holder;
                                    
                                    while _not__divisor_copy_ne_zero not 0 do;
                                        incr __not__divisor_copy_ne_zero_copy;
                                        incr __not__divisor_copy_ne_zero_holder;
                                        decr _not__divisor_copy_ne_zero;
                                    end;
                                    
                                    while __not__divisor_copy_ne_zero_holder not 0 do;
                                        incr _not__divisor_copy_ne_zero;
                                        decr __not__divisor_copy_ne_zero_holder;
                                    end;
                                #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                            #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                            
                            clear _divisor_copy_ne_zero;
                            incr _divisor_copy_ne_zero;
                            
                            while __not__divisor_copy_ne_zero_copy not 0 do;
                                clear _divisor_copy_ne_zero;
                                clear __not__divisor_copy_ne_zero_copy;
                            end;
                        #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                    #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                    #> _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                        #> _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                            #> __potential_prime_copy_copy = _potential_prime_copy;
                                clear __potential_prime_copy_copy;
                                #> __potential_prime_copy_copy += _potential_prime_copy;
                                    clear __potential_prime_copy_holder;
                                    
                                    while _potential_prime_copy not 0 do;
                                        incr __potential_prime_copy_copy;
                                        incr __potential_prime_copy_holder;
                                        decr _potential_prime_copy;
                                    end;
                                    
                                    while __potential_prime_copy_holder not 0 do;
                                        incr _potential_prime_copy;
                                        decr __potential_prime_copy_holder;
                                    end;
                                #< done __potential_prime_copy_copy += _potential_prime_copy;
                            #< done __potential_prime_copy_copy = _potential_prime_copy;
                            
                            clear _not__potential_prime_copy_ne_zero;
                            incr _not__potential_prime_copy_ne_zero;
                            while __potential_prime_copy_copy not 0 do;
                                clear _not__potential_prime_copy_ne_zero;
                                clear __potential_prime_copy_copy;
                            end;
                        #< done _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                        #> _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                            #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                clear __not__potential_prime_copy_ne_zero_copy;
                                #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_holder;
                                    
                                    while _not__potential_prime_copy_ne_zero not 0 do;
                                        incr __not__potential_prime_copy_ne_zero_copy;
                                        incr __not__potential_prime_copy_ne_zero_holder;
                                        decr _not__potential_prime_copy_ne_zero;
                                    end;
                                    
                                    while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                        incr _not__potential_prime_copy_ne_zero;
                                        decr __not__potential_prime_copy_ne_zero_holder;
                                    end;
                                #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                            #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                            
                            clear _potential_prime_copy_ne_zero;
                            incr _potential_prime_copy_ne_zero;
                            
                            while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                clear _potential_prime_copy_ne_zero;
                                clear __not__potential_prime_copy_ne_zero_copy;
                            end;
                        #< done _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                    #< done _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                    #> _neither_are_zero = _potential_prime_copy_ne_zero and _divisor_copy_ne_zero;
                        # DeMorgan's:
                        #  (X and Y) = not ((not X) or (not Y))
                        #> _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                            #> __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                clear __potential_prime_copy_ne_zero_copy;
                                #> __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_ne_zero_holder;
                                    
                                    while _potential_prime_copy_ne_zero not 0 do;
                                        incr __potential_prime_copy_ne_zero_copy;
                                        incr __potential_prime_copy_ne_zero_holder;
                                        decr _potential_prime_copy_ne_zero;
                                    end;
                                    
                                    while __potential_prime_copy_ne_zero_holder not 0 do;
                                        incr _potential_prime_copy_ne_zero;
                                        decr __potential_prime_copy_ne_zero_holder;
                                    end;
                                #< done __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                            #< done __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                            
                            clear _not__potential_prime_copy_ne_zero;
                            incr _not__potential_prime_copy_ne_zero;
                            
                            while __potential_prime_copy_ne_zero_copy not 0 do;
                                clear _not__potential_prime_copy_ne_zero;
                                clear __potential_prime_copy_ne_zero_copy;
                            end;
                        #< done _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                        #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                            #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                clear __divisor_copy_ne_zero_copy;
                                #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                    clear __divisor_copy_ne_zero_holder;
                                    
                                    while _divisor_copy_ne_zero not 0 do;
                                        incr __divisor_copy_ne_zero_copy;
                                        incr __divisor_copy_ne_zero_holder;
                                        decr _divisor_copy_ne_zero;
                                    end;
                                    
                                    while __divisor_copy_ne_zero_holder not 0 do;
                                        incr _divisor_copy_ne_zero;
                                        decr __divisor_copy_ne_zero_holder;
                                    end;
                                #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                            #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                            
                            clear _not__divisor_copy_ne_zero;
                            incr _not__divisor_copy_ne_zero;
                            
                            while __divisor_copy_ne_zero_copy not 0 do;
                                clear _not__divisor_copy_ne_zero;
                                clear __divisor_copy_ne_zero_copy;
                            end;
                        #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                        #> _inner_or = _not__potential_prime_copy_ne_zero or _not__divisor_copy_ne_zero;
                            #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                clear __not__potential_prime_copy_ne_zero_copy;
                                #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_holder;
                                    
                                    while _not__potential_prime_copy_ne_zero not 0 do;
                                        incr __not__potential_prime_copy_ne_zero_copy;
                                        incr __not__potential_prime_copy_ne_zero_holder;
                                        decr _not__potential_prime_copy_ne_zero;
                                    end;
                                    
                                    while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                        incr _not__potential_prime_copy_ne_zero;
                                        decr __not__potential_prime_copy_ne_zero_holder;
                                    end;
                                #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                            #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                            #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                clear __not__divisor_copy_ne_zero_copy;
                                #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                    clear __not__divisor_copy_ne_zero_holder;
                                    
                                    while _not__divisor_copy_ne_zero not 0 do;
                                        incr __not__divisor_copy_ne_zero_copy;
                                        incr __not__divisor_copy_ne_zero_holder;
                                        decr _not__divisor_copy_ne_zero;
                                    end;
                                    
                                    while __not__divisor_copy_ne_zero_holder not 0 do;
                                        incr _not__divisor_copy_ne_zero;
                                        decr __not__divisor_copy_ne_zero_holder;
                                    end;
                                #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                            #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                            clear _inner_or;
                            
                            while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not__potential_prime_copy_ne_zero_copy;
                            end;
                            
                            while __not__divisor_copy_ne_zero_copy not 0 do;
                                clear _inner_or;
                                incr _inner_or;
                                clear __not__divisor_copy_ne_zero_copy;
                            end;
                        #< done _inner_or = _not__potential_prime_copy_ne_zero or _not__divisor_copy_ne_zero;
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
                    #< done _neither_are_zero = _potential_prime_copy_ne_zero and _divisor_copy_ne_zero;
                    while _neither_are_zero not 0 do;
                        decr _divisor_copy;
                        decr _potential_prime_copy;
                        
                        #> _divisor_copy_ne_zero = _divisor_copy != 0;
                            #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                #> __divisor_copy_copy = _divisor_copy;
                                    clear __divisor_copy_copy;
                                    #> __divisor_copy_copy += _divisor_copy;
                                        clear __divisor_copy_holder;
                                        
                                        while _divisor_copy not 0 do;
                                            incr __divisor_copy_copy;
                                            incr __divisor_copy_holder;
                                            decr _divisor_copy;
                                        end;
                                        
                                        while __divisor_copy_holder not 0 do;
                                            incr _divisor_copy;
                                            decr __divisor_copy_holder;
                                        end;
                                    #< done __divisor_copy_copy += _divisor_copy;
                                #< done __divisor_copy_copy = _divisor_copy;
                                
                                clear _not__divisor_copy_ne_zero;
                                incr _not__divisor_copy_ne_zero;
                                while __divisor_copy_copy not 0 do;
                                    clear _not__divisor_copy_ne_zero;
                                    clear __divisor_copy_copy;
                                end;
                            #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                            #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                    clear __not__divisor_copy_ne_zero_copy;
                                    #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_holder;
                                        
                                        while _not__divisor_copy_ne_zero not 0 do;
                                            incr __not__divisor_copy_ne_zero_copy;
                                            incr __not__divisor_copy_ne_zero_holder;
                                            decr _not__divisor_copy_ne_zero;
                                        end;
                                        
                                        while __not__divisor_copy_ne_zero_holder not 0 do;
                                            incr _not__divisor_copy_ne_zero;
                                            decr __not__divisor_copy_ne_zero_holder;
                                        end;
                                    #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                
                                clear _divisor_copy_ne_zero;
                                incr _divisor_copy_ne_zero;
                                
                                while __not__divisor_copy_ne_zero_copy not 0 do;
                                    clear _divisor_copy_ne_zero;
                                    clear __not__divisor_copy_ne_zero_copy;
                                end;
                            #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                        #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                        #> _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                            #> _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                #> __potential_prime_copy_copy = _potential_prime_copy;
                                    clear __potential_prime_copy_copy;
                                    #> __potential_prime_copy_copy += _potential_prime_copy;
                                        clear __potential_prime_copy_holder;
                                        
                                        while _potential_prime_copy not 0 do;
                                            incr __potential_prime_copy_copy;
                                            incr __potential_prime_copy_holder;
                                            decr _potential_prime_copy;
                                        end;
                                        
                                        while __potential_prime_copy_holder not 0 do;
                                            incr _potential_prime_copy;
                                            decr __potential_prime_copy_holder;
                                        end;
                                    #< done __potential_prime_copy_copy += _potential_prime_copy;
                                #< done __potential_prime_copy_copy = _potential_prime_copy;
                                
                                clear _not__potential_prime_copy_ne_zero;
                                incr _not__potential_prime_copy_ne_zero;
                                while __potential_prime_copy_copy not 0 do;
                                    clear _not__potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_copy;
                                end;
                            #< done _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                            #> _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                                #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                    #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_holder;
                                        
                                        while _not__potential_prime_copy_ne_zero not 0 do;
                                            incr __not__potential_prime_copy_ne_zero_copy;
                                            incr __not__potential_prime_copy_ne_zero_holder;
                                            decr _not__potential_prime_copy_ne_zero;
                                        end;
                                        
                                        while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                            incr _not__potential_prime_copy_ne_zero;
                                            decr __not__potential_prime_copy_ne_zero_holder;
                                        end;
                                    #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                
                                clear _potential_prime_copy_ne_zero;
                                incr _potential_prime_copy_ne_zero;
                                
                                while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                    clear _potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                end;
                            #< done _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                        #< done _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                        #> _neither_are_zero = _potential_prime_copy_ne_zero and _divisor_copy_ne_zero;
                            # DeMorgan's:
                            #  (X and Y) = not ((not X) or (not Y))
                            #> _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                #> __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_ne_zero_copy;
                                    #> __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_ne_zero_holder;
                                        
                                        while _potential_prime_copy_ne_zero not 0 do;
                                            incr __potential_prime_copy_ne_zero_copy;
                                            incr __potential_prime_copy_ne_zero_holder;
                                            decr _potential_prime_copy_ne_zero;
                                        end;
                                        
                                        while __potential_prime_copy_ne_zero_holder not 0 do;
                                            incr _potential_prime_copy_ne_zero;
                                            decr __potential_prime_copy_ne_zero_holder;
                                        end;
                                    #< done __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                #< done __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                
                                clear _not__potential_prime_copy_ne_zero;
                                incr _not__potential_prime_copy_ne_zero;
                                
                                while __potential_prime_copy_ne_zero_copy not 0 do;
                                    clear _not__potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_ne_zero_copy;
                                end;
                            #< done _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                            #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                    clear __divisor_copy_ne_zero_copy;
                                    #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                        clear __divisor_copy_ne_zero_holder;
                                        
                                        while _divisor_copy_ne_zero not 0 do;
                                            incr __divisor_copy_ne_zero_copy;
                                            incr __divisor_copy_ne_zero_holder;
                                            decr _divisor_copy_ne_zero;
                                        end;
                                        
                                        while __divisor_copy_ne_zero_holder not 0 do;
                                            incr _divisor_copy_ne_zero;
                                            decr __divisor_copy_ne_zero_holder;
                                        end;
                                    #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                
                                clear _not__divisor_copy_ne_zero;
                                incr _not__divisor_copy_ne_zero;
                                
                                while __divisor_copy_ne_zero_copy not 0 do;
                                    clear _not__divisor_copy_ne_zero;
                                    clear __divisor_copy_ne_zero_copy;
                                end;
                            #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                            #> _inner_or = _not__potential_prime_copy_ne_zero or _not__divisor_copy_ne_zero;
                                #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                    #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_holder;
                                        
                                        while _not__potential_prime_copy_ne_zero not 0 do;
                                            incr __not__potential_prime_copy_ne_zero_copy;
                                            incr __not__potential_prime_copy_ne_zero_holder;
                                            decr _not__potential_prime_copy_ne_zero;
                                        end;
                                        
                                        while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                            incr _not__potential_prime_copy_ne_zero;
                                            decr __not__potential_prime_copy_ne_zero_holder;
                                        end;
                                    #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                    clear __not__divisor_copy_ne_zero_copy;
                                    #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_holder;
                                        
                                        while _not__divisor_copy_ne_zero not 0 do;
                                            incr __not__divisor_copy_ne_zero_copy;
                                            incr __not__divisor_copy_ne_zero_holder;
                                            decr _not__divisor_copy_ne_zero;
                                        end;
                                        
                                        while __not__divisor_copy_ne_zero_holder not 0 do;
                                            incr _not__divisor_copy_ne_zero;
                                            decr __not__divisor_copy_ne_zero_holder;
                                        end;
                                    #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                end;
                                
                                while __not__divisor_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__divisor_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not__potential_prime_copy_ne_zero or _not__divisor_copy_ne_zero;
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
                        #< done _neither_are_zero = _potential_prime_copy_ne_zero and _divisor_copy_ne_zero;
                    end;
                    
                    
                    clear _difference;
                    
                    while _potential_prime_copy_ne_zero not 0 do;
                        # _potential_prime_copy_ne_zero is True, so potential_prime must be the larger
                        #> _difference = _potential_prime_copy;
                            clear _difference;
                            #> _difference += _potential_prime_copy;
                                clear __potential_prime_copy_holder;
                                
                                while _potential_prime_copy not 0 do;
                                    incr _difference;
                                    incr __potential_prime_copy_holder;
                                    decr _potential_prime_copy;
                                end;
                                
                                while __potential_prime_copy_holder not 0 do;
                                    incr _potential_prime_copy;
                                    decr __potential_prime_copy_holder;
                                end;
                            #< done _difference += _potential_prime_copy;
                        #< done _difference = _potential_prime_copy;
                        clear _potential_prime_copy_ne_zero;
                    end;
                    
                    while _divisor_copy_ne_zero not 0 do;
                        # _divisor_copy_ne_zero is True, so divisor must be the larger
                        #> _difference = _divisor_copy;
                            clear _difference;
                            #> _difference += _divisor_copy;
                                clear __divisor_copy_holder;
                                
                                while _divisor_copy not 0 do;
                                    incr _difference;
                                    incr __divisor_copy_holder;
                                    decr _divisor_copy;
                                end;
                                
                                while __divisor_copy_holder not 0 do;
                                    incr _divisor_copy;
                                    decr __divisor_copy_holder;
                                end;
                            #< done _difference += _divisor_copy;
                        #< done _difference = _divisor_copy;
                        clear _divisor_copy_ne_zero;
                    end;
                #< done _difference = abs(divisor - potential_prime);
                clear _divisor_eq_potential_prime;
                incr _divisor_eq_potential_prime;
                while _difference not 0 do;
                    clear _divisor_eq_potential_prime;
                    clear _difference;
                end;
                
                # If divisor == potential_prime, _divisor_eq_potential_prime = 1. Otherwise, _divisor_eq_potential_prime = 0
            #< done _divisor_eq_potential_prime = divisor == potential_prime;
            #> _divisor_ge_potential_prime = _divisor_gt_potential_prime or _divisor_eq_potential_prime;
                #> __divisor_gt_potential_prime_copy = _divisor_gt_potential_prime;
                    clear __divisor_gt_potential_prime_copy;
                    #> __divisor_gt_potential_prime_copy += _divisor_gt_potential_prime;
                        clear __divisor_gt_potential_prime_holder;
                        
                        while _divisor_gt_potential_prime not 0 do;
                            incr __divisor_gt_potential_prime_copy;
                            incr __divisor_gt_potential_prime_holder;
                            decr _divisor_gt_potential_prime;
                        end;
                        
                        while __divisor_gt_potential_prime_holder not 0 do;
                            incr _divisor_gt_potential_prime;
                            decr __divisor_gt_potential_prime_holder;
                        end;
                    #< done __divisor_gt_potential_prime_copy += _divisor_gt_potential_prime;
                #< done __divisor_gt_potential_prime_copy = _divisor_gt_potential_prime;
                #> __divisor_eq_potential_prime_copy = _divisor_eq_potential_prime;
                    clear __divisor_eq_potential_prime_copy;
                    #> __divisor_eq_potential_prime_copy += _divisor_eq_potential_prime;
                        clear __divisor_eq_potential_prime_holder;
                        
                        while _divisor_eq_potential_prime not 0 do;
                            incr __divisor_eq_potential_prime_copy;
                            incr __divisor_eq_potential_prime_holder;
                            decr _divisor_eq_potential_prime;
                        end;
                        
                        while __divisor_eq_potential_prime_holder not 0 do;
                            incr _divisor_eq_potential_prime;
                            decr __divisor_eq_potential_prime_holder;
                        end;
                    #< done __divisor_eq_potential_prime_copy += _divisor_eq_potential_prime;
                #< done __divisor_eq_potential_prime_copy = _divisor_eq_potential_prime;
                clear _divisor_ge_potential_prime;
                
                while __divisor_gt_potential_prime_copy not 0 do;
                    clear _divisor_ge_potential_prime;
                    incr _divisor_ge_potential_prime;
                    clear __divisor_gt_potential_prime_copy;
                end;
                
                while __divisor_eq_potential_prime_copy not 0 do;
                    clear _divisor_ge_potential_prime;
                    incr _divisor_ge_potential_prime;
                    clear __divisor_eq_potential_prime_copy;
                end;
            #< done _divisor_ge_potential_prime = _divisor_gt_potential_prime or _divisor_eq_potential_prime;
        #< done _divisor_ge_potential_prime = divisor >= potential_prime;
        #> divisor_lt_potential_prime = not _divisor_ge_potential_prime;
            #> __divisor_ge_potential_prime_copy = _divisor_ge_potential_prime;
                clear __divisor_ge_potential_prime_copy;
                #> __divisor_ge_potential_prime_copy += _divisor_ge_potential_prime;
                    clear __divisor_ge_potential_prime_holder;
                    
                    while _divisor_ge_potential_prime not 0 do;
                        incr __divisor_ge_potential_prime_copy;
                        incr __divisor_ge_potential_prime_holder;
                        decr _divisor_ge_potential_prime;
                    end;
                    
                    while __divisor_ge_potential_prime_holder not 0 do;
                        incr _divisor_ge_potential_prime;
                        decr __divisor_ge_potential_prime_holder;
                    end;
                #< done __divisor_ge_potential_prime_copy += _divisor_ge_potential_prime;
            #< done __divisor_ge_potential_prime_copy = _divisor_ge_potential_prime;
            
            clear divisor_lt_potential_prime;
            incr divisor_lt_potential_prime;
            
            while __divisor_ge_potential_prime_copy not 0 do;
                clear divisor_lt_potential_prime;
                clear __divisor_ge_potential_prime_copy;
            end;
        #< done divisor_lt_potential_prime = not _divisor_ge_potential_prime;
    #< done divisor_lt_potential_prime = divisor < potential_prime;
    while divisor_lt_potential_prime not 0 do;
        #> remainder = potential_prime % divisor;
            #> _ r remainder = potential_prime / divisor;
                #_potential_prime_copy = potential_prime;
                #> _divisor_copy = divisor;
                    clear _divisor_copy;
                    #> _divisor_copy += divisor;
                        clear _divisor_holder;
                        
                        while divisor not 0 do;
                            incr _divisor_copy;
                            incr _divisor_holder;
                            decr divisor;
                        end;
                        
                        while _divisor_holder not 0 do;
                            incr divisor;
                            decr _divisor_holder;
                        end;
                    #< done _divisor_copy += divisor;
                #< done _divisor_copy = divisor;
                clear _;
                #clear remainder;
                
                #> remainder = potential_prime;
                    clear remainder;
                    #> remainder += potential_prime;
                        clear _potential_prime_holder;
                        
                        while potential_prime not 0 do;
                            incr remainder;
                            incr _potential_prime_holder;
                            decr potential_prime;
                        end;
                        
                        while _potential_prime_holder not 0 do;
                            incr potential_prime;
                            decr _potential_prime_holder;
                        end;
                    #< done remainder += potential_prime;
                #< done remainder = potential_prime;
                #> _remainder_ge_divisor = remainder >= divisor;
                    #> _remainder_gt_divisor = remainder > divisor;
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
                        #> _divisor_copy = divisor;
                            clear _divisor_copy;
                            #> _divisor_copy += divisor;
                                clear _divisor_holder;
                                
                                while divisor not 0 do;
                                    incr _divisor_copy;
                                    incr _divisor_holder;
                                    decr divisor;
                                end;
                                
                                while _divisor_holder not 0 do;
                                    incr divisor;
                                    decr _divisor_holder;
                                end;
                            #< done _divisor_copy += divisor;
                        #< done _divisor_copy = divisor;
                        
                        #> _difference = abs(_remainder_copy - _divisor_copy);
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
                            #> __divisor_copy_copy = _divisor_copy;
                                clear __divisor_copy_copy;
                                #> __divisor_copy_copy += _divisor_copy;
                                    clear __divisor_copy_holder;
                                    
                                    while _divisor_copy not 0 do;
                                        incr __divisor_copy_copy;
                                        incr __divisor_copy_holder;
                                        decr _divisor_copy;
                                    end;
                                    
                                    while __divisor_copy_holder not 0 do;
                                        incr _divisor_copy;
                                        decr __divisor_copy_holder;
                                    end;
                                #< done __divisor_copy_copy += _divisor_copy;
                            #< done __divisor_copy_copy = _divisor_copy;
                            
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
                            #> __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                                #> _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                    #> ___divisor_copy_copy_copy = __divisor_copy_copy;
                                        clear ___divisor_copy_copy_copy;
                                        #> ___divisor_copy_copy_copy += __divisor_copy_copy;
                                            clear ___divisor_copy_copy_holder;
                                            
                                            while __divisor_copy_copy not 0 do;
                                                incr ___divisor_copy_copy_copy;
                                                incr ___divisor_copy_copy_holder;
                                                decr __divisor_copy_copy;
                                            end;
                                            
                                            while ___divisor_copy_copy_holder not 0 do;
                                                incr __divisor_copy_copy;
                                                decr ___divisor_copy_copy_holder;
                                            end;
                                        #< done ___divisor_copy_copy_copy += __divisor_copy_copy;
                                    #< done ___divisor_copy_copy_copy = __divisor_copy_copy;
                                    
                                    clear _not___divisor_copy_copy_ne_zero;
                                    incr _not___divisor_copy_copy_ne_zero;
                                    while ___divisor_copy_copy_copy not 0 do;
                                        clear _not___divisor_copy_copy_ne_zero;
                                        clear ___divisor_copy_copy_copy;
                                    end;
                                #< done _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                #> __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                    #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_copy;
                                        #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_holder;
                                            
                                            while _not___divisor_copy_copy_ne_zero not 0 do;
                                                incr __not___divisor_copy_copy_ne_zero_copy;
                                                incr __not___divisor_copy_copy_ne_zero_holder;
                                                decr _not___divisor_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___divisor_copy_copy_ne_zero;
                                                decr __not___divisor_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                    #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                    
                                    clear __divisor_copy_copy_ne_zero;
                                    incr __divisor_copy_copy_ne_zero;
                                    
                                    while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                        clear __divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_copy;
                                    end;
                                #< done __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                            #< done __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                            #> _neither_are_zero = __divisor_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                                    #> ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                        clear ___divisor_copy_copy_ne_zero_copy;
                                        #> ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                            clear ___divisor_copy_copy_ne_zero_holder;
                                            
                                            while __divisor_copy_copy_ne_zero not 0 do;
                                                incr ___divisor_copy_copy_ne_zero_copy;
                                                incr ___divisor_copy_copy_ne_zero_holder;
                                                decr __divisor_copy_copy_ne_zero;
                                            end;
                                            
                                            while ___divisor_copy_copy_ne_zero_holder not 0 do;
                                                incr __divisor_copy_copy_ne_zero;
                                                decr ___divisor_copy_copy_ne_zero_holder;
                                            end;
                                        #< done ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                    #< done ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                    
                                    clear _not___divisor_copy_copy_ne_zero;
                                    incr _not___divisor_copy_copy_ne_zero;
                                    
                                    while ___divisor_copy_copy_ne_zero_copy not 0 do;
                                        clear _not___divisor_copy_copy_ne_zero;
                                        clear ___divisor_copy_copy_ne_zero_copy;
                                    end;
                                #< done _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
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
                                #> _inner_or = _not___divisor_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
                                    #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_copy;
                                        #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_holder;
                                            
                                            while _not___divisor_copy_copy_ne_zero not 0 do;
                                                incr __not___divisor_copy_copy_ne_zero_copy;
                                                incr __not___divisor_copy_copy_ne_zero_holder;
                                                decr _not___divisor_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___divisor_copy_copy_ne_zero;
                                                decr __not___divisor_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                    #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
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
                                    
                                    while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___divisor_copy_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___remainder_copy_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not___divisor_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
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
                            #< done _neither_are_zero = __divisor_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                            while _neither_are_zero not 0 do;
                                decr __remainder_copy_copy;
                                decr __divisor_copy_copy;
                                
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
                                #> __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                                    #> _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                        #> ___divisor_copy_copy_copy = __divisor_copy_copy;
                                            clear ___divisor_copy_copy_copy;
                                            #> ___divisor_copy_copy_copy += __divisor_copy_copy;
                                                clear ___divisor_copy_copy_holder;
                                                
                                                while __divisor_copy_copy not 0 do;
                                                    incr ___divisor_copy_copy_copy;
                                                    incr ___divisor_copy_copy_holder;
                                                    decr __divisor_copy_copy;
                                                end;
                                                
                                                while ___divisor_copy_copy_holder not 0 do;
                                                    incr __divisor_copy_copy;
                                                    decr ___divisor_copy_copy_holder;
                                                end;
                                            #< done ___divisor_copy_copy_copy += __divisor_copy_copy;
                                        #< done ___divisor_copy_copy_copy = __divisor_copy_copy;
                                        
                                        clear _not___divisor_copy_copy_ne_zero;
                                        incr _not___divisor_copy_copy_ne_zero;
                                        while ___divisor_copy_copy_copy not 0 do;
                                            clear _not___divisor_copy_copy_ne_zero;
                                            clear ___divisor_copy_copy_copy;
                                        end;
                                    #< done _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                    #> __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                        #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_copy;
                                            #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                                clear __not___divisor_copy_copy_ne_zero_holder;
                                                
                                                while _not___divisor_copy_copy_ne_zero not 0 do;
                                                    incr __not___divisor_copy_copy_ne_zero_copy;
                                                    incr __not___divisor_copy_copy_ne_zero_holder;
                                                    decr _not___divisor_copy_copy_ne_zero;
                                                end;
                                                
                                                while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                    incr _not___divisor_copy_copy_ne_zero;
                                                    decr __not___divisor_copy_copy_ne_zero_holder;
                                                end;
                                            #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                        #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                        
                                        clear __divisor_copy_copy_ne_zero;
                                        incr __divisor_copy_copy_ne_zero;
                                        
                                        while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                            clear __divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_copy;
                                        end;
                                    #< done __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                #< done __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                                #> _neither_are_zero = __divisor_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                                        #> ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                            clear ___divisor_copy_copy_ne_zero_copy;
                                            #> ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                                clear ___divisor_copy_copy_ne_zero_holder;
                                                
                                                while __divisor_copy_copy_ne_zero not 0 do;
                                                    incr ___divisor_copy_copy_ne_zero_copy;
                                                    incr ___divisor_copy_copy_ne_zero_holder;
                                                    decr __divisor_copy_copy_ne_zero;
                                                end;
                                                
                                                while ___divisor_copy_copy_ne_zero_holder not 0 do;
                                                    incr __divisor_copy_copy_ne_zero;
                                                    decr ___divisor_copy_copy_ne_zero_holder;
                                                end;
                                            #< done ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                        #< done ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                        
                                        clear _not___divisor_copy_copy_ne_zero;
                                        incr _not___divisor_copy_copy_ne_zero;
                                        
                                        while ___divisor_copy_copy_ne_zero_copy not 0 do;
                                            clear _not___divisor_copy_copy_ne_zero;
                                            clear ___divisor_copy_copy_ne_zero_copy;
                                        end;
                                    #< done _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
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
                                    #> _inner_or = _not___divisor_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
                                        #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_copy;
                                            #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                                clear __not___divisor_copy_copy_ne_zero_holder;
                                                
                                                while _not___divisor_copy_copy_ne_zero not 0 do;
                                                    incr __not___divisor_copy_copy_ne_zero_copy;
                                                    incr __not___divisor_copy_copy_ne_zero_holder;
                                                    decr _not___divisor_copy_copy_ne_zero;
                                                end;
                                                
                                                while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                    incr _not___divisor_copy_copy_ne_zero;
                                                    decr __not___divisor_copy_copy_ne_zero_holder;
                                                end;
                                            #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                        #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
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
                                        
                                        while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___divisor_copy_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___remainder_copy_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not___divisor_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
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
                                #< done _neither_are_zero = __divisor_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                            end;
                            
                            
                            clear _difference;
                            
                            while __divisor_copy_copy_ne_zero not 0 do;
                                # __divisor_copy_copy_ne_zero is True, so _divisor_copy must be the larger
                                #> _difference = __divisor_copy_copy;
                                    clear _difference;
                                    #> _difference += __divisor_copy_copy;
                                        clear ___divisor_copy_copy_holder;
                                        
                                        while __divisor_copy_copy not 0 do;
                                            incr _difference;
                                            incr ___divisor_copy_copy_holder;
                                            decr __divisor_copy_copy;
                                        end;
                                        
                                        while ___divisor_copy_copy_holder not 0 do;
                                            incr __divisor_copy_copy;
                                            decr ___divisor_copy_copy_holder;
                                        end;
                                    #< done _difference += __divisor_copy_copy;
                                #< done _difference = __divisor_copy_copy;
                                clear __divisor_copy_copy_ne_zero;
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
                        #< done _difference = abs(_remainder_copy - _divisor_copy);
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
                        #> _remainder_plus_difference_eq_divisor = _remainder_plus_difference == divisor;
                            #> _difference = abs(_remainder_plus_difference - divisor);
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
                                #> _divisor_copy = divisor;
                                    clear _divisor_copy;
                                    #> _divisor_copy += divisor;
                                        clear _divisor_holder;
                                        
                                        while divisor not 0 do;
                                            incr _divisor_copy;
                                            incr _divisor_holder;
                                            decr divisor;
                                        end;
                                        
                                        while _divisor_holder not 0 do;
                                            incr divisor;
                                            decr _divisor_holder;
                                        end;
                                    #< done _divisor_copy += divisor;
                                #< done _divisor_copy = divisor;
                                
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
                                #> _divisor_copy_ne_zero = _divisor_copy != 0;
                                    #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                        #> __divisor_copy_copy = _divisor_copy;
                                            clear __divisor_copy_copy;
                                            #> __divisor_copy_copy += _divisor_copy;
                                                clear __divisor_copy_holder;
                                                
                                                while _divisor_copy not 0 do;
                                                    incr __divisor_copy_copy;
                                                    incr __divisor_copy_holder;
                                                    decr _divisor_copy;
                                                end;
                                                
                                                while __divisor_copy_holder not 0 do;
                                                    incr _divisor_copy;
                                                    decr __divisor_copy_holder;
                                                end;
                                            #< done __divisor_copy_copy += _divisor_copy;
                                        #< done __divisor_copy_copy = _divisor_copy;
                                        
                                        clear _not__divisor_copy_ne_zero;
                                        incr _not__divisor_copy_ne_zero;
                                        while __divisor_copy_copy not 0 do;
                                            clear _not__divisor_copy_ne_zero;
                                            clear __divisor_copy_copy;
                                        end;
                                    #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                    #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                        #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_copy;
                                            #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_holder;
                                                
                                                while _not__divisor_copy_ne_zero not 0 do;
                                                    incr __not__divisor_copy_ne_zero_copy;
                                                    incr __not__divisor_copy_ne_zero_holder;
                                                    decr _not__divisor_copy_ne_zero;
                                                end;
                                                
                                                while __not__divisor_copy_ne_zero_holder not 0 do;
                                                    incr _not__divisor_copy_ne_zero;
                                                    decr __not__divisor_copy_ne_zero_holder;
                                                end;
                                            #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                        
                                        clear _divisor_copy_ne_zero;
                                        incr _divisor_copy_ne_zero;
                                        
                                        while __not__divisor_copy_ne_zero_copy not 0 do;
                                            clear _divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_copy;
                                        end;
                                    #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                                #> _neither_are_zero = _divisor_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                        #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                            clear __divisor_copy_ne_zero_copy;
                                            #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                                clear __divisor_copy_ne_zero_holder;
                                                
                                                while _divisor_copy_ne_zero not 0 do;
                                                    incr __divisor_copy_ne_zero_copy;
                                                    incr __divisor_copy_ne_zero_holder;
                                                    decr _divisor_copy_ne_zero;
                                                end;
                                                
                                                while __divisor_copy_ne_zero_holder not 0 do;
                                                    incr _divisor_copy_ne_zero;
                                                    decr __divisor_copy_ne_zero_holder;
                                                end;
                                            #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                        #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                        
                                        clear _not__divisor_copy_ne_zero;
                                        incr _not__divisor_copy_ne_zero;
                                        
                                        while __divisor_copy_ne_zero_copy not 0 do;
                                            clear _not__divisor_copy_ne_zero;
                                            clear __divisor_copy_ne_zero_copy;
                                        end;
                                    #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
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
                                    #> _inner_or = _not__divisor_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
                                        #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_copy;
                                            #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_holder;
                                                
                                                while _not__divisor_copy_ne_zero not 0 do;
                                                    incr __not__divisor_copy_ne_zero_copy;
                                                    incr __not__divisor_copy_ne_zero_holder;
                                                    decr _not__divisor_copy_ne_zero;
                                                end;
                                                
                                                while __not__divisor_copy_ne_zero_holder not 0 do;
                                                    incr _not__divisor_copy_ne_zero;
                                                    decr __not__divisor_copy_ne_zero_holder;
                                                end;
                                            #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
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
                                        
                                        while __not__divisor_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not__divisor_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not__divisor_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
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
                                #< done _neither_are_zero = _divisor_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                while _neither_are_zero not 0 do;
                                    decr __remainder_plus_difference_copy;
                                    decr _divisor_copy;
                                    
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
                                    #> _divisor_copy_ne_zero = _divisor_copy != 0;
                                        #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                            #> __divisor_copy_copy = _divisor_copy;
                                                clear __divisor_copy_copy;
                                                #> __divisor_copy_copy += _divisor_copy;
                                                    clear __divisor_copy_holder;
                                                    
                                                    while _divisor_copy not 0 do;
                                                        incr __divisor_copy_copy;
                                                        incr __divisor_copy_holder;
                                                        decr _divisor_copy;
                                                    end;
                                                    
                                                    while __divisor_copy_holder not 0 do;
                                                        incr _divisor_copy;
                                                        decr __divisor_copy_holder;
                                                    end;
                                                #< done __divisor_copy_copy += _divisor_copy;
                                            #< done __divisor_copy_copy = _divisor_copy;
                                            
                                            clear _not__divisor_copy_ne_zero;
                                            incr _not__divisor_copy_ne_zero;
                                            while __divisor_copy_copy not 0 do;
                                                clear _not__divisor_copy_ne_zero;
                                                clear __divisor_copy_copy;
                                            end;
                                        #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                        #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                            #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_copy;
                                                #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                    clear __not__divisor_copy_ne_zero_holder;
                                                    
                                                    while _not__divisor_copy_ne_zero not 0 do;
                                                        incr __not__divisor_copy_ne_zero_copy;
                                                        incr __not__divisor_copy_ne_zero_holder;
                                                        decr _not__divisor_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not__divisor_copy_ne_zero_holder not 0 do;
                                                        incr _not__divisor_copy_ne_zero;
                                                        decr __not__divisor_copy_ne_zero_holder;
                                                    end;
                                                #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                            
                                            clear _divisor_copy_ne_zero;
                                            incr _divisor_copy_ne_zero;
                                            
                                            while __not__divisor_copy_ne_zero_copy not 0 do;
                                                clear _divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_copy;
                                            end;
                                        #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                    #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                                    #> _neither_are_zero = _divisor_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                        # DeMorgan's:
                                        #  (X and Y) = not ((not X) or (not Y))
                                        #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                            #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                                clear __divisor_copy_ne_zero_copy;
                                                #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                                    clear __divisor_copy_ne_zero_holder;
                                                    
                                                    while _divisor_copy_ne_zero not 0 do;
                                                        incr __divisor_copy_ne_zero_copy;
                                                        incr __divisor_copy_ne_zero_holder;
                                                        decr _divisor_copy_ne_zero;
                                                    end;
                                                    
                                                    while __divisor_copy_ne_zero_holder not 0 do;
                                                        incr _divisor_copy_ne_zero;
                                                        decr __divisor_copy_ne_zero_holder;
                                                    end;
                                                #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                            #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                            
                                            clear _not__divisor_copy_ne_zero;
                                            incr _not__divisor_copy_ne_zero;
                                            
                                            while __divisor_copy_ne_zero_copy not 0 do;
                                                clear _not__divisor_copy_ne_zero;
                                                clear __divisor_copy_ne_zero_copy;
                                            end;
                                        #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
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
                                        #> _inner_or = _not__divisor_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
                                            #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_copy;
                                                #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                    clear __not__divisor_copy_ne_zero_holder;
                                                    
                                                    while _not__divisor_copy_ne_zero not 0 do;
                                                        incr __not__divisor_copy_ne_zero_copy;
                                                        incr __not__divisor_copy_ne_zero_holder;
                                                        decr _not__divisor_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not__divisor_copy_ne_zero_holder not 0 do;
                                                        incr _not__divisor_copy_ne_zero;
                                                        decr __not__divisor_copy_ne_zero_holder;
                                                    end;
                                                #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
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
                                            
                                            while __not__divisor_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not__divisor_copy_ne_zero_copy;
                                            end;
                                            
                                            while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                            end;
                                        #< done _inner_or = _not__divisor_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
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
                                    #< done _neither_are_zero = _divisor_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                end;
                                
                                
                                clear _difference;
                                
                                while _divisor_copy_ne_zero not 0 do;
                                    # _divisor_copy_ne_zero is True, so divisor must be the larger
                                    #> _difference = _divisor_copy;
                                        clear _difference;
                                        #> _difference += _divisor_copy;
                                            clear __divisor_copy_holder;
                                            
                                            while _divisor_copy not 0 do;
                                                incr _difference;
                                                incr __divisor_copy_holder;
                                                decr _divisor_copy;
                                            end;
                                            
                                            while __divisor_copy_holder not 0 do;
                                                incr _divisor_copy;
                                                decr __divisor_copy_holder;
                                            end;
                                        #< done _difference += _divisor_copy;
                                    #< done _difference = _divisor_copy;
                                    clear _divisor_copy_ne_zero;
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
                            #< done _difference = abs(_remainder_plus_difference - divisor);
                            clear _remainder_plus_difference_eq_divisor;
                            incr _remainder_plus_difference_eq_divisor;
                            while _difference not 0 do;
                                clear _remainder_plus_difference_eq_divisor;
                                clear _difference;
                            end;
                            
                            # If _remainder_plus_difference == divisor, _remainder_plus_difference_eq_divisor = 1. Otherwise, _remainder_plus_difference_eq_divisor = 0
                        #< done _remainder_plus_difference_eq_divisor = _remainder_plus_difference == divisor;
                        # If X + abs(X - Y) == Y, Y was bigger, so false
                        #> _remainder_gt_divisor = not _remainder_plus_difference_eq_divisor;
                            #> __remainder_plus_difference_eq_divisor_copy = _remainder_plus_difference_eq_divisor;
                                clear __remainder_plus_difference_eq_divisor_copy;
                                #> __remainder_plus_difference_eq_divisor_copy += _remainder_plus_difference_eq_divisor;
                                    clear __remainder_plus_difference_eq_divisor_holder;
                                    
                                    while _remainder_plus_difference_eq_divisor not 0 do;
                                        incr __remainder_plus_difference_eq_divisor_copy;
                                        incr __remainder_plus_difference_eq_divisor_holder;
                                        decr _remainder_plus_difference_eq_divisor;
                                    end;
                                    
                                    while __remainder_plus_difference_eq_divisor_holder not 0 do;
                                        incr _remainder_plus_difference_eq_divisor;
                                        decr __remainder_plus_difference_eq_divisor_holder;
                                    end;
                                #< done __remainder_plus_difference_eq_divisor_copy += _remainder_plus_difference_eq_divisor;
                            #< done __remainder_plus_difference_eq_divisor_copy = _remainder_plus_difference_eq_divisor;
                            
                            clear _remainder_gt_divisor;
                            incr _remainder_gt_divisor;
                            
                            while __remainder_plus_difference_eq_divisor_copy not 0 do;
                                clear _remainder_gt_divisor;
                                clear __remainder_plus_difference_eq_divisor_copy;
                            end;
                        #< done _remainder_gt_divisor = not _remainder_plus_difference_eq_divisor;
                    #< done _remainder_gt_divisor = remainder > divisor;
                    #> _remainder_eq_divisor = remainder == divisor;
                        #> _difference = abs(remainder - divisor);
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
                            #> _divisor_copy = divisor;
                                clear _divisor_copy;
                                #> _divisor_copy += divisor;
                                    clear _divisor_holder;
                                    
                                    while divisor not 0 do;
                                        incr _divisor_copy;
                                        incr _divisor_holder;
                                        decr divisor;
                                    end;
                                    
                                    while _divisor_holder not 0 do;
                                        incr divisor;
                                        decr _divisor_holder;
                                    end;
                                #< done _divisor_copy += divisor;
                            #< done _divisor_copy = divisor;
                            
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
                            #> _divisor_copy_ne_zero = _divisor_copy != 0;
                                #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                    #> __divisor_copy_copy = _divisor_copy;
                                        clear __divisor_copy_copy;
                                        #> __divisor_copy_copy += _divisor_copy;
                                            clear __divisor_copy_holder;
                                            
                                            while _divisor_copy not 0 do;
                                                incr __divisor_copy_copy;
                                                incr __divisor_copy_holder;
                                                decr _divisor_copy;
                                            end;
                                            
                                            while __divisor_copy_holder not 0 do;
                                                incr _divisor_copy;
                                                decr __divisor_copy_holder;
                                            end;
                                        #< done __divisor_copy_copy += _divisor_copy;
                                    #< done __divisor_copy_copy = _divisor_copy;
                                    
                                    clear _not__divisor_copy_ne_zero;
                                    incr _not__divisor_copy_ne_zero;
                                    while __divisor_copy_copy not 0 do;
                                        clear _not__divisor_copy_ne_zero;
                                        clear __divisor_copy_copy;
                                    end;
                                #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                    #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_copy;
                                        #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_holder;
                                            
                                            while _not__divisor_copy_ne_zero not 0 do;
                                                incr __not__divisor_copy_ne_zero_copy;
                                                incr __not__divisor_copy_ne_zero_holder;
                                                decr _not__divisor_copy_ne_zero;
                                            end;
                                            
                                            while __not__divisor_copy_ne_zero_holder not 0 do;
                                                incr _not__divisor_copy_ne_zero;
                                                decr __not__divisor_copy_ne_zero_holder;
                                            end;
                                        #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                    #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                    
                                    clear _divisor_copy_ne_zero;
                                    incr _divisor_copy_ne_zero;
                                    
                                    while __not__divisor_copy_ne_zero_copy not 0 do;
                                        clear _divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_copy;
                                    end;
                                #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                            #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                            #> _neither_are_zero = _divisor_copy_ne_zero and _remainder_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                    #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                        clear __divisor_copy_ne_zero_copy;
                                        #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                            clear __divisor_copy_ne_zero_holder;
                                            
                                            while _divisor_copy_ne_zero not 0 do;
                                                incr __divisor_copy_ne_zero_copy;
                                                incr __divisor_copy_ne_zero_holder;
                                                decr _divisor_copy_ne_zero;
                                            end;
                                            
                                            while __divisor_copy_ne_zero_holder not 0 do;
                                                incr _divisor_copy_ne_zero;
                                                decr __divisor_copy_ne_zero_holder;
                                            end;
                                        #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                    #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                    
                                    clear _not__divisor_copy_ne_zero;
                                    incr _not__divisor_copy_ne_zero;
                                    
                                    while __divisor_copy_ne_zero_copy not 0 do;
                                        clear _not__divisor_copy_ne_zero;
                                        clear __divisor_copy_ne_zero_copy;
                                    end;
                                #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
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
                                #> _inner_or = _not__divisor_copy_ne_zero or _not__remainder_copy_ne_zero;
                                    #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_copy;
                                        #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_holder;
                                            
                                            while _not__divisor_copy_ne_zero not 0 do;
                                                incr __not__divisor_copy_ne_zero_copy;
                                                incr __not__divisor_copy_ne_zero_holder;
                                                decr _not__divisor_copy_ne_zero;
                                            end;
                                            
                                            while __not__divisor_copy_ne_zero_holder not 0 do;
                                                incr _not__divisor_copy_ne_zero;
                                                decr __not__divisor_copy_ne_zero_holder;
                                            end;
                                        #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                    #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
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
                                    
                                    while __not__divisor_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not__divisor_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not__remainder_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not__remainder_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not__divisor_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                            #< done _neither_are_zero = _divisor_copy_ne_zero and _remainder_copy_ne_zero;
                            while _neither_are_zero not 0 do;
                                decr _remainder_copy;
                                decr _divisor_copy;
                                
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
                                #> _divisor_copy_ne_zero = _divisor_copy != 0;
                                    #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                        #> __divisor_copy_copy = _divisor_copy;
                                            clear __divisor_copy_copy;
                                            #> __divisor_copy_copy += _divisor_copy;
                                                clear __divisor_copy_holder;
                                                
                                                while _divisor_copy not 0 do;
                                                    incr __divisor_copy_copy;
                                                    incr __divisor_copy_holder;
                                                    decr _divisor_copy;
                                                end;
                                                
                                                while __divisor_copy_holder not 0 do;
                                                    incr _divisor_copy;
                                                    decr __divisor_copy_holder;
                                                end;
                                            #< done __divisor_copy_copy += _divisor_copy;
                                        #< done __divisor_copy_copy = _divisor_copy;
                                        
                                        clear _not__divisor_copy_ne_zero;
                                        incr _not__divisor_copy_ne_zero;
                                        while __divisor_copy_copy not 0 do;
                                            clear _not__divisor_copy_ne_zero;
                                            clear __divisor_copy_copy;
                                        end;
                                    #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                    #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                        #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_copy;
                                            #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_holder;
                                                
                                                while _not__divisor_copy_ne_zero not 0 do;
                                                    incr __not__divisor_copy_ne_zero_copy;
                                                    incr __not__divisor_copy_ne_zero_holder;
                                                    decr _not__divisor_copy_ne_zero;
                                                end;
                                                
                                                while __not__divisor_copy_ne_zero_holder not 0 do;
                                                    incr _not__divisor_copy_ne_zero;
                                                    decr __not__divisor_copy_ne_zero_holder;
                                                end;
                                            #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                        
                                        clear _divisor_copy_ne_zero;
                                        incr _divisor_copy_ne_zero;
                                        
                                        while __not__divisor_copy_ne_zero_copy not 0 do;
                                            clear _divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_copy;
                                        end;
                                    #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                                #> _neither_are_zero = _divisor_copy_ne_zero and _remainder_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                        #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                            clear __divisor_copy_ne_zero_copy;
                                            #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                                clear __divisor_copy_ne_zero_holder;
                                                
                                                while _divisor_copy_ne_zero not 0 do;
                                                    incr __divisor_copy_ne_zero_copy;
                                                    incr __divisor_copy_ne_zero_holder;
                                                    decr _divisor_copy_ne_zero;
                                                end;
                                                
                                                while __divisor_copy_ne_zero_holder not 0 do;
                                                    incr _divisor_copy_ne_zero;
                                                    decr __divisor_copy_ne_zero_holder;
                                                end;
                                            #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                        #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                        
                                        clear _not__divisor_copy_ne_zero;
                                        incr _not__divisor_copy_ne_zero;
                                        
                                        while __divisor_copy_ne_zero_copy not 0 do;
                                            clear _not__divisor_copy_ne_zero;
                                            clear __divisor_copy_ne_zero_copy;
                                        end;
                                    #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
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
                                    #> _inner_or = _not__divisor_copy_ne_zero or _not__remainder_copy_ne_zero;
                                        #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_copy;
                                            #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_holder;
                                                
                                                while _not__divisor_copy_ne_zero not 0 do;
                                                    incr __not__divisor_copy_ne_zero_copy;
                                                    incr __not__divisor_copy_ne_zero_holder;
                                                    decr _not__divisor_copy_ne_zero;
                                                end;
                                                
                                                while __not__divisor_copy_ne_zero_holder not 0 do;
                                                    incr _not__divisor_copy_ne_zero;
                                                    decr __not__divisor_copy_ne_zero_holder;
                                                end;
                                            #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
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
                                        
                                        while __not__divisor_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not__divisor_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not__remainder_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not__remainder_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not__divisor_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                                #< done _neither_are_zero = _divisor_copy_ne_zero and _remainder_copy_ne_zero;
                            end;
                            
                            
                            clear _difference;
                            
                            while _divisor_copy_ne_zero not 0 do;
                                # _divisor_copy_ne_zero is True, so divisor must be the larger
                                #> _difference = _divisor_copy;
                                    clear _difference;
                                    #> _difference += _divisor_copy;
                                        clear __divisor_copy_holder;
                                        
                                        while _divisor_copy not 0 do;
                                            incr _difference;
                                            incr __divisor_copy_holder;
                                            decr _divisor_copy;
                                        end;
                                        
                                        while __divisor_copy_holder not 0 do;
                                            incr _divisor_copy;
                                            decr __divisor_copy_holder;
                                        end;
                                    #< done _difference += _divisor_copy;
                                #< done _difference = _divisor_copy;
                                clear _divisor_copy_ne_zero;
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
                        #< done _difference = abs(remainder - divisor);
                        clear _remainder_eq_divisor;
                        incr _remainder_eq_divisor;
                        while _difference not 0 do;
                            clear _remainder_eq_divisor;
                            clear _difference;
                        end;
                        
                        # If remainder == divisor, _remainder_eq_divisor = 1. Otherwise, _remainder_eq_divisor = 0
                    #< done _remainder_eq_divisor = remainder == divisor;
                    #> _remainder_ge_divisor = _remainder_gt_divisor or _remainder_eq_divisor;
                        #> __remainder_gt_divisor_copy = _remainder_gt_divisor;
                            clear __remainder_gt_divisor_copy;
                            #> __remainder_gt_divisor_copy += _remainder_gt_divisor;
                                clear __remainder_gt_divisor_holder;
                                
                                while _remainder_gt_divisor not 0 do;
                                    incr __remainder_gt_divisor_copy;
                                    incr __remainder_gt_divisor_holder;
                                    decr _remainder_gt_divisor;
                                end;
                                
                                while __remainder_gt_divisor_holder not 0 do;
                                    incr _remainder_gt_divisor;
                                    decr __remainder_gt_divisor_holder;
                                end;
                            #< done __remainder_gt_divisor_copy += _remainder_gt_divisor;
                        #< done __remainder_gt_divisor_copy = _remainder_gt_divisor;
                        #> __remainder_eq_divisor_copy = _remainder_eq_divisor;
                            clear __remainder_eq_divisor_copy;
                            #> __remainder_eq_divisor_copy += _remainder_eq_divisor;
                                clear __remainder_eq_divisor_holder;
                                
                                while _remainder_eq_divisor not 0 do;
                                    incr __remainder_eq_divisor_copy;
                                    incr __remainder_eq_divisor_holder;
                                    decr _remainder_eq_divisor;
                                end;
                                
                                while __remainder_eq_divisor_holder not 0 do;
                                    incr _remainder_eq_divisor;
                                    decr __remainder_eq_divisor_holder;
                                end;
                            #< done __remainder_eq_divisor_copy += _remainder_eq_divisor;
                        #< done __remainder_eq_divisor_copy = _remainder_eq_divisor;
                        clear _remainder_ge_divisor;
                        
                        while __remainder_gt_divisor_copy not 0 do;
                            clear _remainder_ge_divisor;
                            incr _remainder_ge_divisor;
                            clear __remainder_gt_divisor_copy;
                        end;
                        
                        while __remainder_eq_divisor_copy not 0 do;
                            clear _remainder_ge_divisor;
                            incr _remainder_ge_divisor;
                            clear __remainder_eq_divisor_copy;
                        end;
                    #< done _remainder_ge_divisor = _remainder_gt_divisor or _remainder_eq_divisor;
                #< done _remainder_ge_divisor = remainder >= divisor;
                while _remainder_ge_divisor not 0 do;
                    incr _;
                    #> remainder -= divisor;
                        clear _divisor_holder;
                        
                        while divisor not 0 do;
                            decr remainder;
                            incr _divisor_holder;
                            decr divisor;
                        end;
                        
                        while _divisor_holder not 0 do;
                            incr divisor;
                            decr _divisor_holder;
                        end;
                    #< done remainder -= divisor;
                    
                    #> _remainder_ge_divisor = remainder >= divisor;
                        #> _remainder_gt_divisor = remainder > divisor;
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
                            #> _divisor_copy = divisor;
                                clear _divisor_copy;
                                #> _divisor_copy += divisor;
                                    clear _divisor_holder;
                                    
                                    while divisor not 0 do;
                                        incr _divisor_copy;
                                        incr _divisor_holder;
                                        decr divisor;
                                    end;
                                    
                                    while _divisor_holder not 0 do;
                                        incr divisor;
                                        decr _divisor_holder;
                                    end;
                                #< done _divisor_copy += divisor;
                            #< done _divisor_copy = divisor;
                            
                            #> _difference = abs(_remainder_copy - _divisor_copy);
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
                                #> __divisor_copy_copy = _divisor_copy;
                                    clear __divisor_copy_copy;
                                    #> __divisor_copy_copy += _divisor_copy;
                                        clear __divisor_copy_holder;
                                        
                                        while _divisor_copy not 0 do;
                                            incr __divisor_copy_copy;
                                            incr __divisor_copy_holder;
                                            decr _divisor_copy;
                                        end;
                                        
                                        while __divisor_copy_holder not 0 do;
                                            incr _divisor_copy;
                                            decr __divisor_copy_holder;
                                        end;
                                    #< done __divisor_copy_copy += _divisor_copy;
                                #< done __divisor_copy_copy = _divisor_copy;
                                
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
                                #> __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                                    #> _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                        #> ___divisor_copy_copy_copy = __divisor_copy_copy;
                                            clear ___divisor_copy_copy_copy;
                                            #> ___divisor_copy_copy_copy += __divisor_copy_copy;
                                                clear ___divisor_copy_copy_holder;
                                                
                                                while __divisor_copy_copy not 0 do;
                                                    incr ___divisor_copy_copy_copy;
                                                    incr ___divisor_copy_copy_holder;
                                                    decr __divisor_copy_copy;
                                                end;
                                                
                                                while ___divisor_copy_copy_holder not 0 do;
                                                    incr __divisor_copy_copy;
                                                    decr ___divisor_copy_copy_holder;
                                                end;
                                            #< done ___divisor_copy_copy_copy += __divisor_copy_copy;
                                        #< done ___divisor_copy_copy_copy = __divisor_copy_copy;
                                        
                                        clear _not___divisor_copy_copy_ne_zero;
                                        incr _not___divisor_copy_copy_ne_zero;
                                        while ___divisor_copy_copy_copy not 0 do;
                                            clear _not___divisor_copy_copy_ne_zero;
                                            clear ___divisor_copy_copy_copy;
                                        end;
                                    #< done _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                    #> __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                        #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_copy;
                                            #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                                clear __not___divisor_copy_copy_ne_zero_holder;
                                                
                                                while _not___divisor_copy_copy_ne_zero not 0 do;
                                                    incr __not___divisor_copy_copy_ne_zero_copy;
                                                    incr __not___divisor_copy_copy_ne_zero_holder;
                                                    decr _not___divisor_copy_copy_ne_zero;
                                                end;
                                                
                                                while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                    incr _not___divisor_copy_copy_ne_zero;
                                                    decr __not___divisor_copy_copy_ne_zero_holder;
                                                end;
                                            #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                        #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                        
                                        clear __divisor_copy_copy_ne_zero;
                                        incr __divisor_copy_copy_ne_zero;
                                        
                                        while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                            clear __divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_copy;
                                        end;
                                    #< done __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                #< done __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                                #> _neither_are_zero = __divisor_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                                        #> ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                            clear ___divisor_copy_copy_ne_zero_copy;
                                            #> ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                                clear ___divisor_copy_copy_ne_zero_holder;
                                                
                                                while __divisor_copy_copy_ne_zero not 0 do;
                                                    incr ___divisor_copy_copy_ne_zero_copy;
                                                    incr ___divisor_copy_copy_ne_zero_holder;
                                                    decr __divisor_copy_copy_ne_zero;
                                                end;
                                                
                                                while ___divisor_copy_copy_ne_zero_holder not 0 do;
                                                    incr __divisor_copy_copy_ne_zero;
                                                    decr ___divisor_copy_copy_ne_zero_holder;
                                                end;
                                            #< done ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                        #< done ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                        
                                        clear _not___divisor_copy_copy_ne_zero;
                                        incr _not___divisor_copy_copy_ne_zero;
                                        
                                        while ___divisor_copy_copy_ne_zero_copy not 0 do;
                                            clear _not___divisor_copy_copy_ne_zero;
                                            clear ___divisor_copy_copy_ne_zero_copy;
                                        end;
                                    #< done _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
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
                                    #> _inner_or = _not___divisor_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
                                        #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_copy;
                                            #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                                clear __not___divisor_copy_copy_ne_zero_holder;
                                                
                                                while _not___divisor_copy_copy_ne_zero not 0 do;
                                                    incr __not___divisor_copy_copy_ne_zero_copy;
                                                    incr __not___divisor_copy_copy_ne_zero_holder;
                                                    decr _not___divisor_copy_copy_ne_zero;
                                                end;
                                                
                                                while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                    incr _not___divisor_copy_copy_ne_zero;
                                                    decr __not___divisor_copy_copy_ne_zero_holder;
                                                end;
                                            #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                        #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
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
                                        
                                        while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___divisor_copy_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___remainder_copy_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not___divisor_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
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
                                #< done _neither_are_zero = __divisor_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                                while _neither_are_zero not 0 do;
                                    decr __remainder_copy_copy;
                                    decr __divisor_copy_copy;
                                    
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
                                    #> __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                                        #> _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                            #> ___divisor_copy_copy_copy = __divisor_copy_copy;
                                                clear ___divisor_copy_copy_copy;
                                                #> ___divisor_copy_copy_copy += __divisor_copy_copy;
                                                    clear ___divisor_copy_copy_holder;
                                                    
                                                    while __divisor_copy_copy not 0 do;
                                                        incr ___divisor_copy_copy_copy;
                                                        incr ___divisor_copy_copy_holder;
                                                        decr __divisor_copy_copy;
                                                    end;
                                                    
                                                    while ___divisor_copy_copy_holder not 0 do;
                                                        incr __divisor_copy_copy;
                                                        decr ___divisor_copy_copy_holder;
                                                    end;
                                                #< done ___divisor_copy_copy_copy += __divisor_copy_copy;
                                            #< done ___divisor_copy_copy_copy = __divisor_copy_copy;
                                            
                                            clear _not___divisor_copy_copy_ne_zero;
                                            incr _not___divisor_copy_copy_ne_zero;
                                            while ___divisor_copy_copy_copy not 0 do;
                                                clear _not___divisor_copy_copy_ne_zero;
                                                clear ___divisor_copy_copy_copy;
                                            end;
                                        #< done _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                        #> __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                            #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                                clear __not___divisor_copy_copy_ne_zero_copy;
                                                #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                                    clear __not___divisor_copy_copy_ne_zero_holder;
                                                    
                                                    while _not___divisor_copy_copy_ne_zero not 0 do;
                                                        incr __not___divisor_copy_copy_ne_zero_copy;
                                                        incr __not___divisor_copy_copy_ne_zero_holder;
                                                        decr _not___divisor_copy_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                        incr _not___divisor_copy_copy_ne_zero;
                                                        decr __not___divisor_copy_copy_ne_zero_holder;
                                                    end;
                                                #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                            #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                            
                                            clear __divisor_copy_copy_ne_zero;
                                            incr __divisor_copy_copy_ne_zero;
                                            
                                            while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                                clear __divisor_copy_copy_ne_zero;
                                                clear __not___divisor_copy_copy_ne_zero_copy;
                                            end;
                                        #< done __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                    #< done __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                                    #> _neither_are_zero = __divisor_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                                        # DeMorgan's:
                                        #  (X and Y) = not ((not X) or (not Y))
                                        #> _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                                            #> ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                                clear ___divisor_copy_copy_ne_zero_copy;
                                                #> ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                                    clear ___divisor_copy_copy_ne_zero_holder;
                                                    
                                                    while __divisor_copy_copy_ne_zero not 0 do;
                                                        incr ___divisor_copy_copy_ne_zero_copy;
                                                        incr ___divisor_copy_copy_ne_zero_holder;
                                                        decr __divisor_copy_copy_ne_zero;
                                                    end;
                                                    
                                                    while ___divisor_copy_copy_ne_zero_holder not 0 do;
                                                        incr __divisor_copy_copy_ne_zero;
                                                        decr ___divisor_copy_copy_ne_zero_holder;
                                                    end;
                                                #< done ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                            #< done ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                            
                                            clear _not___divisor_copy_copy_ne_zero;
                                            incr _not___divisor_copy_copy_ne_zero;
                                            
                                            while ___divisor_copy_copy_ne_zero_copy not 0 do;
                                                clear _not___divisor_copy_copy_ne_zero;
                                                clear ___divisor_copy_copy_ne_zero_copy;
                                            end;
                                        #< done _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
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
                                        #> _inner_or = _not___divisor_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
                                            #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                                clear __not___divisor_copy_copy_ne_zero_copy;
                                                #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                                    clear __not___divisor_copy_copy_ne_zero_holder;
                                                    
                                                    while _not___divisor_copy_copy_ne_zero not 0 do;
                                                        incr __not___divisor_copy_copy_ne_zero_copy;
                                                        incr __not___divisor_copy_copy_ne_zero_holder;
                                                        decr _not___divisor_copy_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                        incr _not___divisor_copy_copy_ne_zero;
                                                        decr __not___divisor_copy_copy_ne_zero_holder;
                                                    end;
                                                #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                            #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
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
                                            
                                            while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not___divisor_copy_copy_ne_zero_copy;
                                            end;
                                            
                                            while __not___remainder_copy_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not___remainder_copy_copy_ne_zero_copy;
                                            end;
                                        #< done _inner_or = _not___divisor_copy_copy_ne_zero or _not___remainder_copy_copy_ne_zero;
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
                                    #< done _neither_are_zero = __divisor_copy_copy_ne_zero and __remainder_copy_copy_ne_zero;
                                end;
                                
                                
                                clear _difference;
                                
                                while __divisor_copy_copy_ne_zero not 0 do;
                                    # __divisor_copy_copy_ne_zero is True, so _divisor_copy must be the larger
                                    #> _difference = __divisor_copy_copy;
                                        clear _difference;
                                        #> _difference += __divisor_copy_copy;
                                            clear ___divisor_copy_copy_holder;
                                            
                                            while __divisor_copy_copy not 0 do;
                                                incr _difference;
                                                incr ___divisor_copy_copy_holder;
                                                decr __divisor_copy_copy;
                                            end;
                                            
                                            while ___divisor_copy_copy_holder not 0 do;
                                                incr __divisor_copy_copy;
                                                decr ___divisor_copy_copy_holder;
                                            end;
                                        #< done _difference += __divisor_copy_copy;
                                    #< done _difference = __divisor_copy_copy;
                                    clear __divisor_copy_copy_ne_zero;
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
                            #< done _difference = abs(_remainder_copy - _divisor_copy);
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
                            #> _remainder_plus_difference_eq_divisor = _remainder_plus_difference == divisor;
                                #> _difference = abs(_remainder_plus_difference - divisor);
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
                                    #> _divisor_copy = divisor;
                                        clear _divisor_copy;
                                        #> _divisor_copy += divisor;
                                            clear _divisor_holder;
                                            
                                            while divisor not 0 do;
                                                incr _divisor_copy;
                                                incr _divisor_holder;
                                                decr divisor;
                                            end;
                                            
                                            while _divisor_holder not 0 do;
                                                incr divisor;
                                                decr _divisor_holder;
                                            end;
                                        #< done _divisor_copy += divisor;
                                    #< done _divisor_copy = divisor;
                                    
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
                                    #> _divisor_copy_ne_zero = _divisor_copy != 0;
                                        #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                            #> __divisor_copy_copy = _divisor_copy;
                                                clear __divisor_copy_copy;
                                                #> __divisor_copy_copy += _divisor_copy;
                                                    clear __divisor_copy_holder;
                                                    
                                                    while _divisor_copy not 0 do;
                                                        incr __divisor_copy_copy;
                                                        incr __divisor_copy_holder;
                                                        decr _divisor_copy;
                                                    end;
                                                    
                                                    while __divisor_copy_holder not 0 do;
                                                        incr _divisor_copy;
                                                        decr __divisor_copy_holder;
                                                    end;
                                                #< done __divisor_copy_copy += _divisor_copy;
                                            #< done __divisor_copy_copy = _divisor_copy;
                                            
                                            clear _not__divisor_copy_ne_zero;
                                            incr _not__divisor_copy_ne_zero;
                                            while __divisor_copy_copy not 0 do;
                                                clear _not__divisor_copy_ne_zero;
                                                clear __divisor_copy_copy;
                                            end;
                                        #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                        #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                            #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_copy;
                                                #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                    clear __not__divisor_copy_ne_zero_holder;
                                                    
                                                    while _not__divisor_copy_ne_zero not 0 do;
                                                        incr __not__divisor_copy_ne_zero_copy;
                                                        incr __not__divisor_copy_ne_zero_holder;
                                                        decr _not__divisor_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not__divisor_copy_ne_zero_holder not 0 do;
                                                        incr _not__divisor_copy_ne_zero;
                                                        decr __not__divisor_copy_ne_zero_holder;
                                                    end;
                                                #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                            
                                            clear _divisor_copy_ne_zero;
                                            incr _divisor_copy_ne_zero;
                                            
                                            while __not__divisor_copy_ne_zero_copy not 0 do;
                                                clear _divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_copy;
                                            end;
                                        #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                    #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                                    #> _neither_are_zero = _divisor_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                        # DeMorgan's:
                                        #  (X and Y) = not ((not X) or (not Y))
                                        #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                            #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                                clear __divisor_copy_ne_zero_copy;
                                                #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                                    clear __divisor_copy_ne_zero_holder;
                                                    
                                                    while _divisor_copy_ne_zero not 0 do;
                                                        incr __divisor_copy_ne_zero_copy;
                                                        incr __divisor_copy_ne_zero_holder;
                                                        decr _divisor_copy_ne_zero;
                                                    end;
                                                    
                                                    while __divisor_copy_ne_zero_holder not 0 do;
                                                        incr _divisor_copy_ne_zero;
                                                        decr __divisor_copy_ne_zero_holder;
                                                    end;
                                                #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                            #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                            
                                            clear _not__divisor_copy_ne_zero;
                                            incr _not__divisor_copy_ne_zero;
                                            
                                            while __divisor_copy_ne_zero_copy not 0 do;
                                                clear _not__divisor_copy_ne_zero;
                                                clear __divisor_copy_ne_zero_copy;
                                            end;
                                        #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
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
                                        #> _inner_or = _not__divisor_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
                                            #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_copy;
                                                #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                    clear __not__divisor_copy_ne_zero_holder;
                                                    
                                                    while _not__divisor_copy_ne_zero not 0 do;
                                                        incr __not__divisor_copy_ne_zero_copy;
                                                        incr __not__divisor_copy_ne_zero_holder;
                                                        decr _not__divisor_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not__divisor_copy_ne_zero_holder not 0 do;
                                                        incr _not__divisor_copy_ne_zero;
                                                        decr __not__divisor_copy_ne_zero_holder;
                                                    end;
                                                #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
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
                                            
                                            while __not__divisor_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not__divisor_copy_ne_zero_copy;
                                            end;
                                            
                                            while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                            end;
                                        #< done _inner_or = _not__divisor_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
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
                                    #< done _neither_are_zero = _divisor_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                    while _neither_are_zero not 0 do;
                                        decr __remainder_plus_difference_copy;
                                        decr _divisor_copy;
                                        
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
                                        #> _divisor_copy_ne_zero = _divisor_copy != 0;
                                            #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                                #> __divisor_copy_copy = _divisor_copy;
                                                    clear __divisor_copy_copy;
                                                    #> __divisor_copy_copy += _divisor_copy;
                                                        clear __divisor_copy_holder;
                                                        
                                                        while _divisor_copy not 0 do;
                                                            incr __divisor_copy_copy;
                                                            incr __divisor_copy_holder;
                                                            decr _divisor_copy;
                                                        end;
                                                        
                                                        while __divisor_copy_holder not 0 do;
                                                            incr _divisor_copy;
                                                            decr __divisor_copy_holder;
                                                        end;
                                                    #< done __divisor_copy_copy += _divisor_copy;
                                                #< done __divisor_copy_copy = _divisor_copy;
                                                
                                                clear _not__divisor_copy_ne_zero;
                                                incr _not__divisor_copy_ne_zero;
                                                while __divisor_copy_copy not 0 do;
                                                    clear _not__divisor_copy_ne_zero;
                                                    clear __divisor_copy_copy;
                                                end;
                                            #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                            #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                                #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                                    clear __not__divisor_copy_ne_zero_copy;
                                                    #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                        clear __not__divisor_copy_ne_zero_holder;
                                                        
                                                        while _not__divisor_copy_ne_zero not 0 do;
                                                            incr __not__divisor_copy_ne_zero_copy;
                                                            incr __not__divisor_copy_ne_zero_holder;
                                                            decr _not__divisor_copy_ne_zero;
                                                        end;
                                                        
                                                        while __not__divisor_copy_ne_zero_holder not 0 do;
                                                            incr _not__divisor_copy_ne_zero;
                                                            decr __not__divisor_copy_ne_zero_holder;
                                                        end;
                                                    #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                                
                                                clear _divisor_copy_ne_zero;
                                                incr _divisor_copy_ne_zero;
                                                
                                                while __not__divisor_copy_ne_zero_copy not 0 do;
                                                    clear _divisor_copy_ne_zero;
                                                    clear __not__divisor_copy_ne_zero_copy;
                                                end;
                                            #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                        #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                                        #> _neither_are_zero = _divisor_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                            # DeMorgan's:
                                            #  (X and Y) = not ((not X) or (not Y))
                                            #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                                #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                                    clear __divisor_copy_ne_zero_copy;
                                                    #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                                        clear __divisor_copy_ne_zero_holder;
                                                        
                                                        while _divisor_copy_ne_zero not 0 do;
                                                            incr __divisor_copy_ne_zero_copy;
                                                            incr __divisor_copy_ne_zero_holder;
                                                            decr _divisor_copy_ne_zero;
                                                        end;
                                                        
                                                        while __divisor_copy_ne_zero_holder not 0 do;
                                                            incr _divisor_copy_ne_zero;
                                                            decr __divisor_copy_ne_zero_holder;
                                                        end;
                                                    #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                                #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                                
                                                clear _not__divisor_copy_ne_zero;
                                                incr _not__divisor_copy_ne_zero;
                                                
                                                while __divisor_copy_ne_zero_copy not 0 do;
                                                    clear _not__divisor_copy_ne_zero;
                                                    clear __divisor_copy_ne_zero_copy;
                                                end;
                                            #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
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
                                            #> _inner_or = _not__divisor_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
                                                #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                                    clear __not__divisor_copy_ne_zero_copy;
                                                    #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                        clear __not__divisor_copy_ne_zero_holder;
                                                        
                                                        while _not__divisor_copy_ne_zero not 0 do;
                                                            incr __not__divisor_copy_ne_zero_copy;
                                                            incr __not__divisor_copy_ne_zero_holder;
                                                            decr _not__divisor_copy_ne_zero;
                                                        end;
                                                        
                                                        while __not__divisor_copy_ne_zero_holder not 0 do;
                                                            incr _not__divisor_copy_ne_zero;
                                                            decr __not__divisor_copy_ne_zero_holder;
                                                        end;
                                                    #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
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
                                                
                                                while __not__divisor_copy_ne_zero_copy not 0 do;
                                                    clear _inner_or;
                                                    incr _inner_or;
                                                    clear __not__divisor_copy_ne_zero_copy;
                                                end;
                                                
                                                while __not___remainder_plus_difference_copy_ne_zero_copy not 0 do;
                                                    clear _inner_or;
                                                    incr _inner_or;
                                                    clear __not___remainder_plus_difference_copy_ne_zero_copy;
                                                end;
                                            #< done _inner_or = _not__divisor_copy_ne_zero or _not___remainder_plus_difference_copy_ne_zero;
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
                                        #< done _neither_are_zero = _divisor_copy_ne_zero and __remainder_plus_difference_copy_ne_zero;
                                    end;
                                    
                                    
                                    clear _difference;
                                    
                                    while _divisor_copy_ne_zero not 0 do;
                                        # _divisor_copy_ne_zero is True, so divisor must be the larger
                                        #> _difference = _divisor_copy;
                                            clear _difference;
                                            #> _difference += _divisor_copy;
                                                clear __divisor_copy_holder;
                                                
                                                while _divisor_copy not 0 do;
                                                    incr _difference;
                                                    incr __divisor_copy_holder;
                                                    decr _divisor_copy;
                                                end;
                                                
                                                while __divisor_copy_holder not 0 do;
                                                    incr _divisor_copy;
                                                    decr __divisor_copy_holder;
                                                end;
                                            #< done _difference += _divisor_copy;
                                        #< done _difference = _divisor_copy;
                                        clear _divisor_copy_ne_zero;
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
                                #< done _difference = abs(_remainder_plus_difference - divisor);
                                clear _remainder_plus_difference_eq_divisor;
                                incr _remainder_plus_difference_eq_divisor;
                                while _difference not 0 do;
                                    clear _remainder_plus_difference_eq_divisor;
                                    clear _difference;
                                end;
                                
                                # If _remainder_plus_difference == divisor, _remainder_plus_difference_eq_divisor = 1. Otherwise, _remainder_plus_difference_eq_divisor = 0
                            #< done _remainder_plus_difference_eq_divisor = _remainder_plus_difference == divisor;
                            # If X + abs(X - Y) == Y, Y was bigger, so false
                            #> _remainder_gt_divisor = not _remainder_plus_difference_eq_divisor;
                                #> __remainder_plus_difference_eq_divisor_copy = _remainder_plus_difference_eq_divisor;
                                    clear __remainder_plus_difference_eq_divisor_copy;
                                    #> __remainder_plus_difference_eq_divisor_copy += _remainder_plus_difference_eq_divisor;
                                        clear __remainder_plus_difference_eq_divisor_holder;
                                        
                                        while _remainder_plus_difference_eq_divisor not 0 do;
                                            incr __remainder_plus_difference_eq_divisor_copy;
                                            incr __remainder_plus_difference_eq_divisor_holder;
                                            decr _remainder_plus_difference_eq_divisor;
                                        end;
                                        
                                        while __remainder_plus_difference_eq_divisor_holder not 0 do;
                                            incr _remainder_plus_difference_eq_divisor;
                                            decr __remainder_plus_difference_eq_divisor_holder;
                                        end;
                                    #< done __remainder_plus_difference_eq_divisor_copy += _remainder_plus_difference_eq_divisor;
                                #< done __remainder_plus_difference_eq_divisor_copy = _remainder_plus_difference_eq_divisor;
                                
                                clear _remainder_gt_divisor;
                                incr _remainder_gt_divisor;
                                
                                while __remainder_plus_difference_eq_divisor_copy not 0 do;
                                    clear _remainder_gt_divisor;
                                    clear __remainder_plus_difference_eq_divisor_copy;
                                end;
                            #< done _remainder_gt_divisor = not _remainder_plus_difference_eq_divisor;
                        #< done _remainder_gt_divisor = remainder > divisor;
                        #> _remainder_eq_divisor = remainder == divisor;
                            #> _difference = abs(remainder - divisor);
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
                                #> _divisor_copy = divisor;
                                    clear _divisor_copy;
                                    #> _divisor_copy += divisor;
                                        clear _divisor_holder;
                                        
                                        while divisor not 0 do;
                                            incr _divisor_copy;
                                            incr _divisor_holder;
                                            decr divisor;
                                        end;
                                        
                                        while _divisor_holder not 0 do;
                                            incr divisor;
                                            decr _divisor_holder;
                                        end;
                                    #< done _divisor_copy += divisor;
                                #< done _divisor_copy = divisor;
                                
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
                                #> _divisor_copy_ne_zero = _divisor_copy != 0;
                                    #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                        #> __divisor_copy_copy = _divisor_copy;
                                            clear __divisor_copy_copy;
                                            #> __divisor_copy_copy += _divisor_copy;
                                                clear __divisor_copy_holder;
                                                
                                                while _divisor_copy not 0 do;
                                                    incr __divisor_copy_copy;
                                                    incr __divisor_copy_holder;
                                                    decr _divisor_copy;
                                                end;
                                                
                                                while __divisor_copy_holder not 0 do;
                                                    incr _divisor_copy;
                                                    decr __divisor_copy_holder;
                                                end;
                                            #< done __divisor_copy_copy += _divisor_copy;
                                        #< done __divisor_copy_copy = _divisor_copy;
                                        
                                        clear _not__divisor_copy_ne_zero;
                                        incr _not__divisor_copy_ne_zero;
                                        while __divisor_copy_copy not 0 do;
                                            clear _not__divisor_copy_ne_zero;
                                            clear __divisor_copy_copy;
                                        end;
                                    #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                    #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                        #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_copy;
                                            #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_holder;
                                                
                                                while _not__divisor_copy_ne_zero not 0 do;
                                                    incr __not__divisor_copy_ne_zero_copy;
                                                    incr __not__divisor_copy_ne_zero_holder;
                                                    decr _not__divisor_copy_ne_zero;
                                                end;
                                                
                                                while __not__divisor_copy_ne_zero_holder not 0 do;
                                                    incr _not__divisor_copy_ne_zero;
                                                    decr __not__divisor_copy_ne_zero_holder;
                                                end;
                                            #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                        
                                        clear _divisor_copy_ne_zero;
                                        incr _divisor_copy_ne_zero;
                                        
                                        while __not__divisor_copy_ne_zero_copy not 0 do;
                                            clear _divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_copy;
                                        end;
                                    #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                                #> _neither_are_zero = _divisor_copy_ne_zero and _remainder_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                        #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                            clear __divisor_copy_ne_zero_copy;
                                            #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                                clear __divisor_copy_ne_zero_holder;
                                                
                                                while _divisor_copy_ne_zero not 0 do;
                                                    incr __divisor_copy_ne_zero_copy;
                                                    incr __divisor_copy_ne_zero_holder;
                                                    decr _divisor_copy_ne_zero;
                                                end;
                                                
                                                while __divisor_copy_ne_zero_holder not 0 do;
                                                    incr _divisor_copy_ne_zero;
                                                    decr __divisor_copy_ne_zero_holder;
                                                end;
                                            #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                        #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                        
                                        clear _not__divisor_copy_ne_zero;
                                        incr _not__divisor_copy_ne_zero;
                                        
                                        while __divisor_copy_ne_zero_copy not 0 do;
                                            clear _not__divisor_copy_ne_zero;
                                            clear __divisor_copy_ne_zero_copy;
                                        end;
                                    #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
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
                                    #> _inner_or = _not__divisor_copy_ne_zero or _not__remainder_copy_ne_zero;
                                        #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_copy;
                                            #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_holder;
                                                
                                                while _not__divisor_copy_ne_zero not 0 do;
                                                    incr __not__divisor_copy_ne_zero_copy;
                                                    incr __not__divisor_copy_ne_zero_holder;
                                                    decr _not__divisor_copy_ne_zero;
                                                end;
                                                
                                                while __not__divisor_copy_ne_zero_holder not 0 do;
                                                    incr _not__divisor_copy_ne_zero;
                                                    decr __not__divisor_copy_ne_zero_holder;
                                                end;
                                            #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
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
                                        
                                        while __not__divisor_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not__divisor_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not__remainder_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not__remainder_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not__divisor_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                                #< done _neither_are_zero = _divisor_copy_ne_zero and _remainder_copy_ne_zero;
                                while _neither_are_zero not 0 do;
                                    decr _remainder_copy;
                                    decr _divisor_copy;
                                    
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
                                    #> _divisor_copy_ne_zero = _divisor_copy != 0;
                                        #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                            #> __divisor_copy_copy = _divisor_copy;
                                                clear __divisor_copy_copy;
                                                #> __divisor_copy_copy += _divisor_copy;
                                                    clear __divisor_copy_holder;
                                                    
                                                    while _divisor_copy not 0 do;
                                                        incr __divisor_copy_copy;
                                                        incr __divisor_copy_holder;
                                                        decr _divisor_copy;
                                                    end;
                                                    
                                                    while __divisor_copy_holder not 0 do;
                                                        incr _divisor_copy;
                                                        decr __divisor_copy_holder;
                                                    end;
                                                #< done __divisor_copy_copy += _divisor_copy;
                                            #< done __divisor_copy_copy = _divisor_copy;
                                            
                                            clear _not__divisor_copy_ne_zero;
                                            incr _not__divisor_copy_ne_zero;
                                            while __divisor_copy_copy not 0 do;
                                                clear _not__divisor_copy_ne_zero;
                                                clear __divisor_copy_copy;
                                            end;
                                        #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                        #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                            #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_copy;
                                                #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                    clear __not__divisor_copy_ne_zero_holder;
                                                    
                                                    while _not__divisor_copy_ne_zero not 0 do;
                                                        incr __not__divisor_copy_ne_zero_copy;
                                                        incr __not__divisor_copy_ne_zero_holder;
                                                        decr _not__divisor_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not__divisor_copy_ne_zero_holder not 0 do;
                                                        incr _not__divisor_copy_ne_zero;
                                                        decr __not__divisor_copy_ne_zero_holder;
                                                    end;
                                                #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                            
                                            clear _divisor_copy_ne_zero;
                                            incr _divisor_copy_ne_zero;
                                            
                                            while __not__divisor_copy_ne_zero_copy not 0 do;
                                                clear _divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_copy;
                                            end;
                                        #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                    #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                                    #> _neither_are_zero = _divisor_copy_ne_zero and _remainder_copy_ne_zero;
                                        # DeMorgan's:
                                        #  (X and Y) = not ((not X) or (not Y))
                                        #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                            #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                                clear __divisor_copy_ne_zero_copy;
                                                #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                                    clear __divisor_copy_ne_zero_holder;
                                                    
                                                    while _divisor_copy_ne_zero not 0 do;
                                                        incr __divisor_copy_ne_zero_copy;
                                                        incr __divisor_copy_ne_zero_holder;
                                                        decr _divisor_copy_ne_zero;
                                                    end;
                                                    
                                                    while __divisor_copy_ne_zero_holder not 0 do;
                                                        incr _divisor_copy_ne_zero;
                                                        decr __divisor_copy_ne_zero_holder;
                                                    end;
                                                #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                            #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                            
                                            clear _not__divisor_copy_ne_zero;
                                            incr _not__divisor_copy_ne_zero;
                                            
                                            while __divisor_copy_ne_zero_copy not 0 do;
                                                clear _not__divisor_copy_ne_zero;
                                                clear __divisor_copy_ne_zero_copy;
                                            end;
                                        #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
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
                                        #> _inner_or = _not__divisor_copy_ne_zero or _not__remainder_copy_ne_zero;
                                            #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                                clear __not__divisor_copy_ne_zero_copy;
                                                #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                                    clear __not__divisor_copy_ne_zero_holder;
                                                    
                                                    while _not__divisor_copy_ne_zero not 0 do;
                                                        incr __not__divisor_copy_ne_zero_copy;
                                                        incr __not__divisor_copy_ne_zero_holder;
                                                        decr _not__divisor_copy_ne_zero;
                                                    end;
                                                    
                                                    while __not__divisor_copy_ne_zero_holder not 0 do;
                                                        incr _not__divisor_copy_ne_zero;
                                                        decr __not__divisor_copy_ne_zero_holder;
                                                    end;
                                                #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
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
                                            
                                            while __not__divisor_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not__divisor_copy_ne_zero_copy;
                                            end;
                                            
                                            while __not__remainder_copy_ne_zero_copy not 0 do;
                                                clear _inner_or;
                                                incr _inner_or;
                                                clear __not__remainder_copy_ne_zero_copy;
                                            end;
                                        #< done _inner_or = _not__divisor_copy_ne_zero or _not__remainder_copy_ne_zero;
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
                                    #< done _neither_are_zero = _divisor_copy_ne_zero and _remainder_copy_ne_zero;
                                end;
                                
                                
                                clear _difference;
                                
                                while _divisor_copy_ne_zero not 0 do;
                                    # _divisor_copy_ne_zero is True, so divisor must be the larger
                                    #> _difference = _divisor_copy;
                                        clear _difference;
                                        #> _difference += _divisor_copy;
                                            clear __divisor_copy_holder;
                                            
                                            while _divisor_copy not 0 do;
                                                incr _difference;
                                                incr __divisor_copy_holder;
                                                decr _divisor_copy;
                                            end;
                                            
                                            while __divisor_copy_holder not 0 do;
                                                incr _divisor_copy;
                                                decr __divisor_copy_holder;
                                            end;
                                        #< done _difference += _divisor_copy;
                                    #< done _difference = _divisor_copy;
                                    clear _divisor_copy_ne_zero;
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
                            #< done _difference = abs(remainder - divisor);
                            clear _remainder_eq_divisor;
                            incr _remainder_eq_divisor;
                            while _difference not 0 do;
                                clear _remainder_eq_divisor;
                                clear _difference;
                            end;
                            
                            # If remainder == divisor, _remainder_eq_divisor = 1. Otherwise, _remainder_eq_divisor = 0
                        #< done _remainder_eq_divisor = remainder == divisor;
                        #> _remainder_ge_divisor = _remainder_gt_divisor or _remainder_eq_divisor;
                            #> __remainder_gt_divisor_copy = _remainder_gt_divisor;
                                clear __remainder_gt_divisor_copy;
                                #> __remainder_gt_divisor_copy += _remainder_gt_divisor;
                                    clear __remainder_gt_divisor_holder;
                                    
                                    while _remainder_gt_divisor not 0 do;
                                        incr __remainder_gt_divisor_copy;
                                        incr __remainder_gt_divisor_holder;
                                        decr _remainder_gt_divisor;
                                    end;
                                    
                                    while __remainder_gt_divisor_holder not 0 do;
                                        incr _remainder_gt_divisor;
                                        decr __remainder_gt_divisor_holder;
                                    end;
                                #< done __remainder_gt_divisor_copy += _remainder_gt_divisor;
                            #< done __remainder_gt_divisor_copy = _remainder_gt_divisor;
                            #> __remainder_eq_divisor_copy = _remainder_eq_divisor;
                                clear __remainder_eq_divisor_copy;
                                #> __remainder_eq_divisor_copy += _remainder_eq_divisor;
                                    clear __remainder_eq_divisor_holder;
                                    
                                    while _remainder_eq_divisor not 0 do;
                                        incr __remainder_eq_divisor_copy;
                                        incr __remainder_eq_divisor_holder;
                                        decr _remainder_eq_divisor;
                                    end;
                                    
                                    while __remainder_eq_divisor_holder not 0 do;
                                        incr _remainder_eq_divisor;
                                        decr __remainder_eq_divisor_holder;
                                    end;
                                #< done __remainder_eq_divisor_copy += _remainder_eq_divisor;
                            #< done __remainder_eq_divisor_copy = _remainder_eq_divisor;
                            clear _remainder_ge_divisor;
                            
                            while __remainder_gt_divisor_copy not 0 do;
                                clear _remainder_ge_divisor;
                                incr _remainder_ge_divisor;
                                clear __remainder_gt_divisor_copy;
                            end;
                            
                            while __remainder_eq_divisor_copy not 0 do;
                                clear _remainder_ge_divisor;
                                incr _remainder_ge_divisor;
                                clear __remainder_eq_divisor_copy;
                            end;
                        #< done _remainder_ge_divisor = _remainder_gt_divisor or _remainder_eq_divisor;
                    #< done _remainder_ge_divisor = remainder >= divisor;
                end;
            #< done _ r remainder = potential_prime / divisor;
        #< done remainder = potential_prime % divisor;
        #> divisor_divides_potential_prime = remainder == 0;
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
            
            clear divisor_divides_potential_prime;
            incr divisor_divides_potential_prime;
            while _remainder_copy not 0 do;
                clear divisor_divides_potential_prime;
                clear _remainder_copy;
            end;
        #< done divisor_divides_potential_prime = remainder == 0;
        while divisor_divides_potential_prime not 0 do;
            clear is_prime;
            clear divisor_divides_potential_prime;
        end;
        
        incr divisor;
        incr divisor;
        #> divisor_lt_potential_prime = divisor < potential_prime;
            #> _divisor_ge_potential_prime = divisor >= potential_prime;
                #> _divisor_gt_potential_prime = divisor > potential_prime;
                    #> _divisor_copy = divisor;
                        clear _divisor_copy;
                        #> _divisor_copy += divisor;
                            clear _divisor_holder;
                            
                            while divisor not 0 do;
                                incr _divisor_copy;
                                incr _divisor_holder;
                                decr divisor;
                            end;
                            
                            while _divisor_holder not 0 do;
                                incr divisor;
                                decr _divisor_holder;
                            end;
                        #< done _divisor_copy += divisor;
                    #< done _divisor_copy = divisor;
                    #> _potential_prime_copy = potential_prime;
                        clear _potential_prime_copy;
                        #> _potential_prime_copy += potential_prime;
                            clear _potential_prime_holder;
                            
                            while potential_prime not 0 do;
                                incr _potential_prime_copy;
                                incr _potential_prime_holder;
                                decr potential_prime;
                            end;
                            
                            while _potential_prime_holder not 0 do;
                                incr potential_prime;
                                decr _potential_prime_holder;
                            end;
                        #< done _potential_prime_copy += potential_prime;
                    #< done _potential_prime_copy = potential_prime;
                    
                    #> _difference = abs(_divisor_copy - _potential_prime_copy);
                        #> __divisor_copy_copy = _divisor_copy;
                            clear __divisor_copy_copy;
                            #> __divisor_copy_copy += _divisor_copy;
                                clear __divisor_copy_holder;
                                
                                while _divisor_copy not 0 do;
                                    incr __divisor_copy_copy;
                                    incr __divisor_copy_holder;
                                    decr _divisor_copy;
                                end;
                                
                                while __divisor_copy_holder not 0 do;
                                    incr _divisor_copy;
                                    decr __divisor_copy_holder;
                                end;
                            #< done __divisor_copy_copy += _divisor_copy;
                        #< done __divisor_copy_copy = _divisor_copy;
                        #> __potential_prime_copy_copy = _potential_prime_copy;
                            clear __potential_prime_copy_copy;
                            #> __potential_prime_copy_copy += _potential_prime_copy;
                                clear __potential_prime_copy_holder;
                                
                                while _potential_prime_copy not 0 do;
                                    incr __potential_prime_copy_copy;
                                    incr __potential_prime_copy_holder;
                                    decr _potential_prime_copy;
                                end;
                                
                                while __potential_prime_copy_holder not 0 do;
                                    incr _potential_prime_copy;
                                    decr __potential_prime_copy_holder;
                                end;
                            #< done __potential_prime_copy_copy += _potential_prime_copy;
                        #< done __potential_prime_copy_copy = _potential_prime_copy;
                        
                        #> __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                            #> _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                #> ___divisor_copy_copy_copy = __divisor_copy_copy;
                                    clear ___divisor_copy_copy_copy;
                                    #> ___divisor_copy_copy_copy += __divisor_copy_copy;
                                        clear ___divisor_copy_copy_holder;
                                        
                                        while __divisor_copy_copy not 0 do;
                                            incr ___divisor_copy_copy_copy;
                                            incr ___divisor_copy_copy_holder;
                                            decr __divisor_copy_copy;
                                        end;
                                        
                                        while ___divisor_copy_copy_holder not 0 do;
                                            incr __divisor_copy_copy;
                                            decr ___divisor_copy_copy_holder;
                                        end;
                                    #< done ___divisor_copy_copy_copy += __divisor_copy_copy;
                                #< done ___divisor_copy_copy_copy = __divisor_copy_copy;
                                
                                clear _not___divisor_copy_copy_ne_zero;
                                incr _not___divisor_copy_copy_ne_zero;
                                while ___divisor_copy_copy_copy not 0 do;
                                    clear _not___divisor_copy_copy_ne_zero;
                                    clear ___divisor_copy_copy_copy;
                                end;
                            #< done _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                            #> __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                    clear __not___divisor_copy_copy_ne_zero_copy;
                                    #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_holder;
                                        
                                        while _not___divisor_copy_copy_ne_zero not 0 do;
                                            incr __not___divisor_copy_copy_ne_zero_copy;
                                            incr __not___divisor_copy_copy_ne_zero_holder;
                                            decr _not___divisor_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___divisor_copy_copy_ne_zero;
                                            decr __not___divisor_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                
                                clear __divisor_copy_copy_ne_zero;
                                incr __divisor_copy_copy_ne_zero;
                                
                                while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                    clear __divisor_copy_copy_ne_zero;
                                    clear __not___divisor_copy_copy_ne_zero_copy;
                                end;
                            #< done __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                        #< done __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                        #> __potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy != 0;
                            #> _not___potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy == 0;
                                #> ___potential_prime_copy_copy_copy = __potential_prime_copy_copy;
                                    clear ___potential_prime_copy_copy_copy;
                                    #> ___potential_prime_copy_copy_copy += __potential_prime_copy_copy;
                                        clear ___potential_prime_copy_copy_holder;
                                        
                                        while __potential_prime_copy_copy not 0 do;
                                            incr ___potential_prime_copy_copy_copy;
                                            incr ___potential_prime_copy_copy_holder;
                                            decr __potential_prime_copy_copy;
                                        end;
                                        
                                        while ___potential_prime_copy_copy_holder not 0 do;
                                            incr __potential_prime_copy_copy;
                                            decr ___potential_prime_copy_copy_holder;
                                        end;
                                    #< done ___potential_prime_copy_copy_copy += __potential_prime_copy_copy;
                                #< done ___potential_prime_copy_copy_copy = __potential_prime_copy_copy;
                                
                                clear _not___potential_prime_copy_copy_ne_zero;
                                incr _not___potential_prime_copy_copy_ne_zero;
                                while ___potential_prime_copy_copy_copy not 0 do;
                                    clear _not___potential_prime_copy_copy_ne_zero;
                                    clear ___potential_prime_copy_copy_copy;
                                end;
                            #< done _not___potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy == 0;
                            #> __potential_prime_copy_copy_ne_zero = not _not___potential_prime_copy_copy_ne_zero;
                                #> __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                    clear __not___potential_prime_copy_copy_ne_zero_copy;
                                    #> __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                        clear __not___potential_prime_copy_copy_ne_zero_holder;
                                        
                                        while _not___potential_prime_copy_copy_ne_zero not 0 do;
                                            incr __not___potential_prime_copy_copy_ne_zero_copy;
                                            incr __not___potential_prime_copy_copy_ne_zero_holder;
                                            decr _not___potential_prime_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___potential_prime_copy_copy_ne_zero;
                                            decr __not___potential_prime_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                #< done __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                
                                clear __potential_prime_copy_copy_ne_zero;
                                incr __potential_prime_copy_copy_ne_zero;
                                
                                while __not___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                    clear __potential_prime_copy_copy_ne_zero;
                                    clear __not___potential_prime_copy_copy_ne_zero_copy;
                                end;
                            #< done __potential_prime_copy_copy_ne_zero = not _not___potential_prime_copy_copy_ne_zero;
                        #< done __potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy != 0;
                        #> _neither_are_zero = __potential_prime_copy_copy_ne_zero and __divisor_copy_copy_ne_zero;
                            # DeMorgan's:
                            #  (X and Y) = not ((not X) or (not Y))
                            #> _not___potential_prime_copy_copy_ne_zero = not __potential_prime_copy_copy_ne_zero;
                                #> ___potential_prime_copy_copy_ne_zero_copy = __potential_prime_copy_copy_ne_zero;
                                    clear ___potential_prime_copy_copy_ne_zero_copy;
                                    #> ___potential_prime_copy_copy_ne_zero_copy += __potential_prime_copy_copy_ne_zero;
                                        clear ___potential_prime_copy_copy_ne_zero_holder;
                                        
                                        while __potential_prime_copy_copy_ne_zero not 0 do;
                                            incr ___potential_prime_copy_copy_ne_zero_copy;
                                            incr ___potential_prime_copy_copy_ne_zero_holder;
                                            decr __potential_prime_copy_copy_ne_zero;
                                        end;
                                        
                                        while ___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                            incr __potential_prime_copy_copy_ne_zero;
                                            decr ___potential_prime_copy_copy_ne_zero_holder;
                                        end;
                                    #< done ___potential_prime_copy_copy_ne_zero_copy += __potential_prime_copy_copy_ne_zero;
                                #< done ___potential_prime_copy_copy_ne_zero_copy = __potential_prime_copy_copy_ne_zero;
                                
                                clear _not___potential_prime_copy_copy_ne_zero;
                                incr _not___potential_prime_copy_copy_ne_zero;
                                
                                while ___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                    clear _not___potential_prime_copy_copy_ne_zero;
                                    clear ___potential_prime_copy_copy_ne_zero_copy;
                                end;
                            #< done _not___potential_prime_copy_copy_ne_zero = not __potential_prime_copy_copy_ne_zero;
                            #> _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                                #> ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                    clear ___divisor_copy_copy_ne_zero_copy;
                                    #> ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                        clear ___divisor_copy_copy_ne_zero_holder;
                                        
                                        while __divisor_copy_copy_ne_zero not 0 do;
                                            incr ___divisor_copy_copy_ne_zero_copy;
                                            incr ___divisor_copy_copy_ne_zero_holder;
                                            decr __divisor_copy_copy_ne_zero;
                                        end;
                                        
                                        while ___divisor_copy_copy_ne_zero_holder not 0 do;
                                            incr __divisor_copy_copy_ne_zero;
                                            decr ___divisor_copy_copy_ne_zero_holder;
                                        end;
                                    #< done ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                #< done ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                
                                clear _not___divisor_copy_copy_ne_zero;
                                incr _not___divisor_copy_copy_ne_zero;
                                
                                while ___divisor_copy_copy_ne_zero_copy not 0 do;
                                    clear _not___divisor_copy_copy_ne_zero;
                                    clear ___divisor_copy_copy_ne_zero_copy;
                                end;
                            #< done _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                            #> _inner_or = _not___potential_prime_copy_copy_ne_zero or _not___divisor_copy_copy_ne_zero;
                                #> __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                    clear __not___potential_prime_copy_copy_ne_zero_copy;
                                    #> __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                        clear __not___potential_prime_copy_copy_ne_zero_holder;
                                        
                                        while _not___potential_prime_copy_copy_ne_zero not 0 do;
                                            incr __not___potential_prime_copy_copy_ne_zero_copy;
                                            incr __not___potential_prime_copy_copy_ne_zero_holder;
                                            decr _not___potential_prime_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___potential_prime_copy_copy_ne_zero;
                                            decr __not___potential_prime_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                #< done __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                    clear __not___divisor_copy_copy_ne_zero_copy;
                                    #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_holder;
                                        
                                        while _not___divisor_copy_copy_ne_zero not 0 do;
                                            incr __not___divisor_copy_copy_ne_zero_copy;
                                            incr __not___divisor_copy_copy_ne_zero_holder;
                                            decr _not___divisor_copy_copy_ne_zero;
                                        end;
                                        
                                        while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                            incr _not___divisor_copy_copy_ne_zero;
                                            decr __not___divisor_copy_copy_ne_zero_holder;
                                        end;
                                    #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___potential_prime_copy_copy_ne_zero_copy;
                                end;
                                
                                while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not___divisor_copy_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not___potential_prime_copy_copy_ne_zero or _not___divisor_copy_copy_ne_zero;
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
                        #< done _neither_are_zero = __potential_prime_copy_copy_ne_zero and __divisor_copy_copy_ne_zero;
                        while _neither_are_zero not 0 do;
                            decr __divisor_copy_copy;
                            decr __potential_prime_copy_copy;
                            
                            #> __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                                #> _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                    #> ___divisor_copy_copy_copy = __divisor_copy_copy;
                                        clear ___divisor_copy_copy_copy;
                                        #> ___divisor_copy_copy_copy += __divisor_copy_copy;
                                            clear ___divisor_copy_copy_holder;
                                            
                                            while __divisor_copy_copy not 0 do;
                                                incr ___divisor_copy_copy_copy;
                                                incr ___divisor_copy_copy_holder;
                                                decr __divisor_copy_copy;
                                            end;
                                            
                                            while ___divisor_copy_copy_holder not 0 do;
                                                incr __divisor_copy_copy;
                                                decr ___divisor_copy_copy_holder;
                                            end;
                                        #< done ___divisor_copy_copy_copy += __divisor_copy_copy;
                                    #< done ___divisor_copy_copy_copy = __divisor_copy_copy;
                                    
                                    clear _not___divisor_copy_copy_ne_zero;
                                    incr _not___divisor_copy_copy_ne_zero;
                                    while ___divisor_copy_copy_copy not 0 do;
                                        clear _not___divisor_copy_copy_ne_zero;
                                        clear ___divisor_copy_copy_copy;
                                    end;
                                #< done _not___divisor_copy_copy_ne_zero = __divisor_copy_copy == 0;
                                #> __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                                    #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_copy;
                                        #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_holder;
                                            
                                            while _not___divisor_copy_copy_ne_zero not 0 do;
                                                incr __not___divisor_copy_copy_ne_zero_copy;
                                                incr __not___divisor_copy_copy_ne_zero_holder;
                                                decr _not___divisor_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___divisor_copy_copy_ne_zero;
                                                decr __not___divisor_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                    #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                    
                                    clear __divisor_copy_copy_ne_zero;
                                    incr __divisor_copy_copy_ne_zero;
                                    
                                    while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                        clear __divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_copy;
                                    end;
                                #< done __divisor_copy_copy_ne_zero = not _not___divisor_copy_copy_ne_zero;
                            #< done __divisor_copy_copy_ne_zero = __divisor_copy_copy != 0;
                            #> __potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy != 0;
                                #> _not___potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy == 0;
                                    #> ___potential_prime_copy_copy_copy = __potential_prime_copy_copy;
                                        clear ___potential_prime_copy_copy_copy;
                                        #> ___potential_prime_copy_copy_copy += __potential_prime_copy_copy;
                                            clear ___potential_prime_copy_copy_holder;
                                            
                                            while __potential_prime_copy_copy not 0 do;
                                                incr ___potential_prime_copy_copy_copy;
                                                incr ___potential_prime_copy_copy_holder;
                                                decr __potential_prime_copy_copy;
                                            end;
                                            
                                            while ___potential_prime_copy_copy_holder not 0 do;
                                                incr __potential_prime_copy_copy;
                                                decr ___potential_prime_copy_copy_holder;
                                            end;
                                        #< done ___potential_prime_copy_copy_copy += __potential_prime_copy_copy;
                                    #< done ___potential_prime_copy_copy_copy = __potential_prime_copy_copy;
                                    
                                    clear _not___potential_prime_copy_copy_ne_zero;
                                    incr _not___potential_prime_copy_copy_ne_zero;
                                    while ___potential_prime_copy_copy_copy not 0 do;
                                        clear _not___potential_prime_copy_copy_ne_zero;
                                        clear ___potential_prime_copy_copy_copy;
                                    end;
                                #< done _not___potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy == 0;
                                #> __potential_prime_copy_copy_ne_zero = not _not___potential_prime_copy_copy_ne_zero;
                                    #> __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                        clear __not___potential_prime_copy_copy_ne_zero_copy;
                                        #> __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                            clear __not___potential_prime_copy_copy_ne_zero_holder;
                                            
                                            while _not___potential_prime_copy_copy_ne_zero not 0 do;
                                                incr __not___potential_prime_copy_copy_ne_zero_copy;
                                                incr __not___potential_prime_copy_copy_ne_zero_holder;
                                                decr _not___potential_prime_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___potential_prime_copy_copy_ne_zero;
                                                decr __not___potential_prime_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                    #< done __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                    
                                    clear __potential_prime_copy_copy_ne_zero;
                                    incr __potential_prime_copy_copy_ne_zero;
                                    
                                    while __not___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                        clear __potential_prime_copy_copy_ne_zero;
                                        clear __not___potential_prime_copy_copy_ne_zero_copy;
                                    end;
                                #< done __potential_prime_copy_copy_ne_zero = not _not___potential_prime_copy_copy_ne_zero;
                            #< done __potential_prime_copy_copy_ne_zero = __potential_prime_copy_copy != 0;
                            #> _neither_are_zero = __potential_prime_copy_copy_ne_zero and __divisor_copy_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not___potential_prime_copy_copy_ne_zero = not __potential_prime_copy_copy_ne_zero;
                                    #> ___potential_prime_copy_copy_ne_zero_copy = __potential_prime_copy_copy_ne_zero;
                                        clear ___potential_prime_copy_copy_ne_zero_copy;
                                        #> ___potential_prime_copy_copy_ne_zero_copy += __potential_prime_copy_copy_ne_zero;
                                            clear ___potential_prime_copy_copy_ne_zero_holder;
                                            
                                            while __potential_prime_copy_copy_ne_zero not 0 do;
                                                incr ___potential_prime_copy_copy_ne_zero_copy;
                                                incr ___potential_prime_copy_copy_ne_zero_holder;
                                                decr __potential_prime_copy_copy_ne_zero;
                                            end;
                                            
                                            while ___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                                incr __potential_prime_copy_copy_ne_zero;
                                                decr ___potential_prime_copy_copy_ne_zero_holder;
                                            end;
                                        #< done ___potential_prime_copy_copy_ne_zero_copy += __potential_prime_copy_copy_ne_zero;
                                    #< done ___potential_prime_copy_copy_ne_zero_copy = __potential_prime_copy_copy_ne_zero;
                                    
                                    clear _not___potential_prime_copy_copy_ne_zero;
                                    incr _not___potential_prime_copy_copy_ne_zero;
                                    
                                    while ___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                        clear _not___potential_prime_copy_copy_ne_zero;
                                        clear ___potential_prime_copy_copy_ne_zero_copy;
                                    end;
                                #< done _not___potential_prime_copy_copy_ne_zero = not __potential_prime_copy_copy_ne_zero;
                                #> _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                                    #> ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                        clear ___divisor_copy_copy_ne_zero_copy;
                                        #> ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                            clear ___divisor_copy_copy_ne_zero_holder;
                                            
                                            while __divisor_copy_copy_ne_zero not 0 do;
                                                incr ___divisor_copy_copy_ne_zero_copy;
                                                incr ___divisor_copy_copy_ne_zero_holder;
                                                decr __divisor_copy_copy_ne_zero;
                                            end;
                                            
                                            while ___divisor_copy_copy_ne_zero_holder not 0 do;
                                                incr __divisor_copy_copy_ne_zero;
                                                decr ___divisor_copy_copy_ne_zero_holder;
                                            end;
                                        #< done ___divisor_copy_copy_ne_zero_copy += __divisor_copy_copy_ne_zero;
                                    #< done ___divisor_copy_copy_ne_zero_copy = __divisor_copy_copy_ne_zero;
                                    
                                    clear _not___divisor_copy_copy_ne_zero;
                                    incr _not___divisor_copy_copy_ne_zero;
                                    
                                    while ___divisor_copy_copy_ne_zero_copy not 0 do;
                                        clear _not___divisor_copy_copy_ne_zero;
                                        clear ___divisor_copy_copy_ne_zero_copy;
                                    end;
                                #< done _not___divisor_copy_copy_ne_zero = not __divisor_copy_copy_ne_zero;
                                #> _inner_or = _not___potential_prime_copy_copy_ne_zero or _not___divisor_copy_copy_ne_zero;
                                    #> __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                        clear __not___potential_prime_copy_copy_ne_zero_copy;
                                        #> __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                            clear __not___potential_prime_copy_copy_ne_zero_holder;
                                            
                                            while _not___potential_prime_copy_copy_ne_zero not 0 do;
                                                incr __not___potential_prime_copy_copy_ne_zero_copy;
                                                incr __not___potential_prime_copy_copy_ne_zero_holder;
                                                decr _not___potential_prime_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___potential_prime_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___potential_prime_copy_copy_ne_zero;
                                                decr __not___potential_prime_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___potential_prime_copy_copy_ne_zero_copy += _not___potential_prime_copy_copy_ne_zero;
                                    #< done __not___potential_prime_copy_copy_ne_zero_copy = _not___potential_prime_copy_copy_ne_zero;
                                    #> __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                        clear __not___divisor_copy_copy_ne_zero_copy;
                                        #> __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                            clear __not___divisor_copy_copy_ne_zero_holder;
                                            
                                            while _not___divisor_copy_copy_ne_zero not 0 do;
                                                incr __not___divisor_copy_copy_ne_zero_copy;
                                                incr __not___divisor_copy_copy_ne_zero_holder;
                                                decr _not___divisor_copy_copy_ne_zero;
                                            end;
                                            
                                            while __not___divisor_copy_copy_ne_zero_holder not 0 do;
                                                incr _not___divisor_copy_copy_ne_zero;
                                                decr __not___divisor_copy_copy_ne_zero_holder;
                                            end;
                                        #< done __not___divisor_copy_copy_ne_zero_copy += _not___divisor_copy_copy_ne_zero;
                                    #< done __not___divisor_copy_copy_ne_zero_copy = _not___divisor_copy_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not___potential_prime_copy_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___potential_prime_copy_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not___divisor_copy_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___divisor_copy_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not___potential_prime_copy_copy_ne_zero or _not___divisor_copy_copy_ne_zero;
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
                            #< done _neither_are_zero = __potential_prime_copy_copy_ne_zero and __divisor_copy_copy_ne_zero;
                        end;
                        
                        
                        clear _difference;
                        
                        while __potential_prime_copy_copy_ne_zero not 0 do;
                            # __potential_prime_copy_copy_ne_zero is True, so _potential_prime_copy must be the larger
                            #> _difference = __potential_prime_copy_copy;
                                clear _difference;
                                #> _difference += __potential_prime_copy_copy;
                                    clear ___potential_prime_copy_copy_holder;
                                    
                                    while __potential_prime_copy_copy not 0 do;
                                        incr _difference;
                                        incr ___potential_prime_copy_copy_holder;
                                        decr __potential_prime_copy_copy;
                                    end;
                                    
                                    while ___potential_prime_copy_copy_holder not 0 do;
                                        incr __potential_prime_copy_copy;
                                        decr ___potential_prime_copy_copy_holder;
                                    end;
                                #< done _difference += __potential_prime_copy_copy;
                            #< done _difference = __potential_prime_copy_copy;
                            clear __potential_prime_copy_copy_ne_zero;
                        end;
                        
                        while __divisor_copy_copy_ne_zero not 0 do;
                            # __divisor_copy_copy_ne_zero is True, so _divisor_copy must be the larger
                            #> _difference = __divisor_copy_copy;
                                clear _difference;
                                #> _difference += __divisor_copy_copy;
                                    clear ___divisor_copy_copy_holder;
                                    
                                    while __divisor_copy_copy not 0 do;
                                        incr _difference;
                                        incr ___divisor_copy_copy_holder;
                                        decr __divisor_copy_copy;
                                    end;
                                    
                                    while ___divisor_copy_copy_holder not 0 do;
                                        incr __divisor_copy_copy;
                                        decr ___divisor_copy_copy_holder;
                                    end;
                                #< done _difference += __divisor_copy_copy;
                            #< done _difference = __divisor_copy_copy;
                            clear __divisor_copy_copy_ne_zero;
                        end;
                    #< done _difference = abs(_divisor_copy - _potential_prime_copy);
                    #> _divisor_plus_difference = _divisor_copy + _difference;
                        #> __divisor_copy_copy = _divisor_copy;
                            clear __divisor_copy_copy;
                            #> __divisor_copy_copy += _divisor_copy;
                                clear __divisor_copy_holder;
                                
                                while _divisor_copy not 0 do;
                                    incr __divisor_copy_copy;
                                    incr __divisor_copy_holder;
                                    decr _divisor_copy;
                                end;
                                
                                while __divisor_copy_holder not 0 do;
                                    incr _divisor_copy;
                                    decr __divisor_copy_holder;
                                end;
                            #< done __divisor_copy_copy += _divisor_copy;
                        #< done __divisor_copy_copy = _divisor_copy;
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
                        clear _divisor_plus_difference;
                        #> _divisor_plus_difference += __divisor_copy_copy;
                            clear ___divisor_copy_copy_holder;
                            
                            while __divisor_copy_copy not 0 do;
                                incr _divisor_plus_difference;
                                incr ___divisor_copy_copy_holder;
                                decr __divisor_copy_copy;
                            end;
                            
                            while ___divisor_copy_copy_holder not 0 do;
                                incr __divisor_copy_copy;
                                decr ___divisor_copy_copy_holder;
                            end;
                        #< done _divisor_plus_difference += __divisor_copy_copy;
                        #> _divisor_plus_difference += __difference_copy;
                            clear ___difference_copy_holder;
                            
                            while __difference_copy not 0 do;
                                incr _divisor_plus_difference;
                                incr ___difference_copy_holder;
                                decr __difference_copy;
                            end;
                            
                            while ___difference_copy_holder not 0 do;
                                incr __difference_copy;
                                decr ___difference_copy_holder;
                            end;
                        #< done _divisor_plus_difference += __difference_copy;
                    #< done _divisor_plus_difference = _divisor_copy + _difference;
                    #> _divisor_plus_difference_eq_potential_prime = _divisor_plus_difference == potential_prime;
                        #> _difference = abs(_divisor_plus_difference - potential_prime);
                            #> __divisor_plus_difference_copy = _divisor_plus_difference;
                                clear __divisor_plus_difference_copy;
                                #> __divisor_plus_difference_copy += _divisor_plus_difference;
                                    clear __divisor_plus_difference_holder;
                                    
                                    while _divisor_plus_difference not 0 do;
                                        incr __divisor_plus_difference_copy;
                                        incr __divisor_plus_difference_holder;
                                        decr _divisor_plus_difference;
                                    end;
                                    
                                    while __divisor_plus_difference_holder not 0 do;
                                        incr _divisor_plus_difference;
                                        decr __divisor_plus_difference_holder;
                                    end;
                                #< done __divisor_plus_difference_copy += _divisor_plus_difference;
                            #< done __divisor_plus_difference_copy = _divisor_plus_difference;
                            #> _potential_prime_copy = potential_prime;
                                clear _potential_prime_copy;
                                #> _potential_prime_copy += potential_prime;
                                    clear _potential_prime_holder;
                                    
                                    while potential_prime not 0 do;
                                        incr _potential_prime_copy;
                                        incr _potential_prime_holder;
                                        decr potential_prime;
                                    end;
                                    
                                    while _potential_prime_holder not 0 do;
                                        incr potential_prime;
                                        decr _potential_prime_holder;
                                    end;
                                #< done _potential_prime_copy += potential_prime;
                            #< done _potential_prime_copy = potential_prime;
                            
                            #> __divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy != 0;
                                #> _not___divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy == 0;
                                    #> ___divisor_plus_difference_copy_copy = __divisor_plus_difference_copy;
                                        clear ___divisor_plus_difference_copy_copy;
                                        #> ___divisor_plus_difference_copy_copy += __divisor_plus_difference_copy;
                                            clear ___divisor_plus_difference_copy_holder;
                                            
                                            while __divisor_plus_difference_copy not 0 do;
                                                incr ___divisor_plus_difference_copy_copy;
                                                incr ___divisor_plus_difference_copy_holder;
                                                decr __divisor_plus_difference_copy;
                                            end;
                                            
                                            while ___divisor_plus_difference_copy_holder not 0 do;
                                                incr __divisor_plus_difference_copy;
                                                decr ___divisor_plus_difference_copy_holder;
                                            end;
                                        #< done ___divisor_plus_difference_copy_copy += __divisor_plus_difference_copy;
                                    #< done ___divisor_plus_difference_copy_copy = __divisor_plus_difference_copy;
                                    
                                    clear _not___divisor_plus_difference_copy_ne_zero;
                                    incr _not___divisor_plus_difference_copy_ne_zero;
                                    while ___divisor_plus_difference_copy_copy not 0 do;
                                        clear _not___divisor_plus_difference_copy_ne_zero;
                                        clear ___divisor_plus_difference_copy_copy;
                                    end;
                                #< done _not___divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy == 0;
                                #> __divisor_plus_difference_copy_ne_zero = not _not___divisor_plus_difference_copy_ne_zero;
                                    #> __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                        clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                        #> __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                            clear __not___divisor_plus_difference_copy_ne_zero_holder;
                                            
                                            while _not___divisor_plus_difference_copy_ne_zero not 0 do;
                                                incr __not___divisor_plus_difference_copy_ne_zero_copy;
                                                incr __not___divisor_plus_difference_copy_ne_zero_holder;
                                                decr _not___divisor_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while __not___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr _not___divisor_plus_difference_copy_ne_zero;
                                                decr __not___divisor_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                    #< done __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                    
                                    clear __divisor_plus_difference_copy_ne_zero;
                                    incr __divisor_plus_difference_copy_ne_zero;
                                    
                                    while __not___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear __divisor_plus_difference_copy_ne_zero;
                                        clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done __divisor_plus_difference_copy_ne_zero = not _not___divisor_plus_difference_copy_ne_zero;
                            #< done __divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy != 0;
                            #> _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                                #> _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                    #> __potential_prime_copy_copy = _potential_prime_copy;
                                        clear __potential_prime_copy_copy;
                                        #> __potential_prime_copy_copy += _potential_prime_copy;
                                            clear __potential_prime_copy_holder;
                                            
                                            while _potential_prime_copy not 0 do;
                                                incr __potential_prime_copy_copy;
                                                incr __potential_prime_copy_holder;
                                                decr _potential_prime_copy;
                                            end;
                                            
                                            while __potential_prime_copy_holder not 0 do;
                                                incr _potential_prime_copy;
                                                decr __potential_prime_copy_holder;
                                            end;
                                        #< done __potential_prime_copy_copy += _potential_prime_copy;
                                    #< done __potential_prime_copy_copy = _potential_prime_copy;
                                    
                                    clear _not__potential_prime_copy_ne_zero;
                                    incr _not__potential_prime_copy_ne_zero;
                                    while __potential_prime_copy_copy not 0 do;
                                        clear _not__potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_copy;
                                    end;
                                #< done _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                #> _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                                    #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                        #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                            clear __not__potential_prime_copy_ne_zero_holder;
                                            
                                            while _not__potential_prime_copy_ne_zero not 0 do;
                                                incr __not__potential_prime_copy_ne_zero_copy;
                                                incr __not__potential_prime_copy_ne_zero_holder;
                                                decr _not__potential_prime_copy_ne_zero;
                                            end;
                                            
                                            while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                                incr _not__potential_prime_copy_ne_zero;
                                                decr __not__potential_prime_copy_ne_zero_holder;
                                            end;
                                        #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                    #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    
                                    clear _potential_prime_copy_ne_zero;
                                    incr _potential_prime_copy_ne_zero;
                                    
                                    while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                        clear _potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                    end;
                                #< done _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                            #< done _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                            #> _neither_are_zero = _potential_prime_copy_ne_zero and __divisor_plus_difference_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                    #> __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_ne_zero_copy;
                                        #> __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                            clear __potential_prime_copy_ne_zero_holder;
                                            
                                            while _potential_prime_copy_ne_zero not 0 do;
                                                incr __potential_prime_copy_ne_zero_copy;
                                                incr __potential_prime_copy_ne_zero_holder;
                                                decr _potential_prime_copy_ne_zero;
                                            end;
                                            
                                            while __potential_prime_copy_ne_zero_holder not 0 do;
                                                incr _potential_prime_copy_ne_zero;
                                                decr __potential_prime_copy_ne_zero_holder;
                                            end;
                                        #< done __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                    #< done __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                    
                                    clear _not__potential_prime_copy_ne_zero;
                                    incr _not__potential_prime_copy_ne_zero;
                                    
                                    while __potential_prime_copy_ne_zero_copy not 0 do;
                                        clear _not__potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_ne_zero_copy;
                                    end;
                                #< done _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                #> _not___divisor_plus_difference_copy_ne_zero = not __divisor_plus_difference_copy_ne_zero;
                                    #> ___divisor_plus_difference_copy_ne_zero_copy = __divisor_plus_difference_copy_ne_zero;
                                        clear ___divisor_plus_difference_copy_ne_zero_copy;
                                        #> ___divisor_plus_difference_copy_ne_zero_copy += __divisor_plus_difference_copy_ne_zero;
                                            clear ___divisor_plus_difference_copy_ne_zero_holder;
                                            
                                            while __divisor_plus_difference_copy_ne_zero not 0 do;
                                                incr ___divisor_plus_difference_copy_ne_zero_copy;
                                                incr ___divisor_plus_difference_copy_ne_zero_holder;
                                                decr __divisor_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while ___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr __divisor_plus_difference_copy_ne_zero;
                                                decr ___divisor_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done ___divisor_plus_difference_copy_ne_zero_copy += __divisor_plus_difference_copy_ne_zero;
                                    #< done ___divisor_plus_difference_copy_ne_zero_copy = __divisor_plus_difference_copy_ne_zero;
                                    
                                    clear _not___divisor_plus_difference_copy_ne_zero;
                                    incr _not___divisor_plus_difference_copy_ne_zero;
                                    
                                    while ___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear _not___divisor_plus_difference_copy_ne_zero;
                                        clear ___divisor_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done _not___divisor_plus_difference_copy_ne_zero = not __divisor_plus_difference_copy_ne_zero;
                                #> _inner_or = _not__potential_prime_copy_ne_zero or _not___divisor_plus_difference_copy_ne_zero;
                                    #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                        #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                            clear __not__potential_prime_copy_ne_zero_holder;
                                            
                                            while _not__potential_prime_copy_ne_zero not 0 do;
                                                incr __not__potential_prime_copy_ne_zero_copy;
                                                incr __not__potential_prime_copy_ne_zero_holder;
                                                decr _not__potential_prime_copy_ne_zero;
                                            end;
                                            
                                            while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                                incr _not__potential_prime_copy_ne_zero;
                                                decr __not__potential_prime_copy_ne_zero_holder;
                                            end;
                                        #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                    #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    #> __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                        clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                        #> __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                            clear __not___divisor_plus_difference_copy_ne_zero_holder;
                                            
                                            while _not___divisor_plus_difference_copy_ne_zero not 0 do;
                                                incr __not___divisor_plus_difference_copy_ne_zero_copy;
                                                incr __not___divisor_plus_difference_copy_ne_zero_holder;
                                                decr _not___divisor_plus_difference_copy_ne_zero;
                                            end;
                                            
                                            while __not___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                                incr _not___divisor_plus_difference_copy_ne_zero;
                                                decr __not___divisor_plus_difference_copy_ne_zero_holder;
                                            end;
                                        #< done __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                    #< done __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not__potential_prime_copy_ne_zero or _not___divisor_plus_difference_copy_ne_zero;
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
                            #< done _neither_are_zero = _potential_prime_copy_ne_zero and __divisor_plus_difference_copy_ne_zero;
                            while _neither_are_zero not 0 do;
                                decr __divisor_plus_difference_copy;
                                decr _potential_prime_copy;
                                
                                #> __divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy != 0;
                                    #> _not___divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy == 0;
                                        #> ___divisor_plus_difference_copy_copy = __divisor_plus_difference_copy;
                                            clear ___divisor_plus_difference_copy_copy;
                                            #> ___divisor_plus_difference_copy_copy += __divisor_plus_difference_copy;
                                                clear ___divisor_plus_difference_copy_holder;
                                                
                                                while __divisor_plus_difference_copy not 0 do;
                                                    incr ___divisor_plus_difference_copy_copy;
                                                    incr ___divisor_plus_difference_copy_holder;
                                                    decr __divisor_plus_difference_copy;
                                                end;
                                                
                                                while ___divisor_plus_difference_copy_holder not 0 do;
                                                    incr __divisor_plus_difference_copy;
                                                    decr ___divisor_plus_difference_copy_holder;
                                                end;
                                            #< done ___divisor_plus_difference_copy_copy += __divisor_plus_difference_copy;
                                        #< done ___divisor_plus_difference_copy_copy = __divisor_plus_difference_copy;
                                        
                                        clear _not___divisor_plus_difference_copy_ne_zero;
                                        incr _not___divisor_plus_difference_copy_ne_zero;
                                        while ___divisor_plus_difference_copy_copy not 0 do;
                                            clear _not___divisor_plus_difference_copy_ne_zero;
                                            clear ___divisor_plus_difference_copy_copy;
                                        end;
                                    #< done _not___divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy == 0;
                                    #> __divisor_plus_difference_copy_ne_zero = not _not___divisor_plus_difference_copy_ne_zero;
                                        #> __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                            clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                            #> __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                                clear __not___divisor_plus_difference_copy_ne_zero_holder;
                                                
                                                while _not___divisor_plus_difference_copy_ne_zero not 0 do;
                                                    incr __not___divisor_plus_difference_copy_ne_zero_copy;
                                                    incr __not___divisor_plus_difference_copy_ne_zero_holder;
                                                    decr _not___divisor_plus_difference_copy_ne_zero;
                                                end;
                                                
                                                while __not___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                                    incr _not___divisor_plus_difference_copy_ne_zero;
                                                    decr __not___divisor_plus_difference_copy_ne_zero_holder;
                                                end;
                                            #< done __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                        #< done __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                        
                                        clear __divisor_plus_difference_copy_ne_zero;
                                        incr __divisor_plus_difference_copy_ne_zero;
                                        
                                        while __not___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear __divisor_plus_difference_copy_ne_zero;
                                            clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done __divisor_plus_difference_copy_ne_zero = not _not___divisor_plus_difference_copy_ne_zero;
                                #< done __divisor_plus_difference_copy_ne_zero = __divisor_plus_difference_copy != 0;
                                #> _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                                    #> _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                        #> __potential_prime_copy_copy = _potential_prime_copy;
                                            clear __potential_prime_copy_copy;
                                            #> __potential_prime_copy_copy += _potential_prime_copy;
                                                clear __potential_prime_copy_holder;
                                                
                                                while _potential_prime_copy not 0 do;
                                                    incr __potential_prime_copy_copy;
                                                    incr __potential_prime_copy_holder;
                                                    decr _potential_prime_copy;
                                                end;
                                                
                                                while __potential_prime_copy_holder not 0 do;
                                                    incr _potential_prime_copy;
                                                    decr __potential_prime_copy_holder;
                                                end;
                                            #< done __potential_prime_copy_copy += _potential_prime_copy;
                                        #< done __potential_prime_copy_copy = _potential_prime_copy;
                                        
                                        clear _not__potential_prime_copy_ne_zero;
                                        incr _not__potential_prime_copy_ne_zero;
                                        while __potential_prime_copy_copy not 0 do;
                                            clear _not__potential_prime_copy_ne_zero;
                                            clear __potential_prime_copy_copy;
                                        end;
                                    #< done _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                    #> _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                                        #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                            clear __not__potential_prime_copy_ne_zero_copy;
                                            #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                                clear __not__potential_prime_copy_ne_zero_holder;
                                                
                                                while _not__potential_prime_copy_ne_zero not 0 do;
                                                    incr __not__potential_prime_copy_ne_zero_copy;
                                                    incr __not__potential_prime_copy_ne_zero_holder;
                                                    decr _not__potential_prime_copy_ne_zero;
                                                end;
                                                
                                                while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                                    incr _not__potential_prime_copy_ne_zero;
                                                    decr __not__potential_prime_copy_ne_zero_holder;
                                                end;
                                            #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                        #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                        
                                        clear _potential_prime_copy_ne_zero;
                                        incr _potential_prime_copy_ne_zero;
                                        
                                        while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                            clear _potential_prime_copy_ne_zero;
                                            clear __not__potential_prime_copy_ne_zero_copy;
                                        end;
                                    #< done _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                                #< done _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                                #> _neither_are_zero = _potential_prime_copy_ne_zero and __divisor_plus_difference_copy_ne_zero;
                                    # DeMorgan's:
                                    #  (X and Y) = not ((not X) or (not Y))
                                    #> _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                        #> __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                            clear __potential_prime_copy_ne_zero_copy;
                                            #> __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                                clear __potential_prime_copy_ne_zero_holder;
                                                
                                                while _potential_prime_copy_ne_zero not 0 do;
                                                    incr __potential_prime_copy_ne_zero_copy;
                                                    incr __potential_prime_copy_ne_zero_holder;
                                                    decr _potential_prime_copy_ne_zero;
                                                end;
                                                
                                                while __potential_prime_copy_ne_zero_holder not 0 do;
                                                    incr _potential_prime_copy_ne_zero;
                                                    decr __potential_prime_copy_ne_zero_holder;
                                                end;
                                            #< done __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                        #< done __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                        
                                        clear _not__potential_prime_copy_ne_zero;
                                        incr _not__potential_prime_copy_ne_zero;
                                        
                                        while __potential_prime_copy_ne_zero_copy not 0 do;
                                            clear _not__potential_prime_copy_ne_zero;
                                            clear __potential_prime_copy_ne_zero_copy;
                                        end;
                                    #< done _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                    #> _not___divisor_plus_difference_copy_ne_zero = not __divisor_plus_difference_copy_ne_zero;
                                        #> ___divisor_plus_difference_copy_ne_zero_copy = __divisor_plus_difference_copy_ne_zero;
                                            clear ___divisor_plus_difference_copy_ne_zero_copy;
                                            #> ___divisor_plus_difference_copy_ne_zero_copy += __divisor_plus_difference_copy_ne_zero;
                                                clear ___divisor_plus_difference_copy_ne_zero_holder;
                                                
                                                while __divisor_plus_difference_copy_ne_zero not 0 do;
                                                    incr ___divisor_plus_difference_copy_ne_zero_copy;
                                                    incr ___divisor_plus_difference_copy_ne_zero_holder;
                                                    decr __divisor_plus_difference_copy_ne_zero;
                                                end;
                                                
                                                while ___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                                    incr __divisor_plus_difference_copy_ne_zero;
                                                    decr ___divisor_plus_difference_copy_ne_zero_holder;
                                                end;
                                            #< done ___divisor_plus_difference_copy_ne_zero_copy += __divisor_plus_difference_copy_ne_zero;
                                        #< done ___divisor_plus_difference_copy_ne_zero_copy = __divisor_plus_difference_copy_ne_zero;
                                        
                                        clear _not___divisor_plus_difference_copy_ne_zero;
                                        incr _not___divisor_plus_difference_copy_ne_zero;
                                        
                                        while ___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear _not___divisor_plus_difference_copy_ne_zero;
                                            clear ___divisor_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done _not___divisor_plus_difference_copy_ne_zero = not __divisor_plus_difference_copy_ne_zero;
                                    #> _inner_or = _not__potential_prime_copy_ne_zero or _not___divisor_plus_difference_copy_ne_zero;
                                        #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                            clear __not__potential_prime_copy_ne_zero_copy;
                                            #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                                clear __not__potential_prime_copy_ne_zero_holder;
                                                
                                                while _not__potential_prime_copy_ne_zero not 0 do;
                                                    incr __not__potential_prime_copy_ne_zero_copy;
                                                    incr __not__potential_prime_copy_ne_zero_holder;
                                                    decr _not__potential_prime_copy_ne_zero;
                                                end;
                                                
                                                while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                                    incr _not__potential_prime_copy_ne_zero;
                                                    decr __not__potential_prime_copy_ne_zero_holder;
                                                end;
                                            #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                        #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                        #> __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                            clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                            #> __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                                clear __not___divisor_plus_difference_copy_ne_zero_holder;
                                                
                                                while _not___divisor_plus_difference_copy_ne_zero not 0 do;
                                                    incr __not___divisor_plus_difference_copy_ne_zero_copy;
                                                    incr __not___divisor_plus_difference_copy_ne_zero_holder;
                                                    decr _not___divisor_plus_difference_copy_ne_zero;
                                                end;
                                                
                                                while __not___divisor_plus_difference_copy_ne_zero_holder not 0 do;
                                                    incr _not___divisor_plus_difference_copy_ne_zero;
                                                    decr __not___divisor_plus_difference_copy_ne_zero_holder;
                                                end;
                                            #< done __not___divisor_plus_difference_copy_ne_zero_copy += _not___divisor_plus_difference_copy_ne_zero;
                                        #< done __not___divisor_plus_difference_copy_ne_zero_copy = _not___divisor_plus_difference_copy_ne_zero;
                                        clear _inner_or;
                                        
                                        while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not__potential_prime_copy_ne_zero_copy;
                                        end;
                                        
                                        while __not___divisor_plus_difference_copy_ne_zero_copy not 0 do;
                                            clear _inner_or;
                                            incr _inner_or;
                                            clear __not___divisor_plus_difference_copy_ne_zero_copy;
                                        end;
                                    #< done _inner_or = _not__potential_prime_copy_ne_zero or _not___divisor_plus_difference_copy_ne_zero;
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
                                #< done _neither_are_zero = _potential_prime_copy_ne_zero and __divisor_plus_difference_copy_ne_zero;
                            end;
                            
                            
                            clear _difference;
                            
                            while _potential_prime_copy_ne_zero not 0 do;
                                # _potential_prime_copy_ne_zero is True, so potential_prime must be the larger
                                #> _difference = _potential_prime_copy;
                                    clear _difference;
                                    #> _difference += _potential_prime_copy;
                                        clear __potential_prime_copy_holder;
                                        
                                        while _potential_prime_copy not 0 do;
                                            incr _difference;
                                            incr __potential_prime_copy_holder;
                                            decr _potential_prime_copy;
                                        end;
                                        
                                        while __potential_prime_copy_holder not 0 do;
                                            incr _potential_prime_copy;
                                            decr __potential_prime_copy_holder;
                                        end;
                                    #< done _difference += _potential_prime_copy;
                                #< done _difference = _potential_prime_copy;
                                clear _potential_prime_copy_ne_zero;
                            end;
                            
                            while __divisor_plus_difference_copy_ne_zero not 0 do;
                                # __divisor_plus_difference_copy_ne_zero is True, so _divisor_plus_difference must be the larger
                                #> _difference = __divisor_plus_difference_copy;
                                    clear _difference;
                                    #> _difference += __divisor_plus_difference_copy;
                                        clear ___divisor_plus_difference_copy_holder;
                                        
                                        while __divisor_plus_difference_copy not 0 do;
                                            incr _difference;
                                            incr ___divisor_plus_difference_copy_holder;
                                            decr __divisor_plus_difference_copy;
                                        end;
                                        
                                        while ___divisor_plus_difference_copy_holder not 0 do;
                                            incr __divisor_plus_difference_copy;
                                            decr ___divisor_plus_difference_copy_holder;
                                        end;
                                    #< done _difference += __divisor_plus_difference_copy;
                                #< done _difference = __divisor_plus_difference_copy;
                                clear __divisor_plus_difference_copy_ne_zero;
                            end;
                        #< done _difference = abs(_divisor_plus_difference - potential_prime);
                        clear _divisor_plus_difference_eq_potential_prime;
                        incr _divisor_plus_difference_eq_potential_prime;
                        while _difference not 0 do;
                            clear _divisor_plus_difference_eq_potential_prime;
                            clear _difference;
                        end;
                        
                        # If _divisor_plus_difference == potential_prime, _divisor_plus_difference_eq_potential_prime = 1. Otherwise, _divisor_plus_difference_eq_potential_prime = 0
                    #< done _divisor_plus_difference_eq_potential_prime = _divisor_plus_difference == potential_prime;
                    # If X + abs(X - Y) == Y, Y was bigger, so false
                    #> _divisor_gt_potential_prime = not _divisor_plus_difference_eq_potential_prime;
                        #> __divisor_plus_difference_eq_potential_prime_copy = _divisor_plus_difference_eq_potential_prime;
                            clear __divisor_plus_difference_eq_potential_prime_copy;
                            #> __divisor_plus_difference_eq_potential_prime_copy += _divisor_plus_difference_eq_potential_prime;
                                clear __divisor_plus_difference_eq_potential_prime_holder;
                                
                                while _divisor_plus_difference_eq_potential_prime not 0 do;
                                    incr __divisor_plus_difference_eq_potential_prime_copy;
                                    incr __divisor_plus_difference_eq_potential_prime_holder;
                                    decr _divisor_plus_difference_eq_potential_prime;
                                end;
                                
                                while __divisor_plus_difference_eq_potential_prime_holder not 0 do;
                                    incr _divisor_plus_difference_eq_potential_prime;
                                    decr __divisor_plus_difference_eq_potential_prime_holder;
                                end;
                            #< done __divisor_plus_difference_eq_potential_prime_copy += _divisor_plus_difference_eq_potential_prime;
                        #< done __divisor_plus_difference_eq_potential_prime_copy = _divisor_plus_difference_eq_potential_prime;
                        
                        clear _divisor_gt_potential_prime;
                        incr _divisor_gt_potential_prime;
                        
                        while __divisor_plus_difference_eq_potential_prime_copy not 0 do;
                            clear _divisor_gt_potential_prime;
                            clear __divisor_plus_difference_eq_potential_prime_copy;
                        end;
                    #< done _divisor_gt_potential_prime = not _divisor_plus_difference_eq_potential_prime;
                #< done _divisor_gt_potential_prime = divisor > potential_prime;
                #> _divisor_eq_potential_prime = divisor == potential_prime;
                    #> _difference = abs(divisor - potential_prime);
                        #> _divisor_copy = divisor;
                            clear _divisor_copy;
                            #> _divisor_copy += divisor;
                                clear _divisor_holder;
                                
                                while divisor not 0 do;
                                    incr _divisor_copy;
                                    incr _divisor_holder;
                                    decr divisor;
                                end;
                                
                                while _divisor_holder not 0 do;
                                    incr divisor;
                                    decr _divisor_holder;
                                end;
                            #< done _divisor_copy += divisor;
                        #< done _divisor_copy = divisor;
                        #> _potential_prime_copy = potential_prime;
                            clear _potential_prime_copy;
                            #> _potential_prime_copy += potential_prime;
                                clear _potential_prime_holder;
                                
                                while potential_prime not 0 do;
                                    incr _potential_prime_copy;
                                    incr _potential_prime_holder;
                                    decr potential_prime;
                                end;
                                
                                while _potential_prime_holder not 0 do;
                                    incr potential_prime;
                                    decr _potential_prime_holder;
                                end;
                            #< done _potential_prime_copy += potential_prime;
                        #< done _potential_prime_copy = potential_prime;
                        
                        #> _divisor_copy_ne_zero = _divisor_copy != 0;
                            #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                #> __divisor_copy_copy = _divisor_copy;
                                    clear __divisor_copy_copy;
                                    #> __divisor_copy_copy += _divisor_copy;
                                        clear __divisor_copy_holder;
                                        
                                        while _divisor_copy not 0 do;
                                            incr __divisor_copy_copy;
                                            incr __divisor_copy_holder;
                                            decr _divisor_copy;
                                        end;
                                        
                                        while __divisor_copy_holder not 0 do;
                                            incr _divisor_copy;
                                            decr __divisor_copy_holder;
                                        end;
                                    #< done __divisor_copy_copy += _divisor_copy;
                                #< done __divisor_copy_copy = _divisor_copy;
                                
                                clear _not__divisor_copy_ne_zero;
                                incr _not__divisor_copy_ne_zero;
                                while __divisor_copy_copy not 0 do;
                                    clear _not__divisor_copy_ne_zero;
                                    clear __divisor_copy_copy;
                                end;
                            #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                            #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                    clear __not__divisor_copy_ne_zero_copy;
                                    #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_holder;
                                        
                                        while _not__divisor_copy_ne_zero not 0 do;
                                            incr __not__divisor_copy_ne_zero_copy;
                                            incr __not__divisor_copy_ne_zero_holder;
                                            decr _not__divisor_copy_ne_zero;
                                        end;
                                        
                                        while __not__divisor_copy_ne_zero_holder not 0 do;
                                            incr _not__divisor_copy_ne_zero;
                                            decr __not__divisor_copy_ne_zero_holder;
                                        end;
                                    #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                
                                clear _divisor_copy_ne_zero;
                                incr _divisor_copy_ne_zero;
                                
                                while __not__divisor_copy_ne_zero_copy not 0 do;
                                    clear _divisor_copy_ne_zero;
                                    clear __not__divisor_copy_ne_zero_copy;
                                end;
                            #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                        #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                        #> _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                            #> _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                #> __potential_prime_copy_copy = _potential_prime_copy;
                                    clear __potential_prime_copy_copy;
                                    #> __potential_prime_copy_copy += _potential_prime_copy;
                                        clear __potential_prime_copy_holder;
                                        
                                        while _potential_prime_copy not 0 do;
                                            incr __potential_prime_copy_copy;
                                            incr __potential_prime_copy_holder;
                                            decr _potential_prime_copy;
                                        end;
                                        
                                        while __potential_prime_copy_holder not 0 do;
                                            incr _potential_prime_copy;
                                            decr __potential_prime_copy_holder;
                                        end;
                                    #< done __potential_prime_copy_copy += _potential_prime_copy;
                                #< done __potential_prime_copy_copy = _potential_prime_copy;
                                
                                clear _not__potential_prime_copy_ne_zero;
                                incr _not__potential_prime_copy_ne_zero;
                                while __potential_prime_copy_copy not 0 do;
                                    clear _not__potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_copy;
                                end;
                            #< done _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                            #> _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                                #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                    #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_holder;
                                        
                                        while _not__potential_prime_copy_ne_zero not 0 do;
                                            incr __not__potential_prime_copy_ne_zero_copy;
                                            incr __not__potential_prime_copy_ne_zero_holder;
                                            decr _not__potential_prime_copy_ne_zero;
                                        end;
                                        
                                        while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                            incr _not__potential_prime_copy_ne_zero;
                                            decr __not__potential_prime_copy_ne_zero_holder;
                                        end;
                                    #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                
                                clear _potential_prime_copy_ne_zero;
                                incr _potential_prime_copy_ne_zero;
                                
                                while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                    clear _potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                end;
                            #< done _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                        #< done _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                        #> _neither_are_zero = _potential_prime_copy_ne_zero and _divisor_copy_ne_zero;
                            # DeMorgan's:
                            #  (X and Y) = not ((not X) or (not Y))
                            #> _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                #> __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_ne_zero_copy;
                                    #> __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_ne_zero_holder;
                                        
                                        while _potential_prime_copy_ne_zero not 0 do;
                                            incr __potential_prime_copy_ne_zero_copy;
                                            incr __potential_prime_copy_ne_zero_holder;
                                            decr _potential_prime_copy_ne_zero;
                                        end;
                                        
                                        while __potential_prime_copy_ne_zero_holder not 0 do;
                                            incr _potential_prime_copy_ne_zero;
                                            decr __potential_prime_copy_ne_zero_holder;
                                        end;
                                    #< done __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                #< done __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                
                                clear _not__potential_prime_copy_ne_zero;
                                incr _not__potential_prime_copy_ne_zero;
                                
                                while __potential_prime_copy_ne_zero_copy not 0 do;
                                    clear _not__potential_prime_copy_ne_zero;
                                    clear __potential_prime_copy_ne_zero_copy;
                                end;
                            #< done _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                            #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                    clear __divisor_copy_ne_zero_copy;
                                    #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                        clear __divisor_copy_ne_zero_holder;
                                        
                                        while _divisor_copy_ne_zero not 0 do;
                                            incr __divisor_copy_ne_zero_copy;
                                            incr __divisor_copy_ne_zero_holder;
                                            decr _divisor_copy_ne_zero;
                                        end;
                                        
                                        while __divisor_copy_ne_zero_holder not 0 do;
                                            incr _divisor_copy_ne_zero;
                                            decr __divisor_copy_ne_zero_holder;
                                        end;
                                    #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                
                                clear _not__divisor_copy_ne_zero;
                                incr _not__divisor_copy_ne_zero;
                                
                                while __divisor_copy_ne_zero_copy not 0 do;
                                    clear _not__divisor_copy_ne_zero;
                                    clear __divisor_copy_ne_zero_copy;
                                end;
                            #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                            #> _inner_or = _not__potential_prime_copy_ne_zero or _not__divisor_copy_ne_zero;
                                #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                    #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_holder;
                                        
                                        while _not__potential_prime_copy_ne_zero not 0 do;
                                            incr __not__potential_prime_copy_ne_zero_copy;
                                            incr __not__potential_prime_copy_ne_zero_holder;
                                            decr _not__potential_prime_copy_ne_zero;
                                        end;
                                        
                                        while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                            incr _not__potential_prime_copy_ne_zero;
                                            decr __not__potential_prime_copy_ne_zero_holder;
                                        end;
                                    #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                    clear __not__divisor_copy_ne_zero_copy;
                                    #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_holder;
                                        
                                        while _not__divisor_copy_ne_zero not 0 do;
                                            incr __not__divisor_copy_ne_zero_copy;
                                            incr __not__divisor_copy_ne_zero_holder;
                                            decr _not__divisor_copy_ne_zero;
                                        end;
                                        
                                        while __not__divisor_copy_ne_zero_holder not 0 do;
                                            incr _not__divisor_copy_ne_zero;
                                            decr __not__divisor_copy_ne_zero_holder;
                                        end;
                                    #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                clear _inner_or;
                                
                                while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__potential_prime_copy_ne_zero_copy;
                                end;
                                
                                while __not__divisor_copy_ne_zero_copy not 0 do;
                                    clear _inner_or;
                                    incr _inner_or;
                                    clear __not__divisor_copy_ne_zero_copy;
                                end;
                            #< done _inner_or = _not__potential_prime_copy_ne_zero or _not__divisor_copy_ne_zero;
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
                        #< done _neither_are_zero = _potential_prime_copy_ne_zero and _divisor_copy_ne_zero;
                        while _neither_are_zero not 0 do;
                            decr _divisor_copy;
                            decr _potential_prime_copy;
                            
                            #> _divisor_copy_ne_zero = _divisor_copy != 0;
                                #> _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                    #> __divisor_copy_copy = _divisor_copy;
                                        clear __divisor_copy_copy;
                                        #> __divisor_copy_copy += _divisor_copy;
                                            clear __divisor_copy_holder;
                                            
                                            while _divisor_copy not 0 do;
                                                incr __divisor_copy_copy;
                                                incr __divisor_copy_holder;
                                                decr _divisor_copy;
                                            end;
                                            
                                            while __divisor_copy_holder not 0 do;
                                                incr _divisor_copy;
                                                decr __divisor_copy_holder;
                                            end;
                                        #< done __divisor_copy_copy += _divisor_copy;
                                    #< done __divisor_copy_copy = _divisor_copy;
                                    
                                    clear _not__divisor_copy_ne_zero;
                                    incr _not__divisor_copy_ne_zero;
                                    while __divisor_copy_copy not 0 do;
                                        clear _not__divisor_copy_ne_zero;
                                        clear __divisor_copy_copy;
                                    end;
                                #< done _not__divisor_copy_ne_zero = _divisor_copy == 0;
                                #> _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                                    #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_copy;
                                        #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_holder;
                                            
                                            while _not__divisor_copy_ne_zero not 0 do;
                                                incr __not__divisor_copy_ne_zero_copy;
                                                incr __not__divisor_copy_ne_zero_holder;
                                                decr _not__divisor_copy_ne_zero;
                                            end;
                                            
                                            while __not__divisor_copy_ne_zero_holder not 0 do;
                                                incr _not__divisor_copy_ne_zero;
                                                decr __not__divisor_copy_ne_zero_holder;
                                            end;
                                        #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                    #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                    
                                    clear _divisor_copy_ne_zero;
                                    incr _divisor_copy_ne_zero;
                                    
                                    while __not__divisor_copy_ne_zero_copy not 0 do;
                                        clear _divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_copy;
                                    end;
                                #< done _divisor_copy_ne_zero = not _not__divisor_copy_ne_zero;
                            #< done _divisor_copy_ne_zero = _divisor_copy != 0;
                            #> _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                                #> _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                    #> __potential_prime_copy_copy = _potential_prime_copy;
                                        clear __potential_prime_copy_copy;
                                        #> __potential_prime_copy_copy += _potential_prime_copy;
                                            clear __potential_prime_copy_holder;
                                            
                                            while _potential_prime_copy not 0 do;
                                                incr __potential_prime_copy_copy;
                                                incr __potential_prime_copy_holder;
                                                decr _potential_prime_copy;
                                            end;
                                            
                                            while __potential_prime_copy_holder not 0 do;
                                                incr _potential_prime_copy;
                                                decr __potential_prime_copy_holder;
                                            end;
                                        #< done __potential_prime_copy_copy += _potential_prime_copy;
                                    #< done __potential_prime_copy_copy = _potential_prime_copy;
                                    
                                    clear _not__potential_prime_copy_ne_zero;
                                    incr _not__potential_prime_copy_ne_zero;
                                    while __potential_prime_copy_copy not 0 do;
                                        clear _not__potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_copy;
                                    end;
                                #< done _not__potential_prime_copy_ne_zero = _potential_prime_copy == 0;
                                #> _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                                    #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                        #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                            clear __not__potential_prime_copy_ne_zero_holder;
                                            
                                            while _not__potential_prime_copy_ne_zero not 0 do;
                                                incr __not__potential_prime_copy_ne_zero_copy;
                                                incr __not__potential_prime_copy_ne_zero_holder;
                                                decr _not__potential_prime_copy_ne_zero;
                                            end;
                                            
                                            while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                                incr _not__potential_prime_copy_ne_zero;
                                                decr __not__potential_prime_copy_ne_zero_holder;
                                            end;
                                        #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                    #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    
                                    clear _potential_prime_copy_ne_zero;
                                    incr _potential_prime_copy_ne_zero;
                                    
                                    while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                        clear _potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                    end;
                                #< done _potential_prime_copy_ne_zero = not _not__potential_prime_copy_ne_zero;
                            #< done _potential_prime_copy_ne_zero = _potential_prime_copy != 0;
                            #> _neither_are_zero = _potential_prime_copy_ne_zero and _divisor_copy_ne_zero;
                                # DeMorgan's:
                                #  (X and Y) = not ((not X) or (not Y))
                                #> _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                    #> __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_ne_zero_copy;
                                        #> __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                            clear __potential_prime_copy_ne_zero_holder;
                                            
                                            while _potential_prime_copy_ne_zero not 0 do;
                                                incr __potential_prime_copy_ne_zero_copy;
                                                incr __potential_prime_copy_ne_zero_holder;
                                                decr _potential_prime_copy_ne_zero;
                                            end;
                                            
                                            while __potential_prime_copy_ne_zero_holder not 0 do;
                                                incr _potential_prime_copy_ne_zero;
                                                decr __potential_prime_copy_ne_zero_holder;
                                            end;
                                        #< done __potential_prime_copy_ne_zero_copy += _potential_prime_copy_ne_zero;
                                    #< done __potential_prime_copy_ne_zero_copy = _potential_prime_copy_ne_zero;
                                    
                                    clear _not__potential_prime_copy_ne_zero;
                                    incr _not__potential_prime_copy_ne_zero;
                                    
                                    while __potential_prime_copy_ne_zero_copy not 0 do;
                                        clear _not__potential_prime_copy_ne_zero;
                                        clear __potential_prime_copy_ne_zero_copy;
                                    end;
                                #< done _not__potential_prime_copy_ne_zero = not _potential_prime_copy_ne_zero;
                                #> _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                    #> __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                        clear __divisor_copy_ne_zero_copy;
                                        #> __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                            clear __divisor_copy_ne_zero_holder;
                                            
                                            while _divisor_copy_ne_zero not 0 do;
                                                incr __divisor_copy_ne_zero_copy;
                                                incr __divisor_copy_ne_zero_holder;
                                                decr _divisor_copy_ne_zero;
                                            end;
                                            
                                            while __divisor_copy_ne_zero_holder not 0 do;
                                                incr _divisor_copy_ne_zero;
                                                decr __divisor_copy_ne_zero_holder;
                                            end;
                                        #< done __divisor_copy_ne_zero_copy += _divisor_copy_ne_zero;
                                    #< done __divisor_copy_ne_zero_copy = _divisor_copy_ne_zero;
                                    
                                    clear _not__divisor_copy_ne_zero;
                                    incr _not__divisor_copy_ne_zero;
                                    
                                    while __divisor_copy_ne_zero_copy not 0 do;
                                        clear _not__divisor_copy_ne_zero;
                                        clear __divisor_copy_ne_zero_copy;
                                    end;
                                #< done _not__divisor_copy_ne_zero = not _divisor_copy_ne_zero;
                                #> _inner_or = _not__potential_prime_copy_ne_zero or _not__divisor_copy_ne_zero;
                                    #> __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                        #> __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                            clear __not__potential_prime_copy_ne_zero_holder;
                                            
                                            while _not__potential_prime_copy_ne_zero not 0 do;
                                                incr __not__potential_prime_copy_ne_zero_copy;
                                                incr __not__potential_prime_copy_ne_zero_holder;
                                                decr _not__potential_prime_copy_ne_zero;
                                            end;
                                            
                                            while __not__potential_prime_copy_ne_zero_holder not 0 do;
                                                incr _not__potential_prime_copy_ne_zero;
                                                decr __not__potential_prime_copy_ne_zero_holder;
                                            end;
                                        #< done __not__potential_prime_copy_ne_zero_copy += _not__potential_prime_copy_ne_zero;
                                    #< done __not__potential_prime_copy_ne_zero_copy = _not__potential_prime_copy_ne_zero;
                                    #> __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                        clear __not__divisor_copy_ne_zero_copy;
                                        #> __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                            clear __not__divisor_copy_ne_zero_holder;
                                            
                                            while _not__divisor_copy_ne_zero not 0 do;
                                                incr __not__divisor_copy_ne_zero_copy;
                                                incr __not__divisor_copy_ne_zero_holder;
                                                decr _not__divisor_copy_ne_zero;
                                            end;
                                            
                                            while __not__divisor_copy_ne_zero_holder not 0 do;
                                                incr _not__divisor_copy_ne_zero;
                                                decr __not__divisor_copy_ne_zero_holder;
                                            end;
                                        #< done __not__divisor_copy_ne_zero_copy += _not__divisor_copy_ne_zero;
                                    #< done __not__divisor_copy_ne_zero_copy = _not__divisor_copy_ne_zero;
                                    clear _inner_or;
                                    
                                    while __not__potential_prime_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not__potential_prime_copy_ne_zero_copy;
                                    end;
                                    
                                    while __not__divisor_copy_ne_zero_copy not 0 do;
                                        clear _inner_or;
                                        incr _inner_or;
                                        clear __not__divisor_copy_ne_zero_copy;
                                    end;
                                #< done _inner_or = _not__potential_prime_copy_ne_zero or _not__divisor_copy_ne_zero;
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
                            #< done _neither_are_zero = _potential_prime_copy_ne_zero and _divisor_copy_ne_zero;
                        end;
                        
                        
                        clear _difference;
                        
                        while _potential_prime_copy_ne_zero not 0 do;
                            # _potential_prime_copy_ne_zero is True, so potential_prime must be the larger
                            #> _difference = _potential_prime_copy;
                                clear _difference;
                                #> _difference += _potential_prime_copy;
                                    clear __potential_prime_copy_holder;
                                    
                                    while _potential_prime_copy not 0 do;
                                        incr _difference;
                                        incr __potential_prime_copy_holder;
                                        decr _potential_prime_copy;
                                    end;
                                    
                                    while __potential_prime_copy_holder not 0 do;
                                        incr _potential_prime_copy;
                                        decr __potential_prime_copy_holder;
                                    end;
                                #< done _difference += _potential_prime_copy;
                            #< done _difference = _potential_prime_copy;
                            clear _potential_prime_copy_ne_zero;
                        end;
                        
                        while _divisor_copy_ne_zero not 0 do;
                            # _divisor_copy_ne_zero is True, so divisor must be the larger
                            #> _difference = _divisor_copy;
                                clear _difference;
                                #> _difference += _divisor_copy;
                                    clear __divisor_copy_holder;
                                    
                                    while _divisor_copy not 0 do;
                                        incr _difference;
                                        incr __divisor_copy_holder;
                                        decr _divisor_copy;
                                    end;
                                    
                                    while __divisor_copy_holder not 0 do;
                                        incr _divisor_copy;
                                        decr __divisor_copy_holder;
                                    end;
                                #< done _difference += _divisor_copy;
                            #< done _difference = _divisor_copy;
                            clear _divisor_copy_ne_zero;
                        end;
                    #< done _difference = abs(divisor - potential_prime);
                    clear _divisor_eq_potential_prime;
                    incr _divisor_eq_potential_prime;
                    while _difference not 0 do;
                        clear _divisor_eq_potential_prime;
                        clear _difference;
                    end;
                    
                    # If divisor == potential_prime, _divisor_eq_potential_prime = 1. Otherwise, _divisor_eq_potential_prime = 0
                #< done _divisor_eq_potential_prime = divisor == potential_prime;
                #> _divisor_ge_potential_prime = _divisor_gt_potential_prime or _divisor_eq_potential_prime;
                    #> __divisor_gt_potential_prime_copy = _divisor_gt_potential_prime;
                        clear __divisor_gt_potential_prime_copy;
                        #> __divisor_gt_potential_prime_copy += _divisor_gt_potential_prime;
                            clear __divisor_gt_potential_prime_holder;
                            
                            while _divisor_gt_potential_prime not 0 do;
                                incr __divisor_gt_potential_prime_copy;
                                incr __divisor_gt_potential_prime_holder;
                                decr _divisor_gt_potential_prime;
                            end;
                            
                            while __divisor_gt_potential_prime_holder not 0 do;
                                incr _divisor_gt_potential_prime;
                                decr __divisor_gt_potential_prime_holder;
                            end;
                        #< done __divisor_gt_potential_prime_copy += _divisor_gt_potential_prime;
                    #< done __divisor_gt_potential_prime_copy = _divisor_gt_potential_prime;
                    #> __divisor_eq_potential_prime_copy = _divisor_eq_potential_prime;
                        clear __divisor_eq_potential_prime_copy;
                        #> __divisor_eq_potential_prime_copy += _divisor_eq_potential_prime;
                            clear __divisor_eq_potential_prime_holder;
                            
                            while _divisor_eq_potential_prime not 0 do;
                                incr __divisor_eq_potential_prime_copy;
                                incr __divisor_eq_potential_prime_holder;
                                decr _divisor_eq_potential_prime;
                            end;
                            
                            while __divisor_eq_potential_prime_holder not 0 do;
                                incr _divisor_eq_potential_prime;
                                decr __divisor_eq_potential_prime_holder;
                            end;
                        #< done __divisor_eq_potential_prime_copy += _divisor_eq_potential_prime;
                    #< done __divisor_eq_potential_prime_copy = _divisor_eq_potential_prime;
                    clear _divisor_ge_potential_prime;
                    
                    while __divisor_gt_potential_prime_copy not 0 do;
                        clear _divisor_ge_potential_prime;
                        incr _divisor_ge_potential_prime;
                        clear __divisor_gt_potential_prime_copy;
                    end;
                    
                    while __divisor_eq_potential_prime_copy not 0 do;
                        clear _divisor_ge_potential_prime;
                        incr _divisor_ge_potential_prime;
                        clear __divisor_eq_potential_prime_copy;
                    end;
                #< done _divisor_ge_potential_prime = _divisor_gt_potential_prime or _divisor_eq_potential_prime;
            #< done _divisor_ge_potential_prime = divisor >= potential_prime;
            #> divisor_lt_potential_prime = not _divisor_ge_potential_prime;
                #> __divisor_ge_potential_prime_copy = _divisor_ge_potential_prime;
                    clear __divisor_ge_potential_prime_copy;
                    #> __divisor_ge_potential_prime_copy += _divisor_ge_potential_prime;
                        clear __divisor_ge_potential_prime_holder;
                        
                        while _divisor_ge_potential_prime not 0 do;
                            incr __divisor_ge_potential_prime_copy;
                            incr __divisor_ge_potential_prime_holder;
                            decr _divisor_ge_potential_prime;
                        end;
                        
                        while __divisor_ge_potential_prime_holder not 0 do;
                            incr _divisor_ge_potential_prime;
                            decr __divisor_ge_potential_prime_holder;
                        end;
                    #< done __divisor_ge_potential_prime_copy += _divisor_ge_potential_prime;
                #< done __divisor_ge_potential_prime_copy = _divisor_ge_potential_prime;
                
                clear divisor_lt_potential_prime;
                incr divisor_lt_potential_prime;
                
                while __divisor_ge_potential_prime_copy not 0 do;
                    clear divisor_lt_potential_prime;
                    clear __divisor_ge_potential_prime_copy;
                end;
            #< done divisor_lt_potential_prime = not _divisor_ge_potential_prime;
        #< done divisor_lt_potential_prime = divisor < potential_prime;
    end;
    
    while is_prime not 0 do;
        print potential_prime;
        clear is_prime;
    end;
    
    # No point checking evens:
    incr potential_prime;
    incr potential_prime;
end;