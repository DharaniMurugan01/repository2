package TestNGBasics;
import org.testng.annotations.Test;
public class Groupexample {
  @Test(groups={"regressiontest"})
  public void f() {
	  System.out.println("Test 1");
  }
  @	Test(groups= {"regressiontest","sanitytest"})
  public void f1() {
	  System.out.println("test2");
  }
  @Test(groups= {"regressiontest","sanitytest","smoketest"})
  public void f2() {
	  System.out.println("Test 3");
  }
}