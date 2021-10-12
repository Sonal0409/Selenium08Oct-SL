package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * driver.get(
		 * "https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia"
		 * );
		 * 
		 * List<WebElement> e1=
		 * driver.findElements(By.xpath("//*[@id='wpName2']|//*[@id='wpPassword2']"));
		 * 
		 * 
		 * e1.get(0).sendKeys("username"); e1.get(1).sendKeys("pasword");
		 */
	
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("sonalmittal");
	
		
	
	
	
	
	
	
	
	
	
		
	}

}
