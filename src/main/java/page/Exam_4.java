package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exam_4 {
	
	
	
		
		WebDriver driver;

		public Exam_4(WebDriver driver) throws InterruptedException {

			this.driver = driver;
			
			
			Thread.sleep(3000);
			
			
			
			String str = "Final Exam for Automaton";
				
				//Random rnd = new Random();
				//int rendomNum = rnd.nextInt(999);

				driver.findElement(By.name("categorydata")).sendKeys(str);
				driver.findElement(By.xpath("//input[@value='Add category']")).click();
				Thread.sleep(5000);
				
				String sl = "/html/body/div[3]/a[";
				String sl2 = "]/span";
				
			int j=	driver.findElements(By.xpath("//a[@title='Remove this category']")).size();
			System.out.println(j);
				

				for (int i =2;i<=j+1; i++) {
					String name = driver.findElement(By.xpath((sl + i + sl2))).getText();
					 System.out.println(name);

					if (name.equalsIgnoreCase(str)) {

						System.out.println("enter name exists");
					}

			
			
			


               }
		}}




