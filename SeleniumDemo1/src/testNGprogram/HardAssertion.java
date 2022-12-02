package testNGprogram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	//Hard assertion
		@Test(priority = 2, description = "Hard Assertion")
		public void main2() {
		System.out.println("Test main2 starting");
		Assert.assertEquals(11, 12);
		System.out.println("Test main2 Ended");
		}
		@Test(priority = 3)
		public void main3() {
			System.out.println("I am in main3 method");
		}

}
