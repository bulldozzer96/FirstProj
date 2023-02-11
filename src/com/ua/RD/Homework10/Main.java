package com.ua.RD.Homework10;


public class Main {
    public static void main(String[] args) {

        Teacher phys = new Teacher("Alex", "Phys", "Professor", 54);
        Teacher economy = new Teacher("Simon", "Economy");
        Teacher math = new Teacher("Sally", "Math", 43);
        System.out.println(phys);
        System.out.println(economy);
        System.out.println(math);
        Student bob = new Student("Bob", 1, 18, 94);
        System.out.println(bob.getName() + "`s score is " + bob.getScore());

        int length = 10;
        int[] arr = new int[length];
        int maxValue = 100;

        ArraySort arraySort = new ArraySort(length, arr, maxValue);

    }
}
