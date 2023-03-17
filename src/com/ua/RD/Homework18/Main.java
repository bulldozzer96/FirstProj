package com.ua.RD.Homework18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Integer> decimalList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            decimalList.add(i);
        }

        System.out.print(decimalList);
        System.out.println();

        List<Integer> millionList = new LinkedList<>();
        for (int i = 0; i < 2_000_000; i++) {
            millionList.add(i);
        }

        System.out.print(millionList.size());
        System.out.println();


        List<Student> students = new LinkedList<>();

        int studentCount = 10;

        for (int i = 0; i < studentCount; i++) {
            students.add(new Student(Student.studentFirstName(), Student.studentSecondName(), Student.studentAge()));
        }

        for (Student student : students) {
            System.out.println(student);

        }


    }


}

