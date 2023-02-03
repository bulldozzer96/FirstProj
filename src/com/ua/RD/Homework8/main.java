package com.ua.RD.Homework8;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int length = 5;
        int[] arr = new int[length];
        int maxValue = 100; //обмежив максимальне значення від 0 до 100
        fillArray(arr, maxValue);
        Min(arr);
        Max(arr);

        printArray(arr);
        System.out.println(Min(arr));
        System.out.println(Max(arr));
        System.out.println(Average(arr));
        System.out.println(Sum(arr));


    }


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void fillArray(int[] arr, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }
    }

    static int Min(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0];

    }

    static int Max(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 1];

    }

    static double Average(int[] arr) { //ср.знач через double, задля виводу повноцінного результату ділення
        double result = 1;
        for (double j : arr) {
            result += j;
        }
        return (result - 1) / (arr.length);
    }

    static int Sum(int[] arr) { // сума значень масиву
        int result = 1;
        for (int j : arr) {
            result += j;
        }
        return (result - 1);
    }


}