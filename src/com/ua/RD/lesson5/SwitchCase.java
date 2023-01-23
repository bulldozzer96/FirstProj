package com.ua.RD.lesson5;

public class SwitchCase {
    public static void main(String[] args) {
        int numb3 = 5;
        //double dd = 4.5d; /*double не варіант*/
        switch (numb3) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("dflt");
                break;
        }
    }
}
