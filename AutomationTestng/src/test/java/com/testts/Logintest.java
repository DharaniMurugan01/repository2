package com.testts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tests.Loginpage;

public class Logintest extends BaseTest {
	Loginpage log;
	@Test
	public void test1() {
	log=new Loginpage(driver);
	String expected="Login";
	String actual=log.getlogtext();
	Assert.assertEquals(expected,actual);
	System.out.println("Moved to login successfully");
	}
}
