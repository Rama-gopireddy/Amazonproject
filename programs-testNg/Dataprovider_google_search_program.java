package Selenium.TestNg.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_google_search_program {
	
@DataProvider(name="names")
	
	public Object[][] method1()
	{	return new Object[][]{{"Rama"},{"seetha"},{"lakshmana"}};
	
	
	}
	@Test(dataProvider="names")
	public void testcase1(String value)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	WebElement e1	=driver.findElement(By.name("q"));
			e1.sendKeys(value);
			e1.sendKeys(Keys.ENTER);
		
	}

}
