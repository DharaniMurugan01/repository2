package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Dashboardpage extends Basepage {
   public Dashboardpage(WebDriver driver) {
	   super(driver);
   }
   @FindBy(xpath="//h6")
   public WebElement dashtit;
   public String gettit() {
	   return dashtit.getText();
   }
}
