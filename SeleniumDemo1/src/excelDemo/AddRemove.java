package excelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddRemove {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:/BrowserDrivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		for(int i=1;i<=5;i++) {
		driver.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();
		}
		for(int i=1;i<=5;i++) {
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		}
		driver.close();

	}

}
