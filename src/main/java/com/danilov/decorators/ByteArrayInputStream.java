package com.danilov.decorators;

import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStream extends InputStream {

  private ByteArrayInputStream byteArrayInputStream;
  private static final int BUFFER_SIZE = 5;
  private byte[] array;
  private int size;
  private int index;

  public ByteArrayInputStream(byte[] bytes) {
    this.array = bytes;
  }


  @Override
  public int read() throws IOException {
    if (index != array.length) {
      return array[index++];
    }
    return -1;
  }

//  @Override
//  public int read(byte[] bytes) throws IOException {
//    return byteArrayInputStream.read(bytes);
//  }
//
//  @Override
//  public int read(byte[] bytes, int i, int i1) throws IOException {
//    return super.read(bytes, i, i1);
//  }
//
//  @Override
//  public void close() throws IOException {
//    super.close();
//  }
}
