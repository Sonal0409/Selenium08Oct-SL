package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDemo extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		configuration();
		
driver.get("https://mypage.rediff.com/login/dologin");
		
		WebElement l1=driver.findElement(By.linkText("Create a Rediffmail account"));
          l1.click();
		driver.findElements(By.xpath("//input[@type='text']")).get(0).sendKeys("sonalMittal");
		driver.findElements(By.xpath("//input[@type='text']")).get(1).sendKeys("sonalsel123");
		driver.findElement(By.xpath("//*[@value='Check availability']")).click();
	driver.findElements(By.xpath("//*[@type='password']")).get(0).sendKeys("Abc@123");
	
	driver.findElements(By.xpath("//*[@type='password']")).get(1).sendKeys("Abc@123");
	//driver.findElements(By.xpath("//input[@type='text']")).get(2).sendKeys("admin@gmail.com");
	
	driver.findElement(By.xpath("//*[@type='checkbox']")).click();
	driver.findElement(By.xpath("//*[@id='mobno']")).sendKeys("3456783356");
	
	WebElement e1= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	WebElement e2 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));

	WebElement e3 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	
	Select dd1 = new Select(e1);
	
	dd1.selectByValue("12");
	
Select dd2 = new Select(e2);
	
	dd2.selectByIndex(2);
	
Select dd3 = new Select(e3);
	
	dd3.selectByIndex(15);

	
 driver.findElements(By.xpath("//*[@type='radio']")).get(1).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
