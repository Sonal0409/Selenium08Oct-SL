package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mypage.rediff.com/login/dologin");
		
		WebElement l1=driver.findElement(By.linkText("Create a Rediffmail account"));
		
		WebElement l2 = driver.findElement(By.partialLinkText("Create a Rediffmail"));
		
		
		System.out.println(l2.isDisplayed());
		
		System.out.println(l2.isEnabled());
		
		
		String t1=l2.getText(); // return text on the link
		
		System.out.println(t1);
		
		l2.click();
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().to("https://mypage.rediff.com/login/dologin");
		
		driver.navigate().refresh();
		
        title= driver.getTitle();
		
		System.out.println(title);
		
		// Get the text of the link available on the page
		
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	try {
	  String t2=driver.findElement(By.linkText("Create a Rediffmail account")).getText();
	System.out.println(t2);
	}
	catch(StaleElementReferenceException e)
	{
		System.out.println("handlaling exception");
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
