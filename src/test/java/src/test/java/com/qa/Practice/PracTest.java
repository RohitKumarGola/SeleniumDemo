package src.test.java.com.qa.Practice;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class PracTest {

  @Test
  public void mainTest() {
    throw new RuntimeException("Test not implemented");
    
    
  }
  
  @Test
  public void test2()
  {
	System.out.println("test 2 started");  
  	Assert.assertEquals(12,13,"not equal");
  	System.out.println("test 2 completed");
  }
  @Test
  public void test3()
  {

	    SoftAssert ar = new SoftAssert();
		System.out.println("test 3 started");  
	  	ar.assertEquals(12,13,"not equal");
	  	System.out.println("test 3 completed");
  	
  }
  
  
  
  
}
