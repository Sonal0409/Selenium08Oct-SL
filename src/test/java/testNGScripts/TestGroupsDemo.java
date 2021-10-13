package testNGScripts;

import org.testng.annotations.Test;

public class TestGroupsDemo {

	// createEmail --group1
	// modifyemail -- group2
	// delete email -- group3
	
	@Test(priority='1', groups="createemail")
	public void ComposeEmail()
	{
		System.out.println("Code to write an email");
	}
	@Test(priority='2', groups="createemail")
	public void SubjectEmail()
	{
		System.out.println("Code to testSubject an email");
	}
	@Test(priority='3', groups="createemail")
	public void SendButtonEmail()
	{
		System.out.println("Code to Send an email");
	}
	@Test(priority='4', groups="modifyemail")
	public void searchEmail()
	{
		System.out.println("Code to search an email");
	}
	@Test(priority='5', groups="modifyemail")
	public void ModifyEmail()
	{
		System.out.println("Code to modify an email");
	}
	@Test(priority='6', groups="deleteemail")
	public void searchEmailAgain()
	{
		System.out.println("Code to search an email to delete");
	}
	@Test(priority='7', groups="deleteemail")
	public void trashEmail()
	{
		System.out.println("Code to Send an email to trash box");
	}
	
}
