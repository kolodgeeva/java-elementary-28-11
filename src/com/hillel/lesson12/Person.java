package com.hillel.lesson12;

import java.util.List;

public class Person {

    private final String name;
    private final List<String> emails;

    public Person(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }

    public static List<Person> getPeople() {
        Person person1 = new Person("John",
                List.of("john1@gmail.com","john2@gmail.com","john3@gmail.com"));

        Person person2 = new Person("Liza",
                List.of("liza1@gmail.com","liza2@gmail.com","liza3@gmail.com"));

        Person person3 = new Person("Tom",
                List.of("tom1@gmail.com","tom2@gmail.com","tom3@gmail.com"));

        return List.of(person1, person2, person3);
    }
}
