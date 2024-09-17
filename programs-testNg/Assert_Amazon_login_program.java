package Selenium.TestNg.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Amazon_login_program {
	
	@Test
	public void login() {
		
		ChromeDriver c=new ChromeDriver ();
		c.get("https://www.amazon.in/");
	System.out.println(c.getTitle());	
		
		c.manage().window().maximize();
		
	WebElement account=	c.findElement(By.id("nav-link-accountList"));
	
	//Actions a1=new Actions(c);
//	a1.moveToElement(account).perform();
//	WebElement e1=c.findElement(By.className("nav-action-inner"));
		account.click();
		 WebElement email=	c.findElement(By.name("email"));
		 
		 email.sendKeys("ramagopireddy1@gmail.com");
		 
		 WebElement con=	c.findElement(By.id("continue"));
			
			con.click();

		WebElement password=	c.findElement(By.id("ap_password"));
	                                                                     	password.sendKeys("Bhavik143#");

		WebElement signinbutton=	c.findElement(By.id("signInSubmit"));
		signinbutton.click();
		
		//Assert.assertEquals(c.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
	WebElement search=	c.findElement(By.id("twotabsearchtextbox"));
	Assert.assertEquals(search.isDisplayed(), true, "sorry it is not matching");
	}

}
