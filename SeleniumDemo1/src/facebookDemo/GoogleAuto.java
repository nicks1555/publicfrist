package facebookDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleAuto {
	WebDriver driver;
	@Test
	public void google() {
		System.setProperty("webdriver.chrome.driver","D:/BrowserDrivers/chromedriver.exe/");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("java");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='wM6W7d']"));
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		System.out.println("Size of list= "+list.size());
		for(int i=0;i<list.size();i++) {
			WebElement listtext=list.get(i);
			String print=listtext.getText();
			System.out.println("Webelements= "+print);
			if(print.contains("java jdk download"))
			{
				System.out.println("Match is found and clicking");
				listtext.click();
			}
		}
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		System.out.println("Title of page = "+driver.getTitle());
		
		driver.close();
	}

}
