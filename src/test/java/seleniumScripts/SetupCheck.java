package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// client to send a request and chromeDriver to start a session with chrome browser
		
		//Open Chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		// load a url on the current browser window
		
		driver.get("https://www.wikipedia.org/");
		
		
		
		
		
		

	}

}
