package seleniumScripts;

import org.openqa.selenium.By;

public class FramesDemo extends TestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		configuration();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		
		driver.switchTo().frame("packageListFrame");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("classFrame");
		
	driver.findElement(By.linkText("org.openqa.selenium.devtools.events")).click();

	}

}
