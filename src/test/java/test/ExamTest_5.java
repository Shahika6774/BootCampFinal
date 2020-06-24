package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Exam_4;
import page.Exam_5;
import util.BrowserFectory;

public class ExamTest_5 {
	
	
	WebDriver driver;
	@Test
	public void validusershouldbeabletologin() {
		
		driver = BrowserFectory.init();
		
		Exam_5  exam = PageFactory.initElements(driver, Exam_5.class );

	}

}
