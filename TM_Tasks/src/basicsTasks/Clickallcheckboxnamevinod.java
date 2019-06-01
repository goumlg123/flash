package basicsTasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clickallcheckboxnamevinod {

	public static void main(String[] args) 
	
	{


FirefoxDriver  driver = new  FirefoxDriver();
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		
	List<WebElement> allvinod = driver.findElements(By.xpath("//td[text()='Vinod']/preceding-sibling::td[position()=2]/child::input[position()=1]"));
	
	//
	
	for (WebElement ele: allvinod)
		
	{
		System.out.println(ele.getText());
	}

}
}
