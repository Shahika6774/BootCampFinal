package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Exam_7;
import page.Exam_8;
import util.BrowserFectory;

public class ExamTest_8 {
	
	
	WebDriver driver;
	@Test
	public void SetSkyWhiteeBackgroundbutton() {
		
		driver = BrowserFectory.init();
		
		Exam_8  exam = PageFactory.initElements(driver, Exam_8.class );
		
		
		driver.close();
		driver.quit();
}

	
}
