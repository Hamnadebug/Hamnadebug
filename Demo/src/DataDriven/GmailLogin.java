package DataDriven;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class GmailLogin 
{
	public void login() 
	{
		UserInfo userInfo= new UserInfo(null,null);
		ArrayList<UserInfo> userLoginFromCsvFile= UserInfo.getUserDataFromCsvFile();
		for (UserInfo info:userLoginFromCsvFile)
		{
			
			Utils.webDriver.manage().window().maximize();
			Utils.webDriver.findElement(By.xpath("//a[contains(text(),'Rediffmail')]")).click();
			Utils.webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
			Utils.webDriver.findElement(By.id("login1")).sendKeys(userInfo.getusername());
			Utils.webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		//	Utils.webDriver.findElement(By.id("password")).sendKeys(userInfo.setPassword(null));
			Utils.webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
			Utils.webDriver.findElement(By.name("proceed")).click();
			
		}
		
	}
}
