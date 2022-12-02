package excelDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitchDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nikhil");
		System.out.println("Test passed");
		driver.switchTo().parentFrame();
//		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
//		driver.switchTo().frame("Nested iFrames").switchTo().frame("iFrame Demo");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ambole");
	}

}
