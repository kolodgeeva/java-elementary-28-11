package com.hillel.lesson12;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.hillel.lesson12.Person.getPeople;

public class PersonEmployeeTest {

    public static void main(String[] args) {

        List<Person> people = getPeople();

        List<Employee> employees = people.stream()
                .map(Employee::new)
                //.map(person -> new Employee(person))
                .collect(Collectors.toList());

        employees.forEach(System.out::println);

        Set<Employee> employeeSet = people.stream()
                .map(Employee::new)
                .collect(Collectors.toSet());

        Map<String, Employee> employeeMap = people.stream()
                .map(Employee::new)
                //.collect(Collectors.toMap(employee -> employee.getName(), employee -> employee))
                .collect(Collectors.toMap(Employee::getName, Function.identity()));

    }
}
