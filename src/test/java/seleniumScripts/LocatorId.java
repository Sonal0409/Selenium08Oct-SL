package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		// driver.findElement(By.locator("value")).action();
		
		//ID locator
	//	driver.findElement(By.id("searchInput")).sendKeys("Seleniumtesting");
		
		// 2. Name Locator
		
		
	// driver.findElement(By.name("search")).sendKeys("Selenium testing");
		
	//3. ClassName : cannot be used for this element as no value is available
		
	//	driver.findElement(By.className("")) ---> NA
		
 // 4. tagName Locator
		
		driver.findElements(By.tagName("input")).get(3).sendKeys("Selenium Testing");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
