package com.hillel.lesson13;

import static com.hillel.lesson13.FileUtils.readFromFile;
import static com.hillel.lesson13.FileUtils.writeToFile;

import java.io.IOException;

public class UserTest {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    User user = new User("Ivan", "test");
    writeToFile(user, "user.dat");

    User userFromFile = (User) readFromFile("user.dat");
    System.out.println(userFromFile);
  }

}
