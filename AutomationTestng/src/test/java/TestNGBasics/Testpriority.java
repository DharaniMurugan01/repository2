
package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Ignore;

import org.testng.annotations.Test;

public class Testpriority {
  @Test
  public void f() {
  }
  
  @Test(priority=1,dependsOnMethods="D")
  public void A() {
	  System.out.println("A");
  }
  @Test(dependsOnMethods="D")
  public void B() {
	  System.out.println("B");
  }
  @Ignore
  @Test(priority=2,enabled=false)
  public void C() {
	  System.out.println("C");
  }
  @Test
  public void D() {
	 String k="Dharu";
	 String l="dharani";
	 Assert.assertEquals(k,l);
	 System.out.println("succeed");
  }
  @Test
  public void E() {
	  System.out.println("E");
  }
}
