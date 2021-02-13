package com.hillel.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathTest {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer number1 = Integer.parseInt(reader.readLine());
            Integer number2 = Integer.parseInt(reader.readLine());

            Integer result = number1 / number2;
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (IOException e) {
            System.out.println("IO error");
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero!");
        } catch (Exception e) {
            System.out.println("Exception!");
        } finally {
            reader.close();
        }
    }
}
