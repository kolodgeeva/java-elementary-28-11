package com.hillel.lesson10;

public class NameSwapper {

    private volatile String name1 = "Olia";
    private volatile String name2 = "Lena";

    public void swap() {
        synchronized (this) {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }

    public void printNames() {
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
    }
}
