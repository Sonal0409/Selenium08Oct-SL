package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettitleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
	String title=driver.getTitle();
	
	//System.out.println("title of the page is :" + title); // actual title
	
	//Expected title of the page should be "Wikipedia"
	
	// condition , if expected is equal to actual==> test case pass, else test case fail
	
	if(title.equalsIgnoreCase("Wikipedia"))
	{
		System.out.println("Test Case is pass");
	
	}
	else {
		System.out.println("Test Case Failed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
