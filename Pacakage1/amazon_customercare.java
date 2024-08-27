package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_customercare {

	public static void main(String[] args) {
		
		//signin directly and enter email,password click sign in button
		
		ChromeDriver c=new ChromeDriver ();
		c.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement e1=c.findElement(By.name("email"));

		e1.sendKeys("ramagopireddy1@gmail.com");
		
	WebElement con=	c.findElement(By.id("continue-announce"));
			
			con.click();
		
	WebElement password=	c.findElement(By.id("ap_password"));
	password.sendKeys("rama");
		
	WebElement signinbutton=	c.findElement(By.id("signInSubmit"));
	signinbutton.click();
		
		//customer service
	
	
		/*c.get("https://www.amazon.in/");
		c.manage().window().maximize();
	WebElement cust=	c.findElement(By.linkText("Customer Service"));
	
	cust.click();*/
		

	
	
	
	
	
	
	
		
		

	}

}
