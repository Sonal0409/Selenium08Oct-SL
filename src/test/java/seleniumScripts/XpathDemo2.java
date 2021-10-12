package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/index.html");
		
		//	("//div[@class='hmmtctable']/child::ul[2]/child::li[1]/child::*")).getText();
		
		String text= driver.findElement(By.xpath
				("//div[@class='hmmtctable']/descendant::a[1]")).getText();
		
		

		System.out.println(text);
	}

}
