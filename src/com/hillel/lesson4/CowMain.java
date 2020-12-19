package com.hillel.lesson4;

public class CowMain {

    public static void main(String[] args) {

        Cow something = new Whale();
        something.name = "Who are you?";
        printCow(something);

        Cow cow = new Cow();
        Whale whale = (Whale) cow;

    }

    private static void printCow(Cow cow) {
        cow.printName();
    }
}
