package com.ua.RD.work;

//import com.ua.RD.lesson20.Language;
//import com.ua.RD.lesson20.Word;
import com.ua.RD.work.domain.Employee;
import com.ua.RD.work.domain.EmploymentType;
import com.ua.RD.work.service.EmployeeService;
import com.ua.RD.work.service.GeneralTaxesService;
import com.ua.RD.work.service.PeThirdGroupTaxesService;
import com.ua.RD.work.service.TaxesService;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        TaxesService pe3TaxesService = new PeThirdGroupTaxesService();
        TaxesService generalTaxesService = new GeneralTaxesService();
        TaxesService[] taxesServices = {pe3TaxesService, generalTaxesService};


        EmployeeService employeeService = new EmployeeService();
        employeeService.printEmployees();
        Employee employeeWithMaxSalary = employeeService.findEmployeeWithMaxSalary();
        System.out.println();
        System.out.println("Employee with max salary: ");
        employeeService.printEmployee(employeeWithMaxSalary);
        Employee employeeWithMinSalary = employeeService.findEmployeeWithMinSalary();
        System.out.println();
        System.out.println("Employee with min salary: ");
        employeeService.printEmployee(employeeWithMinSalary);
        System.out.println();

        List<Employee> employees = employeeService.findAll();
        for (TaxesService taxesService : taxesServices) {
            System.out.println("Taxes - " + taxesService.getClass().getSimpleName() + ": " + taxesService.calculateTaxes(employees));
        }

        List<Employee> employeesWithGeneralSystem = employeeService.findEmployeesByType(EmploymentType.GENERAL);
        List<Employee> employeesWithPeSystem = employeeService.findEmployeesByType(EmploymentType.PE);

        System.out.println("General taxes: " + generalTaxesService.calculateTaxes(employeesWithGeneralSystem));
        System.out.println("Pe third group taxes: " + pe3TaxesService.calculateTaxes(employeesWithPeSystem));


//        Instant instant = Instant.now();
//        System.out.println(instant);
//        System.out.println(instant.atZone(ZoneId.of("Europe/Kiev")));
//        System.out.println(instant.atZone(ZoneId.of("Pacific/Ponape")));
//        instant.minus(1, ChronoUnit.HOURS);
//
//        var before = Instant.now();
//        var list1 = new LinkedList<>();
//        for (long i = 0; i < 100_000L; i++) {
//            list1.add(i);
//        }
//        var after = Instant.now();
//        System.out.println();
//        System.out.println(after);
//        System.out.println(before);
//        var difference = after.toEpochMilli() - before.toEpochMilli();
//        System.out.println(difference);


//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        System.out.println(localTime.plus(1, ChronoUnit.HOURS));

//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        System.out.println(localDate.plus(1, ChronoUnit.DAYS));
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getDayOfYear());
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonthValue());
//        System.out.println(localDate.lengthOfYear());
//        System.out.println(localDate.lengthOfMonth());
//
//        LocalDate ld2 = LocalDate.of(2001, 9, 11);
//        System.out.println(ld2.getDayOfWeek());

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        localDateTime.toInstant(ZoneOffset.UTC);
//        Date date = new Date();
//        System.out.println(date.getTime());


        // ZoneId.getAvailableZoneIds().forEach(System.out::println);

//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        var formattedDate = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(formattedDate);
//        String date = "20/11/2022";
//        LocalDate localDate2 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(localDate2);

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        var formattedDate = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS"));
//        System.out.println(formattedDate);
//        String date = "20/11/2022 10:00:00.000";
//        LocalDateTime localDateTime2 = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS"));
//        System.out.println(localDateTime2);
//
//        LocalDate localDate = LocalDate.now();
//        LocalDate endDate = localDate.plusMonths(1);
//
//        ZonedDateTime zdt = localDate.atStartOfDay(ZoneId.of("Pacific/Ponape"));
//        System.out.println(zdt);
//        var dt = zdt.toLocalDate();
//        System.out.println(dt);
//        String s = "qwe".toLowerCase(Locale.FRENCH);
//        System.out.println("こんにちは");
//        s.toLowerCase(Locale.);

//        Map<Word, List<Word>> map1 = new HashMap<>();
//        Word ua1 = new Word(Language.UA, "привіт");
//        map1.put(ua1, List.of(new Word(Language.EN, "hello"), new Word(Language.JAP, "こんにちは")));
//        System.out.println(map1);
//        List<Word> ll1 = map1.get(ua1);

//        System.out.println(ll1);
    }
}
