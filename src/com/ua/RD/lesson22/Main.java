package com.ua.RD.lesson22;

import com.ua.RD.lesson19.Person;
import com.ua.RD.lesson19.PersonDto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Person> persons = new ArrayList<>();
//
//
//        persons.add(new Person(14, "Ivan"));
//        persons.add(new Person(23, "Petr"));
//        persons.add(new Person(12, "sdsaf"));
//
//        Collection.sort(persons, (o1, o2) -> {
//            System.out.println("hello");
//            return o1.getName().compareTo(o2.getName());
//        });

//
//
//        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//
//        List <Integer> streamresult = list1.stream()
//                .filter(integer -> integer%2==0)
//                .map(integer -> integer*2)
//                .distinct()
//                .collect(Collectors.toList());
//
//
//        System.out.println(streamresult);
//
//
//        List<Integer> l2 = List.of(1, 1, 3, 4, 5, 1, 7, 8, 9, 10);
//
//        List<Integer> u2 = l2.stream().distinct().collect(Collectors.toList());
//
//
//        System.out.println(u2);


        List<Person> persons = new ArrayList<>();


        persons.add(new Person(14, "Ivan"));
        persons.add(new Person(23, "Petr"));
        persons.add(new Person(12, "sdsaf"));


        var personDto = persons.stream()
                .map(Main::toPersonDto)
                //.map(person ->toPersonDto(person))
                .collect(Collectors.toList());

        System.out.println(persons);


        var l3 = List.of(1, 1, 3, 4, 5, 1, 7, 8, 9, 10);

        l3.stream().skip(2)
                .limit(2)
                .collect(Collectors.toList());

    }

    private static PersonDto toPersonDto(Person person) {
        return new PersonDto(person.getAge(), person.getName());
    }
}
