package com.flipkart.qa.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.util.TestUtil;
import com.flipkart.qa.base.TestBase;

public class FlipkartHomePage extends TestBase {

	public FlipkartHomePage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="//div[text()='Sachin']")
	WebElement userName;

	@FindBy(xpath="//img[@title='Flipkart']")
	WebElement flikartLogo;
	
	@FindBy(xpath="//input[@class='_3704LK' and @title='Search for products, brands and more']")
	WebElement searchBar;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	WebElement searchButton;
	
	
	
	public String verifyFlipkartHomePageTitle() throws IOException, InterruptedException
	{
		
		return driver.getTitle();
		
		
		
	}
	
	public boolean verifyFlipkartHomePageLogo() throws IOException, InterruptedException
	{
		
		return flikartLogo.isDisplayed();
		
		
		
	}
	

	public boolean verifyFlipkartHomePageUserDetails() throws IOException, InterruptedException
	{
		
		return userName.isDisplayed();
		
		
		
	}
	
	public FlipkartItemDetailsPage searchProductAndSelect() throws IOException, InterruptedException
	{
		Map<String, String> map = TestUtil.getFlipkartTestData();
		
		searchBar.sendKeys(map.get("Product_Name"));
		Thread.sleep(5000);
		
		searchButton.click();
		
		if (driver.findElements(By.xpath("//div[text()='"+map.get("Product_Name")+"']")).size()>0)
		{
	
			driver.findElement(By.xpath("//div[text()='"+map.get("Product_Name")+"']")).click();
		}
		
		TestUtil.switchToNewTab();
		
		return new FlipkartItemDetailsPage();
		
		
	}
	
	
	
}
