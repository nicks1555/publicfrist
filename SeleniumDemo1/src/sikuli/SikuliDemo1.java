package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo1 {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.chrome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(3000);
		Screen s=new Screen();
		Pattern browseimg=new Pattern("C:/Users/nikit/Desktop/browse.png");
		Thread.sleep(3000);
		s.click(browseimg);
		

	}

}
