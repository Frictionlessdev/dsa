package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SumOfDigitsTest extends TestCase {

    SumOfDigits problemOne = new SumOfDigits();

    @Test
    public void shouldReturnSumOfDigits() throws InvalidInputException {
        assertEquals(5, problemOne.sumOfDigits(23));
        assertEquals(16, problemOne.sumOfDigits(2356));
        assertEquals(31, problemOne.sumOfDigits(235678));
    }

    @Test
    public void shouldReturnSumOfEvenDigitPositiveNumberOptimized() throws InvalidInputException {
        //assertEquals(5, problemOne.sumOfDigitsOptimized(23));
        assertEquals(16, problemOne.sumOfDigitsOptimized(2356));
        assertEquals(31, problemOne.sumOfDigitsOptimized(235678));
    }

    @Test
    public void shouldReturnSumOfOddDigitPositiveNumberOptimized() throws InvalidInputException {
        //assertEquals(5, problemOne.sumOfDigitsOptimized(23));
        assertEquals(17, problemOne.sumOfDigitsOptimized(23561));
        assertEquals(32, problemOne.sumOfDigitsOptimized(2356781));
    }

    @Test(expected = InvalidInputException.class)
    public void shouldRaiseErrorOnInvalidInput() throws InvalidInputException {
        problemOne.sumOfDigitsOptimized(-1);
    }

    @Test
    public void shouldReturnSumOfDigitsBest() throws InvalidInputException {
        assertEquals(5, problemOne.sumOfDigitsBest(23));
        assertEquals(16, problemOne.sumOfDigitsBest(2356));
        assertEquals(31, problemOne.sumOfDigitsBest(235678));
    }

}