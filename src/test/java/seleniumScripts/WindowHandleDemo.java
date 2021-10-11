package seleniumScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		// Return the parent window name as a String
		
		String parent_window = driver.getWindowHandle();
		
		System.out.println(parent_window);
		
		// return the unique identifier name of all the child windows
		
	Set<String> s1=	driver.getWindowHandles();
		
	Thread.sleep(5000);
		
		Iterator<String> i=s1.iterator();
		
		while(i.hasNext())
		{
			String child_window = i.next();
			
			if(!parent_window.equals(child_window))
			{
				driver.switchTo().window(child_window);
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parent_window);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
