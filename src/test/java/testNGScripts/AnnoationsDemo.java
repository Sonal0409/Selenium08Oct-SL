package testNGScripts;

import org.testng.annotations.Test;

public class AnnoationsDemo {
	
	// @Test : is an testNG annotation
	// testNg annotations are written just above your method
	// to execute your  test methods you will use @Test annotations
	
	@Test
	public void login()   // testMethods
	{
		String a= null;
		
		a.length();
	}

	@Test(dependsOnMethods = {"login"})
	public void createemail()  // testMethod2
	{
		System.out.println("Compose Email");
	}
	
	@Test(dependsOnMethods = {"login","createemail"})
	public void Deleteemail()  // testMethod3
	{
		System.out.println("Delete Email");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
