package Selenium.TestNg.programs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_Youtube_5inputs_implicitywait {
	
	/*@DataProvider(name="names")
	public Object[][]amazon()
	{
	return new Object[][] {{"songs"},{"vlogs"},{"movie"},{"testing"},{"craft"}};
		
		
	}*/
	@Test//(dataProvider="names")
	public void testcase1()
	{
ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.youtube.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();	
		
	WebElement e1=	d.findElement(By.name("search_query"));
	e1.sendKeys("GroTechMinds");
	e1.sendKeys(Keys.ENTER);
	}

}
