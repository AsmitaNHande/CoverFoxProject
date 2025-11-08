package assertionStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void f() {
	  boolean result =true;
	    Assert.assertTrue(result,"TC is failed");
  }
  		
}
