package com.hillel.lesson13;

import static com.hillel.lesson13.FileUtils.readFromFile;
import static com.hillel.lesson13.FileUtils.writeToFile;

import java.io.IOException;

public class CatTest {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Cat cat = new Cat("Vasiliy", 10, 3);
    writeToFile(cat, "cat.dat");

    Cat catFromFile = (Cat) readFromFile("cat.dat");
    System.out.println(catFromFile);
  }

}
