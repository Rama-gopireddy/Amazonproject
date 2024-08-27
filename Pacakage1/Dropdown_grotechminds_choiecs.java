package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_grotechminds_choiecs {

	public static void main(String[] args) {
		
		
	ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://grotechminds.com/dropdown/");
		
		driver.manage().window().maximize();

WebElement e1=driver.findElement(By.name("Choice1"));

Select s1=new Select(e1);

s1.selectByVisibleText("Demo1");
WebElement e2=driver.findElement(By.name("Choice2"));

Select s2=new Select(e2);

//s2.selectByVisibleText("Pratice1");
s2.selectByValue("practice15");
WebElement e3=driver.findElement(By.name("Choice6"));

Select s3=new Select(e3);

s3.selectByVisibleText("Night10");
WebElement e4=driver.findElement(By.name("Choice4"));

Select s4=new Select(e4);

s4.selectByVisibleText("Enargy15");
WebElement e5=driver.findElement(By.name("Choice5"));

Select s5=new Select(e5);

s5.selectByVisibleText("Day1");
WebElement e6=driver.findElement(By.name("Choice7"));

Select s6=new Select(e6);

s6.selectByVisibleText("Night10");
WebElement e7=driver.findElement(By.name("Choice7"));

Select s7=new Select(e7);

s7.selectByVisibleText("Night1");

WebElement e8=driver.findElement(By.name("Choice8"));

Select s8=new Select(e8);

s8.selectByVisibleText("Selenium1");



//s1.selectByIndex(1);
//s1.selectByValue("search-alias=furniture");


		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
