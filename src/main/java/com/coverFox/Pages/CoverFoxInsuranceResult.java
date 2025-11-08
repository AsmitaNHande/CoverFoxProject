package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxInsuranceResult {
	
	@FindBy(xpath ="//div[contains(text(),'Health Insurance Plans')]") private WebElement results;
	
	public CoverFoxInsuranceResult(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public String getMatchingPlans()
	{
		String matchingResult = results.getText();
		String[] ar = matchingResult.split(" ");
		String finalResult = ar[0];
		return finalResult;
	}
}
