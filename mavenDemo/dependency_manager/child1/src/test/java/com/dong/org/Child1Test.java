package com.dong.org;

import org.junit.Test;

import static junit.framework.Assert.*;

public class Child1Test {
    @Test
    public void infoTest() {
        Child1 child1 = new Child1();
        assertEquals("this is child1", child1.info());
    }
}
