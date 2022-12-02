package excelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class collapsible {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/accordion/");
		driver.switchTo().frame(0);
		WebElement sect2=driver.findElement(By.xpath("//h3[@id='ui-id-3']"));
		sect2.click();
		System.out.println(sect2.getText());
		Thread.sleep(2000);
		WebElement sect2tx=driver.findElement(By.xpath("//p[contains(text(),'Sed non urna. Donec et ante. Phasellus eu ligula. ')]"));
		System.out.println(sect2tx.getText());
		driver.close();
		

	}

}
