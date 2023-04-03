package com.ua.RD.Homework23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> surname = List.of("Ivanov", "Petrov",
                "Sidorov", "Petrov", "Sidorov", "Petrov", "Sidorov",
                "Ivanov", "Petrov", "Sidorov", "Petrov", "Sidorov",
                "Petrov", "Sidorov", "Petrov", "Sidorov", "Ivanov",
                "Petrov", "Sidorov", "Petrov");
        Map<String, Long> surnameMap = surname.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        System.out.println();
        System.out.println(surnameMap);
        System.out.println();


        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumb = random.nextInt(11, 21);
            list.add(randomNumb);
        }

        System.out.println(list);
        // System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        System.out.println(list.stream().collect(Collectors.summingInt(Integer::intValue)));


    }
}
