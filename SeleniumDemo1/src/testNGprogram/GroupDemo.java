package testNGprogram;

import org.testng.annotations.Test;

public class GroupDemo {
	
	@Test(groups={"G1"})
	void m1() {
		System.out.println("Group 1 method 1");		
	}
	@Test(groups={"G2"})
	void m2() {
		System.out.println("Group 2 method 1");		
	}
	@Test(groups={"G3"})
	void m3() {
		System.out.println("Group 3 method 1");		
	}
	@Test(groups={"G1"})
	void m4() {
		System.out.println("Group 1 method 2");		
	}
	@Test(groups={"G2"})
	void m5() {
		System.out.println("Group 2 method 2");		
	}
	@Test(groups={"G3"})
	void m6() {
		System.out.println("Groupv3 method 2");		
	}
	@Test(groups={"G1"})
	void m7() {
		System.out.println("Group 1 method 3");		
	}
	@Test(groups={"G2"})
	void m8() {
		System.out.println("Group 2 method 3");		
	}
	@Test(groups={"G3"})
	void m9() {
		System.out.println("Group 1 method 3");		
	}

}
