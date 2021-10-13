package waitTimes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitTimeDemo {
	@Test
	public void newPage()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bankofamerica.com/");
		
		// Implicit wait Webdriver to wait for 5 second while searching for an element, 
		//if element is not found even after 5 second, then throw element not found exception
		
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id='skip_to_signin']/descendant::input[1]")).sendKeys("sonal");
		

	// Explicit wait time in Selenium for a single element
		// Time for selenium tool to wait for element to be available
		  // condition to selenium tool to satisfy for element to be available
		// if condition is satisfied before the wait time, then comeout of wait and perform action
	WebElement e1 =driver.findElement(By.xpath("//*[@id3453454='skip_to_signin']/descendant::input[2]"));
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	wait.until(ExpectedConditions.visibilityOf(e1));
		
	e1.sendKeys("sonal123");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
