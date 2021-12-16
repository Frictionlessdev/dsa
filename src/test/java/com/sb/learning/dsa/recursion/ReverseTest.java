package com.sb.learning.dsa.recursion;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReverseTest extends TestCase {
    Reverse reverse;

    @Before
    public void setup(){
        reverse = new Reverse();
    }

    @Test
    public void shouldReverseInput(){
        assertEquals("avaj", reverse.reverse("java"));
    }
}