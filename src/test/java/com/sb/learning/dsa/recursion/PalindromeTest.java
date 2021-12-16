package com.sb.learning.dsa.recursion;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PalindromeTest extends TestCase {
    Palindrome palindrome;

    @Before
    public void setup(){
        palindrome = new Palindrome();
    }

    @Test
    public void shouldCheckForPalindrome(){
        assertEquals(false, palindrome.isPalindrome("awesome"));
        assertEquals(true, palindrome.isPalindrome("tacocat"));
        assertEquals(true, palindrome.isPalindrome("taccat"));
    }
}