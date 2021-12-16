package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;

/*Calculate power of a number using recursion*/
public class PowerOf {
    public int powerOf(int number, int n) throws InvalidInputException {
        if (n < 0){
            throw new InvalidInputException("Only valid for positive numbers", "Invalid Input" , null);
        }
        if (n == 0){
            return 1;
        }
        return number * powerOf(number, n - 1);
    }
}
