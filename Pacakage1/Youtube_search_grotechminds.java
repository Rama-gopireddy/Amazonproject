package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_search_grotechminds {

	public static void main(String[] args) {
		
		
		
ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();	
		
	WebElement e1=	d.findElement(By.name("search_query"));
		
	e1.sendKeys("grotechminds");
	
	e1.sendKeys(Keys.ENTER);
	
	WebElement e2=d.findElement(By.partialLinkText("subscribe"));
	
	e2.click();
		
	
		

	}

}
