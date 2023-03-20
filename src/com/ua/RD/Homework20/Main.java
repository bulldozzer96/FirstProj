package com.ua.RD.Homework20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to translate \nin lower case: ");
        String fromInput = scanner.next();


        Map<String, List<String>> dictionary = new HashMap<>();
        dictionary.put("рушниця", List.of("in english: rifle", "auf deutsch: gewehr", "銃"));
        dictionary.put("паляниця", List.of("in english: loaf", "auf deutsch: laib", "パン"));
        dictionary.put("полуниця", List.of("in english: strawberry", "auf deutsch: erdbeere", "いちご"));
        dictionary.put("потяг", List.of("in english: train", "auf deutsch: der zug", "列車"));
        dictionary.put("автомобіль", List.of("in english: car", "auf deutsch: auto", "車"));
        dictionary.put("поле", List.of("in english: field", "auf deutsch: feld", "分野"));
        dictionary.put("сонце", List.of("in english: sun", "auf deutsch: sonne", "太陽"));
        dictionary.put("червоний", List.of("in english: red", "auf deutsch: rot", "赤"));
        dictionary.put("монітор", List.of("in english: monitor", "auf deutsch: monitor", "モニター"));
        dictionary.put("двері", List.of("in english: door", "auf deutsch: tür", "ドア"));

        System.out.println(dictionary.get(fromInput));

    }
}
