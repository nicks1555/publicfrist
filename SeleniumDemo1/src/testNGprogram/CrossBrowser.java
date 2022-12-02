package testNGprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void browser1(String browserName){
		if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","D:/BrowserDrivers/geckodriver.exe" );
		driver=new FirefoxDriver();}
		
		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:/BrowserDrivers/chromedriver.exe" );
			driver=new ChromeDriver();}
		
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.msedge.driver","D:/BrowserDrivers/msedgedriver.exe" );
			driver=new EdgeDriver();}
		
		driver.get("https://jqueryui.com/datepicker/");
		System.out.println(driver.getTitle());
		
	}
	@Test(dependsOnMethods = "browser1")
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
