package DemoPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Simple Alert//
		driver.findElement(By.id("alertButton")).click();
		Alert simplealert = driver.switchTo().alert();
		Thread.sleep(3000);
		simplealert.accept();
		System.out.println("Simple alert performed");
		//Timer Alert//
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert timeralert = driver.switchTo().alert();
		timeralert.accept();
		System.out.println("Timer Alert Performed");
		//Confirm Alert//
		WebElement element = driver.findElement(By.id("confirmButton"));
		element.click();
		//((JavascriptExecutor) driver).executeScript("argument[0].click()",element);
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		System.out.println("Confirmation Alert is Performed");
		//PromptAlert//
		driver.findElement(By.id("promtButton")).click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Performing");
		promptalert.accept();
		System.out.println("Prompt Alert Performed");
		
	}
}
