package Capturescreenshot;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

public class Screenshot
{
	WebDriver driver;
	@Test
	public void captureScreen() throws Exception
	{
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com");
		//Utility.captureScreen(driver, "Launch");
		
		driver.findElement(By.id("Email")).sendKeys("ranjit.ayala");
		//Utility.captureScreen(driver);
		//Utility.captureScreen(driver, "Enter Username");
		
		driver.quit();	
	}
	//Screen shot for failed testcase==ITestResult is an interface which keep all info about testcase which we executed.
	@AfterMethod
	public void teardown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreen(driver, result.getName());
			
		}
		driver.quit();	
	}

}
