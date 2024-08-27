package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login_Relative_xpath {

	public static void main(String[] args) {
		
	ChromeDriver d=new ChromeDriver();
		
		d.get("https://facebook.com");
		d.manage().window().maximize();
		
	
		
	WebElement e4=d.findElement(By.xpath("(//input)[3]"));
			e4.sendKeys("gopireddy1@gmail.com");		
	
 
	WebElement e5=d.findElement(By.xpath("(//input)[4]"));
			e5.sendKeys("Devi123");
		
		
			WebElement e6=d.findElement(By.xpath("//button[@name='login']"));//relative xpath
				e6.click();
		
		
		

	}

}
