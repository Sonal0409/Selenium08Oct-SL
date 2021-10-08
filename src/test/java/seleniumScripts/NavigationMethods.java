package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		String title = driver.getTitle();
		System.out.println("the title of the page is:" + title);
		
		driver.navigate().to("https://docs.ansible.com/ansible/2.8/modules/list_of_all_modules.html");
		
		Thread.sleep(2000);
		
		String title1 = driver.getTitle();
		System.out.println("the title of the  navigated page is:" + title1);
		
		driver.navigate().back();
		
		String title2 = driver.getTitle();
		System.out.println("the title of the page navigated back is: " + title2);
	
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		String title3 = driver.getTitle();
		System.out.println("the title of the page navigated forward is: " + title3);
		
		driver.navigate().refresh();
		
		
		
		String url =driver.getCurrentUrl();
		System.out.println("tht URL of current URL is :" + url);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
