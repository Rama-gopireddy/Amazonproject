package Pacakage1;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class backward_program {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.google.com");
		
		d.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		
		d.navigate().back();
		
		
		
		Thread.sleep(5000);
		
		d.navigate().forward();
		
		Thread.sleep(5000);
		
		d.navigate().refresh();
		
		
		
		

	}

}
