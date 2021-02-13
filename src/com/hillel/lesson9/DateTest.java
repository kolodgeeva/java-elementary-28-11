package com.hillel.lesson9;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.now;

public class DateTest {

    public static void main(String[] args) {

        LocalDate now = now();
        System.out.println(now);

        LocalDate dateOfBirth = LocalDate.of(2020, 4, 15);
        System.out.println(dateOfBirth);

        LocalDate anotherDate = LocalDate.parse("1981-05-30");
        System.out.println(anotherDate);

        System.out.println(anotherDate.getMonth());

        System.out.println(anotherDate.isAfter(dateOfBirth));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.of(11, 50);
        System.out.println(time1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse("2021-01-01T06:00:00");
        System.out.println(localDateTime1);

        System.out.println(localDateTime.plusYears(3));

        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yy MM dd")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MMM dd")));

        ZoneId zoneId = ZoneId.of("CET");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2021, 3, 10, 0, 0, 0, 0, zoneId);

        System.out.println(zonedDateTime);

        System.out.println(ZonedDateTime.now());

        LocalDate initialDate = now();
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        //initialDate.plusDays(5);

        int five = Period.between(initialDate, finalDate).getDays();
        long five1 = ChronoUnit.DAYS.between(initialDate, finalDate);

        LocalTime initialTime = LocalTime.now();
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        long thirty = Duration.between(initialTime, finalTime).getSeconds();
        long thirty1 = ChronoUnit.SECONDS.between(initialTime, finalTime);





    }
}
