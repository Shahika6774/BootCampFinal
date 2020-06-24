package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Exam_2;
import page.Exam_3;
import util.BrowserFectory;

public class ExamTest_3 {
	
	WebDriver driver;
	@Test
	public void Validatethatalllistitemremove() {
		
		driver = BrowserFectory.init();
		
		Exam_3  exam = PageFactory.initElements(driver, Exam_3.class );

}
	
	public void closewindow() {
		driver.close();
	}

}
