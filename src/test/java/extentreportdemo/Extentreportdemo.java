package extentreportdemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportdemo {

	@Test
	public void extentTest()
	{
		ExtentReports extent = new ExtentReports();
		// this means index.html file will be created inside your project only
		//ExtentSparkReporter is also a deafualt report with extent.. they also have other reports too on website
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); 
		// this give what theme will be your report.. it is going to be dark
		spark.config().setTheme(Theme.DARK);
		// this shows what will be title of the report
		spark.config().setDocumentTitle("automationReport");
		spark.config().setReportName("Extent report demo");
		extent.attachReporter(spark);
	
		// Lets create a test node in the report
		
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
