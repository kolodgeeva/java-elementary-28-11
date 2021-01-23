package com.hillel.lesson6;

import java.util.LinkedList;

public class LinkedListMain {

  public static void main(String[] args) {

    LinkedList<String> strings = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
      strings.add("string " + i);
    }

    System.out.println(strings);

    System.out.println(strings.get(4));

    strings.add(4, "new string");

    System.out.println(strings);

    strings.addFirst("new first");

    strings.addLast("new Last");

    System.out.println(strings);


  }

}
