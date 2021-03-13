package com.hillel.lesson12;

import java.util.List;
import java.util.stream.Collectors;

import static com.hillel.lesson12.Person.getPeople;

public class PersonEmailTest {

    public static void main(String[] args) {

        List<Person> people = getPeople();

        System.out.println("Without streams:");

        for (Person person: people) {
            for (String email: person.getEmails()) {
                boolean isSent = sendEmail(email);
                System.out.println("Email send status: " + isSent);
            }
        }

        System.out.println("----------------------------");
        System.out.println("With streams:");

        people.stream()
                .flatMap(person -> person.getEmails().stream())
                .map(PersonEmailTest::sendEmail)
                .forEach(isSent -> System.out.println("Email send status: " + isSent));

        System.out.println("----------------------------");
        System.out.println("With collect to string:");

        String emails = people.stream()
                .flatMap(person -> person.getEmails().stream())
                .collect(Collectors.joining(","));

        sendEmail(emails);
    }

    public static boolean sendEmail(String email) {
        System.out.println("send email to " + email);
        return true;
    }
}
