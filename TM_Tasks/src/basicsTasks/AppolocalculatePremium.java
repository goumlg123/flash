package basicsTasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AppolocalculatePremium {

	public static void main(String[] args)  {

  
		 System.setProperty("Webdr", "C:\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  
		driver.get("https://buy.apollomunichinsurance.com/easy-health-individual");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9989188810");
		
		
	/*WebElement enterCity=  driver.findElement(By.xpath("//input[@type='text']"));
		
		enterCity.click();
		//Thread.sleep(3000);
		 
		List<WebElement> cities = driver.findElements(By.xpath("//div[contains(@class,'ng-option')]"));
		System.out.println(cities.size());
		
		
		for (int i=0; i<cities.size(); i++)
		{
			System.out.println(cities.get(i).getText());
			
			if (cities.get(i).getText().contains("Abohar"))
					 
			{
				cities.get(i).click();
			// System.out.println(cities.get(i).getText());
			
				cities.clear();
			  
				break;
				
			}
			
			
			
			
		}
	*/	
		
		//age selection
		
		
/* WebElement selfageweb = (driver.findElement(By.xpath("//div[@id='state1']/form-generator/div[3]/div[3]/div/select-auto-complete/div/select")));
		
		//selfageweb.click();
		 
		Select selfage = new  Select(selfageweb);
		 
		selfage.selectByValue("19");*/
	
		
		
	driver.findElement(By.xpath("//div[@id='state1']/form-generator/div[3]/div[3]/div/select-auto-complete/div/select")).click();
		
		
	//	driver.findElement(By.partialLinkText("Remove")).click();
		
		driver.findElement((By.xpath("//div[@class='column3-last remove-btn']//a"))).click();
		
		driver.findElement((By.xpath("//input[@class='primary-btn'][@value='CALCULATE PREMIUM']"))).click();
		
		 
		
		
		/*Select wifeage = new  Select(driver.findElement(By.xpath("//select[@name='AdultAge15535335777591']")));
		wifeage.selectByIndex(25);
		
		
		Select suminsured = new  Select(driver.findElement(By.xpath("//select[@name='AdultCover15535335770571']")));
		suminsured.selectByValue("5");
		
		Select AvailCriticalIllness = new  Select(driver.findElement(By.xpath("//select[@name='AdultCI15535335770571']")));
		AvailCriticalIllness.selectByIndex(0);
		
		*/
		
	 	 

}
}

