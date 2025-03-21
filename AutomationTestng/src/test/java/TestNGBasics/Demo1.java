package TestNGBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
public class Demo1 {
	public WebDriver driver;
  @Test
  public void Verification() {
      WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[1]/a"));
      String text = element.getText();
      System.out.println("Text: " + text);
  }
  @BeforeTest
  public void beforeTest() {
		  ChromeOptions op=new ChromeOptions();
		  driver=new ChromeDriver(op);
		  driver.manage().window().maximize();
		  driver.manage  ().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://www.naukri.com");
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
