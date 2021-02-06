package com.hillel.lesson8;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PersonQueueMain {

    public static void main(String[] args) {

        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getName().length() > o2.getName().length()) {
                    return -1;
                } else if (o2.getName().length() > o1.getName().length()) {
                    return 1;
                }
                return 0;
            }
        };

        //Queue<Person> persons = new PriorityQueue<>();
        Queue<Person> persons = new PriorityQueue<>(personComparator);

        Person ivan = new Person(30, "Ivan");
        persons.add(ivan);
        persons.add(new Person(10, "Maria"));
        persons.add(new Person(60, "Petro"));
        persons.add(new Person(20, "Viktor"));
        persons.add(new Person(48, "Olga"));

        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());

    }

}
