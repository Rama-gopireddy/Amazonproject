package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search_xpath {

	public static void main(String[] args) {
		
		
		
		
		ChromeDriver d=new ChromeDriver();
			
			d.get("https://amazon.in");
			d.manage().window().maximize();
			
			
			
			WebElement e1=d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			
			e1.sendKeys("shoe");
			e1.sendKeys(Keys.ENTER);
			
			//*[@id="twotabsearchtextbox"]

	}

}
