package com.hillel.lesson7;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Person> persons = new HashMap<>();

        Person ivanIvanich = new Person("Ivan Ivanich", 50);
        persons.put("manager", ivanIvanich);

        Person mariaPetrovna = new Person("Maria Petrovna", 60);
        persons.put("cleaner", mariaPetrovna);

        for (Map.Entry<String, Person> personEntry: persons.entrySet()) {
            System.out.println("Key: " + personEntry.getKey());
            System.out.println("Value: " + personEntry.getValue());
        }

        System.out.println(persons.containsKey("manager"));
        System.out.println(persons.containsKey("director"));

        if (persons.containsKey("manager")) {
            Person manager = persons.get("manager");
            System.out.println(manager);
        }

        if (persons.containsKey("director")) {
            System.out.println(persons.get("director"));
        } else {
            System.out.println("No director");
        }

        System.out.println(persons.toString());
        persons.remove("manager");

        System.out.println(persons.toString());

    }
}
