package com.ua.RD.lesson23;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        List<Integer> list = List.of(1, -2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        var mn = list.stream()
//                .anyMatch(it -> it < 0);
//        System.out.println(mn);
//
//
//        var allN = list.stream()
//                .allMatch(it -> it < 0);//always boolean logic (can be with logic operators)
//        System.out.println(allN);
//
//        var noneMatch = list.stream()
//                .allMatch(it -> it > 0);
//        System.out.println(noneMatch);
//        List<String> stringList = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
//        String s = "1";
//        Optional<String> stringOptional = Optional.ofNullable(s);//auto null check
//        stringOptional.or(() -> Optional.of(""));
//        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty"));
//        var r = stringOptional.orElse("default");
//        System.out.println(r.length());
//
//
//
//        Optional<String> so1 =  stringList.stream().
//                filter(it -> it.length() < 3).
//                findFirst();
//        System.out.println(so1.isPresent());
//
//
//
//        stringList.stream().filter(it -> it.length() < 3)
//                .collect(Collectors.toList()).stream()
//                .map(s1 -> s1="sdsdfgsg");


//        List<List<Integer>> inList = List.of(
//                List.of(1, 2, 3),
//                List.of(4, 5, 6),
//                List.of(7, 8, 9),
//                List.of(10, 11, 12)
//        );
//        System.out.println(inList);
//
//        List<Integer> res = inList.stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//
//        System.out.println(res);

        List<Money> moneyList = List.of(
                new Money(1, 100.01d),
                new Money(1, 200.02d),
                new Money(4, 300.03d),
                new Money(4, 400.04d),
                new Money(4, 500.05d),
                new Money(1, 600.06d),
                new Money(7, 700.07d),
                new Money(7, 800.08d),
                new Money(9, 900.09d),
                new Money(7, 1000.10d)
        );

        System.out.println(moneyList);

        Map<Integer,Double> l2 = moneyList.stream()
                .collect(Collectors.groupingBy(Money::getId,Collectors.summingDouble(Money::getSum)));
        //counting()
        System.out.println(l2);
    }
}

