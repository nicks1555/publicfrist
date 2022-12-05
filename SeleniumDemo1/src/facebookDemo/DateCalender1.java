package facebookDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DateCalender1 {
	WebDriver driver;
	@Test
	public void google() {
		System.setProperty("webdriver.chrome.driver","D:/BrowserDrivers/chromedriver.exe/");
		driver=new ChromeDriver();
		driver.get("https://www.markcalculate.com/calculators/date-of-birth-calculator");
		driver.manage().window().maximize();
		WebElement birthmonth=driver.findElement(By.id("birthMonth"));
		Select op=new Select(birthmonth);
		List<WebElement> bm=op.getOptions();
		for(WebElement t:bm) {
			String st=t.getText();
			if(st.contains("Dec")) {
				t.click();
			}
		}
		WebElement birthday=driver.findElement(By.id("birthDay"));
		Select op1=new Select(birthday);
		op1.selectByValue("24");
		
		WebElement birthyear=driver.findElement(By.id("birthYear"));
		birthyear.sendKeys("1990");
		
		driver.findElement(By.className("mt-2")).click();
		
		System.out.println(driver.findElement(By.id("age_calculations_text")).getText());
		
	}
	
}