package com.ua.RD.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int p = 1;
//        for (int i = 0; i < 10; i += 2) {        //якщо умова одразу не виконана - нічого не виведеться
//            System.out.print(i + " ");*/
//            for (int j = 0; j < 20; j++) {
//                System.out.print(j);         // цикл в циклі
//            }
//
//        }
//
//        //   for (;;){} //нескінченний цикл, будь який випадок (коли одного з компонентів немає)
//        System.out.print(" ");*/
//        for (double d = 0.1d; d < 1d; d += 0.1d) {
//            System.out.print(d);
//        }
//        for (int u = 1; u <= 10; u++) {
//            if (u % 3 == 0) {
//                //break; зупиняє
//                continue; //пропускає ітерацію
//            }
//            System.out.print("/");
//            System.out.print(u);
//
//        }
//
//        int a = 0;
//        while (a < 10) {    //обов'язково писати умову, інакше зависне
//
//            System.out.print(a + " ");
//            a++;
//        }
//        int k = 0;
//        while (true) {
//            System.out.print(k + " ");
//            k++;
//            if (k == 10) {
//                break;
//            }
//        }
//        System.out.println();
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter numb: ");
//        int numb = scanner.nextInt();
//        while (true) {
//            System.out.print("Enter numb: ");
//            numb = scanner.nextInt();
//            if (numb == 2) {
//                break;
//            }
//
//        }
//        Scanner scanner3 = new Scanner(System.in);
//        int n3 = 0;
//        do {
//            n3 = scanner3.nextInt();
//            System.out.println(n3);
//            int n4;
//        } while (n3 != 0);

        Scanner scanner4 = new Scanner(System.in);
        String pin = "";
        int count = 0;
        var result = false;
        do {
            if (count == 3) {
                System.out.println("--!!!--");
                break;
            }
            System.out.print("Enter pin: ");
            pin = scanner4.nextLine();
            result = !pin.equals("0000");
            if (result) {
                System.out.println("inv pin");
                count++;
            }
        } while (result);
        if (!result) {
            System.out.println("Welcome!!!");
        }
    }
}



