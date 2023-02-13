package com.ua.RD.lesson10.part2;

public class Student extends Human {
    private String group;


    public Student(){
        System.out.println("BE");
    }
    public Student(String name, String lastName, String group) {
       // super(name, lastName);
        this.group = group;
        System.out.println("BF");
    }

    public void study(){
        super.work();
        System.out.println("i`m studying");
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "group='" + group + '\'' +
                '}';
    }
}
