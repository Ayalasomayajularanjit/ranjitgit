package flight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	public void booktckt() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\Ranjit\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='widget_row']/div[1]/div/div[2]/ul/li[2]/a")).click();
	}
}
