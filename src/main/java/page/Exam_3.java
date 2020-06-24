package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exam_3 {
	
	WebDriver driver;

	public Exam_3(WebDriver driver) throws InterruptedException {

		this.driver = driver;
		
		
		Thread.sleep(3000);

		
		
		 
		   driver.findElement(By.name("allbox")).click();
		 
		 List<WebElement>mycheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
	

}
	
}
