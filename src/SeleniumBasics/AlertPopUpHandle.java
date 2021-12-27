package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		//When alerts come on webpage.These are mainly java Script popup
		//PopUp are like the alert in the System.These are JavaScript Pop Ups.
		//We cannot Spy popup 
		//To handle pop up 
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		//If we have to pause the Script then we have to use Thread.Sleep
		Thread.sleep(5000); // Helps to achive the wait time of 5 seconds 
		//get the text of pop up window .We need to switch from main window to pop up window.
		Alert alert=driver.switchTo().alert(); // this will help to switch to alert pop up.The Control Comes to alert popup window 
		//alert method will give alert class object and we store in alert class reference variable 
		String S=alert.getText();  // This will return the text value of the alert pop up 
		//Validation from QA point of View 
		if (S.equals("Please enter a valid user name"))
		System.out.println("Correct Alert Meesage");
		alert.accept();  // this will click On Ok button 
		//alert.dismiss(); // To click on cancel button if present on the pop up window.
	}
}
//Alert Class
//useful from testing point of view.
//If the message is correct then test case is passed otherwise not 
