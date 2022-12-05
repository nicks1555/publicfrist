package selenuim_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String args[]) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html\r\n");
//		WebElement rightclick = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
//		
//		Actions act = new Actions(driver);
//		act.contextClick(rightclick).perform();
		
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3\r\n");
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.id("field1")).clear();
		driver.findElement(By.id("field1")).sendKeys("vallabha");
		
		WebElement click = driver.findElement(By.xpath("/html/body/button"));
		Actions act = new Actions(driver);
		act.doubleClick(click).perform();
		
	}

}
