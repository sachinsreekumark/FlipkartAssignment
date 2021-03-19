package com.flipkart.qa.testcases;

import com.flipkart.qa.util.TestUtil;
import com.flipkart.qa.pages.FlipkartLoginPage;
import com.flipkart.qa.pages.FlipkartHomePage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;

public class FlipkartLoginPageTest extends TestBase{

	public FlipkartLoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	TestUtil TestUtil;
	FlipkartLoginPage FlipkartLoginPage;
	FlipkartHomePage FlipkartHomePage;
	

	@BeforeMethod
	  public void setup() throws IOException, InterruptedException 
	  {
		initialization();
		FlipkartLoginPage= new FlipkartLoginPage();
		TestUtil=new TestUtil();
	  
	  }
	
	@Test
	public void flipkartLoginTest() throws IOException, InterruptedException
	{
		
		FlipkartHomePage=FlipkartLoginPage.login();
		
		
			
	}
	
	@Test 
	public void loginLogoTest() throws IOException, InterruptedException
	{
		boolean check=FlipkartLoginPage.verifyLoginPageLogo();
		Assert.assertTrue(check);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
