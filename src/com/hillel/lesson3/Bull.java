package com.hillel.lesson3;

public class Bull {

    public static final String BULL_CREATED = "Bull created";
    public static final String BULL_CREATED_WITH_NAME = "Bull created with name";
    public static int COUNT;

    String name;
    int power;

    public Bull() {
        COUNT++;
        System.out.println(BULL_CREATED);
    }

    public Bull(String name) {
        COUNT++;
        this.name = name;
        System.out.println(BULL_CREATED_WITH_NAME);
    }

    public Bull(String name, int power) {
        COUNT++;
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Bull{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }

    public boolean fight(Bull bull) {
        return this.power > bull.power;
    }

    public static int getCount() {
        return COUNT;
    }

}
