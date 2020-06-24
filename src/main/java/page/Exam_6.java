package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Exam_6 {

	
	WebDriver driver;

	public Exam_6(WebDriver driver) throws InterruptedException {

		this.driver = driver;
		
		
		Thread.sleep(3000);
		
		

		Select select = new Select(driver.findElement(By.name("due_month")));
		List<WebElement> list = select.getOptions();
		for (WebElement months:list) {
			System.out.println(months.getText());
		}

				//select[@name='due_month']
}
		
		


	}

