package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Exam_1;
import page.Exam_2;
import util.BrowserFectory;

public class ExamTest_2 {
	

	WebDriver driver;
	@Test
	public void Validatethatasinglelistitemcouldberemoved() {
		
		driver = BrowserFectory.init();
		
		Exam_2  exam = PageFactory.initElements(driver, Exam_2.class );

}
	
	public void closewindow() {
		driver.close();
	}
}
