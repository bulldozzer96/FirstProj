package com.ua.RD.Homework28;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter smth: ");
        String txt = scanner.next();

        try {
            Files.write(Path.of("Homework28.txt"), txt.getBytes());
        } catch (IOException e) {
            Files.createFile(Path.of("Homework28.txt"));
        }

        var output = Files.readAllLines(Path.of("Homework28.txt"));

        System.out.println("Y`ve entered: " + output);

    }

}
