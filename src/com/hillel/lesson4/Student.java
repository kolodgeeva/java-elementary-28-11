package com.hillel.lesson4;

public class Student extends Person {

    int grade;

    public Student() {
        System.out.println("Student empty constructor");
    }

    public Student(String name) {
        super(name);
        System.out.println("Student constructor with name");
    }

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
        System.out.println("Student constructor with name and grade");
    }
}
