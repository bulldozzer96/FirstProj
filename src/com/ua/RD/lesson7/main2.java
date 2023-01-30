package com.ua.RD.lesson7;

import java.util.Random;

public class main2 {

    public static void main(String[] args) {
        //коли викликається getMaxNumb - а і б зліва направво, через кому. Типи повинні співпадати.
        //String.valueOf() не приймається
        //static тільки в static
        //намагатися максимально уникати static в методах.
        int firstNumber = 9;
        int secondNumber = 11;
//        String s = "";
//        byte b = 5;
//
//        int max = getMaxNumber(firstNumber, secondNumber);
//        System.out.println(max);
//        printMaxNumber(firstNumber, secondNumber);
//        someWork();
//        printSymbolNumberTimes(10);
//        printSymbolNumberTimes(20, "x");

//        printType(4);
//        int a = 4;
//        Integer b = 4;
        printMaxStars(getMaxNumber(firstNumber, secondNumber));
        var b = 4;
        printType(b);
        int fact = getFactorial(7);
        int fact2 = Factorial(10);
        System.out.println(fact);
        System.out.println(fact2);
    }




    //рекурсія
    static int Factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }


    static int getFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }


    //основний приклад перевантаження, два методи з однаковим ім'ям, але різні типи виходу
    static void printType(int n) {
        System.out.println("Int printed");
    }

    static void printType(byte n) {
        System.out.println("Byte printed");
    }

    static void printType(Integer n) {
        System.out.println("Integer printed");
    }

    static void printType(double n) {
        System.out.println("Double printed");
    }

    static void printSymbolNumberTimes(int number) {
        printSymbolNumberTimes(number, "*");
    }

    static void printSymbolNumberTimes(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }


    static int getMaxNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    static void printMaxStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void someWork() {
        Random random = new Random();
        int firstNumber = random.nextInt(20);
        int secondNumber = random.nextInt(20);
        printMaxStars(getMaxNumber(firstNumber, secondNumber));
    }

    static void printMaxNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }

    static void rewriteFromFile() {
        //read file
        //write file
    }


}
