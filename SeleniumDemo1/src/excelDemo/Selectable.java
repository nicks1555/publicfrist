package excelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement loc1=driver.findElement(By.xpath("//li[normalize-space()='Item 1']"));
		WebElement loc2=driver.findElement(By.xpath("//li[normalize-space()='Item 4']"));
		Actions act=new Actions(driver);
		act.moveToElement(loc1).clickAndHold().moveToElement(loc2).release().build().perform();
		
	}

}
