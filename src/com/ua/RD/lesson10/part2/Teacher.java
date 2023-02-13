package com.ua.RD.lesson10.part2;

public class Teacher extends Human {


    private String degree;

    public Teacher(String name, String lastName, String degree) {
        super(name, lastName);
        this.degree = degree;
    }
    public void teach(){
        super.work();
    }


    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}


