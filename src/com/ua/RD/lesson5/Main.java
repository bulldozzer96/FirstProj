package com.ua.RD.lesson5;

public class Main {
    public static void main(String[] args) {
        int numb = -13;

        //boolean res = numb > 0;
        boolean evenRgraterZRo = numb % 2 == 0 && numb > 0;
        boolean notEQthirteen = numb != 13;
        if (evenRgraterZRo || notEQthirteen) {

            System.out.println(numb + " is even or >0");

        } else {
            System.out.println("EQ");
        }

        int numb2 = 4;
        if (numb2 == 1) {
            System.out.println("1");
        } else if (numb2 == 2) {
            System.out.println("2");
        } else if (numb2 == 3) {
            System.out.println("3");
        } else {
            System.out.println(numb2);
        }
    }
}
