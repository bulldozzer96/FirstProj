package com.ua.RD.Homework22;

public class Student implements Comparable<Student> {
    private String name;
    private double avgScore;


    public Student() {
    }

    public Student(String name, double avgScore) {
        this.name = name;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
