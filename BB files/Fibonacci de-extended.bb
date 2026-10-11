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
        clear result;
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
        while _fmv_copy not 0 do;
            #> add X into result;
                clear _first_addend_holder;
                
                while X not 0 do;
                    incr result;
                    incr _first_addend_holder;
                    decr X;
                end;
                
                while _first_addend_holder not 0 do;
                    incr X;
                    decr _first_addend_holder;
                end;
            #< done
            decr _fmv_copy;
        end;
    #< done
    decr X;
end;