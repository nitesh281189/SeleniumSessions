package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	// Its good to practise naming conventions

	WebDriver driver1;

	@BeforeMethod
	public void Setup() 
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.get("http://www.google.com");
	}

	@Test
	public void GoogleTitleTest() 
	{
		String Title = driver1.getTitle();
		System.out.println(Title);
	}
	
	@Test(priority=1,groups="test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=2,groups="test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=3,groups="test")
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(priority=4,groups="test")
	public void test4() {
		System.out.println("test4");
	}
//	@AfterMethod
//	public void TearDown() 
//	{
//		driver1.quit();
//	}
}
//TestCases are always independent of each other 
//Priority is used to define the order of the test cases 
//Gives the basic HTML report. It is by the name of index.html file.
//We can do grouping of the test case also.
//groups keyword is used for grouping of the test cases 

