package com.ua.RD.Homework11;


public class Main {
    public static void main(String[] args) {

        Light civil = new Light("", "", "", "");
        civil.setType("Pickup");
        civil.setBrand("FORD");
        civil.setColor("Red");
        civil.setEngine("V8");
        System.out.println(civil);
        civil.drive();



        Heavy cargo = new Heavy("", "", "", "");
        cargo.setType("Truck");
        cargo.setBrand("VOLVO");
        cargo.setCapacity("50T");
        cargo.setPurpose("quarry");
        System.out.println(cargo);
        cargo.drive();


    }
}
