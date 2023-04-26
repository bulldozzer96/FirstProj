package com.ua.RD.lesson32;

public class ThreadRun implements Runnable {
    @Override
    public void run() {
//        for(int i = 0; i < 10; i++) {
//            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//               e.printStackTrace();
//            }
//        }

        try{
            for(int i = 0; i < 10; i++) {
                System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
                    Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
