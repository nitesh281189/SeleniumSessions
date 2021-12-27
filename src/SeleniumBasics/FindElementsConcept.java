package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		//Total number of link and text value of all the links 
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// If we have to maximize the Window, it can be done the following way
		// We dont need to do it manaually 
		driver.manage().window().maximize();
		//if we want to delete all cookies and caches after opening the browser 
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		
		//get the count of total links on page and
		//text of all links 
		
		List<WebElement> ll=driver.findElements(By.tagName("a")); //All links starts with 'a' tag 
		//this method will give list of web element 
		//WebElement is a class avaliable in Selenium 
		//ll will having all the counts 
		System.out.println(ll.size());
		for (int i=0;i<ll.size();i++)
		System.out.println(ll.get(i).getText());
	}
}
