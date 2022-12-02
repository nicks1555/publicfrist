package facebookDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.msedge.driver","D:/BrowserDrivers/msedgedriver.exe");	
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/entry_ad");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
