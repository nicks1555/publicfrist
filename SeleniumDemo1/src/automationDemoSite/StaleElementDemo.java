package automationDemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/BrowserDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.xpath("//a[normalize-space()='WebTable']"));
		link.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		try {
		link.click();}
		catch(Exception e) {
			link=driver.findElement(By.xpath("//a[normalize-space()='WebTable']"));
			link.click();
		}
		driver.close();
		
	}

}
