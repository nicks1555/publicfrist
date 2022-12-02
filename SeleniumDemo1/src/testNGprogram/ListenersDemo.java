package testNGprogram;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


//@Listeners(testNGprogram.ListImpl.class)  ---- adding class level listeners

// Suit level <listeners> must added in xml file as <listener class-name="packageName.className"> 

public class ListenersDemo {
	
	@Test 
	public void main1() {
		Assert.assertEquals(12, 12);
		System.out.println("I am in main1 method");
		
	}
	
	@Test 
	public void main2() {
		Assert.assertEquals(12, 13);
		System.out.println("I am in main2 method");
		
	}
	@Test 
	public void main3() {
		SoftAssert asserts=new SoftAssert();
		asserts.assertEquals(12, 14);
		System.out.println("I am in main3 method");
		asserts.assertAll();
		
	}
	@Test 
	public void main4() {
		System.out.println("I am in main4 method");
		Assert.assertEquals(12, 12);
		
	}

}
