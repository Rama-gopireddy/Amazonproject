package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		
ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.google.com");
		
	WebElement e1=	d.findElement(By.className("gb_V"));
	
	Actions a1=new Actions(d);
	
	
	a1.doubleClick( e1).perform();
	
	
		
		
		
		
		
		
		
		

	}

}