package com.hillel.lesson10;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "response";
    }
}
