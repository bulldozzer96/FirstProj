package com.ua.RD.lesson9;

public class lectors {

        static String s3;

        public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello World!");
//        System.out.println(sb);
//        sb.append("q");
//        sb.append("w");
//        sb.append("r");
//        sb.append("t");
//        System.out.println(sb);
//        String s = "Hello World!";
//        s += "q";
//        s += "w";
//        s += "r";
//        s += "t";
////
//        sb.reverse();
////        System.out.println(sb);
//        String s2 = null;
//        int a;
//        String reversedS = reverse(s3);
//        System.out.println(reversedS);

//        int a = -10;
//        if (a > 0) {
//            String result = a + " > 0";
//            System.out.println(a + " > 0");
//        } else {
//            System.out.println(a + " < 0");
//        }
//
//        String ifResult = a > 0 ? a + " > 0" : a + " < 0";
//        System.out.println(ifResult);


            int a = 10;
            int b = -10;
            int c = 0;
            boolean isAndB = isAndB(a, b);
            System.out.println(isAndB);
            boolean isCZero = c == 0;
            if (isAndB || isCZero) {
                System.out.println(true);
            }

        /*
            true && true = true
            true && false = false
            false && true = false
            false && false = false
            true || true = true
            true || false = true
            false || true = true
            false || false = false
         */

            int arr[] = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }

            for (int i : arr) {
                System.out.println(i);
            }

            int[] arr2 = generateArray(10);

        }

        static int getMinArrayValue(int[] arr) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            return min;
        }

        static int[] generateArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
            return arr;
        }

        static double getAvgArrayValue(int[] arr) {
            double sum = 0;
            for (int j : arr) {
                sum += j;
            }

            return sum / arr.length;
        }
        private static boolean isAndB(int a, int b) {
            return a > 0 && b < 0;
        }

        static String reverse(String original) {
            if (original == null) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            for (int i = original.length() - 1; i >= 0; i--) {
                sb.append(original.charAt(i));
            }

            return sb.toString();

        }
    }

