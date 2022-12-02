package automationDemoSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RagisterPagePOM {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement fristname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")
	WebElement address;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@value='Male']")
	WebElement male;
	
	@FindBy(xpath="//input[@value='FeMale']")
	WebElement female;
	
	@FindBy(xpath="//input[@id='checkbox1']")
	WebElement criket;
	
	@FindBy(xpath="//input[@id='checkbox2']")
	WebElement movies;
	
	@FindBy(xpath="//input[@id='checkbox3']")
	WebElement hockey;
	
	List<WebElement> dropdownLang=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
	
	@FindBy(xpath="//a[normalize-space()='English']")
	WebElement englishLang;
	
	@FindBy(xpath="//select[@id='Skills']")
	WebElement dropdownSkills;
	
	@FindBy(xpath="//select[@id='countries']")
	WebElement dropdownCountry;
	
	@FindBy(xpath="//span[@id='select2-country-container']")
	WebElement dropdown2Country;
	
	@FindBy(xpath="//select[@id='yearbox']")
	WebElement dropdownYear;
	
	@FindBy(xpath="//select[@placeholder='Month']")
	WebElement dropdownMonth;
	
	@FindBy(xpath="//select[@id='daybox']")
	WebElement dropdownDay;
	
	@FindBy(xpath="//input[@id='firstpassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	WebElement confpassword;
	
	@FindBy(xpath="//button[@id='submitbtn']")
	WebElement submit;
	
	RagisterPagePOM(WebDriver d){
		PageFactory pf=new PageFactory();
		pf.initElements(d,this);
	}
	
	public void fristName(String fristname1) {
		fristname.sendKeys(fristname1);	
	}
	
	public void lastName(String lastName1) {
		lastname.sendKeys(lastName1);	
	}
	
	public void addressLocal(String address1) {
		address.sendKeys(address1);	
	}
	
	public void emailid(String email1) {
		email.sendKeys(email1);	
	}
	
	public void mobileno(String mobile1) {
		mobile.sendKeys(mobile1);	
	}
	
	public void gender() {
		male.click();	
	}
	
	public void hobby1() {
		criket.click();	
	}
	
	public void hobby2() {
		movies.click();	
	}
	
	public void hobby3() {
		hockey.click();	
	}
	
	public void langSelect() {
		WebElement option=dropdownLang.get(3);
		System.out.println(option.getText());
	}
	
}

