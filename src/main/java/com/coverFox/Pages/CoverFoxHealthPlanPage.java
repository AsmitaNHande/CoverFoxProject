package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPage {
	//encapsulation 
	//data member private and methods public
	//variables
	
	@FindBy(className = "next-btn") private WebElement nextButton;
	//constructor
	public CoverFoxHealthPlanPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Methods
	public void clickonNextButton()
	{
		nextButton.click();
		System.out.println("clicking on next button");
	}
	
}
