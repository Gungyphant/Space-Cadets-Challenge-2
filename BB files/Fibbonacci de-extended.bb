clear first_val;
incr first_val;
clear second_val;
incr second_val;

print first_val;
print second_val;

while first_val not 0 do;
    # Effectively a while True
    #> first_val = first_val + second_val;
        #> _first_val_copy = first_val;
            clear _first_val_copy;
            #> _first_val_copy += first_val;
                clear _first_val_holder;
                
                while first_val not 0 do;
                    incr _first_val_copy;
                    incr _first_val_holder;
                    decr first_val;
                end;
                
                while _first_val_holder not 0 do;
                    incr first_val;
                    decr _first_val_holder;
                end;
            #< done _first_val_copy += first_val;
        #< done _first_val_copy = first_val;
        #> _second_val_copy = second_val;
            clear _second_val_copy;
            #> _second_val_copy += second_val;
                clear _second_val_holder;
                
                while second_val not 0 do;
                    incr _second_val_copy;
                    incr _second_val_holder;
                    decr second_val;
                end;
                
                while _second_val_holder not 0 do;
                    incr second_val;
                    decr _second_val_holder;
                end;
            #< done _second_val_copy += second_val;
        #< done _second_val_copy = second_val;
        clear first_val;
        #> first_val += _first_val_copy;
            clear __first_val_copy_holder;
            
            while _first_val_copy not 0 do;
                incr first_val;
                incr __first_val_copy_holder;
                decr _first_val_copy;
            end;
            
            while __first_val_copy_holder not 0 do;
                incr _first_val_copy;
                decr __first_val_copy_holder;
            end;
        #< done first_val += _first_val_copy;
        #> first_val += _second_val_copy;
            clear __second_val_copy_holder;
            
            while _second_val_copy not 0 do;
                incr first_val;
                incr __second_val_copy_holder;
                decr _second_val_copy;
            end;
            
            while __second_val_copy_holder not 0 do;
                incr _second_val_copy;
                decr __second_val_copy_holder;
            end;
        #< done first_val += _second_val_copy;
    #< done first_val = first_val + second_val;
    print first_val;
    #> second_val = first_val + second_val;
        #> _first_val_copy = first_val;
            clear _first_val_copy;
            #> _first_val_copy += first_val;
                clear _first_val_holder;
                
                while first_val not 0 do;
                    incr _first_val_copy;
                    incr _first_val_holder;
                    decr first_val;
                end;
                
                while _first_val_holder not 0 do;
                    incr first_val;
                    decr _first_val_holder;
                end;
            #< done _first_val_copy += first_val;
        #< done _first_val_copy = first_val;
        #> _second_val_copy = second_val;
            clear _second_val_copy;
            #> _second_val_copy += second_val;
                clear _second_val_holder;
                
                while second_val not 0 do;
                    incr _second_val_copy;
                    incr _second_val_holder;
                    decr second_val;
                end;
                
                while _second_val_holder not 0 do;
                    incr second_val;
                    decr _second_val_holder;
                end;
            #< done _second_val_copy += second_val;
        #< done _second_val_copy = second_val;
        clear second_val;
        #> second_val += _first_val_copy;
            clear __first_val_copy_holder;
            
            while _first_val_copy not 0 do;
                incr second_val;
                incr __first_val_copy_holder;
                decr _first_val_copy;
            end;
            
            while __first_val_copy_holder not 0 do;
                incr _first_val_copy;
                decr __first_val_copy_holder;
            end;
        #< done second_val += _first_val_copy;
        #> second_val += _second_val_copy;
            clear __second_val_copy_holder;
            
            while _second_val_copy not 0 do;
                incr second_val;
                incr __second_val_copy_holder;
                decr _second_val_copy;
            end;
            
            while __second_val_copy_holder not 0 do;
                incr _second_val_copy;
                decr __second_val_copy_holder;
            end;
        #< done second_val += _second_val_copy;
    #< done second_val = first_val + second_val;
    print second_val;
end;