package TestNGBasics;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
public class Assertion {
	public WebDriver driver;
  @Test
  public void f(){
	  String ex="Google";
	  String act=driver.getTitle();
	  Assert.assertEquals(ex,act);
  }
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions op=new ChromeOptions();
	  driver=new ChromeDriver(op);
	  driver.manage().window().maximize();
	  driver.manage  ().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.co.in/");
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
