package excelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		WebElement box1=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement box2=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement box3=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement box4=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement boxm1=driver.findElement(By.xpath("//div[@id='dropBox']"));
		WebElement boxm2=driver.findElement(By.xpath("//div[@id='dropBox2']"));
		Actions act=new Actions(driver);
	
		act.clickAndHold(box1).moveToElement(boxm1).release().build().perform();
		act.dragAndDrop(box2, boxm1).build().perform();
		act.dragAndDrop(box3, boxm1).build().perform();
		act.dragAndDrop(box4, boxm2).build().perform();
		System.out.println("Test passed");
		
	

		
	}
}
