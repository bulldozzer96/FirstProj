package com.ua.RD.lesson10.part3;

public class Child extends Parent {


    static {
        System.out.println("Child static-1");
    }

    {
        System.out.println("Child-1");
    }

    {
        System.out.println("Child-2");
    }

    public Child() {
        System.out.println("Child");
    }


}
