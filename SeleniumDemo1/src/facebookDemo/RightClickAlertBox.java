package facebookDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAlertBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/BrowserDrivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		WebElement box=driver.findElement(By.xpath("//div[@id='hot-spot']"));
		// contextClick() method for right click to an element after moving the //mouse to with the moveToElement()
		Actions act=new Actions(driver);
		act.moveToElement(box).contextClick().build().perform();  //build().perform() to execute all the steps
		System.out.println(driver.switchTo().alert().getText());  // switch to alert box
		driver.switchTo().alert().accept();  // for press OK on alert box
		// driver.switchTo().alert().dismiss();  // for press cancel on alert box
		driver.close();

	}

}
