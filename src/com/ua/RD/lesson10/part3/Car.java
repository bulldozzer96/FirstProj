package com.ua.RD.lesson10.part3;

public class Car {


    public static String type = "Car";

    private int speed;


    public Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static void ride(){
        System.out.println("Ride");
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }
}
