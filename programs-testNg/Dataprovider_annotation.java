package Selenium.TestNg.programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_annotation {

	@DataProvider(name="data1")
	
	public Object[][] method1()
	{	return new Object[][]{{10},{11},{20}};
	
	
	}
	@Test(dataProvider="data1")
	public void testcase1(int value)
	{
		int sum=value+100;
		System.out.println(sum);
		
	}
}
