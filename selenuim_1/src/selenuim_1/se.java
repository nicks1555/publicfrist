//package selenuim_1;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class se {
//	
//	
//	//@BeforeMethod
//	public static void main(String [] args) throws InterruptedException {
//		WebDriver driver;
//	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
//	driver=new ChromeDriver();
//	driver.get("http://automationpractice.com/index.php");
//	driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
//	driver.findElement(By.name("submit_search")).click();
//	driver.manage().window().maximize();
//	//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
//	driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
//	driver.findElement(By.id("send_friend_button")).click();
//	driver.findElement(By.id("friend_name")).sendKeys("vallabha");
//	driver.findElement(By.id("friend_email")).sendKeys("vallabha@gmail.com");
//	driver.findElement(By.id("sendEmail")).click();
//	//Thread.sleep(3000);
//	//driver.findElement(By.ByClassName("submit"));
//	driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/div/p[2]/input")).click();
//	//driver.switchTo().alert().accept();
//	driver.findElement(By.id("add_to_cart")).click();
//	driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
//	
//	
//	
//	//xml
//	//driver.findElement(By.xpath("//span[@id='our_price_display']")).sendKeys("T-shirts");
//	//driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
//	}
//	
//
//}
