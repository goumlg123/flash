package basicsTasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Task1 {

	public static void main(String[] args)   {
		 
		
		System.setProperty("Webdr", "C:\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  
		 driver.get("http://testingmasters.weebly.com/webtables.html");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//Task1: Click on all checkboxes of the records whose name is vinod


	//	driver.findElement(By.xpath(("//td[text()='Vinod']/preceding-sibling::td[position()=2]/child::input[@type='checkbox']"))).click();
		
		
		//Task2: Print the mobile numbers of the records whose designation is Analyst


		/*List<WebElement> allmobileno= driver.findElements(By.xpath(("//td[text()='Analyst']/following-sibling::td[position()=1]")));
		
		for(WebElement ele: allmobileno)
		{
			System.out.println(ele.getText());
			
		}
		*/
		//Task3:		Select status as Rejected for the candidate whose employee ID is S148106
           
	/*WebElement cancel=	driver.findElement(By.xpath(("//td[text()='S148106']/following-sibling::td[position()=6]/child::select/child::option[text()='Cancelled']"))); 
	   
		 cancel.click();
		
		*/

		//Task4:Print the employee ID’s of the candidates who have applied for days >=8

		
		 
		
	List<WebElement> days = driver.findElements(By.xpath((" //td[7][text()]")));
	 
     
	for (int i=0; i<days.size(); i++)
	{	

		//if (Integer.parseInt(allempid.get(i).getText())!= 5)
		
		
		if  (Integer.parseInt(days.get(i).getText())>= 8)
		{
			List<WebElement> allempid8leave = driver.findElements(By.xpath((" //td[2][text()]")));
			
			
			System.out.println("the employess who applied leave more than 8 days:  " + allempid8leave.get(i).getText());
		  
		}
	
	 
	}
}
		
 
}
 
 

 

 
