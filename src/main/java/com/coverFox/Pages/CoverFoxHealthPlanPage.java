package com.coverFox.Pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoverFoxHealthPlanPage {

    private WebDriver driver;

    @FindBy(className="next-btn")
    private WebElement nextButton;

    public CoverFoxHealthPlanPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickonNextButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        // Wait until the nextButton is clickable
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        
        // Click the button
        nextButton.click();

        System.out.println("Clicked on next button");
    }
}

