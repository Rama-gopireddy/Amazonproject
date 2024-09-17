package Selenium.TestNg.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseret_program {
@Test
public void amazon(){
	ChromeDriver d=new ChromeDriver();
	
	d.get("https://amazon.in");
	d.manage().window().maximize();
	
	
	
	WebElement e1=d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	e1.sendKeys("shoe");
	e1.sendKeys(Keys.ENTER);
	Assert.assertTrue(true);
	//Assert.assertFalse(true);
	//Assert.assertFalse(false);
	//Assert.assertTrue(false);
}}
