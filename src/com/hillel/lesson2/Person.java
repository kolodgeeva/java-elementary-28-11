package com.hillel.lesson2;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public boolean equals(Person person) {
        if (name != null) {
            return name.equals(person.name);
        }
        return person.name == null;
    }

    private void secureInfo() {

    }

}
