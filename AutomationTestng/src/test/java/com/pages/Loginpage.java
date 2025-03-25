package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
public class Loginpage extends Basepage{
  public Loginpage(WebDriver driver) {
	 super(driver);
}
  @FindBy(name="username")
  public WebElement un;  
  @FindBy(xpath="//input[@name='password']")
  public WebElement pw;
  @FindBy(xpath="//h5[text()='Login']")
  public WebElement txt;
  @FindBy(xpath="//button[@type='submit']")
  public WebElement login;
  public void login(String usern,String passw) {
	  un.sendKeys(usern);
	  pw.sendKeys(passw);
	  login.click();
  }
  public String getLogintext() {
	  return txt.getText();
  }
}
