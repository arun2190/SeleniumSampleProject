package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String url = "http://store.demoqa.com/products-page/your-account/";
        
        driver.get(url);
        
        WebElement userName = driver.findElement(By.xpath("//*[@id='log']"));
        WebElement passWord = driver.findElement(By.xpath("//*[@id='pwd']"));
        userName.clear();
        userName.sendKeys("test");
        passWord.clear();
        
        passWord.sendKeys("demo");
        
        driver.findElement(By.xpath("//*[@id='login']")).click();
        
        driver.close();
        
        
        
      
        
		
	}

}
