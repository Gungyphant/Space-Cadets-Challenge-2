clear _first_addend_holder;

while first_addend_variable not 0 do;
    incr result_variable;
    incr _first_addend_holder;
    decr first_addend_variable;
end;

while _first_addend_holder not 0 do;
    incr first_addend_variable;
    decr _first_addend_holder;
end;