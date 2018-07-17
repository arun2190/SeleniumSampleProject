package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObjects.Home_Page;

/**
* @author Mukesh_50
*
*/
public class PageObjectModel 
{


@Test
public void verifyValidLogin()
{

WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.get("http://demosite.center/wordpress/wp-login.php");

 Home_Page Home_Page = new Home_Page(driver);



Home_Page login = null;
login.clickOnLoginButton();


driver.quit();

}


}