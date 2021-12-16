package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;

public class Factorial {
    public int factorial(int n) throws InvalidInputException {
        if (n < 0){
            throw new InvalidInputException("Factorial only valid for positive numbers", "Invalid Input", null);
        }
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }
}
