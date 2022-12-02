package excelDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Chekbox {


	public static void main(String[] args) throws MalformedURLException {
		
		String nodeURL="http://10.10.14.232:5555/wd/hub";
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN11);
		
		System.setProperty("webdriver.chrome.driver", "D:/BrowserDrivers/chromedriver.exe");		
		WebDriver driver=new RemoteWebDriver(new URL(nodeURL),cap);
		WebElement check1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement check2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		if(check1.isSelected()==false) {
			check1.click();
		}
		if(check1.isSelected()==false) {
			check2.click();
		}
		System.out.println("Check Box 1 is selected= "+check1.isSelected());
		System.out.println("Check Box 2 is selected= "+check2.isSelected());
		driver.close();
	}

}
