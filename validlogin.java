package insurancetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class validlogin {
	
	public void validlogintest() {
		
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
	    
		 // validating  by checking title of page
		
		       String title_of_page = driver.getTitle();
		
	           Assert.assertEquals(title_of_page, "Insurance Broker System");
	           
		       System.out.println("title of page is Insurance Broker System");
		   
		// Checking the URL of page       
		       
		      String currenturl =  driver.getCurrentUrl();
		      
		      Assert.assertEquals(currenturl, "http://demo.guru99.com/insurance/v1/header.php");
		      
		      System.out.println("the current URL is"  +currenturl);
		      
		//Checking for the required text on page 
		      
		      String text= driver.findElement(By.tagName("h2")).getText();
		      
		      Assert.assertEquals(text, "Broker Insurance WebPage");
		      
		       System.out.println("The text present is "  +text); 
		       
		       driver.quit();
	 	    
	}

}
