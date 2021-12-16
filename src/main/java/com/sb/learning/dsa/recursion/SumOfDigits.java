package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/*Find the sum of digits of any positive integer*/
@Slf4j
public class SumOfDigits {
    public int sumOfDigits(int number) throws InvalidInputException {
        if (number < 0){
            throw new InvalidInputException("Only valid for positive numbers", "Invalid Input" , null);
        }

        String[] digits = String.valueOf(number).split("");

        if (digits.length == 1){
            return Integer.parseInt(digits[0]);
        }

        int newNumber = sumOfDigits(Integer.parseInt(String.join("",
                Arrays.copyOfRange(digits, 0, digits.length - 1))));

        int result = Integer.parseInt(digits[digits.length - 1]) + newNumber;

        log.info("Result: {}", result);
        return result;
    }

    public int sumOfDigitsOptimized(int number) throws InvalidInputException {
        if (number < 0){
            throw new InvalidInputException("Only valid for positive numbers", "Invalid Input" , null);
        }

        String[] digits = String.valueOf(number).split("");

        if (digits.length / 2 == 1/2){
            return Integer.parseInt(digits[0]);
        }

        if (digits.length % 2 != 0){
            String[] firstHalfDigits = Arrays.copyOfRange(digits, 0, (digits.length - 1) / 2);
            String[] secondHalfDigits = Arrays.copyOfRange(digits, (digits.length - 1) / 2, (digits.length - 1));

            int result = Integer.parseInt(digits[digits.length - 1]) + sumOfDigitsOptimized(Integer.parseInt(String.join("", firstHalfDigits)))
                    + sumOfDigitsOptimized(Integer.parseInt(String.join("", secondHalfDigits)));

            log.info("Result: {}", result);
            return result;
        } else {
            String[] firstHalfDigits = Arrays.copyOfRange(digits, 0, digits.length / 2);
            String[] secondHalfDigits = Arrays.copyOfRange(digits, digits.length / 2, digits.length);

            int result = sumOfDigitsOptimized(Integer.parseInt(String.join("", firstHalfDigits)))
                    + sumOfDigitsOptimized(Integer.parseInt(String.join("", secondHalfDigits)));

            log.info("Result: {}", result);
            return result;
        }
    }

    public int sumOfDigitsBest(int number) throws InvalidInputException {
        if (number < 0) {
            throw new InvalidInputException("Only valid for positive numbers", "Invalid Input" , null);
        }
        if (number == 0){
            return 0;
        }
        return number % 10 + sumOfDigitsBest(number/10);
    }
}
