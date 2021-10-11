package instructorScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		
		driver.manage().window().maximize();
		
		//1. Open the url on the browser
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		/*
		 * driver.findElement(By.id("alertBox")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * Alert a= driver.switchTo().alert();
		 * 
		 * System.out.println( a.getText());
		 * 
		 * Thread.sleep(2000);
		 * 
		 * a.accept();
		 */
		
		
		
		/*
		 * driver.findElement(By.id("confirmBox")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * Alert a= driver.switchTo().alert();
		 * 
		 * System.out.println( a.getText());
		 * 
		 * Thread.sleep(2000);
		 * 
		 * a.dismiss();
		 */
		 
		

		  driver.findElement(By.id("promptBox")).click();
		  
		  Thread.sleep(2000);
		  
		  Alert a= driver.switchTo().alert();
		  
		  System.out.println( a.getText());
		  
		  
		  
		  a.sendKeys("sonal");
		  
		  Thread.sleep(4000);
		  
		 a.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
