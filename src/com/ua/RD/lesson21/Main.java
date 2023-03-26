package com.ua.RD.lesson21;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(Clock.systemDefaultZone()+"2222");
        System.out.println(instant.atZone(ZoneId.of("Asia/Aqtau")).toString());
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


    }

}
//що робить інстант квері?
//а можна детальніше що таке сінглтон ? знаю що паттерн проектуваня але не розумію його суті