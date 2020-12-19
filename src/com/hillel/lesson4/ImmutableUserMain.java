package com.hillel.lesson4;

public class ImmutableUserMain {

    public static void main(String[] args) {

        ImmutableUser user = new ImmutableUser("Mariana", "Kolodzheieva", 18);

        user.update("Mariana", "Kolodzheieva", 18);
        user.update("Mariana", "Kolodzheieva", 19);
        user.update("Mariana1", "Kolodzheieva1", 20);


    }
}
