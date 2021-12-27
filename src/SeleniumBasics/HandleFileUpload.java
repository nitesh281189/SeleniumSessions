package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {

	public static void main(String[] args) {
				//Upload a file through browse option 
				// We canot handle Window pop up or desktop pop up or part of windows pop up 
				//Selenium does not support any  OS 
				System.setProperty("webdriver.chrome.driver","E:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
				driver.findElement(By.id("photo")).sendKeys("E:\\Personal\\Photos\\Collage");
				// We have not to use click method 
				//Give the send keys and file path 
				//when we upload a file to HTML page the type attribute of the element is file	
	}
}
