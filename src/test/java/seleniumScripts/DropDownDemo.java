package seleniumScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo extends TestBase{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		configuration();
		
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		
		WebElement e1= driver.findElement(By.xpath("//select[@name='coffee']"));
		
		Select dd = new Select(e1);
		
		dd.selectByIndex(2);
		
	    dd.selectByValue("regular");
	    
	    dd.selectByVisibleText("Black");
	    
	    
	   List<WebElement> li= dd.getOptions();
	   
	 System.out.println( li.size());
	    
	    
	 for(WebElement l:li)
     {
         System.out.println(l.getText());
     }
     
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
