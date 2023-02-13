package com.ua.RD.lesson10.part1;

public class Car {

    private String model;
    private String color;
    private int year;
    private int hp;

    public Car(){ //явно прописаний конструктор за замовченням
        System.out.println("Call default constructor");
    }

    public Car(String model, String color, int year, int hp) { //конструктор за замовченням, з усіма полями
        this.model = model; //this для звернення до поточного класу Car
        this.color = color;
        this.year = year;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>0){
            this.year = year;
        }

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void drive() {
        System.out.println("Drive " + model);
    }

    void stop() {
        pumpBrakeLiq();
        System.out.println("Stop " + model);
    }
    private void pumpBrakeLiq(){
        System.out.println("pimpBrakeLiq");
    }

    void park() {
        System.out.println("Park " + model);
    }

    void sound() {
        System.out.println("Sound " + model);
    }


    //alt+ins   to String
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", hp=" + hp +
                '}';
    }
}
