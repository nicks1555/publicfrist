package sikuli;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.crome.driver", "D:/BrowserDrivers/chromedriver.exe/");
		ChromeOptions opt=new ChromeOptions();
		opt.setHeadless(true);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println("Size of cookies= "+cookie.size());
		
		Cookie Newcookie=new Cookie("nikhilpambole","12334567245");
		driver.manage().addCookie(Newcookie);
		cookie=driver.manage().getCookies();
		System.out.println("Size of cookies= "+cookie.size());
		
		for(Cookie Ncookie:cookie) {
			System.out.println(Ncookie.getName()+" : "+Ncookie.getValue());
		}
		
		driver.manage().deleteAllCookies();
		cookie=driver.manage().getCookies();
		System.out.println("Size of cookies= "+cookie.size());
		
		driver.close();
		System.out.println("Driver succesfully closed");
		

	}

}
