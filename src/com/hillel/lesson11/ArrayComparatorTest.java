package com.hillel.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayComparatorTest {

    public static void main(String[] args) {

        String[] strings1 = {"one", "two", "three"};
        String[] strings2 = {"one", "two"};
        String[] strings3 = {"one", "two", "three", "four"};

        List<String[]> strings = new ArrayList<>(List.of(strings1, strings2, strings3));

        printResult(strings);

        /*Comparator<String[]> comparator = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        };*/

        //Comparator<String[]> comparator = (o1, o2) -> o1.length - o2.length;

        strings.sort((o1, o2) -> o1.length - o2.length);

        //strings.sort(Comparator.comparingInt(o -> o.length));

        printResult(strings);

    }

    private static void printResult(List<String[]> strings) {
        System.out.println("____________________");
        for (String[] str: strings) {
            System.out.println(Arrays.toString(str));
        }
    }

}
