package com.ua.RD.Homework7;

public class main {
    public static void main(String[] args) {
        int base = 4; //базове число
        int step = 3; //число степені
        String symbol = "2"; //символ для виведення
        stepen(base, step);
        // stepRec(base, step);
        System.out.print("Число " + base + " у степені " + step + " дорівнює " + stepen(base, step)); //виведення результату
        // System.out.println("Число "+base+" у степені "+step+" дорівнює "+stepRec(base, step)); //виведення результату
        System.out.println(" ");
        printStars(stepen(base, step));
        printSymbol(step, symbol);
    }

    //1. Створити метод який повертає куб заданого числа

    static int stepen(int number1, int stepNumber1) {
        int result = 1;
        for (int i = 1; i <= stepNumber1; i++) {
            result = result * number1;
        }
        return result;
    }

    //степінь із застусуванням рекурсії
    //    static int stepRec(int number, int stepNumber) {
    //        if (stepNumber == 1) {
    //            return number;
    //        } else {
    //            return number * stepRec(number, stepNumber - 1);
    //        }
    //    }

    //2. Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод

    static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //3. Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод

    static void printSymbol(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }

}




