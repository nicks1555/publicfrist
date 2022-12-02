package excelDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "D:/BrowserDrivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		FileInputStream excel=new FileInputStream("C:/Users/nikit/Desktop/demodata.xlsx");  //Get Excel file
		XSSFWorkbook workbook=new XSSFWorkbook(excel);   //Get workbook in Excel
		XSSFSheet sheet=workbook.getSheet("Sheet1");	// Get sheet from workbook
		int row=sheet.getLastRowNum();   // Row count
		int col=sheet.getRow(0).getLastCellNum();   // Column count
		for(int i=1;i<=row;i++) {
			XSSFRow curRow=sheet.getRow(i);
			String username=curRow.getCell(0).toString();
			System.out.print("  "+username);
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
			String password=curRow.getCell(1).toString();
			System.out.print("  "+password);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			driver.navigate().refresh();
		//	driver.findElement(By.xpath("//input[@id='login-button']")).click();
			System.out.println(" ");
			}
			driver.close();
		}
		
}

