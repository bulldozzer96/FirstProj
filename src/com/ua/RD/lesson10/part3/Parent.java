package com.ua.RD.lesson10.part3;

public class Parent {


    static {
        System.out.println("Parent static-1");
    }

    {   //блок ініціалізації викликається у порядку написання
        // набір операцій ініціалізації перед конструктором
        System.out.println("Parent-1");
    }

    public Parent() {
        System.out.println("Parent");
    }
}
