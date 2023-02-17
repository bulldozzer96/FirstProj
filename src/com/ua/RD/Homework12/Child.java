package com.ua.RD.Homework12;

public class Child extends Parent {
    static {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }
    static {
        System.out.println("4");
    }

    {
        System.out.println("7");
    }

    {
        System.out.println("8");
    }

    public Child() {
        System.out.println("9");
    }
}
