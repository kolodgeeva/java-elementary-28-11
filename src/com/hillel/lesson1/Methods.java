package com.hillel.lesson1;

public class Methods {

    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(1);
        System.out.println(1L);
        System.out.println(true);

        hello();
        hello("Mariana");
        hello("M", "K");
    }

    public static void hello() {
        System.out.println("Hello!");
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void hello(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }
}
