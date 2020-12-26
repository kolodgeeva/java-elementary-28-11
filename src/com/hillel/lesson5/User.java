package com.hillel.lesson5;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(String number, AbstractPhone phone) {
        phone.call(number);
    }

}
