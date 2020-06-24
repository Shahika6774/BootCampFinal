package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Exam_6;
import util.BrowserFectory;

public class ExamTest_6 {
	
	
	WebDriver driver;
	@Test
	public void Validatethemonthdropdownhasallthemonths () {
		
		driver = BrowserFectory.init();
		
		Exam_6  exam = PageFactory.initElements(driver, Exam_6.class );
}

}
