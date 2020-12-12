package com.hillel.lesson3;

public class Bicycle {

    int height;
    String model;

    public Bicycle(int height, String model) {
        this.height = height;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "weight=" + height +
                ", model='" + model + '\'' +
                '}';
    }

    public void ride() {
        System.out.println("ride!");
    }


    public class SteeringWheel {

        public void left() {
            System.out.println("left");
        }

        public void right() {
            System.out.println("right");
        }

    }

    public class Seat {

        public void up() {
            height++;
            System.out.println("up");
        }

        public void down() {
            height--;
            System.out.println("down");
        }

    }

}
