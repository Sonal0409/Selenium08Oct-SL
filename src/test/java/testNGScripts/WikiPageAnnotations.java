package testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WikiPageAnnotations {
	
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
		Thread.sleep(2000);
		}
	
	@Test(priority='2')
	public void SearchPageTest()
	{
		String title1=driver.getTitle();
		System.out.println("Title of Searchpage : "+ title1);
		
		driver.findElement(By.xpath("//*[@id='p-navigation']/descendant::span[2]")).click();
		
	}
	@Test(priority='3')
	public void MainPageTest()
	{
		String title2=driver.getTitle();
		System.out.println("Title of Mainpage : "+ title2);
		driver.findElement(By.xpath("//*[@id='mw-head']/descendant::span[6]")).click();
	}
	
	@Test(priority='4')
	public void LoginTest()
	{
		String title3=driver.getTitle();
		System.out.println("Title of LoginPage : "+ title3);
		
		driver.findElement(By.xpath("//*[@name='userlogin']/descendant::input[1]")).sendKeys("sonal1");
		driver.findElement(By.xpath("//*[@name='userlogin']/descendant::input[2]")).sendKeys("sonal123");
		
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
}
