package com.ua.RD.lesson14;

public class Main {

    public static void main(String[] args) {
//        Figure c1 = new Circle(5);
//        Figure t1 = new Triangle(3,6,7);
//
//
//        printArea(c1);
//        printArea(t1);


        Car c1 = new Car();

        Car.Engine engine = new Car.Engine();
        c1.setEngine(engine);
        c1.doSomeWork();
    }


//    public static void printArea(Figure figure) {
//        System.out.println(figure.getArea());
//    }



}

