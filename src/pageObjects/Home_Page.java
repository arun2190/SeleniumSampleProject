package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
* @author Mukesh_50
* 
* 
* This class will store all the locator and methods of login page
*
*/
public class Home_Page 
{

WebDriver driver;


By username=By.id("user_login");
By password=By.xpath(".//*[@id='user_pass']");
By loginButton=By.name("wp-submit");


public Home_Page(WebDriver driver)
{
this.driver=driver;
}


public void loginToWordpress(String userid,String pass)
{

driver.findElement(username).sendKeys(userid);
driver.findElement(password).sendKeys(pass);
driver.findElement(loginButton).click();

}


	public void typeUserName(String uid)   {

		driver.findElement(username).sendKeys(uid);
	}

	public void typePassword(String pass) {

		driver.findElement(password).sendKeys(pass);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}