package PracticeTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracTestng 
{
	public String baseUrl ="http://demo.grur99.com/test/newtours/";
	String driverpath = "E:\\Selenium Setup\\chromedriver\\chromedriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	 
	@Test
	public void verifyHomepageTitle()
	{
		String expectedTitle = "Welcome:Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void terminateBrowser()
	{
		driver.close();
	}
}
