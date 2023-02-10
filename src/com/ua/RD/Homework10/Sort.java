package com.ua.RD.Homework10;


import java.util.Arrays;

import java.util.Random;

public class Sort {
    private int length;
    private int[] arr;
    private int maxValue;


    public Sort(int length, int[] arr, int maxValue) {

        this.length = length;
        this.arr = arr;
        this.maxValue = maxValue;
        this.ascending(arr);
        this.descending(arr);
        fill(length, arr, maxValue);
        ascending(arr);
        descending(arr);


    }

    public void fill(int length, int[] arr, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }
    }

    public void ascending(int[] arr) {
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

    }

    public void descending(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }


    @Override
    public String toString() {

        return Arrays.toString(arr);


    }
}
