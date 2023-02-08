package com.ua.RD.Homework8;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];
        int maxValue = 100; //обмежив максимальне значення від 0 до 100
        fillArray(arr, maxValue);
        min(arr);
        max(arr);
        minWithoutSort(arr);
        maxWithoutSort(arr);
        printArray(arr);                    // 1,2
        System.out.println(min(arr)+" найменше з сортуванням");       // 3
        System.out.println(minWithoutSort(arr)+" найменше без сортування");       // 3
        System.out.println(max(arr)+" найбільше з сортуванням");       // 4
        System.out.println(maxWithoutSort(arr)+" найбільше без сортування");       // 4
        System.out.println(average(arr));   // 5
        System.out.println(sum(arr));       // 6


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

    static int min(int[] arr) {
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

    //------------------- найменше значення без сортування
    static int minWithoutSort(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }


    //------------------- найбільше значення без сортування
    static int maxWithoutSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    //-------------------

    static int max(int[] arr) {
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

    static double average(int[] arr) { //ср.знач через double, задля виводу повноцінного результату ділення
        double result = 0;
        for (int j : arr) {
            result += j;
        }
        return (result) / (arr.length);
    }

    static int sum(int[] arr) { // сума значень масиву
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return (result);
    }

}
