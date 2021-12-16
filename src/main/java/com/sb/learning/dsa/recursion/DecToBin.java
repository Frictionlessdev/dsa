package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;

/* Convert Decimal to Binary using recursion*/
public class DecToBin {
    public String decToBinNotEfficient(int number) throws InvalidInputException {
        if (number < 0){
            throw new InvalidInputException("Input should be a positive integer", "Invalid Input", null);
        }
        if (number == 1){
            return "1";
        }
        return decToBinNotEfficient(number/2) + (number % 2);
    }

    public int decToBin(int number) throws InvalidInputException {
        if (number < 0){
            throw new InvalidInputException("Input should be a positive integer", "Invalid Input", null);
        }
        if (number == 0)
            return 0;
        return (number % 2) + 10 * decToBin(number/2);
    }
}
