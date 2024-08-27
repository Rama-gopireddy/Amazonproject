package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_gender_program {

	public static void main(String[] args) {
		
		
		

		ChromeDriver c=new ChromeDriver();	
		c.get("file:///C:/Users/ramag/Downloads/learningHTML1.html");
		c.manage().window().maximize();
		WebElement e1=	c.findElement(By.xpath("(//input)[11]"));
		e1.click();
		
		boolean b1=	e1.isSelected();
		System.out.println(b1);
		


		if(b1==true)
		{
		System.out.println("radio button selected");
		}
		else
		{
			
			System.out.println("sorry please chek the element");
		}

	}

}
