package assertionStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationStudy1 {
  @Test
	public void resultValidation() {
		Reporter.log("running result validation", true);
	}
  @Test
 	public void aresultValidation() {
 		Reporter.log("A running result validation", true);
 	}
  @BeforeMethod	
	public void provideAdressDetails() {
		Reporter.log("Enter Address and Pincode", true);
	}
  @AfterMethod
      public void clearHistory() 
  {
	          Reporter.log("clear History", true);
  }
  @BeforeClass
	public void provideMemberDetails() {
		Reporter.log("provide Member Details", true);
	}
  @AfterClass
	public void tearDown() {
		Reporter.log("Closing Browser", true);
	}
  @BeforeTest
  public void BeforetestRunning()
  {
	  Reporter.log("Before test Running", true);
  }
  @AfterTest
	public void AftertestRunning() {
		Reporter.log("After test Running", true);
	}
  @BeforeSuite
	public void BeforesuiteRunning() {
		Reporter.log("Before suite Running", true);
	}
  @AfterSuite
      public void AftersuiteRunning()
  {
	  Reporter.log("After suite Running", true);
}
  
}