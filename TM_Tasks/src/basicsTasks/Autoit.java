package basicsTasks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		System.setProperty("Webdr", "C:\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  
		 driver.get("http://www.testingmasters.com/hrm");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("ankit3");
		
		driver.findElement(By.xpath(" //input[@name='txtPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		driver.findElement(By.xpath("//b[text()='My Info']")).click();
	
		
		driver.findElement(By.xpath("//input[@class='addbutton']")).click();
		driver.findElement(By.xpath("//input[@id='ufile']")).click();
		
		Runtime.getRuntime().exec("D:\\Autofile2.exe");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='btnSaveAttachment']")).click();
		
		
			 
		
		
		
		

	}

}
