package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class mystore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Jar files\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//navigate to website
		driver.get("http://automationpractice.com/index.php");
		//maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//find and click on sigin 
		driver.findElement(By.className("login")).click();
		
		//enter email address 
		driver.findElement(By.id("email_create")).sendKeys("nickel25041991@gmail.com");
		
		//find and click on create account 
        driver.findElement(By.id("SubmitCreate")).click();

        //select radio button Mr 
        driver.findElement(By.id("uniform-id_gender1")).click();
        
        //fill up first name 
        driver.findElement(By.id("customer_firstname")).sendKeys("Nickel");
        
        //fill up last name 
        driver.findElement(By.id("customer_lastname")).sendKeys("K");
        
        //fill up password 
        driver.findElement(By.id("passwd")).sendKeys("password");
        
        //fill up name  
        driver.findElement(By.id("firstname")).sendKeys("Nickel");
        
        //fill up last name 
        driver.findElement(By.id("lastname")).sendKeys("K");
        
        // fill up company 
        driver.findElement(By.id("company")).sendKeys("Twoplugs");
        
        //fill up address
        driver.findElement(By.id("address1")).sendKeys("14 dovehouse");
        
        //fill up city 
        driver.findElement(By.id("city")).sendKeys("Toronto");
        
        // select state
       // WebElement searchstate = driver.findElement(By.id("id_state"));
        //select s1 = new Select(searchstate);
         
    	
        //fill up postal code 
        driver.findElement(By.id("postcode")).sendKeys("M3J1A1");
        //select country 
        
        //enter phone number 
        driver.findElement(By.id("phone_mobile")).sendKeys("6474614675");
        
        //enter 2nd email address
        driver.findElement(By.id("alias")).sendKeys("gmail.com");
        
        //click on register 
        driver.findElement(By.id("submitAccount")).click();

		
		
		
		
}
}