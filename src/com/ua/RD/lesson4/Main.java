package com.ua.RD.lesson4;

public class Main {
    public static void main(String[] args) {
        String str = "hello world";
        //String str = new String("hello wrold");

        int a = 7;
        a = 9;
        str = "wW--wW";

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

        System.out.println(str.substring(str.indexOf("-")));
        System.out.println(str.substring(2, 4));


    }
}
