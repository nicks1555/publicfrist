package facebookDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessCrome {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		System.out.println("Title of page= "+driver.getTitle());
		System.out.println("URL of page= "+driver.getCurrentUrl());
		driver.close();
	}

}

//System.setProperty("webdriver.firefox.marionette", "D:/BrowserDrivers/geckodriver.exe/");
//FirefoxOptions options=new FirefoxOptions();
//options.setHeadless(true);
//WebDriver driver=new FirefoxDriver(options);