package facebookDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "D:/BrowserDrivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		WebElement text=driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println(text.isDisplayed());
		System.out.println(text.isEnabled());
		text.sendKeys("abcdef");
		System.out.println(text.getText());
		driver.navigate().refresh();
		driver.getPageSource();
		driver.quit();
	}
}
