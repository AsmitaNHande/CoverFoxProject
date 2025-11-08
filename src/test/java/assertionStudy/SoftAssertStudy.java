package assertionStudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	SoftAssert softAssert=new SoftAssert();
  @Test
  
  public void f() {
	  String url="https://www.facebook.com/";
	  softAssert.assertNull(url,"url is not null TC failed");
	  String s1="test";
	  String s2="test1";
	  softAssert.assertEquals(s1, s2,"s1 and s2 are not matching TC failed");
	  softAssert.assertAll();
	
	  
  }
}
