package Pomexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pompractice1 {
    WebDriver driver;

    @FindBy(xpath = "//*[@name='q']")
    private WebElement sb;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        PageFactory.initElements(driver, this); 
    }

    public void search(String txt) {
        sb.sendKeys(txt);
        sb.submit();
        System.out.println(txt);
    }

    @Test
    public void testSearch() {
        search("java");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
