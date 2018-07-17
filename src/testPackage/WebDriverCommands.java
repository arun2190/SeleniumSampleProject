package testPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
@SuppressWarnings("unused")

public class WebDriverCommands {

	public static void main(String[] args) {
		
		String exePath = "C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();

		// Storing the Application Url in the String variable
		String url = "http://www.store.demoqa.com";

		//Launch the ToolsQA WebSite
		driver.get(url);

		// Storing Title name in the String variable
		String title = driver.getTitle();

		// Storing Title length in the Int variable
		int titleLength = driver.getTitle().length();

		// Printing Title & Title length in the Console window
		System.out.println("Title of the page is : " + title);
		System.out.println("Length of the title is : "+ titleLength);

		// Storing URL in String variable
		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.equals(url)){
			System.out.println("Verification Successful - The correct Url is opened.");
		}else{
			System.out.println("Verification Failed - An incorrect Url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual URL is : " + actualUrl);
			System.out.println("Expected URL is : " + url);
		}

		// Storing Page Source in String variable
		String pageSource = driver.getPageSource();

		// Storing Page Source length in Int variable
		int pageSourceLength = pageSource.length();

		// Printing length of the Page Source on console
		System.out.println("Total length of the Pgae Source is : " + pageSourceLength);
		
		
		// Browser Navigation Commands
		
		// Open ToolsQA web site
				String appUrl = "http://www.DemoQA.com";
				driver.get(appUrl);
		 
				// Click on Registration link
				driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		 
				// Go back to Home Page
				driver.navigate().back();
		 
				// Go forward to Registration page
				driver.navigate().forward();
		 
				// Go back to Home page
				driver.navigate().to(appUrl);
		 
				// Refresh browser
				driver.navigate().refresh();

		//Closing browser
		driver.close();
	}
}