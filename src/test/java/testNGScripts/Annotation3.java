package testNGScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation3 {
	
	@BeforeClass  // this will be the first method to be executed in the class 
	//and will be execute only once in the begining
	public void openBrowser()
	{
		System.out.println("open browser");
		
		System.out.println("open URL");
	}
	@BeforeMethod   // before every test method this login method wil be executed
	public void login()
	{
		System.out.println("login into app");
	}
	@Test(priority='1')
	public void testcase1()
	{
		System.out.println("create email");
	}
	@Test(priority='2')
	public void Testcase2()
	{
		System.out.println("delete email");
	}
	
	@AfterMethod //// after every test method this logout method will be executed
	public void logout()
	{
		System.out.println("logout into app");
	}
	
	@AfterClass
	// this method will be executed after all the methods in the class are executed
	// this will be the last
	public void closebrowser()
	{
		System.out.println("close browser");
	}
	
	
	
	
	
	
	
	
	
	
	

}
