package basicsTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumexceptions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();		
		driver.findElement(By.xpath("//a[text()='Immigration']")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		
		driver.findElement(By.xpath("//input[@id='immigration_passport_issue_date']")).click();
		
		WebElement dat = driver.findElement(By.xpath("//input[@id='immigration_passport_issue_date']"));
		
		dat.sendKeys("2017-03-14");
		 
		dat.sendKeys(Keys.ESCAPE);
		
		Thread.sleep(2000);
		 
		WebElement	expdat= driver.findElement(By.xpath("//input[@id='immigration_passport_expire_date']"));
		
		
		expdat.click();
		expdat.sendKeys("2020-03-14");
		
		expdat.sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(1000);
		  
		
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}

}


 