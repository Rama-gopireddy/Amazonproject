package Pacakage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mg_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://1mg.com");
		driver.manage().window().maximize();
		
	WebElement e1=	driver.findElement(By.id("srchBarShwInfo"));
		
	e1.sendKeys("cholesterol");
	Thread.sleep(1000);
	
List<WebElement>l1=	driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
	
	int count=l1.size();
	
	System.out.println(count);
	
	Thread.sleep(2000);
	
	l1.get(5).click();

		
		
		
		
		
		
		
		
		
		
		

	}

}
