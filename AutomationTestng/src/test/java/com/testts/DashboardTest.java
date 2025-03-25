package com.testts;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tests.Dashboardpage;
import com.tests.Loginpage;
public class DashboardTest extends BaseTest {
	Loginpage log;
	Dashboardpage dash;
	
  @Test
  public void f() {
	 log=new Loginpage(driver);
	 log.login("Admin", "admin123");
	 dash=new Dashboardpage(driver);
	 String expec="Dashboard";
	 String actual=dash.getdashtext();
	 Assert.assertEquals(expec,actual);
	 System.out.println("Move to Dashboard successfully");
  }
}