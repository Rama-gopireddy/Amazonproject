package Selenium.TestNg.programs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeMethod_beforesuit_1test {
	@BeforeMethod
	public void ts()
	
	{
		System.out.println("3");
		
	}
	
	
	@BeforeSuite
	public void method()
	
	{
		System.out.println("4");
		
	}
	@Test
	public void login()
	
	{
		System.out.println("5");
		
	}

}
