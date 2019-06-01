package basicsTasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task6 {

	public static void main(String[] args) {
		System.setProperty("Webdr", "C:\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  
		 driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		
		driver.findElement(By.xpath(" //input[@id='txtPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
		driver.findElement(By.xpath(" //b[text()='My Info']")).click();
		
		driver.findElement(By.xpath("//input[@id='btnSave'][@value='Edit']")).click();
		
		
		
		// driver.findElement(By.xpath("//select[@class='editable valid']//child::option[text()='Angolan']")).click();
		
		//System.out.println("hi bangaram");
		 
		 
		
		List<WebElement> nationality = driver.findElements(By.xpath(("//select[@name='personal[cmbNation]']/child::option[position()>1and position()<=16]")));
		
		
		//System.out.println(nationality.size());
		
		for (WebElement ele: nationality)

		{
			System.out.println(ele.getText());
		}
		

	}

}
