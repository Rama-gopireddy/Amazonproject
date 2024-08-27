package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_disable_enabled {

	public static void main(String[] args) {
		
		

		ChromeDriver c=new ChromeDriver();	
		c.get("file:///C:/Users/ramag/Downloads/learningHTML1.html");
		c.manage().window().maximize();
		WebElement e1=	c.findElement(By.xpath("(//input)[5]"));
		boolean b1=	e1.isDisplayed();
		boolean b2=	e1.isEnabled();
		System.out.println(b1);
		System.out.println(b2);


		if(e1.isDisplayed()&& e1.isEnabled())
		{
			e1.sendKeys("gopireddy");
		}
		else
		{
			
			System.out.println("sorry please chek the element");
		}

	}

}
