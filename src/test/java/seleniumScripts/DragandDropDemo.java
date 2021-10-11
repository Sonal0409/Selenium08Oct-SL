package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		configuration();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2= driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		//a.dragAndDrop(e1, e2);
		
		
		a.clickAndHold(e1).moveToElement(e2).release().perform();
		
		
		
		
		
	}

}
