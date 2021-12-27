package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		
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
		

	}

}
