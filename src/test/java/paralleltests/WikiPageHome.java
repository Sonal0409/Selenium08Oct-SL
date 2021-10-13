package paralleltests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WikiPageHome {
	
	WebDriver driver;
	@BeforeClass
	public void setBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		
	}

	@Test(priority='1')
	public void EnterInputTest() throws InterruptedException
	{
		String title=driver.getTitle();
		System.out.println("Title of Homepgae : "+ title);
		driver.findElement(By.xpath("//*[@id='search-form']/descendant::input[3]"))
		.sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//*[@id='search-form']/descendant::button[1]")).click();
driver.close();
		}

}
