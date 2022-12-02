package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JquiryDemo1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/BrowserDrivers/chromedriver.exe");
//		ChromeOptions opt=new ChromeOptions();
//		opt.setHeadless(true);		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		int fc=driver.findElements(By.tagName("iframe")).size();  // no. of iframes
		System.out.println("No. of iframe = "+fc);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[normalize-space()='Paris']")).click();
		Thread.sleep(2000);
		for(int i=2;i<=5;i++)
		{
			String s="//label[normalize-space()='"+i+" Star']";
			driver.findElement(By.xpath(s)).click();
		}
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor) driver; //downcasting of object driver to reference of JavascriptExecutor
		je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='1 King']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='1 Queen']")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		je.executeScript("window.scrollTo(0, 1000)");
		
		
	}

}
