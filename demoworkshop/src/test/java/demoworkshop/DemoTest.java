package demoworkshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	void testRegi()
	{
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless"); // Run in headless mode
	        options.addArguments("--no-sandbox"); // Required for running as root
	        options.addArguments("--disable-dev-shm-usage"); // Avoid memory issues
	        options.addArguments("--disable-gpu"); // Disable GPU (not needed in headless)
	        options.addArguments("--window-size=1920,1080"); // Optional: Define resolution

	        WebDriver driver = new ChromeDriver(options);
		  
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  driver.quit();
	}

}
