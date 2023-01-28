package com.ua.RD.Homework6;

public class Homework6 {
    public static void main(String[] args) {

        //------------- від 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        //------------- парні числа в діапазоні від 1 до 100
        for (int s = 1; s <= 100; s++) {
            if (s % 2 == 0) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
        //------------- !7 виведено у ряд
        int res = 1;
        int b = 7;
        for (int a = 1; a <= b; a++) {
            res *= a;
           // System.out.print(res + " "); //для виведення в ряд
        }
        System.out.print(res + " "); //для виведення підсумком
        System.out.println();
        //------------- ряд Фібоначчі <100

        int fib0 = 1;
        int fib1 = 1;
        int fib2;
        while (fib1 < 100) {    //обов'язково писати умову, інакше зависне
            fib2 = fib0 + fib1;
            System.out.print(fib1 + " ");
            fib0 = fib1;
            fib1 = fib2;

        }
    }
}

