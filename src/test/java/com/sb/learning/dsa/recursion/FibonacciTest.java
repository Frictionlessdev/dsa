package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;

@RunWith(MockitoJUnitRunner.class)
public class FibonacciTest extends TestCase {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void shouldGenerateNthFibonacci() throws InvalidInputException {
        int[] result = new int[]{0,0,0,0,0,0,0,0,0};
        fibonacci.fibonacci(result, 8);
        assertArrayEquals(new int[]{0,1,1,2,3,5,8,13,21}, result);
    }

    @Test(expected = InvalidInputException.class)
    public void shouldThrowErrorOnNegativeValues() throws InvalidInputException {
        fibonacci.fibonacci(new int[]{0,0}, -1);
    }

    @Test(expected = InvalidInputException.class)
    public void shouldThrowErrorOnInsufficientArr() throws InvalidInputException {
        fibonacci.fibonacci(new int[]{0,0}, 2);
    }
}