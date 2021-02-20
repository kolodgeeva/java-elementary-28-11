package com.hillel.lesson10;

public class ClockTest {

    public static void main(String[] args) throws InterruptedException {

        ClockThread clockThread = new ClockThread();
        clockThread.start();

        Thread.sleep(5000);
        clockThread.interrupt();

    }
}
