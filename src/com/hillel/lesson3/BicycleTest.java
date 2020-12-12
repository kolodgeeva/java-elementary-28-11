package com.hillel.lesson3;

public class BicycleTest {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(70, "model1");

        Bicycle.Seat seat = bicycle.new Seat();
        Bicycle.SteeringWheel wheel = bicycle.new SteeringWheel();

        wheel.left();
        wheel.right();

        seat.up();
        seat.up();
        seat.up();
        seat.up();

        System.out.println(bicycle);

        seat.down();

        System.out.println(bicycle);

    }
}
