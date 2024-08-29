package Selenium.TestNg.programs;

import org.testng.annotations.Test;

public class Disable_test {
	
	@Test
	public void login()
	
	{
		System.out.println("login");
		
	}

	@Test(enabled=false)
	public void logout()
	
	{
		System.out.println("logout");
		
	}

	
	
	
	

}
