package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFectory {
	
   static WebDriver driver;
   
   
   public static WebDriver init() {
	   
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAHIKA\\eclipse-newworkspace\\DataDrivenExcel\\Driver\\chromedriver.exe");
	
	   driver = new ChromeDriver();
	   
	   driver.get("http://techfios.com/test/101/index.php");
	   driver.manage().window().maximize();
	   
	   
	return driver;
	
	
	   
	   
   }
   

   public static void teardwon () {
 	  
 	  driver.close();
 	  driver.quit();
   }
}
