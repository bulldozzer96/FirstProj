package com.ua.RD.lesson18;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int a = list.get(0);
        System.out.println(list);
        list.remove(0);
        list.remove((Integer) 3);
        list.add(1, 8);
        list.set(0, 9);
        System.out.println(list);


    }

}
