package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://search.yahoo.com/;_ylt=Awr9CKorUGVhlFEA4O9XNyoA?fr=mcafee");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Simplilearn");
		
		Thread.sleep(7000);
		
	List<WebElement> l1=driver.findElements(By.xpath("//ul[@role='listbox']/child::li"));
		
	Thread.sleep(3000);
	
	System.out.println("Total list of values are: "+ l1.size());
	/*
	 * for(int i=0;i<l1.size();i++) {
	 * 
	 * String text = l1.get(i).getText(); System.out.println(text);
	 * 
	 * if(text.contains("download")) { l1.get(i).click(); break; }
	 * 
	 * }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// go to googlepage
		// Enter value in the search box
		// As you enter the value: base don it the list box open
		
		// from the main element node, which doesnt change
		// we want to collect all the list of values
		// store the list of values in a Object
		// loop to go to each list of options
		// and if desired option is available in the list click on that option as desired by user

	}

}
