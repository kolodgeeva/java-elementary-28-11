package com.hillel.lesson12;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<Integer, String> strings = new HashMap<>(Map.of(
                1, "val1",
                2, "val2",
                3, "val3",
                4, "val4"
        ));

        for (Map.Entry<Integer, String> entry: strings.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        System.out.println("______________");
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        strings.putIfAbsent(3, "new val3");

        System.out.println("______________");
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        String string = strings.computeIfPresent(3, (key, value) -> value + key);

        System.out.println("______________");
        System.out.println(string);
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        String string2 = strings.computeIfPresent(5, (key, value) -> value + key);

        System.out.println("______________");
        System.out.println(string2);
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));


        String string3 = strings.computeIfAbsent(3, key -> "value for " + key);

        System.out.println("______________");
        System.out.println(string3);
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        String string4= strings.computeIfAbsent(666, key -> "value for " + key);

        System.out.println("______________");
        System.out.println(string4);
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        strings.remove(666, "value for 666");

        System.out.println("______________");
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));


        strings.merge(1, "new value", (oldValue, newValue) -> oldValue + newValue);

        System.out.println("______________");
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        strings.merge(100, "new value", (oldValue, newValue) -> oldValue + newValue);

        System.out.println("______________");
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        String string5 = strings.getOrDefault(3, "default value");
        System.out.println(string5);

        String string6 = strings.getOrDefault(33, "default value");
        System.out.println(string6);


    }
}
