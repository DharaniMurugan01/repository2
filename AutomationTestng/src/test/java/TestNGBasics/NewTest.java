package TestNGBasics;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void testA() {
      System.out.println("Executing testA - Thread ID: " + Thread.currentThread().getId());
  }

  @Test
  public void testB() {
      System.out.println("Executing testB - Thread ID: " + Thread.currentThread().getId());
  }
}
