package com.hillel.lesson12;

public class Employee {

    private final String name;

    public Employee(Person person) {
        this.name = person.getName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
