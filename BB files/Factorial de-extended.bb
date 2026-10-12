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
        clear result;
        while _result_copy not 0 do;
            #> result += _X_copy;
                clear __X_copy_holder;
                
                while _X_copy not 0 do;
                    incr result;
                    incr __X_copy_holder;
                    decr _X_copy;
                end;
                
                while __X_copy_holder not 0 do;
                    incr _X_copy;
                    decr __X_copy_holder;
                end;
            #< done result += _X_copy;
            decr _result_copy;
        end;
        # Note: this is faster if result is larger than X
    #< done
    decr X;
end;
# This code will call parse_line O(X!) times. This cannot be improved upon, as the bare minimum number of lines would be X! + 1 (one `clear`, and X! `incr`s)
# The true number, however, is <= 3 + 13.5x - 2.5x^2 + 22e*x!