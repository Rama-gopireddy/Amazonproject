package Selenium.TestNg.programs;

import org.testng.annotations.Test;

public class Group_program {
	
	@Test(groups= {"smoke","system"})
	public void testcase1()
	{
		System.out.println("testcase1");
	}
	@Test(groups= {"smoke"})
	public void testcase2()
	{
		System.out.println();
	}
	@Test(groups= {"smoke"})
	public void testcase3()
	{
		System.out.println("testcase3");
	}
	@Test(groups= {"smoke"})
	public void testcase4()
	{
		System.out.println("testcase4");
	}
	@Test(groups= {"smoke","sanity"})
	public void testcase5()
	{
		System.out.println("testcase5");
	}

}
