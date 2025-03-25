package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
  WebDriver driver;
  By un=By.xpath("//input[@name='username']");
  By ps=By.xpath("//input[@name='password']");
  By txt=By.xpath("//h5[text()='Login']");
  By login=By.xpath("//button[@type='submit']");
  
  public Loginpage(WebDriver driver) {
	  this.driver=driver;
  }
  public void setUname(String strname) {
	  driver.findElement(un).sendKeys(strname);
  }
  public void setpass(String strpass) {
	    driver.findElement(ps).sendKeys(strpass);
	}
  public void clicklogin() {
	  driver.findElement(login).click();
	  System.out.println("Login clicked");
  }
  public String getlogtext() {
	  return driver.findElement(txt).getText();
  }
  public void login(String struname,String strpass) {
	  this.setUname(struname);
	  this.setpass(strpass);
	  this.clicklogin();
  }
}