package com.dong.org;

public class HelloFriend {
    public String sayHelloToFriend(String name) {
        Hello hello = new Hello();
        String str = hello.sayHello("lucia") + ",I am " + getName();
        return str;
    }

    public String getName() {
        return "lifu";
    }
}
