package com.hillel.lesson11;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ForEachTest {

    public static void main(String[] args) {

        List<String> strings = List.of("one", "two", "three");
        strings.forEach(ForEachTest::print);

        Supplier<String> stringConsumer = String::new;
        //Supplier<String> stringConsumer = () -> new String();
        String newString = stringConsumer.get();

    }

    public static void print(String string) {
        System.out.println("-----------");
        System.out.println(string);
    }

}
