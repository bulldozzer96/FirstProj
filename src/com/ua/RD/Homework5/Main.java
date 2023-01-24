package com.ua.RD.Homework5;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        boolean aGreaterPair = a > b && a != b && a % 2 == 0;
        boolean bGreaterPair = a < b && a != b&& b % 2 == 0;
        boolean aGreaterNonPair = a > b && a != b && a % 2 != 0;
        boolean bGreaterNonPair = a < b && a != b&& b % 2 != 0;


        if (aGreaterPair) {
            System.out.println("A is pair and greater than B");
        } else if (bGreaterPair) {
            System.out.println("B is pair greater than A");
        } else if (aGreaterNonPair){
            System.out.println("A is`t pair and greater than B");
        } else if (bGreaterNonPair){
            System.out.println("B is`t pair and greater than A");
        }else
            System.out.println("They are equal");
    }
}
//   System.out.println("They are equal");