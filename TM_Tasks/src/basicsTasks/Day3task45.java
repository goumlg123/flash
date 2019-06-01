package basicsTasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task45 {

	public static void main(String[] args) {
		
		System.setProperty("Webdr", "C:\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  
		 driver.get("http://newtours.demoaut.com/");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ankit3");
		
		driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
		//Task 5: 1.Print all the city names from departing from dropdown
		
	List<WebElement> cities = driver.findElements(By.xpath((" //select[@name='fromPort']/child::option[position()]")));
		 
		
		for (WebElement ele: cities)

		{
			System.out.println(ele.getText());
		}
		
		//Task6:1.click on myinfo 2.In personal details sestion, from nationality dropdown print first 15country names


		
		
		
	}

}
