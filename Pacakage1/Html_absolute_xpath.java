package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_absolute_xpath {

	public static void main(String[] args) {
	
		ChromeDriver c=new ChromeDriver ();
		c.get("file:///C:/Users/ramag/Downloads/learningHTML1.html");
		
		c.manage().window().maximize();
		
	WebElement e1=	c.findElement(By.xpath("(/html/body/input)[1]"));
		
		e1.sendKeys("ramadevi");

WebElement e2=	c.findElement(By.xpath("(/html/body/input)[2]"));
		
		e2.sendKeys("devi");
		
		

WebElement e3=	c.findElement(By.xpath("(/html/body/input)[3]"));
		
		e3.sendKeys("devi");
		

WebElement firstname=	c.findElement(By.xpath("(html/body/form/input)[1]"));
		
		firstname.sendKeys("devi");
		

WebElement boy=	c.findElement(By.xpath("(html/body/form[2]/input)[1]"));
		
		boy.click();
		
		
WebElement girl=	c.findElement(By.xpath("(html/body/form[2]/input)[2]"));
		
		girl.click();
		
WebElement baby=	c.findElement(By.xpath("(html/body/form[2]/input)[3]"));
		
		baby.click();
		
		
WebElement male=	c.findElement(By.xpath("(html/body/input)[4]"));
		
		male.click();
		
WebElement female=	c.findElement(By.xpath("(html/body/input)[5]"));
		
		female.click();		
		
		
WebElement checkbox=	c.findElement(By.xpath("(html/body/input)[6]"));
		
checkbox.click();	


WebElement link=	c.findElement(By.linkText("Click to know about us"));

//link.click();
		
		
	}

}
