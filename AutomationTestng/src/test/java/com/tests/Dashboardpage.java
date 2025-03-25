package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboardpage {
 WebDriver driver;
 By txt=By.xpath("//h6");
 public Dashboardpage(WebDriver driver){
	 this.driver=driver;
 }
 public String getdashtext() {
	  return driver.findElement(txt).getText();
 }
}
