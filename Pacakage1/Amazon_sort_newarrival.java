package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_sort_newarrival {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeDriver c=new ChromeDriver ();
		c.get("https://www.amazon.in/");
		
		c.manage().window().maximize();
		
		WebElement e1=c.findElement(By.xpath("(//input)[5]"));

	e1.sendKeys("tshirt");
	e1.sendKeys(Keys.ENTER);
	
	
	
WebElement e2=	c.findElement(By.className("a-dropdown-label"));

e2.click();

Thread.sleep(3000);


WebElement e3=c.findElement(By.id("s-result-sort-select_4"));

e3.click();





	}

}
