clear X;
incr X;
incr X;
incr X;
incr X;
incr X;

clear result;
incr result;

while X not 0 do;
    #> result = result * X;
        #> _result_copy = result;
            clear _result_copy;
            #> _result_copy += result;
                clear _result_holder;
                
                while result not 0 do;
                    incr _result_copy;
                    incr _result_holder;
                    decr result;
                end;
                
                while _result_holder not 0 do;
                    incr result;
                    decr _result_holder;
                end;
            #< done _result_copy += result;
        #< done _result_copy = result;
        clear result;
        while _result_copy not 0 do;
            #> result += X;
                clear _X_holder;
                
                while X not 0 do;
                    incr result;
                    incr _X_holder;
                    decr X;
                end;
                
                while _X_holder not 0 do;
                    incr X;
                    decr _X_holder;
                end;
            #< done result += X;
            decr _result_copy;
        end;
    #< done
    decr X;
end;