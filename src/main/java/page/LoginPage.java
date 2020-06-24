package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	// 3 way you can find element but page object model you need to use this way
	// @FindBy(how = How.ID, using = "username") WebElement USERNAME_FIELD_LOCATOR;

	// WebElement USERNAME_FIELD_LOCATOR = driver.findElement(By.id("username"));
	// By USERNAME_FIELD_LOCATOR = By.id("username");
	@FindBy(how = How.ID, using = "username")

	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.NAME, using = "login")
	WebElement SIGNIN_BUTTON_LOCATOR;
	
	
	
	
	public void sumcalc(String date) {
		
		System.out.println(date);
	}
	
	


	// methedto interact with element.

	public void enterusername(String username) {

		USERNAME_FIELD_LOCATOR.sendKeys(username);
	}

	public void enterpassword(String password) {

		PASSWORD_FIELD_LOCATOR.sendKeys(password);

	}

	public void clicksinginbutton() {

		SIGNIN_BUTTON_LOCATOR.click();
	}

}