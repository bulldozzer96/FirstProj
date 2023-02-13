package com.ua.RD.lesson10.part1.service;

import com.ua.RD.lesson10.part1.Car;

public class PaintService {
    public Car paint(Car car, String newColor){
        car.setColor(newColor);
        return car;
    }
}
