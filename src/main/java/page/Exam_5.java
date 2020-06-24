package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exam_5 {
	
	WebDriver driver;

	public Exam_5(WebDriver driver) throws InterruptedException {

		this.driver = driver;
		
		
		Thread.sleep(3000);
		
		
String str = "test_java";
		
		

		driver.findElement(By.name("categorydata")).sendKeys(str);
		driver.findElement(By.xpath("//input[@value='Add category']")).click();
		Thread.sleep(5000);
		
		
		
		//stra;
		//test_java.equalsignorecase(test_java)

		if (str.equalsIgnoreCase("test_java")) {
			System.out.println("The category you want to add already exists: <duplicated category name>");
					
		} 

}}
