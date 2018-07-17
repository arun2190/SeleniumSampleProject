package com.wordpress.tests;

import org.testng.annotations.Test;
import com.wordpress.pages.LoginPage;
import com.wordpress.pages.BaseClass;

public class TestLogin extends BaseClass {

	@Test
	public void verifyValidLogin() throws InterruptedException 	{
		
    // Create LoginPage Class Object and Pass WebDriver 
		
	LoginPage login = new LoginPage(driver);
	
	
	// Object call the function defined in Class to perform login Operation
	login.loginToWordpress("admin","demo123");
	
	Thread.sleep(5000);
	login.verifyLogin();
	
	
 
	}
	
	
	
	
}



