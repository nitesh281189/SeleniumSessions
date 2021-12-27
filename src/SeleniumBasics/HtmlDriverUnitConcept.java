package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class HtmlDriverUnitConcept {

	public static void main(String[] args) throws InterruptedException {

		// HeadLess Browser
		// Important for Interview or small Script
		// Execute test cases without opening the browser

		System.setProperty("webdriver.chrome.driver", "E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://ui.cogmento.com/"); // Enter the URL of the Website

		// This is with the Chrome driver
		// Before login title
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("nagrawal512@gmail.com");// Enter the User name
		driver.findElement(By.name("password")).sendKeys("Nitesh512");// Enter the password
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();// Login with the credentials
		// Hierarchy Xpath is not recommended . It needs to be changed
		Thread.sleep(2000);
		// After login title
		System.out.println(driver.getTitle());
		// Wihtout Opening the browser
		// HTML Unit driver is not avaliable from Selenium 3.x version
		// To use this we have to download HTML Unit driver jar file
		WebDriver driver1 = new HtmlUnitDriver();
		// HTMLUNIT driver is a class implementing WebDriver interface

		// It will not open the browser and perform the test
		// Testing is happening behind the scene

		// Advantage
		// Testing is happening behind the scene
		// It is vey fast . Execution is test case is fast. IT imporves performance of
		// the Script
		// No browser

		// Limitations
		// DOM is complex it will not work
		// It is not suitable for Actions class (User Actions) like drag and drop
		// ,double click
		// This is also called GHOST driver or headless browser
		// .HTML unit driver with Java
		// Phantom JS -Java Script-This is also for headless browser.
		// HTM unit driver not part of the selenium 3
		//Small Script to be tested. Couple of features to be tested again and again.
		//Santiy and smoke testing point of view. We use this generally.
		

	}

}
