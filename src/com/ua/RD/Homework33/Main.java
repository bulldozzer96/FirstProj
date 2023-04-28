package com.ua.RD.Homework33;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Thread t = new Thread(() -> {
            int number;
            do {
                number = new Random().nextInt(1, 11);
                System.out.println(Thread.currentThread().getName()+" generated " + number);
            } while (number != 5);

            System.out.println("Number 5 was found");
        });
        t.start();

    }
}
