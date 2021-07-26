package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils 
{
			//Events
			public static final String clickEvent="Click";
			public static final String sendKeyEvent="SendKey";
			
			//Selectors
			public static final String bycssSelector="byCss";
			public static final String byXPathSelector="byXpath";
			public static final String byidSelector="byid";
			public static final String byNameSelector="byName";
			public static final String byClassnameSelector="byClassName";
			
			static WebDriver webDriver= null;
			
			public Utils() 
			{
				getWebDriver();
			}
			public WebDriver getWebDriver()
			{
				if (webDriver==null)
				{
					System.setProperty("webdriver.chrome.driver", "E:\\Selenium Setup\\chromedriver\\chromedriver.exe");
					webDriver= new ChromeDriver();
					webDriver.get("https://www.rediff.com/");
				}
				return webDriver;
			}
			public static void closeWebDriver()
			{
				if (webDriver != null)
				{
					webDriver.close();
				}
					
			}
			
}
