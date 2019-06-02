package demo_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_003 {
	
	 WebDriver driver;

		@BeforeClass
		public void setProerty() throws Throwable

		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications"); /* To disable the Notifications */
			driver = new ChromeDriver(ops);

		}

		@Test

		public void verify() throws Throwable
		{
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			// Actual title
			String title = driver.getTitle();
			System.out.println("Title is" + title);
			driver.close();
			
		}
}
