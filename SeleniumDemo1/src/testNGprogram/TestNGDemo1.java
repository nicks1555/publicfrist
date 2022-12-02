package testNGprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	//System.setProperty("webdriver.chrome.driver", "D:/BrowserDrivers/chromedriver.exe/");
	WebDriver driver;
	
	@Test
	public void method1(){
		System.out.println("Starting the chrome driver");
		
		driver=new ChromeDriver();
		Assert.assertEquals(false, false);
	}
	@Test(dependsOnMethods = "method1")
	public void method2(){
		System.out.println("Opening browser");
		driver.get("https://jqueryui.com/datepicker/");
		Assert.assertTrue(driver.getTitle().contains("Datepicker | jQuery UI"));
		
	}
	@Test(dependsOnMethods = "method2")
	public void method3(){
		System.out.println("Selecting date-box");
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement title=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String str=title.getText();
		Assert.assertEquals(str, "November 2022");
		
	}
	@Test(dependsOnMethods = "method3")
	public void method4() throws InterruptedException {
		System.out.println("Slecting date");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='24']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String date=driver.findElement(By.xpath("//input[@id='datepicker']")).getText();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("Selected Date = "+date);
		Assert.assertFalse(false);
		
		
	}
	@AfterClass
	public void method5() {
		driver.close();
	}
	
}
