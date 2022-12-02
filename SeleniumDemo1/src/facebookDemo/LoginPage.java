package facebookDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String args[])

	{

//		System.setProperty("webdriver.gecko.driver", "D:/BrowserDrivers/geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "D:/BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		}
}
