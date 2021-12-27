package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		// Implicit wait is a dynamic Wait .
		//Thread.sleep is a Static wait or it is hard wait 
		
		// when we have very heavy website like amazon or Fipkart 
		//and environment is slow then selenium will not wait for it 
		//Once limit is crossed Selenium will give exception 
		// We have one wait avaliale 
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// If we have to maximize the Window, it can be done the following way
		// We dont need to do it manaually 
		driver.manage().window().maximize();
		//if we want to delete all cookies and caches after opening the browser 
		driver.manage().deleteAllCookies();
		//dynamic wait 
		// Selenium will wait for 40 secs max, but if the page loaded in 2 secs 
		// Selenium will not wait and move forward 
		// This is dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//GLobal wait 
		//Implicitly wait is for the elements 
		//It is the Global wait for all the elements 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//Global wait 
		//Some ajax component may take time to load and some elements are not avaliable 
		//Some elements take time to load 
		// If the elements comes early the rest of the wait is ignored 
		
		//These steps need to be performed 
		//One time activity 
		//First maximize the window 
		//delete all the cookies 
		//put the dynamic wait
	}
}
//Difference between pageLoadTimeout and implicitlyWait
//Implicit wait is for all the elements for the webpage 
//Implicit wait comes into account when the page is fully loaded.
//It happens that even the page is fully loaded but some elements are still loading.
//We have to apply implicit wait for the elements 
//If the Element is found early, rest of this is ignored.
//Thread.Sleep is hard wait and it is not considered good.
//Dynamic wait is advantageous in Nature.

