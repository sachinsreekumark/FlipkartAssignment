package com.flipkart.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.FlipkartCartPage;
import com.flipkart.qa.pages.FlipkartHomePage;
import com.flipkart.qa.pages.FlipkartItemDetailsPage;
import com.flipkart.qa.pages.FlipkartLoginPage;
import com.flipkart.qa.pages.FlipkartCheckOutPage;
import com.flipkart.qa.util.TestUtil;

public class FlipkartCartPageTest extends TestBase {

	public FlipkartCartPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	FlipkartLoginPage FlipkartLoginPage;
	FlipkartHomePage FlipkartHomePage;
	FlipkartItemDetailsPage FlipkartItemDetailsPage;
	FlipkartCartPage FlipkartCartPage;
	FlipkartCheckOutPage FlipkartCheckOutPage;
	TestUtil TestUtil;
	
	
	@BeforeMethod
	  public void setup() throws IOException, InterruptedException 
	  {
		initialization();
		FlipkartLoginPage= new FlipkartLoginPage();
		TestUtil=new TestUtil();
		FlipkartHomePage=FlipkartLoginPage.login();
		Thread.sleep(5000);
		FlipkartItemDetailsPage=FlipkartHomePage.searchProductAndSelect();
		FlipkartCartPage=FlipkartItemDetailsPage.clickAddToCartButton();
		
	  
	  }
	

	@Test
	public void flipkartProceedToCheckoutTest() throws IOException, InterruptedException
	{
		
		
		FlipkartCheckOutPage=FlipkartCartPage.clickPlaceOrderButton();
		
		
			
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
