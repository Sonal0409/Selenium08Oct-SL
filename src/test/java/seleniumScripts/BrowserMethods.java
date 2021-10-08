package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		// Maximize the browser window
		
		driver.manage().window().maximize();
		
		driver.get("https://eaadhaar.uidai.gov.in/");
		
		// Selenium will wait for atleast 15 sec for the page to load on the browser
		
		// selenium will give error, page not found, unable to load the page
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		System.out.println("page loaded successfully");
	
		
		// close the browser window
		driver.close();
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
