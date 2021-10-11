package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertBoxDemo extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		configuration();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	Alert a = driver.switchTo().alert();	
		
	String alerttext=	a.getText();
		
	System.out.println(alerttext);
		
	a.accept();
		
		
	
	
	
	
	
		
		
		
		
		
	}

}
