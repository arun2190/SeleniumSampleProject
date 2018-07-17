/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
/**
 * @author arukumar
 *
 *  This class will store all the locators and methods of Login Page
 *
 */
public class LoginPage {
	
	WebDriver driver;

	//  Login Page Locators
	
	By username=By.id("user_login");
	By password=By.xpath(".//*[@id='user_pass']");
	By loginButton=By.name("wp-submit");
	By WelcomeText = By.xpath("//*[@id='welcome-panel']/div/h2");
	
 // Parameterized Constructor
	
	public LoginPage(WebDriver driver)	{
		   this.driver=driver;
		 }
		
	// Login function using locators
	
	public void loginToWordpress(String userid,String pass) throws InterruptedException {

	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(loginButton).click();
	
	Thread.sleep(5000);
	}
	
	public void verifyLogin(){
	
	String WelcomeMSG = driver.findElement(WelcomeText).getAttribute("innerText");
	
	if(WelcomeMSG.equalsIgnoreCase("Welcome to WordPress!")){
		
		System.out.println("Login is Successful..!");
	} else {
		System.out.println("Login Failed..!");	
	
	}

	}
		
}
