package com.hillel.lesson4;

public class Cat extends Animal {

    @Override
    public void say() {
        super.say();
        System.out.println("meow meow");
    }

    public void mur() {
        System.out.println("murrrrr");
    }
}
