package Pomexample;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Orange {
	   WebDriver driver;
	    @FindBy(xpath = "//input[@name='username']")
	    WebElement username;
	    @FindBy(xpath = "//input[@name='password']")
	    WebElement password;
	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement loginButton;
	    @FindBy(xpath = "//h5[text()='Login']")
	    WebElement loginText;
	    @FindBy(xpath = "//h6")
	    WebElement dashboardText;
	    @Parameters({"x"})
	    @BeforeTest
	    public void before(String a) {
	        if (a.equals("chrome")) {
	            driver = new ChromeDriver();
	        } else {
	            driver = new ChromeDriver();
	        }
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        PageFactory.initElements(driver, this);
	        System.out.println(driver.getTitle());
	    }
	    @Test
	    public void validation() {
	        String expected = loginText.getText();
	        String actual = "Login";
	        username.sendKeys("Admin");
	        password.sendKeys("admin123");
	        loginButton.click();

	        Assert.assertEquals(expected, actual);
	        System.out.println("Login verified successfully");
	    }
	    @Test
	    public void verification() {
	        String k = dashboardText.getText();
	        String l = "Dashboard";
	        Assert.assertEquals(k, l);
	        System.out.println("Moved to the Dashboard");
	    }
	    @AfterTest
	    public void afterMethod() {
	        driver.quit();
	    }
}
