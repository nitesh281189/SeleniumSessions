package SeleniumBasics;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class TakeScreenShotConcept {

	public static void main(String[] args) {
				//Sometimes we need to take ScreenShot.This is also done during manual testing 
				System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("http://www.google.com");
				//We can take ScreenShot in Selenium by using getScreenShotAs method 
				//Take ScreenShot and Store as file format
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						
				//now copy screenshot to desried location using copyfile //method 
				//FileUtils.copyFile(src, new File("E:\\JavaSessions\\SeleniumSessions\\src\\Seleniumbasics\\google.png"));
				// used to take Screenshots 
			}
}
