package com.hillel.lesson10;

public class RunnableTest {

    public static void main(String[] args) {
        Printer printer = new Printer("mariana-printer");
        Thread thread = new Thread(printer);
        thread.start();

        System.out.println(printer.name + " started");

        Printer printer2 = new Printer("ksenia-printer");
        Thread thread2 = new Thread(printer2);
        thread2.start();

        System.out.println(printer2.name + " started");

        Thread thread3 = new Thread(printer2);
        thread3.start();

        Thread thread4 = new Thread(() -> System.out.println("lambda"));
        thread4.start();

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anon class");
            }
        });
        thread5.start();

        System.out.println(printer2.name + " second started");

        System.out.println("Main thread finished");
    }
}

class Printer implements Runnable {

    String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I'm " + name);
        System.out.println(name + " thread finished");
    }
}
