package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PowerOfTest extends TestCase {

    PowerOf problemTwo = new PowerOf();

    @Test
    public void shouldGetPowerOfNumber() throws InvalidInputException {
        assertEquals(8, problemTwo.powerOf(2, 3));
        assertEquals(32, problemTwo.powerOf(2, 5));
    }

    @Test(expected = InvalidInputException.class)
    public void shouldRaiseErrorForInvalidInput() throws InvalidInputException {
        assertEquals(8, problemTwo.powerOf(2, -1));
    }

}