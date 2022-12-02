package automationDemoSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RagisterPageMain {
	
	@Test
	public void mainn() {
	
	System.setProperty("webdriver.chrome.driver","D:/BrowserDrivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");	
	
	RagisterPagePOM pom=new RagisterPagePOM(driver);
	pom.fristName("nikhil");
	pom.lastName("ambole");
	pom.addressLocal("A/P Karnal");
	pom.emailid("nikkss@gmail.com");
	pom.mobileno("9812345670");
	pom.gender();
	pom.hobby1();
	pom.hobby2();
	pom.hobby3();
	pom.langSelect();
	
	driver.close();
	
	}

}
