package regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase01 {

	WebDriver driver;
	
	
  @Test
  public void verifyLogin() {
	  
	  driver.findElement(By.id("signin_button")).click();
		
		//find username and pass value "username"
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MINUTES);
		
		//find password
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		//click on signin button 
		driver.findElement(By.name("submit")).click();
		
		//click on advance
		driver.findElement(By.id("details-button")).click();
		
		//click on proceed
	    driver.findElement(By.id("proceed-link")).click();
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Zero - Account Summary";
        Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Jar files\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://zero.webappsecurity.com/index.html");
	  driver.manage().window().maximize();	
		
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  
  }

}
