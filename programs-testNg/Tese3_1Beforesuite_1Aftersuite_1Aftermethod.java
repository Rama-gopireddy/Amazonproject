package Selenium.TestNg.programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tese3_1Beforesuite_1Aftersuite_1Aftermethod {

@BeforeSuite
	
	
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

@Test

public void add_cart()

{
	System.out.println("addproduct");
}
	
@Test

public void add_product()

{
	System.out.println("addproduct2");
}	

@AfterSuite

public void checkout()

{
	System.out.println("Checkout");
}
	
	
}
