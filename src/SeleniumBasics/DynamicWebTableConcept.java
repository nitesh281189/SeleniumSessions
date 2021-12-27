package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableConcept {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//Method 1 of getting the data from the dynamic table 
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html"); //Enter the URL of the Website 
		
		// xpath for the table elements 
		
		////*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[1]/th
		////*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[2]/th
		
		String beforexpath="//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr[";
		String afterxpath="]/th";
		for(int i=1;i<=4;i++)
		{
			
			String name=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
			System.out.println(name);
		}
		
		
		//Method 2:
		
		//We have to use the customize Xpath 
		//We can manipulate the xpath 
		//Like preceeding Xpath and parental Xpath Concept 
		//We can use the concept of preceding-sibling , forwarding-sibling and parent tag 
		//With customize xpath we can easily manupulate the dynamic web table.
		//Dynamic Xpath is very strong concept for selenium to handle the web element.
		

	}

	
	
	
}


