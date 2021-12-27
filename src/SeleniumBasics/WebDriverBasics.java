package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//FireFox browser 
		//Gecko driver- It is class in Selenium and we have to create Object of Gecko Driver 
		//FireFoxDriver-Class in Selenium Implements Interface called as Webdriver
		//WebDriver is an interface. 
		//When we have to use firefox we have to set the value of webdriver.gecko.driver
		//System is a class, setProperty is method. We have to pass key and value to set the property of the key 
		//System.setProperty("webdriver.gecko.driver","E:\\Automation_FireFoxDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();   	//reference by parent reference variable(Firefox driver implements
													//and that interface is WebDriver)
													//dynamic polymorphism Concept is used here 
				    								//Launch the firefox browser 
		//driver.get("http://www.google.com");


		//chrome browser 
				
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Chrome Driver is Class.It is implementing WebDriver Interface 
		driver.get("http://10.131.72.69:5000");//get method is implemented in WebDriver Interface

		String title= driver.getTitle();// gets the title of the page
		System.out.println("The title of the page is "+"------------>"+title);
		//Validation point 
		if (title.equals("PanaCIM Authentication Service"))//equals is the method in the String Class.
		{
		System.out.println("Title is Correct");
		}
		else 
		{
			System.out.println("Title is not correct");
	    }
		//Complete is known as automation testing 
	    //For everybrowser we have driver class in Selenium 
		//Make Object of that class using the Webdiver interface variable 
		System.out.println("The Current URL is "+"----------->"+driver.getCurrentUrl());
		driver.quit();// to quit the browser or to close the browser after the test is done
	}
}
