package com.ua.RD.Homework26;

import java.util.*;

public class Main {
    public static void main(String[] args) throws OwnException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Squared number is: ");
        try {
            System.out.println(squaredNumber(number));
        } catch (OwnException e) {
            throw new OwnException(e.getMessage());
        }
    }

    public static int squaredNumber(int i) throws OwnException {
        int result;
        if (i < 0) {
            throw new OwnException("Negative can`t be number");
        }
        result = i * i;
        return result;
    }
}
