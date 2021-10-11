package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// chromedriver to start session with chrome browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypage.rediff.com/login/dologin");
		
		// find the text box using ID locator and test if element is displayed or not
		
	boolean dis=driver.findElement(By.id("txtlogin")).isDisplayed(); // true
	
	System.out.println("Is the Element displayed? " + dis);
	
	
	// find the text box using ID locator and test if element is Enabled or not
	
	boolean enb= driver.findElement(By.id("txtlogin")).isEnabled();
	System.out.println("Is the Element Enabled? " + enb);
	
	// find the text box using ID locator and test clearing of data in the textfield
	
	  driver.findElement(By.id("txtlogin")).clear();
	  
	// find the text box using ID locator and test entering of data in the textfield
	  
	  driver.findElement(By.id("txtlogin")).sendKeys("sonalseleniumTest");
	  
	  
	// find the password text box using ID locator and test if element is displayed or not 
	  
	dis=  driver.findElement(By.id("pass_box")).isDisplayed();
	  
	  System.out.println(" Is password textbox Displayed or not? " + dis);
	  
	// find the password text box using ID locator and test if element is enabled or not   
	  
	enb=  driver.findElement(By.id("pass_box")).isEnabled();
	  
	  
	  System.out.println(" Is password textbox Enabled or not? " + enb);
	  
	  
	// find the password text box using ID locator and test clearing of the text field
	  
	  
	  driver.findElement(By.id("pass_box")).clear();
	  
	// find the password text box using ID locator and test entering of data in the text field  
	  
	  driver.findElement(By.id("pass_box")).sendKeys("Abc@123");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		

	}

}



















