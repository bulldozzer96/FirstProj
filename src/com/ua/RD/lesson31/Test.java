package com.ua.RD.lesson31;

public class Test {

    private String name;
    private int age;
    public double info;


    public Test() {
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private void testMethod() {
        System.out.println("testMethod");
    }
@TestAnnotation
    private String getInfo(int age) {
        return age + " Hello";
    }
}