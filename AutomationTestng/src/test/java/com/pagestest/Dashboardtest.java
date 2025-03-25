package com.pagestest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Dashboardpage;
import com.pages.Loginpage;

public class Dashboardtest extends Basetest{
  @Test
  public void valid() {
	  Loginpage p=new Loginpage(driver);
	  p.login("Admin","admin123");
	  Dashboardpage d=new Dashboardpage(driver); 
	  String ex="Dashboard";
	  String ac=d.gettit();
	  Assert.assertEquals(ex,ac);
	  System.out.println("LogIn Successfully");
  }
}
