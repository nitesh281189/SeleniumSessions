package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ndtv.com/");
		driver.findElement(By.xpath("//*[@id=\"_indiatable\"]/div/div[2]/table/thead/tr/th[1]")).click();
		// When we get element not found exception then search for frame in the webpage 
		//Beacuse of the frame presence its possible that Selenium is not able to found that element 
		// We have to switch from one frame to another and then try to perfrom  action 
		//driver.switchTo().frame // This method is used to perform the frame Switch 
		// If we have element not found exception then it can be because of 2 reasons 
		// a. xpath is wrong 
		// b. Frames is present in the Website and we have to switch frame 
	}
}
//Frame has two properties - Index and Name
//Based on Index and Name we can select frame
//Its not neccessary that Frame is present in the application
//Frame method can accpet integer and String values.

