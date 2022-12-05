//package selenuim_1;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class MouseHover {
//	public static void main(String args[]) throws InterruptedException {
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
////		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
////		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
////		Thread.sleep(2000);
////		driver.switchTo().alert().accept();
////		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
////		Thread.sleep(1000);
////		driver.switchTo().alert().dismiss();
////		
////		
////		//alert window with input box
////		
////		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
////		Alert alertwindow = driver.switchTo().alert();
////		//System.out.println("message on alert" +alertwindow.getText());
////		alertwindow.sendKeys("text vallabha");
////		Thread.sleep(4000);
////		alertwindow.accept();
////		
//		
//		driver.get("https://omayo.blogspot.com/");
//		WebElement blog = driver.findElement(By.xpath("//*[@id=\"blogsmenu\"]"));
//		WebElement selenium = driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[1]/a/span"));
//		Actions act = new Actions(driver);
//		act.moveToElement(blog).moveToElement(selenium).click().perform();
//		driver.close();
//		
//	}
//
//}
