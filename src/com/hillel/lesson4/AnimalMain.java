package com.hillel.lesson4;

import java.util.List;

public class AnimalMain {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Vasiliy";

        Dog dog = new Dog();
        dog.name = "Bobick";

        Parrot parrot = new Parrot();
        parrot.name = "Kesha";

        Animal parrot2 = new Parrot();
        parrot2.name = "Kesha2";

        List<Animal> animals = List.of(cat, dog, parrot, parrot2);

        for (Animal an: animals) {
            an.print();
            an.say();
            if (an instanceof Cat) {
                Cat catAnimal = (Cat) an;
                catAnimal.mur();
            }
        }
    }
}
