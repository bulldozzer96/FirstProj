package com.ua.RD.Homework10;

public class Teacher {
    private String name;
    private String subject;
    private String degree;
    private int age;

    public Teacher() {

    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public Teacher(String name, String subject, int age) {
        this.name = name;
        this.subject = subject;
        this.age = age;

    }

    public Teacher(String name, String subject, String degree, int age) {
        this.name = name;
        this.subject = subject;
        this.degree = degree;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getTAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher`s " +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", age=" + age;
    }
}
