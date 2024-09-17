package Selenium.TestNg.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class paralletesting {
	WebDriver driver;
	@Parameters("browser")
	@Test
	
	public void search(String nameofbrowser)
	
	{
		
		
		if(nameofbrowser.equals("Chrome"))
		{
			 driver =new ChromeDriver();
		}
		
		if(nameofbrowser.equals("Edge"))
		{
			 driver =new EdgeDriver();
		}
		
		
		
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		
		
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		e1.sendKeys("shoe");
		e1.sendKeys(Keys.ENTER);}

}
