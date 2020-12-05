package com.hillel.lesson2;

public class ClassTest {
    public static void main(String[] args) {

        Cat catNull = null;
        Cat cat = new Cat();
        Cat anotherCat = cat;
        Cat cat3 = new Cat();
        Cat cat4 = anotherCat;

        System.out.println(catNull);
        System.out.println(cat);
        System.out.println(cat.toString());

        System.out.println("Another cat: " + anotherCat);
        System.out.println("3 cat: " + cat3);
        System.out.println("4 cat: " + cat4);

        cat = null;

    }
}
