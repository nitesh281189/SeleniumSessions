package SeleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
				//To read the property file we have to create an object of properties class
				//We Will write the code to read the properties file 
				//We will create the Object of Class Properties 
				Properties prop=new Properties();
				FileInputStream fs=new FileInputStream("E:\\JavaSessions\\SeleniumTestSessions\\src\\SeleniumBasics\\config.properties");
				prop.load(fs);
				//Load the Config File 
				//Read the properties and print the value 
				//We have pass the exact value that is mentioned in properties file.
				System.out.println(prop.getProperty("name"));
				System.out.println(prop.getProperty("age"));
				//We have to pass the correct exact value 
				String URL=prop.getProperty("URL");
				String browsername=prop.getProperty("browser");
				WebDriver driver = null;
				if (browsername.equals("chrome"))
				{	
					System.out.println("Chrome Driver");
					System.setProperty("webdriver.chrome.driver","E:\\Automation_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
					driver=new ChromeDriver();	
				}
				driver.get(URL);
				//Scope of variable defined in If block is within the block only
				//Advantage is we can easily set the environement for test using the properties file 
				//We can replace hard coded values from config.properties file 
				//If the Xpath is changed we can just the Xpath in the properties file so we dont have to modify mutlipe location 
				//Helps to make the Script generic
	}
}
