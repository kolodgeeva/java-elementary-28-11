package com.hillel.lesson1;

public class Recursion {

    public static void main(String[] args) {
        recursionFucn(0);
    }

    public static void recursionFucn(int number) {
        System.out.println("Number: " + number);
        System.out.println("Привет, Java!");

        if (number >= 100) {
            return;
        }
        recursionFucn(number + 1);
    }

}
