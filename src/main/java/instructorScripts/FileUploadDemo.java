package instructorScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sonal/Desktop/fileupload.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"myFile\"]")).sendKeys("C:\\Users\\sonal\\Desktop\\newfile.txt");
		
		//Runtime.getRuntime().exec("C:\\Users\\sonal\\Desktop\\AutiitScripts\\Scriptupload.exe");
		
	}

}
