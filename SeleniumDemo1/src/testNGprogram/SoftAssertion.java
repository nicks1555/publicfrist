package testNGprogram;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion  {
	
	// Soft assertion
	@Test(priority = 0, description = "Soft Assertion")
	public void main() {
		
	System.out.println("Test main starting");
	SoftAssert s=new SoftAssert();
	s.assertTrue(false);             	// validation failed
	System.out.println("Test main Ended");  // still executing this
	s.assertAll();

	}
	@Test(priority = 1)
	public void main1() {
		System.out.println("I am in main1 method");
	}
}

	



