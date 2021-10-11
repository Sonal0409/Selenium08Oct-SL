package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXPATHDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypage.rediff.com/login/dologin");
		
		// WEBELEMENT object : store the address of the element
		// use the webelement object to perform action on it
		
		// address of the element your email
		WebElement email= driver.findElement(By.xpath("//input[@id='txtlogin']"));
		
		WebElement pwd= driver.findElement(By.xpath("//input[@id='pass_box']")) ;
		
		WebElement lgn = driver.findElement(By.xpath("//*[@id='pass_div']/input[3]"));
		
		WebElement cb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		// Actions you want on element1: email
		
		System.out.println(email.isDisplayed());
		System.out.println(email.isEnabled());
		email.clear();
		email.sendKeys("sonalseleniumTest");
		
		// Actions you want on element2: password
		
		pwd.isDisplayed();
		pwd.isEnabled();
		pwd.clear();
		pwd.sendKeys("Abc@123");
		
		// Actions you want on element3: Checkbox
		
		System.out.println("Is the checkbox available? " + cb.isDisplayed());
		System.out.println("Is the checkbox Selected? " + cb.isSelected());
		
		System.out.println("By default checkbox is selected, we are click on it");
        cb.click();
    	System.out.println("We click on checkbox so it is unselected");
    	Thread.sleep(3000);
       
    	System.out.println("Is the checkbox Selected now? " + cb.isSelected()); // notselected
        
    	System.out.println("AGANIN we are clicking on it, to select the checkbox");
        
    	cb.click();
        
        System.out.println("Is the checkbox Enabled? " + cb.isEnabled());
        System.out.println("Is the checkbox Selected? " + cb.isSelected());
        
		
        Thread.sleep(3000);
		// Actions you want on element4: Button
		
		System.out.println(lgn.isDisplayed());
		System.out.println(lgn.isEnabled());
		lgn.click();
		
		
		
		
		driver.close();
		
		
		
		
	}

}
