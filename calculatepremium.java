package insurancetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test

public class calculatepremium {
public void calculation() {
		
		// for opening the GURU Demo website
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-16.0.1\\chromedriver.exe");
		 
		    WebDriver driver=new ChromeDriver();
		
		    driver.get("http://demo.guru99.com/insurance/v1/index.php");
		
		
		// trying to login with valid credentials
		
		       driver.findElement(By.id("email")).sendKeys("bhaskar123@gmail.com");
		
		       driver.findElement(By.id("password")).sendKeys("bhaskar1");
		
		        driver.findElement(By.name("submit")).click();
		        
		 // validating whether successfully logined or not by checking logout button is present or not
				
			      WebElement logoutbutton = driver.findElement(By.xpath("//input[@value='Log out']"));
			       
			      boolean displayed = logoutbutton.isDisplayed();

			      System.out.println("Login is successful. Logout button is present in the page.");
		        
	   // opening the Request Quotation page and giving details
				
				driver.findElement(By.linkText("Request Quotation")).click();
				
		// to select Radio button to yes
				
			    driver.findElement(By.xpath("//input[@value='Yes']")).click();
			    
			    WebElement radiobutton = driver.findElement(By.xpath("//input[@value='Yes']"));
			    
			    Assert.assertTrue(radiobutton.isSelected());
			    
			    System.out.println("Yes radio button is selected successfully.");
			    
			 // to send Estimated value as 1000  
				
			    	driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1000");
			   
			// to select public place from parking location drop down 		    
				
			    	Select select = new Select(driver.findElement(By.name("parkinglocation")));
				
			    	select.selectByIndex(3);

			    	System.out.println("Public place is selected successfully");
				 
		// trying to calculate premium 
				
				driver.findElement(By.xpath("//input[@value='Calculate Premium']")).click();
				
				 WebElement Calculatedpremium = driver.findElement(By.id("calculatedpremium"));
				 					
					Assert.assertTrue(Calculatedpremium.isDisplayed());
					
					System.out.println("Your discount is and Premium is calculated and both are not null");
					
					driver.findElement(By.id("resetquote")).click();
					
		//to reset values
					
				
					 WebElement changedradiobutton = driver.findElement(By.xpath("//input[@value='No']"));
					    
					    Assert.assertTrue(changedradiobutton.isSelected());
					    
					    System.out.println("Entered values are resetted successfully.");
					    
					    WebElement logout = driver.findElement(By.xpath("//input[@class='btn btn-danger']"));
						logout.click();
					    
					    				
}		
}
