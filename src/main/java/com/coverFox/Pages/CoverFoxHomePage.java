package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {

		@FindBy(xpath = "//button[text()='Get Started']" )private WebElement getStarted;
		
		
		public CoverFoxHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void clickonGetStarted()
		{
			getStarted.click();
		}
		
	
}
