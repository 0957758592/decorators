package com.danilov.decorators;

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends InputStream {
  private static final int INITIAL_CAPACITY = 5;
  private byte[] buffer = new byte[INITIAL_CAPACITY];
  private InputStream inputStream;
  private int index;
  private int count;

  public BufferedInputStream() {

  }

  public BufferedInputStream(InputStream inputStream) {
    this.inputStream = inputStream;
  }

  @Override
  public int read() throws IOException {
    if (index == count) {
      count = inputStream.read(buffer);
      index = 0;
    }

    if (count == -1) {
      return -1;
    }
    return buffer[index++];
  }

  @Override
  public void close() throws IOException {
    inputStream.close();
  }

}
