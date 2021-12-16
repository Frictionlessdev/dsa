package com.sb.learning.dsa;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class IntroTest {

    Intro intro = new Intro();

    @Test
    public void shouldIntroduce(){
        Assert.assertEquals( "Hello, Shivi", intro.introduction("Shivi"));
    }
}