package basicsTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptionstypes {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdr", "C:\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  
		 driver.get("http://www.testingmasters.com/hrm");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		WebElement userid =driver.findElement(By.xpath("//input[@name='txtUsername']"));
 
		WebElement pwd =driver.findElement(By.xpath("//input[@id='txtPassword']"));
		 
	 	   
		  
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		js.executeScript("arguments[0].value='ankit';",  pwd);
		 
		 

	}

}
