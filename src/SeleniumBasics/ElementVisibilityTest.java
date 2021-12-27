package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://register.freecrm.com/register/"); //Enter the URL of the Website 
		
		//is displayed()
		//This method is used to tell whether the HTML is displayed or not 
		//It is applicable for all the methods
		boolean f=driver.findElement(By.name("action")).isDisplayed();
		System.out.println(f);
		
		// isSelected 
		//This is mainly used for drop downs check box and radio buttons 	
		//Clicking the element and then checking the value of isSelected 
		driver.findElement(By.name("terms")).click();
		
		//isEnabled():This method is used to check whether the HTML Element is enabled or not 
		//It is possible that the Element is displayed but it is not enabled 
		//Like Submit button is displayed but is disbaled and not enabled hence it will return the false value 
		//This method also return the boolean value 
		
		boolean f1=driver.findElement(By.name("terms")).isSelected();
		System.out.println(f1); // This should be false as the element is not selected now 
	}

}
