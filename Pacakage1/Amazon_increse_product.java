package Pacakage1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_increse_product {

	public static void main(String[] args) {
		ChromeDriver c=new ChromeDriver ();
		c.get("https://www.amazon.in/");
		
		c.manage().window().maximize();
		
		WebElement e1=c.findElement(By.xpath("(//input)[5]"));

	e1.sendKeys("tshirt");
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
	
WebElement e2=c.findElement(By.name("quantity"));
	
	e2.click();
	
	
	/*WebElement e4=c.findElement(By.xpath("(//select[@name='quantity'])[5]"));
	
	e4.click();
	*/
	

	WebElement e5=c.findElement(By.name("submit.add-to-cart"));
	
	e5.click();
	}

}
