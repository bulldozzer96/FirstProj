package com.ua.RD.lesson17;

public enum DayOfWeek {
    MONDAY(1, "Mon"),
    TUESDAY(2, "Tue"),
    WEDNESDAY(3, "Wed"),
    THURSDAY(4, "Thur"),
    FRIDAY(5, "Fri"),
    SATURDAY(6, "Sat"),
    SUNDAY(7, "Sun"),
    ALL_DAYS(8, "All days");


    private int priority;
    private String shortName;

    DayOfWeek(int priority) {
        this.priority = priority;
    }
    DayOfWeek(int priority, String shortName) {
        this.priority = priority;
        this.shortName = shortName;
    }

    public int getPriority() {
        return priority;
    }

    public String getShortName() {
        return shortName;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }


    public void printTest() {
        System.out.println("HELLO");
    }
}
