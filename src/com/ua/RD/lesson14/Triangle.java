package com.ua.RD.lesson14;

public class Triangle extends Figure {



    private int a;
    private int b;
    private int c;

    public Triangle() {

    }
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
