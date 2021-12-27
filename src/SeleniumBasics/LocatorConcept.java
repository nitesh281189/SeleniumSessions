package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		//Function is to be used when we use same code again and again.
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 //1. xpath---Second priority
		 //(This is used when ID attribute is not avaliable for the element)
		 //Xpath means the address of that particular element 
		 // It is not used when we have hierarchy based element, because if the element location is shifted 
		 //Xpath will not work 
		 //Xpath will start with (//) double Slash 
		  driver.get("http://10.131.72.69:5000");
		  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("root"); //By is class 
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("panasonic123");
		  driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		  
		  //This is used if we have enter the user and if user is getting registered or not.
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//i[@class='material-icons icon-dark add']")).click();
		  
		  
		  
		 //driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/section/div[6]/i[2]")).click();
		//*[@id="LinkList3"]/div/ul/li[1]/a //this is hierarchy based Xpath and not recommended.
	    // This is absolute xpath and should not be used.Should not be used under any condition. 
		// Always use relative xpath which is always helpul.
		  
		
		 
		 //2.  Id ---First Priority 
		// driver.findElement(By.id("username")).sendKeys("root");
		//driver.findElement(By.id("password")).sendKeys("panasonic123");
		//driver.findElement(By.id("submit")).click();
		  
	    //3. Name ---Third Priority 
		//driver.findElement(By.name("firstname")).sendKeys("Nitesh");
		//driver.findElement(By.name("lastname")).sendKeys("Agrawal");
		
		//4. Linktext 
		//Only and Only for Links
		//driver.findElement(By.linkText("Selenium Webdriver")).click();
		
		//5. partialLink test : Only for links and this is not recommended to use 
		
		//6.CSS selector --also second prioirty Internally using ID only 
		//driver.findElement(By.cssSelector("#sex-0")).click();  // CSS Selector we can also use # and Id 
		
		//7. Class --not recommended and not usefull.
		//It can be duplicate for different element and not recommended 
		//Fourth priority
		
		//driver.quit();//To close the browser once the testing is done 
	}
}
//When Element is not found then selenium gives element not found exception 
//All the links are represented by a tag.
//CSS Selector-#followed by id value.We can select the web element by CSS Selector also.
//Class name is not recommended to select the web element.Class name can be same for different element and hence not used.
//Seleium is based on finding locator also.

