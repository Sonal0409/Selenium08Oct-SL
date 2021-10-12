package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeysActionDemo extends TestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		configuration();
		
		driver.get("https://www.wikipedia.org/");
		
		WebElement e1 = driver.findElement(By.id("searchInput"));
		
		Actions a = new Actions(driver);
		
		// move to a particular element
		// press shift key on the keyboard
		// send series of character in upper case: SELENIUM AUTOMATION
		//release the sift key
		// pause for 2 seconds
		//double click on the element 
		//right click // press enter key
		a.moveToElement(e1).keyDown(e1, Keys.SHIFT).sendKeys("selenium automation")
		.keyUp(e1, Keys.SHIFT).pause(2) //release the key and wait for 2 sec
		.doubleClick(e1)
		.contextClick(e1)
		.sendKeys(Keys.RETURN)
		.perform();
		
		
		

	}

}
