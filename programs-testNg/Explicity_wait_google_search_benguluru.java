package Selenium.TestNg.programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicity_wait_google_search_benguluru {
	


	@Test
	

	public void method1()
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1	=driver.findElement(By.name("q"));
		
		WebDriverWait w1=new WebDriverWait (driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.alertIsPresent());
		 w1.until(ExpectedConditions.titleContains("Goo"));
	     w1.until(ExpectedConditions.titleIs("Google"));
	
			e1.sendKeys("bangalore");
	
		
		
		
		
		
	}

}
