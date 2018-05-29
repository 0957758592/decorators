package com.danilov.decorators;

import java.io.*;

public class Test {

  public static void main(String[] args) throws IOException {
    InputStream inputStream = new FileInputStream("test.txt");
    InputStream bufferedInputStream = new BufferedInputStream(inputStream);

    int value;
    while ((value = bufferedInputStream.read()) != -1) {
      System.out.print((char )value);
    }
  }
}
