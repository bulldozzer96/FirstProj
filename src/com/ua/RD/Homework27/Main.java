package com.ua.RD.Homework27;

import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try (OutputStream os = new FileOutputStream("Homework27.txt");
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(number);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream is = new FileInputStream("Homework27.txt");
             ObjectInputStream ois = new ObjectInputStream(is)) {
            System.out.println("Entered number is: " + ois.readObject());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
