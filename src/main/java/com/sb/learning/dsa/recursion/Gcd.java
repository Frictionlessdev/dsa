package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;

/*Calculate Greatest Common Divisor/Highest Common Factor/Greatest Common Factor GCD/HCF/GCF*/
public class Gcd {
    public int gcd(int x, int y) throws InvalidInputException {
        if (x < y || x < 0 || y <0)
            throw new InvalidInputException("x should be less than y", "Invalid Input", null);

        if (y == 0){
            return x;
        }

        return gcd(y, x % y);
    }
}
