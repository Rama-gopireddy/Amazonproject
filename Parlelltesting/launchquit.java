package Parlelltesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class launchquit {
	

ChromeDriver c;
	@BeforeMethod
	public void launch()
	{
		 c=new ChromeDriver ();
		c.get("https://www.amazon.in/");
		
		c.manage().window().maximize();
		
	}

	@AfterMethod
	public void quit()
	{
		c.quit();
	}

}
