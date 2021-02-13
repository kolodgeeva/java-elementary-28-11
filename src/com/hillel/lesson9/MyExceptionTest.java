package com.hillel.lesson9;

public class MyExceptionTest {

    public static void main(String[] args) {

        try {
            throw new MyCheckedException("details");
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }

        throw new MyUncheckedException("some text");

    }
}
