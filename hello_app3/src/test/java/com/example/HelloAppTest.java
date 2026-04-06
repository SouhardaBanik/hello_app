package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloAppTest {
    @Test
    public void testGreet() {
        String result = HelloApp.greet("World");
        assertEquals("Hello, World!", result);
    }
    
    @Test
    public void testGreetWithName() {
        String result = HelloApp.greet("Maven");
        assertEquals("Hello, Maven!", result);
    }
}
