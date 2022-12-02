package excelDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
			
		System.setProperty("webdriver.gecko.driver","D:/BrowserDrivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Nikhil Pramod Ambole");
		Thread.sleep(2000);		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);	
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);	
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);	
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);	
		
		driver.close();
		

	}

}
