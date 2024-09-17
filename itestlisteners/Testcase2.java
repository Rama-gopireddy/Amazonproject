package itestlisteners;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(itestlisteners.Listners_class.class)
public class Testcase2  extends Listners_class{
	
	
	

	 @Test
	 public void google()
	 
	 {
		// driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			WebElement e1 = driver.findElement(By.name("q"));
			e1.sendKeys("bangalore");

			
			List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='wM6W7d']"));

			int count = e2.size();

			System.out.println(count);

			e2.get(3).click();
		 
		  }
	
	

}
