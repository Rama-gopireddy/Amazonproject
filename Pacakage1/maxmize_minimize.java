package Pacakage1;

import org.openqa.selenium.chrome.ChromeDriver;

public class maxmize_minimize {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver c=new ChromeDriver();
		
		c.get("https://google.com");
		c.manage().window().maximize();
		Thread.sleep(2000);
		c.manage().window().minimize();
		
		
		
	}

}
