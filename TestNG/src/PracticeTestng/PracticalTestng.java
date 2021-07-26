package PracticeTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class PracticalTestng 
{
	
	
	@Test
	public void TestNg()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Setup\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
	}
}
