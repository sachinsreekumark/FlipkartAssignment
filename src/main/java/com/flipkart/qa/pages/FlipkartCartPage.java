package com.flipkart.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.util.TestUtil;

public class FlipkartCartPage extends TestBase {

	public FlipkartCartPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	WebElement placeOrderButton;

	public FlipkartCheckOutPage  clickPlaceOrderButton() throws IOException, InterruptedException
	{
		TestUtil.explicitWaitUntilElementClickable(placeOrderButton);
		placeOrderButton.click();
		return new FlipkartCheckOutPage(); 
		
		
	}
	
}
