//package selenuim_1;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class MouseDrag {
//	public static void main(String args[]) {
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		WebElement seoul = driver.findElement(By.id("box5"));
//		WebElement sk = driver.findElement(By.id("box105"));
//		Actions act =new Actions(driver);
//		act.dragAndDrop(seoul, sk).perform();
//		driver.close();
//	}
//
//}
