package com.ua.RD.lesson18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);



        Set<Integer> s1 = Set.of(1, 2, 3);//lesson20
        //після сет офф не можна додавати та сортувати(вилетить ексепшен), тільки для читання
        Iterator<Integer> ii = s1.iterator();
        while (ii.hasNext()) {
            Integer i = ii.next();
            System.out.println(i);
        }

        int a = list.get(0);
        System.out.println(list);
        list.remove(0);
        list.remove((Integer) 3);
        list.add(1, 8);
        list.set(0, 9);
        System.out.println(list);


    }

}
