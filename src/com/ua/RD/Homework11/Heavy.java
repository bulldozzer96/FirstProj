package com.ua.RD.Homework11;

public class Heavy extends Car {

    protected String capacity;
    protected String purpose;

    public Heavy() {
    }

    public Heavy(String type, String brand, String capacity, String purpose) {
        super(type, brand);
        this.capacity = capacity;
        this.purpose = purpose;
    }

    public void drive() {
        super.drive();
        System.out.println("Drive cargo car");
    }
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", capacity='" + capacity + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
