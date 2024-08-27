package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_program {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://amazon.in");
		d.manage().window().maximize();
		
	WebElement e1=	d.findElement(By.id("nav-link-accountList"));
	
	
	Actions a1=new Actions(d);
	
	a1.moveToElement(e1).perform();
	
	//login after Hoverhover
	
	Thread.sleep(2000);
WebElement e2	=d.findElement(By.id("nav-flyout-ya-signin"));

e2.click();

 WebElement e3=d.findElement(By.id("ap_email_login"));
 
 e3.sendKeys("ramagopireddy1@gmail.com");
 
 
 
	WebElement con=	d.findElement(By.id("continue"));
	
	con.click();
	


WebElement password=	d.findElement(By.name("password"));
password.sendKeys("12345");



WebElement signinbutton=	d.findElement(By.id("signInSubmit"));
signinbutton.click();
	
	

	}

}
