package excelDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	//	Thread.sleep(5000);
		List<WebElement> NLinks = driver.findElements(By.tagName("a"));
		int s = NLinks.size();
		int count1 = 0, count2 = 0;
		System.out.println("No. of links on page= " + s);
		for (int i = 40; i < 50; i++) {
			WebElement link1 = NLinks.get(i);
			String url = link1.getAttribute("href");
			URL urls = new URL(url);
			HttpURLConnection httpconect = (HttpURLConnection) urls.openConnection();
		//	Thread.sleep(5000);
			httpconect.connect();
			int respcode = httpconect.getResponseCode();
			if (respcode >= 400) {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("No. of broken links= "+count1);
		System.out.println("No. of unbroken links= "+count2);
		driver.close();
	}

}
