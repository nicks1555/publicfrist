package testNGprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POMDemo {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement userid;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	
	POMDemo(WebDriver d){
			this.driver=d;}
		//	PageFactory pf=new PageFactory();
		//	PageFactory.initElements(d,this);}
	
	public void usertext(String key1) {
		userid.sendKeys(key1);}
	
	public void passtext(String key2) {
		password.sendKeys(key2);}
	
	public void logclick() {
		login.click();}
	
		
}
	
	

