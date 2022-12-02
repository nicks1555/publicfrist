package excelDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='btn btn-primary btn-file']")).click();
		
		 Thread.sleep(5000);
		 Runtime.getRuntime().exec("C:/Users/nikit/Desktop/autoit1.exe");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@title='Upload selected files']")).click();
		 Thread.sleep(5000);
		 driver.close();
	}

}
