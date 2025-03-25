package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;
import static org.hamcrest.MatcherAssert.assertThat; // Import Hamcrest assertThat
import static org.hamcrest.Matchers.is; // Import Hamcrest is() matcher

public class Orders {

  @BeforeSuite
  public void beforeSuite() {
      System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
      System.out.println("After suite");
  }

  @BeforeTest
  public void beforeTest() {
      System.out.println("Before test");
  }

  @AfterTest
  public void afterTest() {
      System.out.println("After test");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
      System.out.println("After class");
  }

  @BeforeMethod
  public void beforeMethod() {
      System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
      System.out.println("After method");
  }

  @BeforeGroups({"group1", "group2"})
  public void beforeGroups() {
      System.out.println("Before groups (group1 & group2)");
  }

  @AfterGroups({"group1", "group2"})
  public void afterGroups() {
      System.out.println("After groups (group1 & group2)");
  }

  @Test(groups = "group1")
  public void test1() {
      System.out.println("Test1 in group1");
  }

  @Test(groups = "group1")
  public void test2() {
      System.out.println("Test2 in group1");
  }

  @Test(groups = "group2")
  public void test3() {
      System.out.println("Test3 in group2");
  }

  @Test(groups = {"group1", "group2"})
  public void test4() {
      System.out.println("Test4 in both group1 & group2");
  }
  @Ignore
  @Test
  public void test5() {
	  System.out.println("ignored");
  }
  @Test(priority = 4,enabled=false)
  public void test6() {
	  System.out.println("ignored");
  }
  @Test
  @Parameters("x")
  public void test7(int a) {
      assertThat(a, is(50));
      System.out.println(a);
  }
}
