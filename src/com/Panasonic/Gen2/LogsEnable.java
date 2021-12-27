package com.Panasonic.Gen2;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogsEnable {

	public static void main(String[] args) throws InterruptedException, IOException {
		Login l = new Login();
		l.LoginMethod();
		LogLevel(l.driver, l.prop);
	}

	public static void LogLevel(WebDriver driver, Properties prop) {

		// NavigatetoFactoryManagerPage
		driver.findElement(By.xpath("//a[@id='menu_idFactoryManager']")).click();
		// DynamicWait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// NavigatetoLoggingTab
		driver.findElement(By.linkText("Logging")).click();
		// DynamicWait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		switch (prop.getProperty("LogLevel")) {
		case "Info": {
			driver.findElement(By.xpath(prop.getProperty("Loglevel_xpath1"))).click();
			break;
		}
		case "Debug": {
			driver.findElement(By.xpath(prop.getProperty("Loglevel_xpath2"))).click();
			break;
		}
		case "Trace": {
			driver.findElement(By.xpath(prop.getProperty("Loglevel_xpath3"))).click();
			break;
		}

		}
	}
}
