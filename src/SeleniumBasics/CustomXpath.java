package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// If we have to maximize the Window, it can be done the following way
		// We dont need to do it manaually 
		driver.manage().window().maximize();
		//if we want to delete all cookies and caches after opening the browser 
		driver.manage().deleteAllCookies();
		//Url of the WebSite 
		driver.get("https://www.spicejet.com/");
		//Xpath Should always start with (doubleslash)
		//Afer double slash comes the html tag and then the attribute in the bracket 
		//This is the custome Xpath created 
		//driver.findElement(By.xpath("//select[@class=\"wHuges station ddlfromto formSelect CustomizableDD required\"]")).sendKeys("Nitesh");
		// We can use name tag also at the place of Class if the name tag is present 
		//Function in Xpath library that has method contains (name of the method is contains)
		driver.findElement(By.xpath("//input[contains(@name,\"ctl00$mainContent$chk_friendsandfamily\")]")).click();
		//This is to be used when id tag  is avalaible but it is dynamic in nature or changing with every refresh of Webpage 
		//Suppose id is test_1234
		//it gives test_4356
		//it gives test_45678
		//Id is not constant and getting changed everytime for each referh of the website 
		//the xpath also needs to be changed. It cannot remain constant
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]") we can define the dynamic xpath
		//Starts with method
		//This is used when  attribute starts with particular fixed pattern 
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test");
		//Similarly we have ends-with method 
		//All the links are always represented by 'a' HTML tag 
		//This is for the links 
		// For links tag this custom Xpath is to be used
		driver.findElement(By.xpath("//a[contains(text(),'refunds@spicejet.com')]")).click();
		//Customize Xpath are very powerful as compared to the normal x path 
		// We should avoid the changes in the Script or framework , It has to be very generic 
		//We should avoid to used absolute xpath this may create problem in future.
		//Also customize xpath improves the  performance of the Script. We have to avoid absolute x path 
		//Sample absolute xpath //*[@id="marquee"]/div/div[2]/span[2]/a
		//Performance issues as we have number of layers before the actual element
		//Not reliable 
		//Can become obselete in future 
		//Solution is //a[contains(text(),'refunds@spicejet.com')] Customizble x path
		//fast and efficient
	}
}
