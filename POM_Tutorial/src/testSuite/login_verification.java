package testSuite;

import org.testng.annotations.Test;

import page_OR.Home_page_OR;
import page_OR.Login_page_OR;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class login_verification {
	WebDriver driver ;
	Login_page_OR obj_login;
	Home_page_OR obj_home;
	
  @Test
  public void TC01_login_verification() {
		obj_login = new Login_page_OR(driver);
		obj_login.login("mngr104943", "nEvezev");
		obj_home = new Home_page_OR(driver);
		Assert.assertTrue(obj_home.checkLogin(), "Testcase failed unsuccessful login");
		
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://demo.guru99.com/v4");
  }

  @AfterTest
  public void afterTest() {
  }

}
