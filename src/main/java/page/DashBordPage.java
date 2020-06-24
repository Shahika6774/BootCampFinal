package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBordPage {
	
	
	
		
		
		WebDriver driver;
		
		public DashBordPage(WebDriver driver) {
			
			this.driver = driver;
			
		}
		
		// 3 way you can find element but page object model you need to use this way @FindBy(how = How.ID, using = "username") WebElement USERNAME_FIELD_LOCATOR;

		
		//WebElement USERNAME_FIELD_LOCATOR = driver.findElement(By.id("username"));
		//By USERNAME_FIELD_LOCATOR = By.id("username");
		@FindBy(how = How.ID, using = "username") WebElement USERNAME_FIELD_LOCATOR;

}
