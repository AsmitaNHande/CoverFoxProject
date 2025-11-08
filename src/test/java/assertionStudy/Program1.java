package assertionStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program1 {
  @Test
  public void a() {
	  String s1="hello";
	  String s2="hello";
	  Assert.assertEquals(s1, s2,"s1 and s2 are not matching TC failed");
	  
  }
  @Test
  
  public void b() {
	  String s1="hello";
	  String s2="hello";
	  Assert.assertNotEquals(s1, s2,"s1 and s2 are matching TC failed");
	  
 
  }
  @Test 
  public void c() {
		boolean result = false;
		Assert.assertFalse(result, "TC is failed");
  }
  @Test 
  public void d() {
		String str = null;
		Assert.assertNull(str, "str is not null TC failed");
  }
  @Test 
  public void e() {
	          boolean result = true;
	          Assert.assertTrue(result, "TC is failed");
  }
  @Test 
	public void f() {
		Assert.fail("TC is failed");
	}
  
}
