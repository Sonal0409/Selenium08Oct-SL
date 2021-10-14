package propertydemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UsePropertyDemo {
	
  public static WebDriver driver;
  
  public static Properties prop;
	@Test
	
	public void method1() throws IOException {
		
		// get the location of property file
		
	FileInputStream file = null;
	
	file = new FileInputStream("C:\\Users\\sonal\\eclipse-workspace\\08OctMavenSeleniumProject\\src\\test\\java\\propertydemo\\myfile.properties");
		
	// Properties Class in Java : has methods to work with your property file
	// 2 methods load() & getProperty()
		
		
	prop = new Properties();	
		
	
	prop.load(file);
		
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if(browsername.equals("FF"))
		{
			driver = new FirefoxDriver();
		}
		
	
		
		String urlname = prop.getProperty("url");
		driver.get(urlname);
	}
	
	
	
	
	
	
	
	
	

}
