package com.myslyv4uk.triangle;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestTriangle {
  
  @Test
  public void testPascalTriangle() {
    PascaleTriangle testObj = new PascaleTriangle();
    assertTrue(testObj.pascalTriangle(10) != null);
  }

  @Test
  public void testPrintTriangle() {
    PascaleTriangle testObj = new PascaleTriangle();
    testObj.printTriangle(testObj.pascalTriangle(10), 10);
  }
  
  @Test
  public void testNewObject() {
    assertNotNull(new PascaleTriangle());
  }

}
