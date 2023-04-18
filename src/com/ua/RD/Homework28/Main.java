package com.ua.RD.Homework28;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Files.deleteIfExists(Path.of("Homework28.txt"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter smth: ");
        String txt = scanner.next();

        Files.createFile(Path.of("Homework28.txt"));

        Files.write(Path.of("Homework28.txt"), txt.toString().getBytes());

        var output = Files.readAllLines(Path.of("Homework28.txt"));

        System.out.println("Y`ve entered: " + output);

    }

}
