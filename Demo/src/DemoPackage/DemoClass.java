package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://orah.care/");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("0 element matching.")).click();
		driver.navigate().to("https://orah.care/login/agency");
		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("navreet.codebrew@gmail.com");
		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("a123456A");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Aides')]")).click();
	/*	driver.findElement(By.xpath("//body[1]/app-root[1]/app-agency-root[1]/agency-sidebar[1]/aside[1]/div[1]/div[3]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/ui-switch[1]/span[1]/small[1]")).click();
		Thread.sleep(3000);
		Alert ale = driver.switchTo().alert();	
		System.out.println(ale.getText());
		ale.dismiss();*/
		WebElement element = driver.findElement(By.xpath("//body[1]/app-root[1]/app-agency-root[1]/agency-sidebar[1]/aside[1]/div[1]/div[3]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/ui-switch[1]/span[1]/small[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	//	Alert confirmalert = driver.switchTo().alert();
		driver.findElement(By.xpath("//button[contains(text(),'CLOSE')]")).click();
		//confirmalert.accept();
		System.out.println("Confirmation Alert is Performed");
	}
}
