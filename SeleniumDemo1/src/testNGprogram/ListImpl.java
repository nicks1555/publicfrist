package testNGprogram;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImpl implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test started");
		
	  }

	 
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successful");
	  }

	  
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
	  }

	 
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
	  }

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	
	public void onStart(ITestContext context) {
		System.out.println("Class level start");
	  }

	  
	public void onFinish(ITestContext context) {
		System.out.println("Class level end");
	  }
	}
	
