package demoworkshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	void testRegi()
	{
		
        // Initialize the ChromeDriver without setting the path
        WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  driver.quit();
	}

}
