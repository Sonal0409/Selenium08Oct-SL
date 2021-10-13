package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
	// TODO Auto-generated method stub
		
		//DesiredCapabilties
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options = new ChromeOptions();
		
		options.merge(cap);
		
		String huburl = "http://192.168.1.14:4545/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(huburl),options);
		
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();	
		
		
		
		
		

	}

}
