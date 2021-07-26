package TestPro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Corporate  
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Setup\\chromedriver91\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://corporateloft.com/package/");//Open URL
			driver.manage().window().maximize();//Maximize windows
			Thread.sleep(3000);
			WebElement ddown = driver.findElement(By.id("business_type"));//Choose Business type
			Select set = new Select(ddown);
			set.selectByVisibleText("LLC");
			WebElement ddown1 = driver.findElement(By.xpath("//select[@id='state']"));//Select Location
			Select set1 = new Select(ddown1);
			set1.selectByValue("California");
			driver.findElement(By.xpath("//body/div[@id='page']/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).click();//Click Next button
			Thread.sleep(2000);
			driver.findElement(By.id("yesCheck")).click();//Radio button
			driver.findElement(By.id("reservation_no")).sendKeys("123456789");//Reservation number
			driver.findElement(By.xpath("//body/div[@id='page']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();//Click Next button
			Thread.sleep(2000);
			driver.findElement(By.id("exampleRadios1")).click();//Radio Button
			driver.findElement(By.id("inputFirstName")).sendKeys("Allie");//First name
			driver.findElement(By.id("inputLastName")).sendKeys("Richard");//Last Name
			driver.findElement(By.id("inputEmailAddress")).sendKeys("allierichard@gmail.com");//Email Address
			driver.findElement(By.id("inputPassword")).sendKeys("1234sdjkhfk");//Phone number
		/*	driver.findElement(By.id("inputFirstName")).sendKeys("James");//Partner First name
			driver.findElement(By.id("inputLastName")).sendKeys("Thomas");//partner last name
			driver.findElement(By.id("inputEmailAddress")).sendKeys("Trainee");//Title*/
			driver.findElement(By.xpath("//body/div[@id='page']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();//Click next button
			Thread.sleep(2000);
			driver.findElement(By.id("inputEmailAddress")).sendKeys("Home");//Address
			driver.findElement(By.id("inputFirstName")).sendKeys("michigen");//City
			driver.findElement(By.id("inputLastName")).sendKeys("Thames");//State
			driver.findElement(By.id("inputFirstName")).sendKeys("123456");
		}
}
