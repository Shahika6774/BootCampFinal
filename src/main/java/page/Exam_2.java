package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam_2 {

	WebDriver driver;

	public Exam_2(WebDriver driver) throws InterruptedException {

		this.driver = driver;
	
	
		
		
		  String value= (driver.findElement(By.xpath("//form[@name='todo']/ul/li")).getText());
		  
		  driver.findElement(By.xpath("//form[@name='todo']/ul/li/input")).click();
		 
		  driver.findElement(By.xpath("//input[@value=\"Remove\"]")).click();
		  Thread.sleep(2000); String
		  value2=(driver.findElement(By.xpath("//form[@name='todo']/ul/li")).getText())
		  ; if(value2!=value) 
		  
		  { System.out.println("Checkbox got delted as expected");
		 
		  
		  
		  
		  }
		 
		

	}
}
