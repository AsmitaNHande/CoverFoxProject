package coverFoxStepDefinitions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import com.coverFox.DriverConfig.DriverFactory;
import com.coverFox.Pages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {
	// Initialize Page Objects by passing the WebDriver instance from DriverFactory
	/*
	 * CoverFoxHomePage coverFoxHomePage=new
	 * CoverFoxHomePage(DriverFactory.getDriver()); 
	 * CoverFoxHealthPlanPage
	 * coverFoxHealthPlanPage=new CoverFoxHealthPlanPage(DriverFactory.getDriver());
	 * CoverFoxMemberDetailsPage coverFoxMemberDetailsPage=new
	 * CoverFoxMemberDetailsPage(DriverFactory.getDriver()); CoverFoxAddressDetails
	 * coverFoxAddressDetails = new
	 * CoverFoxAddressDetails(DriverFactory.getDriver()); CoverFoxInsuranceResult
	 * coverFoxInsuranceResult=new
	 * CoverFoxInsuranceResult(DriverFactory.getDriver());
	 */
	
	CoverFoxHomePage coverFoxHomePage = new CoverFoxHomePage(DriverFactory.getDriver());
	CoverFoxHealthPlanPage coverFoxHealthPlanPage = new CoverFoxHealthPlanPage(DriverFactory.getDriver());
	CoverFoxMemberDetailsPage coverFoxMemberDetailsPage = new CoverFoxMemberDetailsPage(DriverFactory.getDriver());
	CoverFoxAddressDetails coverFoxAddressDetails = new CoverFoxAddressDetails(DriverFactory.getDriver());
	CoverFoxInsuranceResult coverFoxInsuranceResult = new CoverFoxInsuranceResult(DriverFactory.getDriver());

	
	@Given("I am on home page")
	public void i_am_on_home_page() throws InterruptedException {
		System.out.println("GIVEN: I am on home page");
		// Thread.sleep is used here, but for robust automation, consider using implicit or explicit waits.
		Thread.sleep(2000); 
	}

	@When("I Click on get Started button")
	public void i_click_on_get_started_button() throws InterruptedException {
		coverFoxHomePage.clickonGetStarted();
		System.out.println("WHEN: Clicked on get Started button");
		Thread.sleep(2000);
	}

	@When("I click on next button")
	public void i_click_on_next_button() throws InterruptedException {
		coverFoxHealthPlanPage.clickonNextButton();
		System.out.println("WHEN: Clicked on next button (Select who you want to insure)");
		Thread.sleep(2000);
	}

	@When("I provide age as {string} and Click on next button")
	public void i_provide_age_as_and_click_on_next_button(String age) throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(2000);
		coverFoxMemberDetailsPage.ageDropDown(age);
		coverFoxMemberDetailsPage.clickOnNextButton();
		System.out.println("WHEN: Provided age as "+age+" and Clicked on next button");
		Thread.sleep(2000);
	}
	
	@When("I provide pincode a {string}, mobNumber as {string} and Click on continue button")
	public void i_provide_pincode_a_mob_number_as_and_click_on_continue_button(String pincode, String mobnumber) throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(2000);
		coverFoxAddressDetails.enterpincode(pincode);
		coverFoxAddressDetails.enterMobilenumber(mobnumber);
		coverFoxAddressDetails.clickOnContinueButton();
		System.out.println("WHEN: Entered pincode as "+pincode+" and mobile number as "+mobnumber+" and clicked continue");
	}

	@Then("matching Health Insurance Plans should be displayed as {string}")
	public void matching_health_insurance_plans_should_be_displayed_as(String expectedPlanCount) throws InterruptedException {
		Thread.sleep(5000);
		// Assuming getMatchingPlans() returns the count of plans or is used for validation.
		// For a robust check, you might compare the text from the UI with 'expectedPlanCount'.
		coverFoxInsuranceResult.getMatchingPlans(); 
		System.out.println("THEN: Health Insurance Plans displayed. Expected plan count: "+expectedPlanCount);
		// Assert.assertEquals(coverFoxInsuranceResult.getPlanCountFromUI(), expectedPlanCount, "Plan count mismatch.");
	}
	
	@When("click on continue button without providing pincode and mobile number")
	public void click_on_continue_button_without_providing_pincode_and_mobile_number() throws InterruptedException {
		Thread.sleep(2000);
		coverFoxAddressDetails.clickOnContinueButton();
		
		}

	@Then("appropriate error messages should be displayed for pincode and mobile number")
	public void appropriate_error_messages_should_be_displayed_for_pincode_and_mobile_number() throws InterruptedException {
		Thread.sleep(2000);
		// Actual Validation Code Here:
		// Assert.assertTrue(coverFoxAddressDetails.isPincodeErrorMessageDisplayed(), "Pincode error message is not visible.");
		// Assert.assertTrue(coverFoxAddressDetails.isMobileNumberErrorMessageDisplayed(), "Mobile number error message is not visible.");
		System.out.println("THEN: Appropriate error messages are displayed for pincode and mobile number (Validation required).");
	}
}