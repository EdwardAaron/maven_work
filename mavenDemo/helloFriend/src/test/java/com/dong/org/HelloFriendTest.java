package com.dong.org;

import org.junit.Test;

import static junit.framework.Assert.*;
public class HelloFriendTest {
    @Test
    public void testHelloFriend() {
        HelloFriend helloFriend = new HelloFriend();
        String str = helloFriend.sayHelloToFriend("lucia");
        assertEquals("Hello lucia,I am lifu", str);
    }
}
