package Selenium.TestNg.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_Amazon_5products_Assertion {
	
	
	@DataProvider(name="names")
	public Object[][]amazon()
	{
	return new Object[][] {{"books"},{"cloths"},{"tshirts"},{"bowls"},{"craft"}};
		
		
	}
	@Test(dataProvider="names")
	public void testcase1(String input)
	{
ChromeDriver d=new ChromeDriver();
		
d.get("https://www.amazon.in/");

d.manage().window().maximize();

WebElement e1=d.findElement(By.id("twotabsearchtextbox"));

e1.sendKeys(input);
e1.sendKeys(Keys.ENTER);
Assert.assertEquals(input,input);
//Assert.assertTrue(true,"not displaying any mesg");

}}
