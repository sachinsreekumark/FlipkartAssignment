package com.flipkart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.flipkart.qa.util.TestUtil;
import com.flipkart.qa.util.WebEventListener;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	public TestBase() throws IOException
	{
		
		try
		{
			prop= new Properties();
			 FileInputStream fileprop = new FileInputStream("D:\\eclipse workspace\\FlipkartAutomationTest\\src\\main\\java\\com\\flipkart\\qa\\config\\config.properties");
			 prop.load(fileprop);  
			
		}
		catch (FileNotFoundException e)
		{
		 e.printStackTrace();
		}
		catch (IOException e)
		{
		 e.printStackTrace();
		}
		
	}
	
	public static void initialization() throws IOException
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver88\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		//code to invoke event firing webdriver
				e_driver = new EventFiringWebDriver(driver);
				// Now create object of EventListerHandler to register it with EventFiringWebDriver
				eventListener = new WebEventListener();
				e_driver.register(eventListener);
				driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS) ;
		driver.get(prop.getProperty("flipkartURL"));
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}
	

}
