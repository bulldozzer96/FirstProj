package com.ua.RD.lesson28;

import com.ua.RD.lesson27.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws RuntimeException, IOException {
//        try {
//            Path path = Path.of("1.txt");
//            //Path path = Path.of("C:\\Users\\3001pdyH\\Desktop\\1.txt");
//            //Path.of("1234235234","12344546sdsdf");
//            Files.readAllLines(path).forEach(System.out::println);
//        }catch (IOException e){
//            throw new RuntimeException(e);
//        }

Path folder = Path.of("deleteMe");
//        Files.deleteIfExists(Path.of("deleteMe"));
//Files.deleteIfExists(folder);
//Files.createDirectory(folder);
var isExist = Files.exists(folder);
        System.out.println(isExist);
       // Files.createFile(folder.resolve("test.txt"));
        //Files.write(folder.resolve("test.txt"), "sd 23".getBytes());
        Files.write(folder.resolve("test.txt"), List.of("sd 23","234 dd"));
        //Files.copy(folder.resolve("test.txt"), folder.resolve("test2.txt"));
        System.out.println(Files.isDirectory(folder));
        System.out.println(Files.isRegularFile(folder));
        System.out.println(Files.isHidden(folder.resolve("test.txt")));
        System.out.println(Files.isSameFile(Path.of("test.txt"), Path.of("test2.txt")));
//        FileAttribute[] attribute = new FileAttribute[0];
//        Files.createFile(folder.resolve("testCreate.txt"),attribute);
//        Files.setAttribute(folder.resolve("testCreate.txt"), "user", "3001pdyH");

        Student student1 = new Student("John", 33, "A");
        Student student2 = new Student("234ecgdg", 11, "g");
        Student student3 = new Student("sdfsdfg", 4353456, "3");
        Student student4 = new Student("sdfgdfghdf", 0, "d");


        List<Student> l1 = List.of(student1, student2, student3, student4);
        List<String> studentString = l1.stream().map(Main::studentToString).toList();

        System.out.println(studentString);
        Files.write(folder.resolve("students.txt"), studentString);
        List<String> studentFromString = Files.readAllLines(folder.resolve("students.txt"));
        System.out.println(studentFromString);
    }

    private static String studentToString(Student student) {
        return student.getName() + " % " + student.getGroup() + " % " + student.getAge();
    }
    private static Student studentFromString(String s) {
        String[] split = s.split(" % ");
        return new Student(split[0].trim(), Integer.parseInt(split[1].trim()), split[2].trim());
    }



}
