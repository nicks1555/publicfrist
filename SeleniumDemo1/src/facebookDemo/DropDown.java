package facebookDemo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/controlgroup/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement dropdown=driver.findElement(By.xpath("//span[@id='car-type-button']"));
		dropdown.click();
		driver.findElement(By.xpath("//div[@id='ui-id-6']")).click();
		System.out.println(dropdown.getText());
		driver.findElement(By.xpath("//label[@for='transmission-standard']")).click();
		driver.findElement(By.xpath("//label[@for='insurance']")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='horizontal-spinner']")).getText());
//		Select op=new Select(dropdown);
//		List <WebElement> oplist=op.getOptions();
//		System.out.println(oplist.size());	
//		for(WebElement option:oplist) {
//           String value=option.getText();
//           System.out.println(value);
//		}
		
		

	}

}
