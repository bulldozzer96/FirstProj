package com.ua.RD.lesson17;

public class Main {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek);
        System.out.println(DayOfWeek.ALL_DAYS.name());
        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");
        System.out.println(monday);

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }

        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value + " " + value.ordinal());
        }

        System.out.println(dayOfWeek.getPriority());
        System.out.println(dayOfWeek.getShortName());

        dayOfWeek.setShortName("2222asdas");
        System.out.println(dayOfWeek.getShortName());
        System.out.println(DayOfWeek.MONDAY.getShortName());

        dayOfWeek.printTest();

        System.out.println(dayOfWeek == DayOfWeek.MONDAY);


        int a = 6;
        Integer b = 6;

       int aa = Integer.parseInt("6");

        ;


    }


}







