package com.hillel.lesson3;

public class BullMain {

    public static void main(String[] args) {

        Bull bull = new Bull("RedBull");

        System.out.println(bull);

        System.out.println("Bull count: " + Bull.getCount());

        Bull[] bulls = new Bull[100];
        for (int i = 0; i < bulls.length; i++) {
            bulls[i] = new Bull("Bull" + i);
        }

        System.out.println("Bull count: " + Bull.getCount());


        Bull bull1 = new Bull("Bull1", 1);
        Bull bull2 = new Bull("Bull2", 2);

        System.out.println("Does Bull1 win? " + bull1.fight(bull2));
        System.out.println("Does Bull2 win? " + bull2.fight(bull1));

    }
}
