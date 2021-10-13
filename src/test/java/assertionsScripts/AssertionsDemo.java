package assertionsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
	
	WebDriver driver;
	@Test
	public void testcase1()
	{
		driver = new ChromeDriver();
		driver.get("https://filebin.net/");
		String expectedTitle= "Filebin123";
		
		String actualtitle = driver.getTitle();
		
		/*
		 * // Hard Assertion
		 * 
		 * Assert.assertEquals(actualtitle, expectedTitle, "Title didnot match");
		 * 
		 * System.out.println("Execution is continuing");
		 */
		
		// SoftAssertion
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(actualtitle, expectedTitle, " soft Assert: Title didnot match");
		
		System.out.println("Execution is continuing");
		
		String expectedtext1= "https://filebin.net/sdnm6xsqkkkq263u";
		
	String lText= driver.findElement(By.xpath("//*[@class='container-xl']/descendant::a[4]")).getText();
		
		sa.assertEquals(lText, expectedtext1, "soft assert : link text dont match");
		
		

		System.out.println("Execution is continuing");
		
		sa.assertAll();
		
		
		
	}

}
