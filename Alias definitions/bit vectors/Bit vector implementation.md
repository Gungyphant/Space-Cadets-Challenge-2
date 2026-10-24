_The underlying theory of this implementation is by [reisensei](https://codeberg.org/reisensei)_

A bit vector can be stored as an integer by having each bit of the binary representation of the int correspond to a bit in the vector, with the LSB being the first element of the bit vector. For example, the bit vector `[1, 0, 1, 1]` can be stored as `0b1101` = `13`. Note that this means every bit vector has infinite trailing 0s.

Accordingly, to get the nth bit of the bit vector V (`V[n]`), a copy of the vector must be 'right-shifted' n times (i.e. divided by 2<sup>n</sup> with the remainder dropped) and then modulo‍-‍ed by 2. This is quite inefficient, as division is O(⌊n/d⌋ * d), where n and d are the numerator and denominators respectively, and modulo (which itself uses division) is the same. Hence, getting V[n] is O(⌊V/(2<sup>n</sup>)⌋ * 2<sup>n</sup> + ⌊V/2⌋ * 2) ≈ 2V ([graph](https://www.desmos.com/3d/m6awxxuqgg))

To set bit n of V to 1, it must be known what it is (via getting it). If it is 1, do nothing; if it is 0, add 2<sup>n</sup>.
<br>
Similarly, to set bit n of V, get it, and if it's 1, subtract 2<sup>n</sup>, doing nothing if it's 0.

