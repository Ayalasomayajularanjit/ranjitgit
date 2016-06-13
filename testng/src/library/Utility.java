package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility 
{
	// so that we can call using class name so creating static method
	public static String captureScreen(WebDriver driver,String screenshotname)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			//FileUtils is a class to copy
			//FileUtils.copyFile(src, new File("./Screenshots/gmail.png"));
			FileUtils.copyFile(src, new File("./Screenshots/"+screenshotname+".png"));
			System.out.println("captured screenshot");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception while taking SC"+e.getMessage());  //+e.getMessage() takes print of exception
		}
		return screenshotname; 
	}
}
