package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// If we have to maximize the Window, it can be done the following way
		// We dont need to do it manaually 
		driver.manage().window().maximize();
		//if we want to delete all cookies and caches after opening the browser 
		driver.manage().deleteAllCookies();
		//We can open the URL on the Chrome browser.
		driver.get("https://www.spicejet.com/");
		//DynamicWait for the page load.
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//DynamicWait for the load of the Web Elements
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Actions is a class and we have created Actions Class Object as action.
		//We have to pass the driver refernce to this Object.
		
		Actions action=new Actions(driver);// Created Actions CLass Object
		//.build and.perform to use to perform the actual action i.e. movement of mouse to add ons tab on Spice Jet Website 
		// Always we have to use .build .perform 
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"))).build().perform();
		//Now once the Options are visible we can slect the options by using find elemen
		//We have to put some static wait to it. 
		Thread.sleep(3000);// It takes some time to display the options , we have to wait for some time 
							// Adding the Static time delay 
		//absolute Xpath are path and hence it should be avoided.
		driver.findElement(By.xpath("//div[contains(text(),'Student Discount')]")).click(); // Click on particular element after 
		// the mouse over operations 
		// Mouse Movement is done by the Actions Class always in Selenium.
	}
}
