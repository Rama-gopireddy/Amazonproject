package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_gmail {

	public static void main(String[] args) {
		
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.google.com");
		
		//d.findElement(By.linkText("Gmail")).click();
		
	//WebElement gmail=	d.findElement(By.linkText("Gmail"));
	WebElement gmail=	d.findElement(By.partialLinkText("Gma"));
	gmail.click();
		
		
		
		

	}

}
