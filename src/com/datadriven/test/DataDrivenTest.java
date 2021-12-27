package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		//getting data for the excel file using the apache poi api.
		//Fetching the data from the Excel File
		Xls_Reader reader=new Xls_Reader("E:\\JavaSessions\\SeleniumTestSessions\\src\\com\\Testdata\\DummyRegistrationData.xlsx");
		
		String firstname=reader.getCellData("Sheet2","FirstName",2);
		String lastname=reader.getCellData("Sheet2","LastName",2);
		String email=reader.getCellData("Sheet2","Email",2);
		String gender=reader.getCellData("Sheet2","Gender",2);
		String mobile=reader.getCellData("Sheet2","Mobile",2);
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(mobile);
		
		//Webdriver Code
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		driver.get("https://demoqa.com/automation-practice-form"); //Enter the URL of the Website
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		if (email=="Male")
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys(mobile);
		
	}
}
