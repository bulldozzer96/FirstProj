package com.ua.RD.Homework10;

public class Student {
    private String name;
    private int course;
    private int age;
    private int score;


    public Student(String name, int course, int age, int score) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student`s " +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                ", score=" + score;
    }
}
