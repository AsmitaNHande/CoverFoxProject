package com.coverFox.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails {
	@FindBy(xpath = "//input[@placeholder='6 Digit Pincode']") private WebElement pincodeField;
	@FindBy(xpath = "//input[@placeholder='Your mobile number']") private WebElement MobileNumberField;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement continueButton;
public CoverFoxAddressDetails(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterpincode(String pincode) throws EncryptedDocumentException, IOException
{
	pincodeField.sendKeys(pincode);
	System.out.println("entering pincode as "+pincode);
}

public void enterMobilenumber(String mobileNo) throws EncryptedDocumentException, IOException
{
	MobileNumberField.sendKeys(mobileNo);
	System.out.println("entering mobile number as "+mobileNo);
}
public void clickOnContinueButton()
{
	continueButton.click();
	System.out.println("click on continue button");
}
}
