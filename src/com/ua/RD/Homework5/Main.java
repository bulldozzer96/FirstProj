package com.ua.RD.Homework5;

public class Main {
    public static void main(String[] args) {
        int a = 123;
        int b = 124;

        boolean GreaterA = a > b && a != b;
        boolean GreaterB = a < b && a != b;

        if (GreaterA) {
            System.out.println("A is greater than B");
        } else if (GreaterB) {
            System.out.println("B is greater than A");
        } else {
            System.out.println("They are equal");
        }
    }
}
