package com.hillel.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Counter extends Thread {


    static int counter;

    public static void main(String[] args) throws InterruptedException {

        List<Thread> counters = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Counter();
            thread.start();
            counters.add(thread);
        }

        for(Thread thread: counters) {
            thread.join();
        }

        System.out.println(counter);
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }
}
