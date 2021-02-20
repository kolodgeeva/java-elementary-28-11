package com.hillel.lesson10;

public class ThreadTest {

    public static void main(String[] args) {
        Thread thread = new NewPrinter("my-printer-1");
        thread.start();

        System.out.println(thread.getName() + " started");

        Thread thread2 = new NewPrinter("my-printer-2");
        thread2.start();

        System.out.println(thread2.getName() + " started");
    }
}

