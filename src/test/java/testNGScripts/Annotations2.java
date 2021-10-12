package testNGScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeMethod    // this method before every test method
	public void login()
	{
		System.out.println("loginto the application");
	}
	
	@Test(priority='1')
	public void Createemail()   // Testmethod
	{
		String a = null;
		a.length();
	}
	
	
	@Test(priority='2')
	public void Modifyemail()   // Testmethod
	{
		System.out.println("Modify email");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout the application");
	}
	
	

}
