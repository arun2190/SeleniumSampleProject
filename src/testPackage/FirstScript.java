package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
@SuppressWarnings("unused")
public class FirstScript {
 
	public static void main(String[] args) throws InterruptedException {
		
			 
	// Firefox driver setup using gekodriver set property 
		
	System.setProperty("webdriver.gecko.driver","C:\\Selenuim\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
	
	
	// Chrome driver setup using set property 
	
	String exePath = "C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	
	
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		
        // Close the driver
       driver.quit();
    }
}