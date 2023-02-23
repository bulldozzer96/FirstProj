package com.ua.RD.lesson14;

public class Car {

    private Engine engine;

    public Car() {
    }


    public void doSomeWork() {
        int a = 5;
        int b = 10;
        int c = a + b;
        int d = a - b;
        Buffer buffer = new Buffer(a, b, c, d);
        int result = buffer.calculate();
        System.out.println(result);

    }
    private int calculate(int a, int b, int c, int d) {
        return a + b + c + d;
    }


    private class Buffer {
        int a;
        int b;
        int c;
        int d;

        public Buffer(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        private int calculate() {
            return a + b + c + d;
        }

    }


    public static class Engine {
        private String name;
        private int power;
        private int volume;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
