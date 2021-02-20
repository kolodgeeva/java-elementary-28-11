package com.hillel.lesson10;

import static com.hillel.lesson10.NameSwapperTest.SWAPPER;

public class NameSwapperTest {

    public static NameSwapper SWAPPER = new NameSwapper();

    public static void main(String[] args) {

        SWAPPER.printNames();

        Thread thread1 = new SwapperThread();
        thread1.start();

        Thread thread2 = new SwapperThread();
        thread2.start();

        SWAPPER.printNames();

    }
}

class SwapperThread extends Thread {
    @Override
    public void run() {
        SWAPPER.swap();
    }
}
