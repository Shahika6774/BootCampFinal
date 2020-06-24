package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exam_8 {
	
	
	WebDriver driver;

	public Exam_8(WebDriver driver) throws InterruptedException {

		this.driver = driver;
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Set SkyBlue Background')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Set White Background')]")).click();
		WebElement white = driver.findElement(By.xpath("//body[@style='background-color: white;']"));

		// System.out.println(Sky);
		if (white.isDisplayed()) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}}}
	


