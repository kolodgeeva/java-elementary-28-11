package com.hillel.lesson10;

public class JoinTest {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new NewPrinter("my-printer");
        thread.start();

        System.out.println("Started " + thread.getName());

        Thread.sleep(2000);

        Thread thread1 = new NewPrinter("my-printer-1");
        thread1.start();

        System.out.println("Started " + thread1.getName());

        thread.join();
        System.out.println("Joined " + thread.getName());

        thread1.join();
        System.out.println("Joined " + thread1.getName());

        System.out.println("All threads are finished");


    }
}
