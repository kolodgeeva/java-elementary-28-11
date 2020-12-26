package com.hillel.lesson5;

public class PhoneMain {

    public static void main(String[] args) {

        AbstractPhone phone = new TomasEdisonPhone(1873);
        AbstractPhone phone1 = new Phone(1980);
        AbstractPhone smartphone = new SmartPhone(2000);
        AbstractPhone smartphone2 = new SmartPhone(2010);

        User user = new User("Mariana");
        user.callAnotherUser("0953254354", phone);

        user.callAnotherUser("456567687", phone1);

        user.callAnotherUser("4647656768", smartphone);
        user.callAnotherUser("4647656768", smartphone2);


    }
}
