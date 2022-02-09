package com.dong.org;

import org.junit.Test;

import static junit.framework.Assert.*;
public class HelloTest {
    @Test
    public void testHello() {
        Hello hello = new Hello();
        String result = hello.sayHello("lucia");
        assertEquals("Hello lucia", result);
    }
}
