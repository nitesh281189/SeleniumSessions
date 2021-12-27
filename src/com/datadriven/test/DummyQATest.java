package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DummyQATest {


WebDriver driver;

@BeforeMethod

public void Setup()
{
	System.setProperty("webdriver.chrome.driver",
			"E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	//dynamic wait 
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/automation-practice-form"); // Enter the URL of the Website



}


@DataProvider

public void getdata()

{
	



}





@Test(dataProvider="getdata")
public void DataTest(String firstname,String lastname,String email,String gender,String mobile )
{
	
	driver.findElement(By.id("firstName")).clear();
	driver.findElement(By.id("firstName")).sendKeys(firstname);
	driver.findElement(By.id("lastName")).clear();
	driver.findElement(By.id("lastName")).sendKeys(lastname);
	driver.findElement(By.id("userEmail")).clear();
	driver.findElement(By.id("userEmail")).sendKeys(email);
	if (gender == "Male")
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	
	driver.findElement(By.id("userNumber")).clear();
	driver.findElement(By.id("userNumber")).sendKeys(mobile);
	
	
	
}


@AfterMethod

public void TearDown()

{
driver.quit();

}





}
