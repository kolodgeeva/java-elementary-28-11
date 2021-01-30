package com.hillel.lesson7;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<String> strings = new Stack<>();

        strings.push("one");

        System.out.println(strings.peek());
        System.out.println(strings.size());

        System.out.println(strings.pop());
        System.out.println(strings.size());

        strings.push("two");
        strings.push("three");

        System.out.println(strings.peek());

    }

}
