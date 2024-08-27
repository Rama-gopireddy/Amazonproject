package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_hdfc {

	public static void main(String[] args) {
		
		
		ChromeDriver cd=new ChromeDriver();
		
		cd.get("https://www.hdfc.com/");
		
		cd.manage().window().maximize();
		
	WebElement login=	cd.findElement(By.linkText("LOGIN"));
		
		login.click();
		
		
		
		
	WebElement cuslogin=	cd.findElement(By.id("hl-master-structure-78e4272871"));
		
	
	cuslogin.click();
	
	
	
WebElement userid=	cd.findElement(By.name("user_id"));
		
	
	userid.sendKeys("rama");
	
WebElement password=	cd.findElement(By.name("password"));
		
	
password.sendKeys("12345");


WebElement mainlogin=	cd.findElement(By.linkText(" LOGIN "));


mainlogin.click();
	}

}
