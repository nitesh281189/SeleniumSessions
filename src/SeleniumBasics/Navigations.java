package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Navigations {
	public static void main(String[] args) throws InterruptedException {
				//Simulate back and forward button of the browser 
				//Browser button is not an Web Element so We cannot inspect it 
				System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("http://www.google.com");	
				//Helps to Simulate forward and back button of the browser 
				driver.navigate().to("http://www.amazon.com");
				//Helps to navigate to the URL  
				// It helps to move to some external URL.
				driver.navigate().back();//Helps to move backward to previous URL 
				Thread.sleep(3000);
				driver.navigate().forward();
				Thread.sleep(3000);
				driver.navigate().back();
				//Also called backward and forward simulation 
				//to refresh 
				driver.navigate().refresh();
				//Helps to refresh the page and Simulate the refresh button 
				//Diference is there between get method and navigate to method 
	}
}
