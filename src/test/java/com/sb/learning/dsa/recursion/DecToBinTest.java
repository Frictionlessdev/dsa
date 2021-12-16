package com.sb.learning.dsa.recursion;

import com.sb.learning.dsa.error.InvalidInputException;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DecToBinTest extends TestCase {
    DecToBin decToBin;

    @Before
    public void setup(){
        decToBin = new DecToBin();
    }

    @Test
    public void shouldConvertDecimalToBinaryNotEfficient() throws InvalidInputException {
        assertEquals("1110", decToBin.decToBinNotEfficient(14));
        assertEquals("1000", decToBin.decToBinNotEfficient(8));
        assertEquals("1111", decToBin.decToBinNotEfficient(15));
        assertEquals("11", decToBin.decToBinNotEfficient(3));
        assertEquals("1101", decToBin.decToBinNotEfficient(13));
    }

    @Test
    public void shouldConvertDecimalToBinary() throws InvalidInputException {
        assertEquals(1110, decToBin.decToBin(14));
        assertEquals(1000, decToBin.decToBin(8));
        assertEquals(1111, decToBin.decToBin(15));
        assertEquals(11, decToBin.decToBin(3));
        assertEquals(1101, decToBin.decToBin(13));
    }

    @Test(expected = InvalidInputException.class)
    public void shouldRaiseErrorForInvalidInput() throws InvalidInputException {
        decToBin.decToBin(-2);
    }
}