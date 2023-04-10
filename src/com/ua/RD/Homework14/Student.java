package com.ua.RD.Homework14;

public class Student extends Human {
    private int course;
    private String name;
    private String surname;

    public Student() {
    }

    public Student(int course, String name, String surname) {
        this.course = course;
        this.name = name;
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String discriptOut() {
        return "Course: " + course + " name: " + name + " surname: " + surname;
    }
}
