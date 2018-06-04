package com.danilov.decorators;

import org.junit.Test;

//import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ByteArrayInputStreamITest {

  @Test
  public void readWithBuffer() throws IOException {


    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5, 6, 7});

    assertEquals(1,byteArrayInputStream.read());
    assertEquals(2,byteArrayInputStream.read());

    byte[] bytes = new byte[3];
    assertEquals(3, bytes.length);

    byteArrayInputStream.read(bytes);
    assertEquals(6, byteArrayInputStream.read());
    assertEquals(7, byteArrayInputStream.read());
    assertEquals(-1, byteArrayInputStream.read());



  }

  @Test
  public void read() throws IOException {

    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{3, 4, 5, 6, 7});

    for (int expextedValue = 3; expextedValue <= 7; expextedValue++) {
      assertEquals(expextedValue, byteArrayInputStream.read());
    }
    assertEquals(-1, byteArrayInputStream.read());

  }

}
