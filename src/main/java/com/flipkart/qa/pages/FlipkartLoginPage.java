package com.flipkart.qa.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.pages.FlipkartHomePage;
import com.flipkart.qa.util.TestUtil;
import com.flipkart.qa.base.TestBase;

public class FlipkartLoginPage extends TestBase{

	public FlipkartLoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement emailID;

	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement loginButton;
	
	@FindBy(xpath="//span[@class='_36KMOx']")
	WebElement loginLogo;
	
	public FlipkartHomePage login() throws IOException, InterruptedException
	{
		Map<String, String> map = TestUtil.getFlipkartTestData();
		emailID.sendKeys(map.get("User_ID"));
	
		password.sendKeys(map.get("Password"));
		loginButton.click();
		
		return new FlipkartHomePage();
		
	}
	
	public boolean verifyLoginPageLogo() throws IOException, InterruptedException
	{
		
		return loginLogo.isDisplayed();
		
		
		
	}
	
	

}
