package com.sb.learning.dsa.recursion;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FirstUpperCaseTest extends TestCase {
    FirstUpperCase firstUpperCase;

    @Before
    public void setup(){
        firstUpperCase = new FirstUpperCase();
    }

    @Test
    public void shouldReturnFirstUppercaseLetter(){
        assertEquals('B', firstUpperCase.firstUpperCase("shiviB"));
    }
}