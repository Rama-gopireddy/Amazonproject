package Selenium.TestNg.programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_after_excution {
	
	@BeforeMethod
	
		
		public void browse_launch()
		
		
		{
		System.out.println("Browserlaunch");
		}
	
	@Test
	
	public void Search_launch()
	
	{
		System.out.println("searchproduct");
	}
	
	@AfterMethod
	
	public void Brower_quit()
	
	{
		System.out.println("QuitBrowserlaunch");
	}
	
	

}
