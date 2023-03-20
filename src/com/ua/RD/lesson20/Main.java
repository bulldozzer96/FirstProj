package com.ua.RD.lesson20;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1, "one");//put instead of add
        map1.put(1, "two");//if new key is added, old value is replaced

        map1.put(2, "two");
        map1.put(3, "three");

        map1.put(null, null);//can be null


        System.out.println(map1);

        map1.putAll(map1);//put map in map

//        Map<List<String>, Set<Integer>>map2 = new HashMap<>();
//        map2.put(List.of("one", "two", "three"), Set.of(1,2,3));


        System.out.println(map1.get(3));
        System.out.println(map1.containsKey(2));//true or false, приблизний пошук не працює

        System.out.println();
//        map1.entrySet().iterator().next();// ітератор це правило проходження по елементах коллекції


        map1.entrySet().forEach(entry -> {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
        System.out.println(map1.keySet());

        Map<String, List<String>> map3 = new HashMap<>();
        map3.put("Virastyk", List.of("Vasya", "Petya", "Kolya"));
        map3.put("Shevchenko", List.of("Ivanko", "Mariyka"));


        System.out.println(map3.get("Virastyk"));

        map3.entrySet().forEach(stringListEntry -> {
            System.out.println("Teacher: " + stringListEntry.getKey());
            System.out.println("Students: " + stringListEntry.getValue());
        });


        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);


        System.out.println(q1);
        System.out.println(q1.peek()); // повертає перший елемент колекції, returns null if queue is empty
        System.out.println(q1.poll()); // дістає та видаляє перший елемент колекції
        System.out.println(q1);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(3);
        q2.add(3);
        q2.add(3);
        System.out.println(q2);
        System.out.println(q2.peek()); // повертає перший елемент колекції
        System.out.println(q2.poll()); // дістає та видаляє перший елемент колекції
        System.out.println(q2);
        System.out.println(q2.element()); // same as peek, returns exception if queue is empty
        System.out.println(q2.remove()); // видаляє перший елемент колекції


        Deque<Integer> q3 = new LinkedList<>();
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);
        System.out.println(q3);

        q3.add(9);
        q3.addFirst(0);
        q3.addLast(8);//same as add
        q3.addAll(q2); //add not same numbers
        q3.pop();
        q3.push(3);

        System.out.println(q3);


        PriorityQueue<Integer> q4 = new PriorityQueue<>();
        q4.add(1);
        q4.add(5);
        q4.add(3);
        q4.add(11);
        System.out.println(q4);


        List<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(1);
        l1.add(4);
        l1.add(10);
        System.out.println(l1);


        var lr = l1.stream()
                .filter(i -> i % 2 == 0)//тільки парні
                .map(i -> i * 2)//помножили на 2
                .collect(Collectors.toList()); // повертає новий список
        System.out.println(lr);
    }

}


