package Selenium.TestNg.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_methods_program {
	
	@Test
	
	public void equals()
	{
		//boolean
	Assert.assertEquals(true, false);
	Assert.assertEquals(false, false,"sorry check the testcase");
//int
	Assert.assertEquals(100, 100);
	Assert.assertEquals(200, 100,"sorry check the testcase");
//short
	Assert.assertEquals(50, 50);
	Assert.assertEquals(50, 100,"sorry check the testcase");

	Assert.assertEquals(true, false);
	Assert.assertEquals(false, false,"sorry check the testcase");
//long
	Assert.assertEquals(12345, 12345);
	Assert.assertEquals(12345567, 654321789,"sorry check the testcase");
//double
	Assert.assertEquals(1.987654, 1.987654);
	Assert.assertEquals(1.987654, 1.8887654,"sorry check the testcase");
//float
	Assert.assertEquals(6.987, 6.987);
	Assert.assertEquals(6.987,7.876,"sorry check the testcase");
//String
	Assert.assertEquals("Rama", "Rama");
	Assert.assertEquals("Rama", "Rama","sorry check the testcase");
	
	//same methods for not equals
	}
@Test
	
	public void notequals()
	{
		//boolean
	Assert.assertNotEquals(true, false);
	Assert.assertNotEquals(false, false,"sorry check the testcase");
//int
	Assert.assertNotEquals(100, 100);
	Assert.assertNotEquals(200, 100,"sorry check the testcase");
//short
	Assert.assertEquals(50, 50);
	Assert.assertEquals(50, 100,"sorry check the testcase");

	Assert.assertNotEquals(true, false);
	Assert.assertNotEquals(false, false,"sorry check the testcase");
//long
	Assert.assertNotEquals(12345, 12345);
	Assert.assertNotEquals(12345567, 654321789,"sorry check the testcase");
//double
	Assert.assertNotEquals(1.987654, 1.987654);
	Assert.assertNotEquals(1.987654, 1.8887654,"sorry check the testcase");
//float
	Assert.assertNotEquals(6.987, 6.987);
	Assert.assertNotEquals(6.987,7.876,"sorry check the testcase");
//String
	Assert.assertNotEquals("Rama", "Rama");
	Assert.assertNotEquals("Rama", "Rama","sorry check the testcase");
	
	}
	
	
}
