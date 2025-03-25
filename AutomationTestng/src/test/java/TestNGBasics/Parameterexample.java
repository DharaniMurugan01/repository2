package TestNGBasics;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameterexample {
  @Test
  public void f() {
  }
  @Test
  @Parameters({"x","y"})
  public void sub(int a,int b) {
	  int sum=a+b;
	  System.out.println(sum);
  }
  @Test
  @Parameters({"x","y"})
  public void mul(int a,int b) {
	  int multi=a*b;
	  System.out.println(multi);
  }
}