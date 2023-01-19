package com.ua.RD.lesson4;

public class Main {
    public static void main(String[] args) {
        String str = "hello world";
        //String str = new String("hello world");

        int a = 7;
        a = 9;
        str = "wW--wFW";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();

        int length = str.length();
        int lastIndex = length - 1;

        System.out.println(str.charAt(lastIndex));

        int s2 = Integer.parseInt("11") + (5 + 6);

        String s3 = "first " + 4 + 5;
        System.out.println(s3);

        System.out.println(s2);

        System.out.println(str.concat("dDdD")); //аналогічно "+"


        System.out.println(str.substring(3));

        System.out.println(str.substring(str.indexOf("-"))); //індексОФ використовує за врахуванням регістру
        System.out.println(str.substring(2, 4));


        System.out.println(str.toLowerCase().indexOf("f"));//(наприклад модифікувати через lowercase)

        System.out.println(str.indexOf("W")+" зліва направо");//зліва направо
        System.out.println(str.lastIndexOf("W")+" зправа наліво");//зправа наліво
    }
}
