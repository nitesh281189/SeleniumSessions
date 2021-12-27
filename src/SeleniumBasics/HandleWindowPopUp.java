package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class HandleWindowPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");
		driver.findElement(By.name("ctl00$ContentMain$popupTest")).click();
		//It will open another window pop up
		//We have to windowId fo the parent window and child window 
		//We have one method 
		//handles because there are two windows 
		Set<String> handles=driver.getWindowHandles();
		// It will give you one set object of string type 
		//In Set Object Values are stored not basis of index 
		//If two values divided in two parts and we have no index 
		//To get the values of set object we have to use iterator 
				
		Iterator<String> it=handles.iterator(); 
		//This will return one iterator object and we have assign that to it refernce variable 
		//Iterator does not point to set object but on top of set object . Just top of set object 
		//We have to shift iterator to first set object location 
		String parentwindowid=it.next(); // will shift it from above set object to first value of Set object 
		System.out.println(parentwindowid);//This is parent window Id
		String childwindowid=it.next();
		System.out.println(childwindowid);//This is child window Id 
		//Now switch 
		driver.switchTo().window(childwindowid);
		driver.getTitle(); //Child window popup 
		System.out.println(driver.getTitle());
		//Now close the popup 
		driver.close();
		//Use to close the Specific browser or the current browser 
		//Dont use driver.quit as it will close both child and parent 
		//Switch back to the parent window 
		driver.switchTo().window(parentwindowid);
		
		System.out.println(driver.getTitle());
		//parent window pop up 
		//Window Id is always unique. it is never duplicated 
		//We cannot get window id without window handles method 
		//We have three different types of pop up 
		//1. Alert pop up //Java Script Pop up //We have to use Alert Api 
		//2. File Upload popup //Browse Pop up // We have use if type=file,then use Send keys
		//3. Windows pop up //Browser Window Pop up //Advertisement pop up // Use window handler Api //get window handles method is there 
	}
}
