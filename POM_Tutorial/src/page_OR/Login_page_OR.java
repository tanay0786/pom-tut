package page_OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page_OR {
	WebDriver driver;
	
	By userID =By.name("uid");
	By password =By.name("password");
	By loginbtn =By.name("btnLogin");
	
	public Login_page_OR(WebDriver driver1){
		this.driver = driver1;
		
	}
	
	public void setUserID(String user){
	driver.findElement(userID).sendKeys(user);
	}
	
	public void setPassword(String pwd){
		driver.findElement(password).sendKeys(pwd);
	}
		
		public void clickLogin(){
			driver.findElement(loginbtn).click();
		}
		public void login(String usr1,String pwd1){
			this.setUserID(usr1);
			this.setPassword(pwd1);
			this.clickLogin();
		}
		

}
