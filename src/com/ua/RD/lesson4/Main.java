package com.ua.RD.lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "hello world";
        //String str = new String("hello world");

        int a = 7;
        a = 9;
        str = "wW-wFW";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();

        int length = str.length(); //аналогічно ДЛСТР
        int lastIndex = length - 1;

        System.out.println(str.charAt(lastIndex));

        int s2 = Integer.parseInt("11") + (5 + 6); // аналогічно ЗНАЧ

        String s3 = "first " + 4 + 5;
        System.out.println(s3);

        System.out.println(s2);

        System.out.println(str.concat("dDdD")); //конкатинація аналогічно "+"


        System.out.println(str.substring(3));//аналогічно ПСТР

        System.out.println(str.substring(str.indexOf("-"))); //індексОФ використовує за врахуванням регістру
        System.out.println(str.substring(2, 4));


        System.out.println(str.toLowerCase().indexOf("f"));//(наприклад модифікувати через lowercase)

        System.out.println(str.indexOf("W")+" зліва направо");//зліва направо
        System.out.println(str.lastIndexOf("W")+" зправа наліво");//зправа наліво


        String fName = "sss eeffE";
        String CorrectfName = "Sss Eeffe"; //продумати реалізацію самостійно


        System.out.println(Arrays.toString(fName.split(" ")));

        String ss1 = "Q";
        String ss2 = "Q";
        ss2 = "QW";
        ss2 = "Q";
        ss2=ss2.toLowerCase();
        ss2=ss2.toUpperCase();

        System.out.println(ss1.hashCode()); //81 -_-
        System.out.println(ss2.hashCode()); //81 Т_Т

        System.out.println(ss1==ss2); //не можна робити з класами, стрінг зберігається і в HEAP і в Thread Stack, тільки для примітивів

        System.out.println(ss1.equals(ss2));
    }
}
