package com.hillel.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfElements = Integer.parseInt(reader.readLine());

        int[] numbers = new int[numberOfElements];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            if (numbers[i] % 2 == 0) {
                System.out.println("четное: " + numbers[i]);
            } else {
                System.out.println("нечетное: " + numbers[i]);
            }
        }

    }

}
