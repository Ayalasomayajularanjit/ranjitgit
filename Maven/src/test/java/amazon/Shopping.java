package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shopping {
	@Test
	public void search() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\Ranjit\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ark = new ChromeDriver();
		ark.get("http://www.amazon.in/");
		ark.manage().window().maximize();
		Thread.sleep(2000);
		ark.findElement(By.xpath("//*[@id='nav-link-shopall']/span[1]")).click();
		
	}
}
