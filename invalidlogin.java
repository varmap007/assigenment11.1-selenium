package insurancetest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class invalidlogin {
	
	public void invalidlogintest() {
		
	  // for opening the GURU Demo website
		
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-16.0.1\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
		
			driver.get("http://demo.guru99.com/insurance/v1/index.php");
		
	// trying to login with invalid credentials
	
			driver.findElement(By.id("email")).sendKeys("invalid@gmail.com");
	
			driver.findElement(By.id("password")).sendKeys("invalid");
	
			driver.findElement(By.name("submit")).click();
			
	// CHecking for login button and error Message	
			
			WebElement loginbutton = driver.findElement(By.name("submit"));
			
			Assert.assertTrue(loginbutton.isDisplayed());
		
			System.out.println("Login is unsuccessful. Login button is present.");
				      
		    System.out.println("The error message is Enter your Email address and password correct"); 
		
		    driver.quit();	
	}
}
