package com.ua.RD.Homework11;


public class Main {
    public static void main(String[] args) {

        Light l1 = new Light("", "", "", "");
        l1.setType("Pickup");
        l1.setBrand("FORD");
        l1.setColor("Red");
        l1.setEngine("V8");


        Heavy h1 = new Heavy("", "", "", "");
        h1.setType("Truck");
        h1.setBrand("VOLVO");
        h1.setCapacity("50T");
        h1.setPurpose("quarry");


        System.out.println(l1);
        System.out.println(h1);


        l1.drive();
        h1.drive();


    }
}
