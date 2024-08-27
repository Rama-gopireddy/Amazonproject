package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copy_paste {

	public static void main(String[] args) {
		
		
		
	ChromeDriver d=new ChromeDriver();
		
		d.get("https://grotechminds.com/registration/");
		d.manage().window().maximize();
		
		WebElement e1=d.findElement(By.name("fname"));
		
		e1.sendKeys("rama");
		
		e1.sendKeys(Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		
		
		WebElement e2=d.findElement(By.name("lname"));
		
		e2.sendKeys(Keys.CONTROL+"v");
		
	}

}
