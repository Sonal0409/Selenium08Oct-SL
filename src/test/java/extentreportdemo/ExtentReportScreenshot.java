package extentreportdemo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportScreenshot {
	
	
	// Take a screenshot as png , jpg file--> attach to report
	// take a screenshot as png ,jpeg --> convert to base 64 and attach to report
	// take a screenshot as base 64 --> and attach to report --> recomended way

	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void setup() throws IOException
	{
		 extent = new ExtentReports();
		
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); 

		final File CONF = new File("extentconfig.xml");
		
		spark.loadXMLConfig(CONF);
		extent.attachReporter(spark);
	
	}
	
	
	@AfterSuite
	public void tearDown() throws IOException
	{
		extent.flush();
		
		// to open the report directly.. automaticallly
		Desktop.getDesktop().browse(new File("index.html").toURI());
	}
	
	@Test
	public void Testcase1() throws IOException
	{
		ExtentTest	test =extent.createTest("Login Test");
		
		WebDriver driver = new ChromeDriver();
		test.pass("Browser Open");
		driver.get("https://www.wikipedia.org/");
		test.pass("URL Open");
		
		// after writing screenshot method come here
		test.pass("url displayed",MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotTest()).build());
		test.pass("Test Finished");
	}
	
	
	public String getScreenshotTest() throws IOException 
	{
		/*
		 * File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * String path= System.getProperty("user.dir")+"/Screenshots/image.png";
		 * FileUtils.copyFile(source, new File(path)); return path;
		 */
	/*	
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		String DestFile=System.getProperty("C:\\Screenshot");
		 FileUtils.copyFile(screenshot, new File("C:\\Screenshot\\homePageScreenshot.png"));
		return DestFile;*/
		
		
File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
String DestFile=System.getProperty("C:\\\\Screenshot\\\\homePageScreenshot.png");
        
        //Copy the file to a location and use try catch block to handle exception
        
            FileUtils.copyFile(screenshot, new File(DestFile));
            return DestFile;
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
