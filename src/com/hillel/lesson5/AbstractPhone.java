package com.hillel.lesson5;

public abstract class AbstractPhone {

    int year;

    public AbstractPhone(int year) {
        this.year = year;
    }

    public void printYear() {
        System.out.println("Year: " + year);
    }

    public abstract void call(String outputNumber);

    public abstract void ring(String inputNumber);

}
