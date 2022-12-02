package excelDemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.*;

public class DropDown {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "D:/BrowserDrivers/geckodriver.exe");
		FirefoxOptions opt=new FirefoxOptions();
		opt.setHeadless(true);
		WebDriver driver=new FirefoxDriver(opt);
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select op=new Select(dropdown);
		List <WebElement> list=op.getOptions();
		System.out.println("Size of List= "+list.size());
		for(WebElement options:list) {
			String str=options.getText();
			System.out.println(str);
		}
		op.selectByIndex(2);
		//Screen Shot
		AShot scr=new AShot();
		Screenshot scr1=scr.takeScreenshot(driver);
		BufferedImage img=scr1.getImage();
		ImageIO.write(img, "png",new File("C://Users/nikit/Desktop/a/webpagescreenshot.png"));
		
	}	
}
