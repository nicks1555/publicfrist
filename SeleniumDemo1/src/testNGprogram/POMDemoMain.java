package testNGprogram;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class POMDemoMain {
	
	@Test
	public void main1() throws IOException {
		
	System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
	WebDriver driver=new ChromeDriver();

	POMDemo pom=new POMDemo(driver);
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
	pom.usertext("");
	pom.passtext("");
	pom.logclick();
	
	AShot ss=new AShot();
	Screenshot ss1=ss.takeScreenshot(driver);
	BufferedImage img=ss1.getImage();
	ImageIO.write(img,"png",new File("C:/Users/nikit/Desktop/a/error.png"));

	
	System.out.println(driver.getTitle());
	driver.quit();
	}

}
