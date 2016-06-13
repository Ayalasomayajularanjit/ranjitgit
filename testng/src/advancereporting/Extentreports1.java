package advancereporting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Extentreports1 
{
	//extent reports and extent test are 2 classes
	ExtentReports report;
	ExtentTest test;
	
	WebDriver driver;
	
	@Test
	public void verifytitle()
	{
		report=new ExtentReports("E:\\Selenium\\Ranjit\\ExtentReports\\Report1.html");
		driver =new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		
		
		test=report.startTest("verifytitle");//start the test before adding logs to it
		test.log(LogStatus.INFO, "Browser is up and running ");
		
		String title= driver.getTitle();
		Assert.assertTrue(title.contains("Google"), "title doesnot match");
		//System.out.println("Title matches");
		test.log(LogStatus.PASS, "Title Verified");
		
		report.endTest(test);
		report.flush();
		//directly can open the html report
		driver.get("E:\\Selenium\\Ranjit\\ExtentReports\\Report1.html");
		
	}
	
		
	
}
