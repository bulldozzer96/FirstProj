package com.ua.RD.Homework25;

import java.util.*;



public class Main {
    public static void main(String[] args) {
        boolean numberOut = true;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a integer: ");
                int fromInput = scanner.nextInt();
                System.out.println(fromInput);
                numberOut = true;
            } catch (InputMismatchException e) {
                System.out.println("Only numbers to input");
                numberOut = false;
            }
        } while (!numberOut);


    }
}

