package com.hillel.lesson5.moves;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!(input = reader.readLine()).isEmpty()) {

            Object object = null;
            switch (input) {
                case "human":
                    object = new Human();
                    break;
                case "duck":
                    object = new Duck();
                    break;
                case "ship":
                    object = new Ship();
                    break;
                default:
                    System.out.println("Invalid input");
            }

            if (object instanceof Flyable) {
                ((Flyable) object).fly();
            }

            if (object instanceof Runnable) {
                ((Runnable) object).run();
            }

            if (object instanceof Swimmable) {
                ((Swimmable) object).swim();
            }
        }
    }
}
