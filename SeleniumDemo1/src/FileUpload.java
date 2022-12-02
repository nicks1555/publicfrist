import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//div[@class='btn btn-primary btn-file']")).click();

//		Screen fileupload=new Screen();
//		Pattern textbox=new Pattern("C:/Users/nikit/Desktop/a/Textbox.png");
//		Pattern openbutton=new Pattern("C:/Users/nikit/Desktop/a/b/OpenButton.png");
//		
//		Thread.sleep(3000);
//
//
//		fileupload.type(textbox,"C:/Users/nikit/Desktop/image1.png");
//		Thread.sleep(3000);
//		fileupload.click(openbutton);
//		Thread.sleep(3000);
//		driver.close();
	
	}

}
