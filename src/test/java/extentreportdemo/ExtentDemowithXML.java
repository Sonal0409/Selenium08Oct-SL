package extentreportdemo;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentDemowithXML {
	
	// first create an xml file in the current project
	// create extentconfig.xml
	// this is used for intial set up of the report
	
	@Test
	public void extentTest() throws IOException
	{
	ExtentReports extent = new ExtentReports();
	
	ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); 

	final File CONF = new File("extentconfig.xml");
	
	spark.loadXMLConfig(CONF);

	extent.attachReporter(spark);
	
ExtentTest	test =extent.createTest("Login Test");
	
	//events to loginto your test case
	// test steps 
	//you 2 types : pass & fail only.. 
	test.pass("Login test started successfully");
	test.pass("URL is loaded");
	test.pass("entered input");
	test.pass("login test passed");
		
		
ExtentTest	test2 =extent.createTest("HomePage Test");
	
	//events to loginto your test case
	// test steps 
	//you 2 types : pass & fail only.. 
	test2.pass("HomePage test started successfully");
	test2.info("URL is loaded");
	test2.info("entered input");
	test2.fail("home page test failed");
	
	// you can aslo assing author,category of test, device details too as in line 50
	//you can assign to all tests
ExtentTest	test3 =extent.createTest("Search Page Test")
.assignAuthor("Sonal")
.assignCategory("Regression")
.assignDevice("chrome version 94");
	
	//events to loginto your test case
	// test steps 
	//you 2 types : pass & fail only.. 
	test3.pass("Search test started successfully");
	test3.info("URL is loaded");
	test3.info("entered input");
	test3.pass("Search page test failed");
	
	
	extent.flush(); // Important Method: unless you call this method your report will not return any logs
		
		
		
	
	
	
	}

}
