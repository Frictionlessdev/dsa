package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FactorialTest extends TestCase {

    Factorial factorial = new Factorial();

    @Test
    public void shouldCalculateFactorialOfGivenNumber() throws InvalidInputException {
        assertEquals(4*3*2, factorial.factorial(4));
    }

    @Test(expected = InvalidInputException.class)
    public void shouldRaiseErrorOnInvalidInput() throws InvalidInputException {
        factorial.factorial(-1);
    }
}