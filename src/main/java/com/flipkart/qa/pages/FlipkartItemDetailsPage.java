package com.flipkart.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class FlipkartItemDetailsPage extends TestBase {

	public FlipkartItemDetailsPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//button[text()='GO TO CART']")
	WebElement addToCartButton;

	public FlipkartCartPage  clickAddToCartButton() throws IOException, InterruptedException
	{
		
		addToCartButton.click();
		return new FlipkartCartPage(); 
		
		
	}

}
