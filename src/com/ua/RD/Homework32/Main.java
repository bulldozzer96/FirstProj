package com.ua.RD.Homework32;

public class Main {
    public static void main(String[] args) {
        ThreadWork trw = new ThreadWork();
        Thread thread0 = new Thread(trw);
        Thread thread1 = new Thread(trw);

        thread0.start();
        thread1.start();
    }
}
