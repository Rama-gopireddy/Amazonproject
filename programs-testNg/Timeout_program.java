package Selenium.TestNg.programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout_program {
	
@Test(timeOut=90000)
	
	public void launch() throws InterruptedException
	{
	ChromeDriver d=new ChromeDriver();

	d.get("https://www.google.com");
	
	d.manage().window().maximize();
	
	
	Thread.sleep(1000);
	
	
	d.navigate().back();
	
	
	
	Thread.sleep(1000);
	
	d.navigate().forward();
	
	Thread.sleep(1000);
	
	d.navigate().refresh();
	
	
		
	}

}
