package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {

		// Webdriver will have to launched outside of the for loop
		// for loop has to start with row number 2

		// Webdriver Code
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form"); // Enter the URL of the Website

		// getting data for the excel file using the apache poi api.
		// Fetching the data from the Excel File
		Xls_Reader reader = new Xls_Reader(
				"E:\\JavaSessions\\SeleniumTestSessions\\src\\com\\Testdata\\DummyRegistrationData.xlsx");

		//Creating the column in the excel sheet 
		
		reader.addColumn("Sheet2", "Status");

		for (int i = 2; i <= reader.getRowCount("Sheet2"); i++) {
			String firstname = reader.getCellData("Sheet2", "FirstName", i);
			String lastname = reader.getCellData("Sheet2", "LastName", i);
			String email = reader.getCellData("Sheet2", "Email", i);
			String gender = reader.getCellData("Sheet2", "Gender", i);
			String mobile = reader.getCellData("Sheet2", "Mobile", i);

			// before doing send keys always clear the data.
			// Clear will prevent the concatenation of the values
			driver.findElement(By.id("firstName")).clear();
			driver.findElement(By.id("firstName")).sendKeys(firstname);
			driver.findElement(By.id("lastName")).clear();
			driver.findElement(By.id("lastName")).sendKeys(lastname);
			driver.findElement(By.id("userEmail")).clear();
			driver.findElement(By.id("userEmail")).sendKeys(email);
			if (email == "Male")
				driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
			driver.findElement(By.id("userNumber")).clear();
			driver.findElement(By.id("userNumber")).sendKeys(mobile);
			
			reader.setCellData("Sheet2","Status", i,"Pass");

		}

	}
}
//driving the test data from the excel files or the test files -Data driven approach for the selenium testing

