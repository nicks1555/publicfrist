package testNGprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

class EnableIncludeExclude {
	WebDriver driver;
	@Test(enabled=true, priority=0, description="Staring the browser")
	public void m1() {
		System.setProperty("webdriver.msedge.driver","D:/BrowserDrivers/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/WebTable.html");
		String str=driver.getTitle();
		Assert.assertEquals(str, "Web Table");
		
	}
	
	@Test(dependsOnMethods="m1",description="Cliking on link")
	public void m2()  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Practice Site']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains("Automation Practice Site"));
		
	}
	@Test(description="Closing the browser")
	public void m3() throws InterruptedException  {
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
