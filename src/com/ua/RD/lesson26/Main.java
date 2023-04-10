package com.ua.RD.lesson26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = null;
//        File file = new File("1.txt");
//        try {
//            scanner = new Scanner(file);
//            System.out.println(scanner.nextLine());
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//
//        } finally {
//            if (scanner != null) {
//                scanner.close();
//            }
//
//
//        }
//
//    }

        try (Scanner scanner = new Scanner(new File("1.txt"))) { // AutoClosable Scanner, в дужках до try
            System.out.println(scanner.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }
}
