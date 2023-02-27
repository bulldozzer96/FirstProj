package com.ua.RD.Homewrok14;

public class Teacher extends Human {

    private String subject;
    private String name;
    private String surname;

    public Teacher() {

    }

    public Teacher(String subject, String name, String surname) {
        this.subject = subject;
        this.name = name;
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
        return "Subject: " + subject + " name: " + name + " surname: " + surname;
    }
}
