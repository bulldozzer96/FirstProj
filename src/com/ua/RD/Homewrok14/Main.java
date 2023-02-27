package com.ua.RD.Homewrok14;

public class Main {
    public static void main(String[] args) {
        Human s1 = new Student(2, "Bob", "Arthurs");
        Human t1 = new Teacher("Math", "Malice", "Boberson");
        System.out.println(s1.discriptOut());
        System.out.println(t1.discriptOut());

    }


}
