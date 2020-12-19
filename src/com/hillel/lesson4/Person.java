package com.hillel.lesson4;

public abstract class Person {

    String name;

    public Person() {
        System.out.println("Person empty constructor");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("Person with name constructor");
    }
}
