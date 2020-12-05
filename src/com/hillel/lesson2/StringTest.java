package com.hillel.lesson2;

public class StringTest {

    public static void main(String[] args) {

        String string = "";
        String string1 = "Some text";
        String string2 = new String("Test");

        System.out.println(string);

        System.out.println(string1);
        System.out.println(string2);

        string1 = string1 + "new text";

        System.out.println("updated: " + string1);

        StringBuffer buffer = new StringBuffer("Test");

        buffer.append("continue");
        buffer.append("ttt");

        buffer.reverse();

        System.out.println("StringBuffer append: " + buffer.toString());






    }
}
