package Selenium.TestNg.programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_trihealth_Integration_assertEquls {
	
	@Test
	public void booking() throws InterruptedException
	{
	ChromeDriver c=new ChromeDriver ();
	c.get("https://www.trihealth.com");
    c.manage().window().maximize();
    System.out.println(c.getTitle());
    
    
    
    WebElement finddoctor=c.findElement(By.xpath("(//span)[8]"));
	finddoctor.click();
  // Assert.assertEquals(c.getTitle(), "TriHealth | Be Seen. Be Heard. Be Healed.℠");
	
	
	
 
    
    WebElement e1=c.findElement(By.xpath("(//input)[4]"));
e1.sendKeys("Kira A. Zimmerly");
e1.sendKeys(Keys.ENTER);
    

    WebElement e2=c.findElement(By.id("location_display"));
    e2.sendKeys("45040");
    e2.sendKeys(Keys.ENTER);
   
    // Thread.sleep(5000);
  //search
  
    
   
    		
    		WebDriverWait w1=new WebDriverWait (c,Duration.ofSeconds(20));
	w1.until(ExpectedConditions.alertIsPresent());
	 w1.until(ExpectedConditions.titleContains("Tri"));
     w1.until(ExpectedConditions.titleIs("TriHealth | Be Seen. Be Heard. Be Healed.℠"));

    /*WebElement search=c.findElement(By.xpath("(//span)[7]"));

    search.click();*/
    
 
   
    
  WebElement bookappointment= c.findElement(By.xpath("//div[@class='text--md lg:font-light']"));
  bookappointment.click();
  Assert.assertEquals(bookappointment.isEnabled() ,true, "sorry it is not enabled");
  
  
	}}
	
	
	
