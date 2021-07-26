package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogin
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Rediffmail')]")).click();
		driver.findElement(By.id("login1")).sendKeys("mrs.hamnakhan@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("High1/low");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
	}
}
