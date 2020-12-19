package com.hillel.lesson4;

public class ImmutableUser {

    private String firstName;
    private String lastName;
    private int age;
    private int changeCounter;

    public ImmutableUser(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void update(String firstName, String lastName, int age) {
        if (!this.firstName.equals(firstName) || !this.lastName.equals(lastName) || this.age != age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.changeCounter++;
            System.out.println("User is updated. Changes: " + changeCounter);
        } else {
            System.out.println("user is not changed");
        }
    }

}
