package Pacakage1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bynow_program {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver c=new ChromeDriver ();
		c.get("https://www.amazon.in/");
		
		c.manage().window().maximize();
		
		WebElement e1=c.findElement(By.xpath("(//input)[5]"));

	e1.sendKeys("Shoes");
	e1.sendKeys(Keys.ENTER);
		
	WebElement e3=	c.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
			
		e3.click();
	
	Set<String> s1=	c.getWindowHandles();
		
	Iterator<String> i1	=s1.iterator();
	
	
	String parentid=i1.next();//parent windowid
		
		
	String childid=i1.next();	//anychild
	
	
	
	System.out.println(parentid);
	System.out.println(childid);
	
	
	c.switchTo().window(childid);
	
	Thread.sleep(2000);
	
WebElement e4=	c.findElement(By.id("buy-now-button"));
	
	
	e4.click();
	
	
	
	

	WebElement e6=c.findElement(By.id("ap_email"));
	
	
	e6.sendKeys("ramagopireddy1@gmail.com");

	WebElement con=	c.findElement(By.id("continue"));
	
	con.click();

WebElement password=	c.findElement(By.name("password"));
password.sendKeys("Bhavik143#");

WebElement signinbutton=	c.findElement(By.id("signInSubmit"));
signinbutton.click();
	
	

	}

}
