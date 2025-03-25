package com.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Loginpage;

public class Logintest extends Basetest{
	
    Loginpage log;
    @Test
    public void logintext() {
    	log=new Loginpage(driver);
    	String tit=log.getLogintext();
    	Assert.assertTrue(tit.contains("Login"));
    	System.out.println("Login page");
    }
}
