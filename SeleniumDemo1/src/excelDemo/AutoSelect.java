package excelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutoSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		WebElement box=driver.findElement(By.xpath("//input[@id='tags']"));
		box.sendKeys("a");

		System.out.println(box.getText());
	

	}

}
