clear X;
incr X;
incr X;
incr X;
incr X;
incr X;

clear result;
incr result;

while X not 0 do;
    #> multiply result by X into result;
        #> set _fmv_copy to result;
            clear _fmv_copy;
            #> add result into _fmv_copy;
                clear _first_addend_holder;
                
                while result not 0 do;
                    incr _fmv_copy;
                    incr _first_addend_holder;
                    decr result;
                end;
                
                while _first_addend_holder not 0 do;
                    incr result;
                    decr _first_addend_holder;
                end;
            #< done
        #< done
        #> set _smv_copy to X;
            clear _smv_copy;
            #> add X into _smv_copy;
                clear _first_addend_holder;
                
                while X not 0 do;
                    incr _smv_copy;
                    incr _first_addend_holder;
                    decr X;
                end;
                
                while _first_addend_holder not 0 do;
                    incr X;
                    decr _first_addend_holder;
                end;
            #< done
        #< done
        clear result;
        while _fmv_copy not 0 do;
            #> add _smv_copy into result;
                clear _first_addend_holder;
                
                while _smv_copy not 0 do;
                    incr result;
                    incr _first_addend_holder;
                    decr _smv_copy;
                end;
                
                while _first_addend_holder not 0 do;
                    incr _smv_copy;
                    decr _first_addend_holder;
                end;
            #< done
            decr _fmv_copy;
        end;
    #< done
    decr X;
end;
# This code will call parse_line O(X!) times. This cannot be improved upon, as the bare minimum number of lines would be X! + 1 (one clear, and X! incrs)
# The true number, however, is <= 3 + 13.5X - 2.5X^2 + 22e*X!