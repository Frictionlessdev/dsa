package com.sb.learning.dsa.recursion;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CapitalizeWordsTest extends TestCase {
    CapitalizeWords capitalizeWords;

    @Before
    public void setup(){
        capitalizeWords = new CapitalizeWords();
    }

    @Test
    public void shouldCapitalizeWords(){
        assertEquals("A Great Month", capitalizeWords.capitalizeWords("a great month"));
    }
}