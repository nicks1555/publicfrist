package excelDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		String parent=driver.getWindowHandle();
		System.out.println("Parent Id = "+parent);
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		Set<String> allwindow=driver.getWindowHandles();
		int count=allwindow.size();
		System.out.println("No. of windows = "+count);
		for(String child : allwindow) {
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		System.out.println("Title of second window = "+driver.getTitle());
		driver.quit();

	}

}
