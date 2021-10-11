package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertBox2Demo extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		configuration();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		driver.findElement(By.id("confirmBox")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Alert a = driver.switchTo().alert();
		
		// dismiss() : click on cancel button on alert and close the alert box
		
		a.dismiss();
		
		
		driver.findElement(By.id("promptBox")).click();
		
		Alert a1 = driver.switchTo().alert();
		
		a1.sendKeys("QTP");
		
		a1.accept();
		
		
		
		
		
		
		
		
		
		
	}

}
