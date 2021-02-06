package com.hillel.lesson8;

public class Person implements Comparable<Person>{

    private final Integer age;
    private final String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if (this.age > person.age) {
            return -1;
        } else if (this.age < person.age) {
            return 1;
        }
        return 0;
    }
}
