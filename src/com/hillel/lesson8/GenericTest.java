package com.hillel.lesson8;

public class GenericTest {

    public static void main(String[] args) {

        Integer integer = printAndGet(123);
        String string = printAndGet("string");
        Boolean bool = printAndGet(true);
        Person person = printAndGet(new Person(30, "Name"));

        Printer<String> stringPrinter = new Printer<>("some string");
        System.out.println(stringPrinter.toString());
        System.out.println(stringPrinter.getValue());

        Printer<Person> personPrinter = new Printer<>(new Person(45, "Vlad"));
        System.out.println(personPrinter.toString());
        System.out.println(personPrinter.getValue());

    }

    public static <T> T printAndGet(T object) {

        T anotherLink = object;

        System.out.println(object);
        return object;
    }
}
