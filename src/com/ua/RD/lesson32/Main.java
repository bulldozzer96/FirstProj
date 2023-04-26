package com.ua.RD.lesson32;

public class Main {
    public static void main(String[] args) {

//        ThreadRun tr1 = new ThreadRun();
//        Thread thread0 = new Thread(tr1);
//        Thread thread1 = new Thread(tr1);
//        //thread1.setDaemon(true);
//        Thread thread3 = new Thread(tr1);
//        //thread3.setPriority(Thread.MAX_PRIORITY); //
////        thread.setPriority(Thread.MIN_PRIORITY);
////        thread0.setPriority(Thread.MIN_PRIORITY);
//
//        thread0.start();
//        thread1.start();
//
//        try {
//            Thread.sleep(2000);
//            thread0.interrupt();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

       // System.out.println(thread0.getState());
//        try {
//            thread0.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        // thread3.start();
//        for(int i = 0; i < 10; i++) {
//            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("End of method");
Thread egg = new EggThread();
Thread chicken = new Chicken();
egg.start();
chicken.start();
    }
}
