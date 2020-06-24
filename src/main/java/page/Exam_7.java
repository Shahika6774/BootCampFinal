package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exam_7 {
	
	
	WebDriver driver;

	public Exam_7(WebDriver driver) throws InterruptedException {

		this.driver = driver;
		
		
		Thread.sleep(3000);
		
		
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Set SkyBlue Background')]")).click();
		WebElement Sky =driver.findElement(By.xpath("//body[@style='background-color: skyblue;']"));
		
	if(Sky.isDisplayed()){
		System.out.println("Pass");
	}else
	{
		System.out.println("fail");
	}
		
	}
		

}
	




