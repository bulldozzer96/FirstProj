package com.ua.RD.lesson19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>[] l1= new LinkedList[3];
        l1[0]=new LinkedList<>();
        l1[0].add(1);
        l1[0].add(2);

        l1[1]=new LinkedList<>();
        l1[1].add(3);
        l1[2]=new LinkedList<>();
        l1[2].add(4);


        Set<String> l2 = new HashSet<>();
        l2.add("a");
        l2.add("aasdasf");
        l2.add("aasdasf");
        l2.add("aasdasf");
        l2.add("a213445dsfsfgdg");
        System.out.println(l2);

        Set<String> l3 = new LinkedHashSet<>();
        l3.add("a");
        l3.add("a213445dsfsfgdg");
        l3.add("aasdasf");
        l3.add("aasdasf");
        l3.add("aasdasf");
        System.out.println(l3);

        List<String> ls = new ArrayList<>(l3);
        System.out.println(ls);
        l3.forEach(s -> {
            System.out.println(s);
        });



    }
}
