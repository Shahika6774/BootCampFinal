package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;

import util.BrowserFectory;



public class LoginTest {
	
	WebDriver driver;
	@Test
	public void validusershouldbeabletologin() {
		
		driver = BrowserFectory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class );
	
		
		loginpage.enterusername("techfiosdemo@gmail.com");
		loginpage.enterpassword("abc123");
		loginpage.clicksinginbutton();
		
	}

}
