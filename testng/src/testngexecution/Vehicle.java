package testngexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Vehicle {
	@Test
	public void selectvehicle() {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://royalenfield.com/motorcycles/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='section4']/h2")).click();
		driver.findElement(By.xpath("//*[@id='cphContent_classicSpan']/a[6]")).click();
		

	}
}
