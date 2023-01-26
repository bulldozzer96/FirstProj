package com.ua.RD.Homework5;

public class Main {
    public static void main(String[] args) {

        int a = 18;
        int b = 18;

        int greater, fewest;

        boolean Greater = a > b;
        boolean Fewest = a < b;
        boolean evenBoth = (a % 2 == 0 && b % 2 == 0);
        boolean oddBoth = (a % 2 != 0 && b % 2 != 0);

        if (Greater) {
            greater = a;
            fewest = b;
            System.out.println("Greater: " + greater);
            System.out.println("Fewest: " + fewest);
        } else if (Fewest) {
            greater = b;
            fewest = a;
            System.out.println("Greater: " + greater);
            System.out.println("Fewest: " + fewest);
        } else {
            System.out.println("They are both equal: " + a);
        }
        if (evenBoth) {
            System.out.println("Both numbers is even");
        } else if (oddBoth) {
            System.out.println("Both numbers is odd");

        } else if (a % 2 == 0 && b % 2 != 0) {
            System.out.println("Even number is: " + a);
            System.out.println("Odd number is: " + b);

        } else {
            System.out.println("Even number is: " + b);
            System.out.println("Odd number is: " + a);
        }
    }
}









