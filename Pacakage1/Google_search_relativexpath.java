package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search_relativexpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	WebElement e1=	driver.findElement(By.xpath("(//input)[5]"));
	
	
	e1.sendKeys("shoes");//+Keys.ENTER);
		
		
e1.sendKeys(Keys.ARROW_DOWN);

Thread.sleep(2000);

e1.sendKeys(Keys.ARROW_DOWN);

e1.sendKeys(Keys.ARROW_DOWN);

e1.sendKeys(Keys.ENTER);
	}

}
