package com.hillel.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.function.*;

public class StringChangerTest {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                return reader.readLine();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            return null;
        };

        String inputString = stringSupplier.get();

        UnaryOperator<String> reverseFunction = stringToReverse -> new StringBuilder(stringToReverse)
                .reverse().toString();

        //UnaryOperator<String> upperCaseFunction = stringToUpper -> stringToUpper.toUpperCase();
        UnaryOperator<String> upperCaseFunction = String::toUpperCase;

        //Function<String, Integer> countFunction = stringForCount -> stringForCount.length();
        Function<String, Integer> countFunction = String::length;

        //Consumer<String> printer = stringToPrint -> System.out.println(stringToPrint);
        Consumer<String> printer = System.out::println;

        //Predicate<String> isEmptyPredicate = str -> str.isEmpty();
        Predicate<String> isEmptyPredicate = String::isEmpty;

        printer.accept(inputString);
        System.out.println(countFunction.apply(inputString));
        changeString(inputString, reverseFunction);
        changeString(inputString, upperCaseFunction);
        System.out.println(isEmptyPredicate.test(inputString));

    }

    public static void changeString(String string, UnaryOperator<String> function) {
        String newString = function.apply(string);
        System.out.println(newString);
    }

}
