package com.ua.RD.Homework19;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> hs = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ts = new TreeSet<>();

        for (int i = 0; i < 1000; i++) {
            int randomNumb = random.nextInt(0, 50) + 1;
            hs.add(randomNumb);
            lhs.add(randomNumb);
            ts.add(randomNumb);
        }

        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);

    }
}
