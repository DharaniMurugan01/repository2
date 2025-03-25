package TestNGBasics;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
@Listeners(TestNGBasics.ListenerPractice.class)
public class Practice {
	WebDriver driver;
  @Parameters({"x"})
  @BeforeTest
  public void before(String a) {
	  if(a.equals("chrome")) {
      driver=new ChromeDriver();
	  }
	  else {
		  driver=new EdgeDriver();
	  }
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println(driver.getTitle()); 
  }
  @Test()
  public void validation() {
	  String expected=driver.findElement(By.xpath("//h5[text()='Login']")).getText();
	  String actual="Login";
	  WebElement ele=driver.findElement(By.xpath("//input[@name='username']"));
	  ele.sendKeys("Admin");
	  WebElement ele2=driver.findElement(By.xpath("//input[@name='password']"));
	  ele2.sendKeys("admin123");
	  WebElement ele3=driver.findElement(By.xpath("//button[@type='submit']"));
	  ele3.click();
	  Assert.assertEquals(expected,actual);
	  System.out.println("login verified successfully");
  }
  @Test
  public void verification() {
	  WebElement ele=driver.findElement(By.xpath("//h6"));
	  String k=ele.getText();
	  String l="Dashboard";
	  Assert.assertEquals(k,l);
	  System.out.println("Move to the Dashboard");
  }
  @AfterTest
  public void afterMethod() {
	 driver.quit();
  }
}