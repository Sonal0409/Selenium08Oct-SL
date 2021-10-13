package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserDemo {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
		}
		
	}
	
	@Test
	public void dragandDropTest() throws InterruptedException
	{
		driver.switchTo().frame(0);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2= driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		//a.dragAndDrop(e1, e2);
		
		
		a.clickAndHold(e1).moveToElement(e2).release().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
