package com.ua.RD.Homework32;

public class ThreadWork implements Runnable {
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println("Result of " + Thread.currentThread().getName() + " is " + i);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
