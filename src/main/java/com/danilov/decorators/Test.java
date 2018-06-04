package com.danilov.decorators;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

  public static void main(String[] args) throws IOException {
    int size = 200;
    InputStream inputStream = new FileInputStream("test.txt");
    InputStream bufferedInputStream = new BufferedInputStream(inputStream, size);

    byte[] bytes = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 32, 72, 87 };

    read(bufferedInputStream);
    read(bufferedInputStream, bytes);


  }

  private static void read(InputStream bufferedInputStream, byte[] bytes) throws IOException {

    int value;
    while ((value = bufferedInputStream.read(bytes)) != -1) {
      System.out.print(value + ", ");
    }
    System.out.println(bufferedInputStream.read(bytes));

  }

  private static void read(InputStream bufferedInputStream) throws IOException {

    int value;
    while ((value = bufferedInputStream.read()) != -1) {
      System.out.print((char) value);
    }
  }


}
