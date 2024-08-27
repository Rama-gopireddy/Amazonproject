package Pacakage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepot_autosuggestion {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com");
		driver.manage().window().maximize();
		
	WebElement e1=	driver.findElement(By.name("keyword"));
		
	e1.sendKeys("pots");
	Thread.sleep(1000);
	
List<WebElement>l1=	driver.findElements(By.xpath("//span[@class='sui-font-bold']/div/div"));
	
	int count=l1.size();
	
	System.out.println(count);
	
	Thread.sleep(2000);
	
	//l1.get().click();
		
		
		
		
		
		
		
		
		
		

	}

}
