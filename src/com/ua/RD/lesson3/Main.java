package com.ua.RD.lesson3;

public class Main {
    public static void main(String[] args) {


        /**
         * main method
         *
         */

        /*
        multiline comment
        */
//
        //this is year variable
        int year = 2023;
        int aftertenyear = 10;
        int future = year + aftertenyear;

        System.out.println(future);
        int a = 99;
        int b = -66;
        double d = 9.99;

        System.out.println(a - b);
        System.out.println(a + d);

        int c = (int) (a + d);

        System.out.println(c);

        System.out.println(a * b);
        System.out.println((double) a / b);

        System.out.println(5 % 3); //залишок від ділення (якщо 0, то ділення відбувається без залишку)

        int q = 1;
    /*    q = q + 1;
        q+=1000;
        q++;
        q--;*/

    /*    System.out.println(++q);
        System.out.println(q++);//постфіксна операція, інкрементація не відбувається після виводу "q"

        System.out.println(q++ + ++q);*/

        q /= 1;
        q *= 4;
        q %= 4;



    }
}
