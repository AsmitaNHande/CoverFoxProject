package com.coverFox.Pages;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coverFox.Utils.Utility;



public class CoverFoxMemberDetailsPage {
	//variable
	
	@FindBy(id = "Age-You") private WebElement ageDropDown;
	@FindBy(className = "next-btn") private WebElement nextbutton;
	
	//constructor
	public CoverFoxMemberDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Methods
	public void ageDropDown(String age) throws EncryptedDocumentException, IOException
	{	
		Utility.handleDropDown(ageDropDown,age+" years ");
		
	}
	public void clickOnNextButton()
	{
		nextbutton.click();
		System.out.println("click on next button");
	}

}
