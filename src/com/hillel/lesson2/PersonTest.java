package com.hillel.lesson2;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Masha");
        person1.setAge(15);

        System.out.println("Before change: ");

        System.out.println("Person1: ");
        printPerson(person1);

        Person person2 = person1;
        System.out.println("Person2: ");
        printPerson(person2);

        changePerson(person2);

        System.out.println("After change: ");

        System.out.println("Person1: ");
        printPerson(person1);
        System.out.println("Person2: ");
        printPerson(person2);

    }

    private static void printPerson(Person person) {
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

    private static void changePerson(Person person) {
        person.setName(person.getName() + " Changed");
        person.setAge(person.getAge() + 100);
    }


}
