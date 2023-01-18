package com.ua.RD.Homework3;

public class Main {
    public static void main(String[] args) {

        int a = 11;
        int b = 13;

        System.out.println(a + b); //  11+13=24
        System.out.println(a - b); //  11-13=-2
        System.out.println(a / b); //  11/13=0 недостатня величина "а" для цілочисельного ділення
        System.out.println(a % b); //  11%13=11 залишок від ділення, яке не відбувається (тому залишок у розмірі чисельника)
        System.out.println((double) a / b); // 11/13=0.8461538461538461 "повноцінне"(але обмежене 16-ма знаками після коми) ділення =)
        System.out.println(a * b); // 11*13=143

    }
}
