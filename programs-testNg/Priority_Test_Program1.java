package Selenium.TestNg.programs;

import org.testng.annotations.Test;

public class Priority_Test_Program1 {
	
	

	@Test(priority=1)
	
	public void searchmethod()
	{
		System.out.println("search");
		
	}
	
@Test(priority=-1)
	
	public void launch()
	{
		System.out.println("search1");
		
	}
	
@Test(priority=-2)

public void quit()
{
	System.out.println("search2");
	
}
	}
	
	
	


