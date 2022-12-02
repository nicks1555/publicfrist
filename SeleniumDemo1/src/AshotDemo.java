import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class AshotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
	//	WebElement facebooklogo1=driver.findElement(By.xpath("//h2[@class='logo']"));
		AShot scr=new AShot();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Screenshot scrofele=scr.takeScreenshot(driver);
	//	Screenshot scrofele=scr.takeScreenshot(driver, facebooklogo1);
		BufferedImage ssimage=scrofele.getImage();
		ImageIO.write(ssimage, "png", new File("C://Users/nikit/Desktop/a/logoJ1.png"));
		
//		BufferedImage acimage=ImageIO.read(new File("C:/Users/nikit/Desktop/a/logoJ1.png"));
//		ImageDiffer idiff=new ImageDiffer();
//		ImageDiff diff=idiff.makeDiff(ssimage, acimage);
//		if(diff.hasDiff()) {
//			System.out.println("Images are different");
//		}
//		else {
//			System.out.println("Images are same");
//		}
		driver.close();
	}

}
