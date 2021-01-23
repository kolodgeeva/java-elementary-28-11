package com.hillel.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {

  public static void main(String[] args) {

    // create array vs create ArrayList
    String[] arrStrings = new String[10];
    ArrayList<String> arrListStrings = new ArrayList<>();

    // fill array, ArrayList
    for (int i = 0; i < arrStrings.length; i++) {
      arrStrings[i] = "arr " + i;
      arrListStrings.add(i, "arrList " + i);
    }

    // get length
    System.out.println(arrStrings.length);
    System.out.println(arrListStrings.size());

    // get elements by indexes
    System.out.println(arrStrings[3]);
    System.out.println(arrListStrings.get(3));

    // set elements by indexes
    arrStrings[3] = "new arr " + 3;
    arrListStrings.set(3, "new arrList " + 3);

    System.out.println(arrStrings[3]);
    System.out.println(arrListStrings.get(3));

    // add element to the end
    // arrStrings[10] = "add to the end"; cannot to do
    arrListStrings.add("add to the end");

    System.out.println(arrListStrings.get(10));

    System.out.println("Size before add to the middle: " + arrListStrings.size());

    // add element to the middle
    // arrStrings[3] = "add to the middle"; cannot to do, because we override 3 element
    arrListStrings.add(3, "add to the middle");

    System.out.println("Size after add to the middle: " + arrListStrings.size());

    System.out.println(arrListStrings.toString());

    System.out.println("---------------------");

    // add element to the start
    // arrStrings[0] = "add to the start"; cannot to do, because we override 0 element
    arrListStrings.add(0, "add to the start");

    System.out.println(arrListStrings.toString());

    System.out.println("---------- Remove in array -----------");
    arrStrings[4] = null;

    for (String str : arrStrings) {
      System.out.println(str);
    }

    System.out.println("---------- Remove in ArrayList -----------");

    // remove by index
    arrListStrings.remove(4);
    System.out.println(arrListStrings.toString());

    // Array to List
    List<String> newList = Arrays.asList(arrStrings);
    System.out.println(newList.toString());

    // List to Array
    Object[] newArray = newList.toArray();



  }


}
