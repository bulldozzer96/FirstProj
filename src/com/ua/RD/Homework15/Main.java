package com.ua.RD.Homework15;

public class Main {
    public static void main(String[] args) {

        Human p1 = new Pilot();
        Human d1 = new Driver();

        flying(p1);
        driving(d1);
    }

    public static void flying(Flying flying) {
        flying.fly();
    }

    public static void driving(Driving driving) {
        driving.drive();
    }

}



