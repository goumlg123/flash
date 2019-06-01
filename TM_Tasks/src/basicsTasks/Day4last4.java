package basicsTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4last4 {

	public static void main(String[] args) {

		System.setProperty("Webdr", "C:\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  
		 driver.get("http://www.testingmasters.com/hrm");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("ankit3");
		
		driver.findElement(By.xpath(" //input[@name='txtPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		
		driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
		
		
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[1]")).click();
		
		
		
		
	}

}
