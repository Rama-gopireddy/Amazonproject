package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Apollo_search_medicine {

	public static void main(String[] args) {
	
		
ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.apollopharmacy.in/");
		d.manage().window().maximize();	
		
	WebElement e1=	d.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		
		e1.click();
		
	WebElement e2	=d.findElement(By.xpath("//input[@id='searchProduct']"));
		
		//e2.click();
		e2.sendKeys("Pcm");
		
		
		
	WebElement e3=	d.findElement(By.className("Ml  "));
	
	
	e3.click();

	}

}
