package com.ua.RD.lesson33;

import com.ua.RD.lesson27.Student;

import java.util.List;

public class ParallelWork {
    public void doSomeWork(List<Student> students) {
        synchronized (this) {
            students.forEach(student -> {
                System.out.println(student.getName());
            });
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }

    public static void doStaticWork (List<Student> students) {
        synchronized (ParallelWork.class) {
            students.forEach(student -> {
                System.out.println(student.getName());
            });
        }
    }
}
