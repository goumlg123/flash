package basicsTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecu {
 
		
		

		public static void main(String[] args)   {
			 
			WebDriver driver = new ChromeDriver();
			driver.get("http://testingmasters.weebly.com/webtables.html");
			driver.manage().window().maximize();

			List<WebElement> allitems = driver.findElements(By.xpath("//td[text()='Manager']/preceding-sibling::td[4]/input[@type='checkbox']"));
			for(WebElement ele:allitems)
			{
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",ele);
			}
		}

}
