package Pacakage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_refrigirator_suggestion {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Amazon.in");
		driver.manage().window().maximize();
		
	WebElement e1=	driver.findElement(By.name("field-keywords"));
		
	e1.sendKeys("Refrigerators");
	Thread.sleep(1000);
	
List<WebElement>l1=	driver.findElements(By.xpath("//div[@class='icon-suggestion-div search-icon-div']/div/div"));
	

//*[@id="nav-flyout-searchAjax"]/div[2]/div/div[1]/div[1]/div/div[1]
	int count=l1.size();
	
	System.out.println(count);
	
	Thread.sleep(2000);
	
	l1.get(7).click();
		
		

	}

}
