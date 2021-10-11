package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	
	// findElements( filds multiple elements with locator value given)
	

	driver.findElements(By.xpath("//input[@type='checkbox']")).get(0).click();
	
	
	driver.findElements(By.xpath("//input[@type='checkbox']")).get(1).click();
	
	driver.findElements(By.xpath("//input[@type='checkbox']")).get(2).click();
	
	
	// Radio Button
	
	driver.findElements(By.xpath("//input[@type='radio']")).get(0).click();
	
	Thread.sleep(2000);
	
	driver.findElements(By.xpath("//input[@type='radio']")).get(1).click();
	
	Thread.sleep(2000);
	
	driver.findElements(By.xpath("//input[@type='radio']")).get(2).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
