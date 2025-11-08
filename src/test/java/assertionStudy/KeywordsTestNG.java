package assertionStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordsTestNG {
//  @Test(invocationCount = 5)
//  public void f() {
//	  WebDriver driver = new ChromeDriver();
//	  driver.get("https://www.google.com/");
//  }
//  @Test(priority = -1)
//  public void login()
//  {
//	  Reporter.log("login successful", true);
//  }
//  @Test(priority = 1)
//	public void signIn() {
//		Reporter.log("signIn successful", true);
//	}
//  @Test(priority = 9)
//  public void logout()
//  {
//	  Reporter.log("Logout successful", true);
//  }
//  @Test(enabled = true)
//  public void logoutTest()
//  {
//	  Reporter.log("logoutTest", true);
//  }
	
	@Test(timeOut = 2000)

	public void timeoutTest() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("timeoutTest", true);
	}
}
