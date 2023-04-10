package com.ua.RD.lesson25;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Start");
//        try {
//            System.out.println(array[100]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//
//
//        }

//        try {
//            System.out.println(array[100]/0);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        try {
            System.out.println(array[1] / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }


        try {
            method(1);
        } catch (ArithmeticException e) {

        }

        delay();


        try {
            myWork(-4);
        } catch (MyException e) {
            e.printStackTrace();


            //System.out.println(e.getMessage());
        }
//        for (int i = 0; i < 20; i++) {
//            System.out.println(i+1);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

        System.out.println("End");

    }

    private static int method(int i) {
        int result = 0;
        try {
            result = i / 0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

        return result;

    }


    private static void delay() throws InterruptedException {
        Thread.sleep(1000);
    }


    private static void myWork(int a) throws MyException {
        if (a < 0) {
            throw new MyException("Number can`t be negative");
        }
        System.out.println(a);
    }
}
