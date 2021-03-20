package com.hillel.lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtils {

  public static void writeToFile(Object object, String fileName) throws IOException {
    FileOutputStream fileOutputStream = new FileOutputStream(fileName);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(object);
    fileOutputStream.close();
    objectOutputStream.close();
  }

  public static Object readFromFile(String fileName) throws IOException, ClassNotFoundException {
    FileInputStream fileInputStream = new FileInputStream(fileName);
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Object object = objectInputStream.readObject();
    fileInputStream.close();
    objectInputStream.close();
    return object;
  }

}
