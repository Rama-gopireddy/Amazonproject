package Pacakage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_mobile_autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Amazon.in");
		driver.manage().window().maximize();
		
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		
	e1.sendKeys("Mobile");
	Thread.sleep(1000);
	
List<WebElement>l1=	driver.findElements(By.xpath("//div[@class='icon-suggestion-div search-icon-div']"));
	
	int count=l1.size();
	
	System.out.println(count);
	
	Thread.sleep(2000);
	
	l1.get(count-7).click();
		

	}

}
