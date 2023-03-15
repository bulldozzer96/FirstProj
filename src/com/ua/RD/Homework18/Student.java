package com.ua.RD.Homework18;

import java.util.Random;

public class Student {
    String firstName;
    String secondName;
    int age;

    public Student(String name, String surname, int age) {
        this.firstName = name;
        this.secondName = surname;
        this.age = age;
    }

    public static String studentFirstName() {

        String firstName = "";
        Random random = new Random();
        int letter_Selector = random.nextInt(4, 6);
        String studentFirstName = "abcdefghijklmnopqrstuvxyz";

        for (int i = 0; i <= letter_Selector; i++) {
            int randomS = (studentFirstName.length());
            firstName = firstName + (studentFirstName.charAt(random.nextInt(randomS)));
        }
        return Character.toUpperCase(firstName.charAt(random.nextInt(0, firstName.length()))) + firstName;
    }

    public static String studentSecondName() {

        String secondName = "";
        Random random = new Random();
        int letter_Selector = random.nextInt(4, 6);
        String studentSecondName = "abcdefghijklmnopqrstuvxyz";

        for (int i = 0; i <= letter_Selector; i++) {
            int randomS = (studentSecondName.length());
            secondName = secondName + (studentSecondName.charAt(random.nextInt(randomS)));
        }
        return Character.toUpperCase(secondName.charAt(random.nextInt(0, secondName.length()))) + secondName;
    }

    public static int studentAge() {
        Random random = new Random();
        int studentAge = random.nextInt(18, 21);

        return studentAge;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + " " + age + " y.o. ";
    }
}
