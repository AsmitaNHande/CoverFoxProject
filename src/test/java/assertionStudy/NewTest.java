package assertionStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  String actual="test";
	  String expected ="test";
	//  if(actual.equals(expected))
	//		  {
	//	  System.out.println("TC Passed");
	//		  }
	 // else
	//  {
	//	  System.out.println("TC failed");
	//  }
	
	//  Assert.assertEquals(actual, expected);
	  Assert.assertEquals(actual, expected,"TC FAILED");
	  Reporter.log("TC Passed",true);
	  
	  
  }
}
