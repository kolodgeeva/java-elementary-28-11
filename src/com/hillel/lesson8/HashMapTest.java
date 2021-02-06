package com.hillel.lesson8;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<String, Integer> items = new HashMap<>();

        items.put(null, 3);
        items.put(null, 4);

        System.out.println(items);

        items.put("яблоки", 3);
        items.put("груши", 5);
        items.put("сливы", 1);
        items.put("бананы", 8);

        System.out.println(items);

        System.out.println(items.get("бананы"));

        if (items.containsKey("груши")) {
            System.out.println("есть!");
        }
    }

}
