package com.ua.RD.lesson8;

import java.util.Arrays;
import java.util.Random;

public class lectors {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
        ;
        int length = 5;
        int[] arr = new int[length];
        Random random = new Random();
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(30);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        fillArrayWithRandomNumbers(arr, 20);
//        printArray(arr);
//        System.out.println();
//        sortArray(arr);
//        printArray(arr);
        //  int multiplyResult = multiplyArray(arr);
        //   System.out.println(multiplyResult);

//        int arr2[][] = new int[length][length];
//        Random random = new Random();
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                arr2[i][j] = random.nextInt(10);
//            }
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                System.out.print(arr2[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int arr3[] = {1, 4, 6};
        int[][] arr4 = {
                {1, 7},
                {4, 6},
                {6, 5}
        };
//        printArray(arr3);

//        printArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
        //   printArray2(3, 7, 55);

    }

    static void printArray2(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // i =3
            for (int j = i + 1; j < arr.length; j++) { // j = 4
                if (arr[i] > arr[j]) {
                    int temp = arr[i]; //temp = 13
                    arr[i] = arr[j]; // arr[i] = 1
                    arr[j] = temp; // arr[j] = 13
                }
            }
        }
    }

    static void fillArrayWithRandomNumbers(int[] arr, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue - 1) + 1;
        }
    }

    static int[] getArrayWithRandomNumbers(int[] arr, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }

        return arr;
    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static int multiplyArray(int[] arr) {
        int result = 1;
        for (int element : arr) {
            result *= element;
        }

        return result;
    }


}