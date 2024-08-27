package Pacakage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_program {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Flipkart.com");
		driver.manage().window().maximize();
		
		
	WebElement e1=	driver.findElement(By.name("q"));
	
	

	
	e1.sendKeys("shoes");
	
	Thread.sleep(2000);
	
List<WebElement>l1=	driver.findElements(By.xpath("//form[@class='__2rslOn header-form-search OpXDaO']/ul/li"));
	
	int count=l1.size();
	
	System.out.println(count);
	
	Thread.sleep(2000);
	
	l1.get(4).click();
	}

}
