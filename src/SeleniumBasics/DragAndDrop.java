package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// If we have to maximize the Window, it can be done the following way 
		driver.manage().window().maximize();
		//if we want to delete all cookies and caches after opening the browser 
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		// for switching frames keep on incrasing the index value until you get the right frame 
		// After frame switching only action can be performed other it will not work 
		driver.switchTo().frame(2);
		//Creating Actions Classes and passing the driver 
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"trash\"]")))
		.release()
		.build()
		.perform();
		// As per W3C Standard frames are not recommended. 
		//Most of the UI developers not using frame concept now days 
		// Frames are depricated now 
		// Right Click in page source and search for frame 
	    // Important for Selenium Interview Questions 
		//Drag and Drop not common in applications 	
	}
}
