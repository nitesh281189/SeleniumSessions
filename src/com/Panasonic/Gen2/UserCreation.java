package com.Panasonic.Gen2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserCreation {
	public static void main(String[] args) throws InterruptedException, IOException {
		Login l = new Login();
		l.LoginMethod();
		UserCreation.UserCreationMehtod(l.driver, l.prop);
	}

	public static void UserCreationMehtod(WebDriver driver, Properties prop) {
		// Navigate to the User Creation page on P10
		driver.findElement(By.xpath("//a[@id='menu_idConfigureMenu']")).click();
		// dynamic wait of the pageload
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// dynamic wait of the web elements
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// Element for the User Addition.
		driver.findElement(By.xpath(prop.getProperty("user_addition"))).click();
		// Userdetails
		driver.findElement(By.xpath(prop.getProperty("user_name_xpath"))).sendKeys(prop.getProperty("user_name"));
		driver.findElement(By.xpath(prop.getProperty("user_password_xpath")))
				.sendKeys(prop.getProperty("user_password"));
		driver.findElement(By.xpath(prop.getProperty("user_id_xpath"))).sendKeys(prop.getProperty("user_id"));
		driver.findElement(By.xpath(prop.getProperty("user_email_xpath"))).sendKeys(prop.getProperty("user_email"));
		// Access to User base on Config file.
		switch (prop.getProperty("user_accesslevel")) {
		case "Administrators": {
			driver.findElement(By.xpath(prop.getProperty("user_accesslevel_xpath"))).click();
			break;
		}
		case "LineOperator": {
			driver.findElement(By.xpath(prop.getProperty("user_accesslevel_xpath"))).click();
			break;
		}
		case "StockOperator": {
			driver.findElement(By.xpath(prop.getProperty("user_accesslevel_xpath"))).click();
			break;
		}
		case "Supervisiors": {
			driver.findElement(By.xpath(prop.getProperty("user_accesslevel_xpath"))).click();
			break;
		}
		case "Planners": {
			driver.findElement(By.xpath(prop.getProperty("user_accesslevel_xpath"))).click();
			break;
		}
		}
		// Saving the user data for the creation.
		driver.findElement(By.id("newuser_button_save")).click();

	}
}
