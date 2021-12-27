package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ExplicitWaitConcepts {

	public static void main(String[] args) {
		
		
		//When we wait for partiular element or Specific Element, then it is knwon as Explicit wait 
		// Particular Element is loading after some time 
		// Selenium may give Error if wait is not provided 
		//Thread.Sleep is not correct method to put wait 
		// We cannot Create method inside main method (Important Concept in Java)
		//method is created outside main method and called in main method
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//It is for the Web page Loading 
		//Dynamic wait for the page to be fully loaded 
		//It is for the complete page to be loaded 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		// It will wait for 20 secs to check if login button is visible or not 
		//It will explicitly wait for login button 
		//Synchronization point in Selenium 
		// It is for the Specific element 
		clickon(driver,driver.findElement(By.name("login")),20);  
		//This will not give the error imediately but wait for 20 secs before throwing the exception 
	}
	public static void clickon(WebDriver driver,WebElement locator,int timeout)
	{
		//This condition is for Element to be Clickable 
		//It will wait for 20 secs before giving the StaleElementException 
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
		//Difference between Implicitly wait and Explicit wait 
		//Sync between Selenium execution Speed and Web Element loading in the browser 
		//Does not provide by default Synchronize 
		//Synchronization point in Selenium and very important.
		//Works for every click option.(Checkboxes,radio buttons)
}
