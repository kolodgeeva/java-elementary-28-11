package com.hillel.lesson12;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        List<String> strings = List.of("one", "two", "three");

        Stream<String> stringStream = strings.stream();

        Stream<Integer> integerStream = Stream.of(10, 5, 40, 40, 50, 5);

        integerStream
                .distinct()
                .forEach(System.out::println);

        List<Integer> numbers = List.of(10, 5, 40, 40, 50, 5);

        System.out.println("Numbers > 10: " + numbers.stream()
                .filter(number -> number > 10)
                .count());

        strings.stream()
                .filter(string -> string.length() == 3)
                .forEach(System.out::println);

        strings.stream()
                .map(String::length)
                .forEach(System.out::println);


    }

}
