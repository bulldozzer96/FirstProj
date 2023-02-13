package com.ua.RD.Homework11;

public class Light extends Car {
    //    private String ;
    protected String color;
    protected String engine;

    public Light() {
    }

    public Light(String type, String brand, String color, String engine) {
        super(type, brand);
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getEngine() {
        return engine;
    }


    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Light{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
