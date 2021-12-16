package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GcdTest extends TestCase {

    Gcd gcd;

    @Before
    public void setup(){
        gcd = new Gcd();
    }

    @Test
    public void shouldCalculateGCDofTwoNumbers() throws InvalidInputException {
        int answer = gcd.gcd(48, 18);
        assertEquals(6, answer);
    }

    @Test(expected = InvalidInputException.class)
    public void shouldRaiseErrorForInvalidInputs() throws InvalidInputException {
        gcd.gcd(18, 48);
        gcd.gcd(-1, 7);
        gcd. gcd(-2, -3);
    }
}