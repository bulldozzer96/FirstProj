package com.ua.RD.Homework10;

public class Teacher {
    private String name;
    private String subject;
    private String degree;
    private int tAge;

    public Teacher(){

        System.out.println("base");
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;

    }

    public Teacher(String name, String subject, String degree) {
        this.name = name;
        this.subject = subject;
        this.degree = degree;

    }
    public Teacher(String name, String subject, String degree, int tAge) {
        this.name = name;
        this.subject = subject;
        this.degree = degree;
        this.tAge = tAge;
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
        return tAge;
    }

    public void settAge(int tAge) {
        this.tAge = tAge;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", degree='" + degree + '\'' +
                ", tAge=" + tAge +
                '}';
    }
}
