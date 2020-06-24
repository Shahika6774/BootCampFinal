package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Exam_1;
import page.Exam_7;
import util.BrowserFectory;

public class ExamTest_7 {
	
	
	WebDriver driver;
	@Test
	public void SetSkyBlueBackgroundbutton() {
		
		driver = BrowserFectory.init();
		
		Exam_7  exam = PageFactory.initElements(driver, Exam_7.class );
}
	
	
	

}
