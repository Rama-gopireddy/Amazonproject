package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://facebook.com");
		d.manage().window().maximize();
		
		d.findElement( By.id("u_0_1_cc")).click();
		
 d.findElement(By.name("firstname")).sendKeys("rama");
	
 d.findElement(By.name("lastname")).sendKeys("gopireddy");
		
 d.findElement(By.name("reg_email__")).sendKeys("gopireddy1@gmail.com");		
	
 
 d.findElement(By.id("password_step_input")).sendKeys("Devi123");
	}

}