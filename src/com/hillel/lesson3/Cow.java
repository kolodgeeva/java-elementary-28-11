package com.hillel.lesson3;

public class Cow {

    private String name;
    private int age;

    public Cow() {
        System.out.println("Cow created");
    }

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cow(String name) {
        this.name = name;
    }

    public Cow(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Cow name=" + name + ", age=" + age);
    }
}
