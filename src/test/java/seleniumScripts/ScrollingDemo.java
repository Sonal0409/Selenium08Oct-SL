package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement e1 = driver.findElements(By.xpath("//input[@type='radio']")).get(2);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);", e1);
	
		e1.click();
		
		
		
		
		
		/*
		 * js.executeScript("scroll(0,1500)");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * js.executeScript("scroll(0,-1500)");
		 */
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
