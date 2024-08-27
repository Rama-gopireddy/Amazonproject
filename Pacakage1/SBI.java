package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {

	public static void main(String[] args) {
		
ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.onlinesbi.sbi/");
		
	WebElement login=	d.findElement(By.linkText("LOGIN"));
	
	login.click();
	
	WebElement partiallinktext=d.findElement(By.partialLinkText("CONTINUE TO LOGIN"));
	
	partiallinktext.click();
	
WebElement username=d.findElement(By.name("userName"));
	
username.sendKeys("rama");
	
WebElement password=d.findElement(By.name("password"));
	
	password.sendKeys("12345");;
		
		

	}

}
