package basicsTasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) {
		System.setProperty("Webdr", "C:\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  
		 driver.get("http://testingmasters.weebly.com/webtables.html");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//table/tbody/tr[3]/td[4]
		
		/*WebElement mailid= driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]"));
		
		System.out.println(mailid.getText());
		*/
		
		
		/*List<WebElement> allcmailids = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		
		
				for (WebElement ele :allcmailids  )
			 
				{
					System.out.println(ele.getText());
				}*/
		
		
		
		
		

	}

}
