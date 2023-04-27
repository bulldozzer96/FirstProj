package com.ua.RD.lesson33;

import java.util.*;

public class Main {
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
//
//        Thread t0 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName()+" is working");
//            try {
//                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName()+" is done");
//        });
//        Thread t1 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName()+" is working");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName()+" is done");
//        });
//        Thread t2 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName()+" is working");
//            try {
//                Thread.sleep(6000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName()+" is done");
//        });
//
//        t0.start();
//        t2.start();
//        t2.join();
//        t1.start();

        list = Collections.synchronizedList(list);



        for (int i = 0; i < 10000; i++) {
            list.add(new Random().nextInt(-100, 100));
        }
        System.out.println(list);
        Thread t0 = new Thread(() -> {
            list.sort(Comparator.comparingInt(o -> o));
        });
        Thread t1 = new Thread(() -> {
            list.sort(Comparator.reverseOrder());
        });

        t0.start();
        t0.join();

        t1.start();

        System.out.println(list);
    }
}
