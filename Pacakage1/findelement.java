package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {

	public static void main(String[] args) {
	/*	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
	//	driver.findElement(By.name("btnK")).click(); //not working
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);*/
		
		
		//login to facebook
		
		
	ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.name("email")).sendKeys("rama@gmail.com");
		
		driver1.findElement(By.name("pass")).sendKeys("rama");
		
		driver1.findElement(By.name("login")).sendKeys(Keys.ENTER);
		 
		// driver1.findElement(By.name("login")).click();

	}

}
