package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@SuppressWarnings("unused")


public class DriverCommands {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url =  "http:store.demoqa.com";
		driver.get(url);
		driver.manage().window().maximize();
	    String PageTitle = driver.getTitle();
	 	int titleLength = PageTitle.length();
		
		System.out.println("Web Page Title is " + PageTitle );
		System.out.println("Length of page title is " + titleLength);
		
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equals(url))  {
			
			System.out.println("Correct page is opened");
			
		}
		
		else 
		{
			System.out.println("Please correct the URL");
		}
			
		int pageSourceLength = driver.getPageSource().length();
		System.out.println("Length of page source code is " + pageSourceLength);
		
		
		driver.close();
		
		
	}	
	
}

/*

Launch a new Firefox browser.
Open Store.DemoQA.com
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if the it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Print Page Length on Eclipse Console.
Close the Browser.


*/