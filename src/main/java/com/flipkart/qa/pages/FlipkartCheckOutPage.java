package com.flipkart.qa.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.util.TestUtil;

public class FlipkartCheckOutPage extends TestBase {

	public FlipkartCheckOutPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//button[text()='Deliver Here']")
	WebElement deliverHereButton;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	WebElement continueButton;
	
	
	
	@FindBy(xpath="//div[text()='Credit / Debit / ATM Card']")
	WebElement newCardRadioButtion;
	
	@FindBy(xpath="//span[text()='Not a valid card number']")
	WebElement notValidCardErrorMessage;
	
	
	
	@FindBy(xpath="//input[@name='cardNumber']")
	WebElement cardNumber;
	
	public String  checkOut() throws IOException, InterruptedException
	{
		String errorMessage="No Message";
		Map<String, String> map = TestUtil.getFlipkartTestData();
		deliverHereButton.click();
		continueButton.click();
		Thread.sleep(5000);
		newCardRadioButtion.click();
		Thread.sleep(5000);
		cardNumber.sendKeys(map.get("Card_Number"));
		if (notValidCardErrorMessage.isDisplayed())
		{
			errorMessage=notValidCardErrorMessage.getText();
		}
		
		return errorMessage;
	}
	

}
