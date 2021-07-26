package DataDriven;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

public class RediffLogin 
{
	
	public void Login()
	{
		
		UserInfo userInfo= new UserInfo( );
		ArrayList<UserInfo> userLoginFromCsvFile= UserInfo.getUserDataFromCsvFile();
		for (UserInfo info:userLoginFromCsvFile)
		{
			Utils.webDriver.manage().window().maximize();
			Utils.webDriver.findElement(By.xpath("//a[contains(text(),'Rediffmail')]")).click();
			System.out.println("SignIN button clicked");
			Utils.webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Utils.webDriver.findElement(By.xpath("//input[@id='login1']")).sendKeys(userInfo.getusername());
			System.out.println("Username Entered");
			Utils.webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Utils.webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys(userInfo.getPassword());
			System.out.println("Password Entered");
			Utils.webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Utils.webDriver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
			Utils.webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	
			System.out.println("Login in Rediffmail");
			Utils.webDriver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/a[2]")).click();
			
		}
	}
}