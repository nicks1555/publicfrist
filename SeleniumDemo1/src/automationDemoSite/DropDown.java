package automationDemoSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown { 

	@Test
	public void mainn() throws Exception {
	
	System.setProperty("webdriver.chrome.driver","D:/BrowserDrivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");	
	driver.manage().window().maximize();
	
	String xpath="//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/descendant::a[@class='ui-corner-all']";
	List<WebElement> dropdownLang=driver.findElements(By.xpath(xpath));
	
//	List<WebElement> dropdownLang=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
	ScreenRecorderUtil.startRecord("CheckingLinks");
	Thread.sleep(3000);
	System.out.println("No. of options = "+dropdownLang.size());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='msdd']")).click();
	Thread.sleep(3000);
	WebElement option=dropdownLang.get(3);
	option.click();
	Thread.sleep(3000);
	System.out.println("option= "+option.getText());
	Thread.sleep(3000);
	ScreenRecorderUtil.stopRecord();
	driver.close();
}
}