package com.Panasonic.Gen2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	WebDriver driver = null;
	Properties prop = null;

	public void LoginMethod() throws IOException {
		System.out.println("Constructor is called");
		prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"E:\\JavaSessions\\SeleniumTestSessions\\src\\com\\Panasonic\\Gen2\\config.properties");
		// Loading the properties file
		prop.load(fs);

		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\Automation_FireFoxDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// maximize and delete all the browser cookies
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Launch the Url
		driver.get(prop.getProperty("url"));
		// page load time out and implicit wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// Once the page is loaded enter the credentials and login
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("user"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		// Login to the application
		driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
	}
}
	
	

	
	
	
	
	
	
	
	
	
	

	