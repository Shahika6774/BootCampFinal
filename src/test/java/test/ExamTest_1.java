package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Exam_1;
import page.LoginPage;
import util.BrowserFectory;

public class ExamTest_1 {

	
	WebDriver driver;
	@Test
	public void ValidatewhenthetoggleallcheckboxisCHECKED() {
		
		driver = BrowserFectory.init();
		
		Exam_1  exam = PageFactory.initElements(driver, Exam_1.class );
}
}