package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		  driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//For handling drop down we have to create the object of select class 
		
		Select select=new Select(driver.findElement(By.id("continents")));  
		//we have to pass the element on which we need to perform the Select  action 
		select.selectByVisibleText("Europe");
		// This value will be selected 
		
		
	}

}

//To handle drop down we have to create object of an Class known as Select Class.
//It is commonly asked in Interview.Select Class.
