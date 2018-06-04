package com.danilov.decorators;

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends InputStream {

  private static final int INITIAL_CAPACITY = 5;
  private byte[] buffer = new byte[INITIAL_CAPACITY];
  private InputStream inputStream;
  private int index;
  private int count;
  private int size;

  public BufferedInputStream(InputStream inputStream) {
    this(inputStream, INITIAL_CAPACITY);
  }

  public BufferedInputStream(InputStream inputStream, int size) {
    this.inputStream = inputStream;
    this.size = size;
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
  public int read(byte[] bytes) throws IOException {
      return read(buffer, 0, count);
  }


  @Override
  public int read(byte[] bytes, int off, int len) throws IOException {
    return super.read(bytes, off, len);
  }

  @Override
  public void close() throws IOException {
    inputStream.close();
  }

}
