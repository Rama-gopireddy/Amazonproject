package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		
	ChromeDriver d=new ChromeDriver();
	
	d.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0https://www.amazon.com/");
	
	d.manage().window().maximize();
	
	/*.findElement(By.id("ap_email")).sendKeys("ramagopireddy1@gmail.com");
	 d.findElement(By.id("continue")).click();*/
	
	
	
	//other way
	
	
	d.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0https://www.amazon.com/");
	
	d.manage().window().maximize();
	
	WebElement un= d.findElement(By.id("ap_email"));
			un.sendKeys("ramagopireddy1@gmail.com");
			
			
	WebElement con_button= d.findElement(By.id("continue"));
	con_button.click();
	

	
	
		
		
		
		


	}

}
