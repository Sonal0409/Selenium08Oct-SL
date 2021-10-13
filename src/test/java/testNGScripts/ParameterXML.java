package testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterXML {
	
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

	@Parameters({"input1"}) // jmeter automation
	@Test(priority='1')
	public void EnterInputTest(String input1) throws InterruptedException
	{
		String title=driver.getTitle();
		System.out.println("Title of Homepgae : "+ title);
		driver.findElement(By.xpath("//*[@id='search-form']/descendant::input[3]"))
		.sendKeys(input1);
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
	
	@Parameters({"username","password"})
	@Test(priority='4')
	public void LoginTest(String username, String password) throws InterruptedException
	{
		String title3=driver.getTitle();
		System.out.println("Title of LoginPage : "+ title3);
		
		driver.findElement(By.xpath("//*[@name='userlogin']/descendant::input[1]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='userlogin']/descendant::input[2]")).sendKeys(password);
		
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	

}
