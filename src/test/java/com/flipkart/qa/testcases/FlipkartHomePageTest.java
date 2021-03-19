package com.flipkart.qa.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.FlipkartHomePage;
import com.flipkart.qa.pages.FlipkartLoginPage;
import com.flipkart.qa.pages.FlipkartItemDetailsPage;

import com.flipkart.qa.util.TestUtil;

public class FlipkartHomePageTest extends TestBase {

	public FlipkartHomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	FlipkartLoginPage FlipkartLoginPage;
	FlipkartHomePage FlipkartHomePage;
	FlipkartItemDetailsPage FlipkartItemDetailsPage;
	TestUtil TestUtil;
	
	

	@BeforeMethod
	  public void setup() throws IOException, InterruptedException 
	  {
		initialization();
		FlipkartLoginPage= new FlipkartLoginPage();
		TestUtil=new TestUtil();
		FlipkartHomePage=FlipkartLoginPage.login();
	  
	  }
	
	@Test
	public void flipkartHomePageTitleTest() throws IOException, InterruptedException
	{
		
		String title=FlipkartHomePage.verifyFlipkartHomePageTitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
		
			
	}
	
	@Test
	public void flipkartHomePageLogoTest() throws IOException, InterruptedException
	{
		
		
		Assert.assertTrue(FlipkartHomePage.verifyFlipkartHomePageLogo());
		
		
			
	}
	
	@Test
	public void flipkartHomePageUserDetailsTest() throws IOException, InterruptedException
	{
		
		
		Assert.assertTrue(FlipkartHomePage.verifyFlipkartHomePageUserDetails());
		
		
			
	}
	
	@Test
	public void flipkartHomePageSearchProductAndSelectTest() throws IOException, InterruptedException
	{
		
		
		FlipkartItemDetailsPage=FlipkartHomePage.searchProductAndSelect();
		
		
			
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
