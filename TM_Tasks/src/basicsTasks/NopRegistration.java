package basicsTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NopRegistration {

	
	
	
	
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("http://demo.nopcommerce.com/register");
		 
		 
		 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("goutham");
		 
		 driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("takur");
		 
		 Select day = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
		 		 
		 day.selectByValue("15");
		 
		
		 
		// WebElement month_dropdown	=  driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		// Select month = new Select(month_dropdown);
		 
		 Select month = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
		 
		
		  WebElement selectedvalue = month.getFirstSelectedOption();
		  
		  System.out.println("before selecting month " + selectedvalue.getText());
		  
		
		  month.selectByIndex(9);
		 
		  WebElement selectedvalue1 =  month.getFirstSelectedOption();
		   
		  System.out.println("after selecting month " + selectedvalue1.getText());
		  
		
		  
		  List<WebElement> monthlist = month.getOptions();
		  
		  int totalmonth= monthlist.size();
		  System.out.println("totalmonth s are  " + totalmonth);
		  
	  
		  	for (WebElement ele: monthlist)
		  	{
		  
		  		String monthname = ele.getText();
		  
		  		System.out.println("month names are"   + monthname );
		  	}
		 
		  
		  
		  
		  
		  
		 
        Select year = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        
        year.selectByVisibleText("1947");
		 
        
        
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("goumlg123@gmail.com");
        
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Accenture");
        
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
        
        
     //   driver.findElement(By.xpath("//input[@id='register-button']")).click();
        
        
        
        
        
		 
			
		 
		 
				 
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
