package Pacakage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_search_modi {

	public static void main(String[] args) throws InterruptedException {
		
		
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://youtube.com");
		driver.manage().window().maximize();
		
	WebElement e1=	driver.findElement(By.name("search_query"));
		
	e1.sendKeys("Modi");
	Thread.sleep(1000);
	
List<WebElement>l1=	driver.findElements(By.xpath("//div[@class='sbqs_c']/ul/li"));
	
	int count=l1.size();
	
	System.out.println(count);
	
	Thread.sleep(2000);
	
	l1.get(0).click();
	}

}
