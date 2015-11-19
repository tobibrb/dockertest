package com.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testApp()
    {
        Hello hello = new Hello();
        assertTrue( hello.home().equals("Hello World!") );
    }
}