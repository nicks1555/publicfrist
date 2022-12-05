package facebookAutoDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver fb=new FirefoxDriver();
		fb.get("https://www.facebook.com/");
		fb.manage().window().maximize();

	}

}
