package testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WikiPage {
	
	@Test
	
	public void wikiTest() throws InterruptedException
	{
		//testCase1******
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		
		//TestCase2********
		String title=driver.getTitle();
		System.out.println("Title of Homepgae : "+ title);
		driver.findElement(By.xpath("//*[@id='search-form']/descendant::input[3]"))
		.sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//*[@id='search-form']/descendant::button[1]")).click();
		Thread.sleep(2000);
		
		//TestCase3************
		String title1=driver.getTitle();
		System.out.println("Title of Searchpage : "+ title1);
		
		driver.findElement(By.xpath("//*[@id='p-navigation']/descendant::span[2]")).click();
		
		//TestCase4********
		
		String title2=driver.getTitle();
		System.out.println("Title of Mainpage : "+ title2);
		
		
		driver.findElement(By.xpath("//*[@id='mw-head']/descendant::span[6]")).click();
		
		// TestCase 5 ************
		
		String title3=driver.getTitle();
		System.out.println("Title of LoginPage : "+ title3);
		
		driver.findElement(By.xpath("//*[@name='userlogin']/descendant::input[1]")).sendKeys("sonal1");
		driver.findElement(By.xpath("//*[@name='userlogin']/descendant::input[2]")).sendKeys("sonal123");
		
		
		
		
		
	}

}
