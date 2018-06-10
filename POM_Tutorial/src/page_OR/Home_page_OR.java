package page_OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_page_OR {
	WebDriver driver;
	By newcustomerlink = By.linkText("New Customer");
	public Home_page_OR(WebDriver driver1){
		
		
		
		this.driver=driver1;
	}
	public boolean checkLogin(){
		return driver.findElement(newcustomerlink).isDisplayed();
	}
	

}
