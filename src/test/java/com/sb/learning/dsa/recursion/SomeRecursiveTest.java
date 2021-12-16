package com.sb.learning.dsa.recursion;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeRecursiveTest extends TestCase {
    SomeRecursive someRecursive;

    @Before
    public void setup(){
        someRecursive = new SomeRecursive();
    }

    @Test
    public void shouldCheckInput(){
        SomeRecursive.OddFuntion oddFunction = new SomeRecursive.OddFuntion();
        int[] listOfNums = new int[] { 1, 3, 4, 6};
        assertEquals(true, someRecursive.someRecursive(listOfNums, oddFunction));

        listOfNums = new int[] {2, 4, 6, 8};
        assertEquals(false, someRecursive.someRecursive(listOfNums, oddFunction));
    }
}