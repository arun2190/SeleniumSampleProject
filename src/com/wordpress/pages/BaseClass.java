package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

		
	public WebDriver driver;
	
	 @Parameters("browser")
	 
	  @BeforeClass
	  public void setupApplication(String browser) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
	 
		System.setProperty("webdriver.gecko.driver","C:\\Selenuim\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		Reporter.log("=====Browser Session Started=====",true);

		// If browser is Chrome, then do this	  
	 
	  		} else if (browser.equalsIgnoreCase("Chrome")) { 
	 
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
	 	  driver = new ChromeDriver();
	 	  Reporter.log("=====Browser Session Started=====",true);
	  		} 
	  
	    driver.manage().window().maximize();
		
	 //	driver.get("https://orangehrm-demo-6x.orangehrmlive.com/symfony/web/index.php/auth/login");
	    driver.get("http://demosite.center/wordpress/wp-login.php");	
		Reporter.log("=====Application Started=====",true);
	  
 }

	@AfterClass
	public void closeApplication()
	{
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
	}
		
}
