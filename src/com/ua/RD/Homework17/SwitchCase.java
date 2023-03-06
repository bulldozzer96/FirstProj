package com.ua.RD.Homework17;

import java.util.Scanner;

public class SwitchCase {
    public void printDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number \nfrom 1 to 7: ");
        int fromInput = scanner.nextInt();

        switch (fromInput) {

            case 1:
                System.out.println("U`ve selected " + WeekDays.MONDAY.getDayName());
                break;
            case 2:
                System.out.println("U`ve selected " + WeekDays.TUESDAY.getDayName());
                break;
            case 3:
                System.out.println("U`ve selected " + WeekDays.WEDNESDAY.getDayName());
                break;
            case 4:
                System.out.println("U`ve selected " + WeekDays.THURSDAY.getDayName());
                break;
            case 5:
                System.out.println("U`ve selected " + WeekDays.FRIDAY.getDayName());
                break;
            case 6:
                System.out.println("U`ve selected " + WeekDays.SATURDAY.getDayName());
                break;
            case 7:
                System.out.println("U`ve selected " + WeekDays.SUNDAY.getDayName());
                break;
            default:
                System.out.println("Error, only 1 to 7 numbers");
                break;
        }
    }
}
