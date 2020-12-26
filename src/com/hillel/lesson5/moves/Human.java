package com.hillel.lesson5.moves;

public class Human implements Runnable, Swimmable {

    @Override
    public void run() {
        System.out.println("Human runs");
    }

    @Override
    public void swim() {
        System.out.println("Human swims");
    }

}
