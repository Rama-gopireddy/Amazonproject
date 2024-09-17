package Parlelltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Testng_Amazon_package.Launch_quit;

public class Testcase2 extends Launch_quit {
@Test
public void searching_amazon()
{
	ChromeDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement e1=driver.findElement(By.xpath("(//input)[5]"));

    e1.sendKeys("Shoes");
    e1.sendKeys(Keys.ENTER);

}}
