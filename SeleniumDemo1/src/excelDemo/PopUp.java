package excelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PopUp {

public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:/BrowserDrivers/geckodriver.exe");
	FirefoxOptions h=new FirefoxOptions();
	h.setHeadless(true);
	WebDriver driver=new FirefoxDriver(h);
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	WebElement text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]"));
	String m=text.getText();
	if(m.equals("Congratulations! You must have the proper credentials."))
	{ System.out.println("Test Passed");}
	else
	{ System.out.println("Test failed");}
	driver.close();
}
}