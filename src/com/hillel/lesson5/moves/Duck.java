package com.hillel.lesson5.moves;

public class Duck implements Flyable, Runnable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void run() {
        System.out.println("Duck runs");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
