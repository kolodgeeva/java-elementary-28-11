package com.hillel.lesson6;

public class Cat {

  String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "name='" + name + '\'' +
        '}';
  }
}
