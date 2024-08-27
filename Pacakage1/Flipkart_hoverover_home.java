package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hoverover_home {

	public static void main(String[] args) {
		
ChromeDriver d=new ChromeDriver();
		
		d.get("https://Flipkart.com");
		d.manage().window().maximize();
		
	WebElement e1=	d.findElement(By.xpath("(//span[.='Home & Furniture'])[2]"));
		
		Actions a1=new Actions(d);
		
		a1.moveToElement(e1).perform();
		
WebElement e2=	d.findElement(By.linkText("Home Decor"));
		
	//	Actions a2=new Actions(d);
		
		a1.moveToElement(e2).perform();
		
	WebElement e3=	d.findElement(By.linkText("Clocks"));
	
	
	e3.click();
		
		
		
		
		
		
		
		
		

	}

}
