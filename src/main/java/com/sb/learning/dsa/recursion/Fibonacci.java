package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;
import com.sb.learning.dsa.utils.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fibonacci {
    public int fibonacci(int[] result, int n) throws InvalidInputException {
        if (n < 0 || result.length <= n){
            throw new InvalidInputException("Factorial only valid for positive numbers", "Invalid Input", null);
        }
        if (n == 1 || n == 0) {
            result[n] = n;
        } else {
            result[n] = fibonacci(result, n - 1) + fibonacci(result, n - 2);
        }
        log.info("filled: {} nth: {}", Arrays.join(",", result), n);
        return result[n];
    }
}
