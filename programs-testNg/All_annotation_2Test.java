package Selenium.TestNg.programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_annotation_2Test {
	
	@BeforeSuite
	public void suit()
	
	{
		System.out.println("1");
		
	}
	
	@BeforeClass
	public void cs()
	
	{
		System.out.println("2");
		
	}
	@BeforeTest
	public void ts()
	
	{
		System.out.println("3");
		
	}
	
	
	@BeforeMethod
	public void method()
	
	{
		System.out.println("4");
		
	}
	@Test
	public void login()
	
	{
		System.out.println("5");
		
	}
	@AfterSuite
	public void su()
	
	{
		System.out.println("6");
		
	}
	
	@AfterClass
	public void cs1()
	
	{
		System.out.println("1");
		
	}
	@AfterTest
	public void ts1()
	
	{
		System.out.println("7");
		
	}
	
	
	@AfterMethod
	public void method1()
	
	{
		System.out.println("8");
		
	}
	
	@Test
	public void login1()
	
	{
		System.out.println("9");
		
	}

}
