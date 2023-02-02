package com.ua.RD.lesson8;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random(20);//випадкові числа
        Random randomL = new Random(8);//випадкові числа
        int length = randomL.nextInt(10);
        int[] arr = new int[length];


        fillArrayWithNumbVoid(arr, 20);
        //arr = getArrayWithNumbInt(arr, 3);

        //
        // int multiplyResult = multiplyArray(arr);
        //  System.out.println(multiplyResult);
        printArray(arr);

        int arr2[][] = new int[length][length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        int arr3[] = {1, 2, 5};
        printArray(arr3);

        //        arr[0]=1;
        //        arr[1]=99;
        //        System.out.println(arr[0]);
        //        System.out.println(arr[1]);
        //        for (int i = 0; i < arr.length; i++) {
        //            arr[i] = random.nextInt(30); //треба вказувати максимум числа,
        //        }


        // arr = new int[11]; перестворення масиву
        //        for (int i = 0; i < arr.length; i++) {
        //            System.out.print(arr[i] + " ");
        //        }

    }


    static void sortArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; i < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(i + "\t");

        }
    }

    static void fillArrayWithNumbVoid(int[] arr, int maxValue) { //заповнення массиву випадковими числами
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }
    }

    //    static int[] getArrayWithNumbInt(int[] arr, int maxValue/*, Random random*/) {//повернення массиву випадковими числами
    //        Random random = new Random();
    //        for (int i = 0; i < arr.length; i++) {
    //            arr[i] = random.nextInt(maxValue);
    //        }
    //        return arr;
    //    }
    //
    static void printArray(int... arr) { //"..." масив невизначенної довжини, IDEA сама зчитує вхідні параметри
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //    static int multiplyArray(int[] arr) {
    //        int result = 1;
    //        for (int i = 0; i < arr.length; i++) {
    //            result *= arr[1];
    //        }
    //        return result;
    //    }
    //
    //    static int forEach(int[] arr) { // перемноження значень масиву
    //        int result = 1;
    //        for (int j : arr) {
    //            result *= j;
    //        }
    //        return result;
    //    }


}
