package com.hillel.lesson7;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> strings = new PriorityQueue<>();

        strings.add(3);
        System.out.println(strings.toString());

        strings.add(1);
        System.out.println(strings.toString());

        strings.add(2);
        System.out.println(strings.toString());

        strings.add(4);
        System.out.println(strings.toString());

        strings.offer(5);
        System.out.println(strings.toString());

        System.out.println(strings.peek());
        System.out.println(strings);

        System.out.println(strings.element());
        System.out.println(strings);

        System.out.println(strings.remove());
        System.out.println(strings);

        System.out.println(strings.poll());
        System.out.println(strings);

    }
}
