package com.danilov.decorators;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedOutputStream extends OutputStream {
  private static final int INITIAL_CAPACITY = 5;
  private byte[] buffer = new byte[INITIAL_CAPACITY];
  private OutputStream outputStream;
  private int index;
  private int size;

  public BufferedOutputStream(OutputStream outputStream) {
    this(outputStream, INITIAL_CAPACITY);

  }

  public BufferedOutputStream(OutputStream outputStream, int size) {
    this.outputStream = outputStream;
    this.size = size;
  }

  @Override
  public void write(int i) throws IOException {

  }

  @Override
  public void write(byte[] bytes) throws IOException {
    outputStream.write(bytes);
  }

  @Override
  public void write(byte[] bytes, int i, int i1) throws IOException {
    outputStream.write(bytes, i, i1);
  }


  @Override
  public void flush() throws IOException {
    outputStream.flush();
  }

  @Override
  public void close() throws IOException {
    outputStream.close();
  }
}
