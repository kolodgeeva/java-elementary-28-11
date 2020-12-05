package com.hillel.lesson2;

public class CompareTest {

    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 0;

        if (number1 == number2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        String string1 = "one";
        String string2 = "one1";

        if (string1.equals(string2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


        Person person1 = new Person();
        person1.setName("Dasha");

        Person person2 = new Person();
        person2.setName("Dasha");

        System.out.println(person1 == person2);

        if (person1.equals(person2)) {
            System.out.println("persons are equal");
        } else {
            System.out.println("persons are not equal");
        }
    }
}
