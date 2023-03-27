package com.ua.RD.Homework22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();


        students.add(new Student("Ivan", 30.5));
        students.add(new Student("Andriy", 20.9));
        students.add(new Student("Viktor", 19.2));


//        System.out.println(students);


//        students.sort(Comparator.comparing(Student::getAvgScore));
//        System.out.println(students);
//
//        students.sort(Comparator.comparing(Student::getName));
//        System.out.println(students);

        System.out.println(students.stream().sorted(Comparator.comparing(Student::getAvgScore)).collect(Collectors.toList()));
        System.out.println(students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList()));

        System.out.println(students); //return original(not sorted) student list
    }
}
