package regression;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ZerobankLogin {

@Test
	
	public void verifyLogin() 
	
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Jar files\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
		Reporter.log("Website launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		//click on Sigin button
		driver.findElement(By.id("signin_button")).click();
		Reporter.log("click on sigin");
		//find username and pass value "username"
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MINUTES);
		Reporter.log("username entered");
		//find password
		driver.findElement(By.name("user_password")).sendKeys("password");
		Reporter.log("password entered");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		//click on signin button 
		driver.findElement(By.name("submit")).click();
		Reporter.log("click on submit");
		//click on advance
		driver.findElement(By.id("details-button")).click();
		Reporter.log("click on details");
		//click on proceed
	    driver.findElement(By.id("proceed-link")).click();;
	    Reporter.log("click on proceed");
	//close the session 
	driver.close();
	}
	}

