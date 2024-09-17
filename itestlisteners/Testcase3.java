package itestlisteners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(itestlisteners.Listners_class.class)

public class Testcase3  extends Listners_class
{
	
	

	
	@Test
	public void youtubesearch  ()
	
	{
		
	// driver=new ChromeDriver();
			
			driver.get("https://www.youtube.com/");
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();	
			
		WebElement e1=	driver.findElement(By.name("search_query"));
		e1.sendKeys("GroTechMinds");
		e1.sendKeys(Keys.ENTER);
		
		
	}
	 

}
