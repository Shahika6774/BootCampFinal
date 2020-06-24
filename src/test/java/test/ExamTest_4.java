package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Exam_4;
import util.BrowserFectory;

public class ExamTest_4 {
	
	
	WebDriver driver;
	@Test
	public void validusershouldbeabletologin() {
		
		driver = BrowserFectory.init();
		
		Exam_4  exam = PageFactory.initElements(driver, Exam_4.class );

	}
		
}