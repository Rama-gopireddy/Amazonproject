package Selenium.TestNg.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Amazonregistration_6sets_Assertion {
	
	@Test(dataProvider="regitration_details")
	public void testcase1(String un,String mobilenum,String pwd) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		
		
	//Actions a1 = new Actions(driver);
		
		//a1.moveToElement(e1).perform();
		//Thread.sleep(4000);
		//e1.click();
		
		WebElement e1=driver.findElement(By.id("ap_customer_name"));
e1.sendKeys(un);
WebElement e2=driver.findElement(By.id("ap_phone_number"));
e2.sendKeys(mobilenum);
WebElement e3=driver.findElement(By.id("ap_password"));
e3.sendKeys(pwd);
		WebElement verifymobinum=driver.findElement(By.id("continue"));
		//verifymobinum.click();
		System.out.println(driver.getTitle());
		Assert.assertEquals(verifymobinum.isDisplayed() ,true, "sorry it is not matching");
		//Assert.assertEquals(verifymobinum.isEnabled(),true, "sorry it is not matching");
		//Assert.assertEquals(driver.getTitle(),"Authentication required","Failed to amazon rigistration");
		}
@DataProvider(name="regitration_details")
	public Object[][] method1()
	{
		Object [][] data=new Object[6][3];
		//set 1
		data[0][0]="rama";//username 1
		data[0][1]="1234567891";//mobile num1
		data[0][2]="jhdasjkda";//password 1
		//set 2
		data[1][0]="devi";//username 1
		data[1][1]="9876543213";//mobile num1
		data[1][2]="tuitigeor";//password 1
		//set 3
		data[2][0]="priya";//username 1
		data[2][1]="6544345678";//mobile num1
		data[2][2]="jfhksd";//password 1
		//set 4
		data[3][0]="ramya";//username 1
		data[3][1]="7654345678";//mobile num1
		data[3][2]="fhskjfhkd";//password 1
		//set 5
				data[4][0]="ritvik";//username 1
				data[4][1]="8765432156";//mobile num1
				data[4][2]="jfhsdjkf";//password 1
				//set 6
				data[5][0]="shilpi";//username 6
				data[5][1]="7654321876";//mobile num6
				data[5][2]="jhfjkffd";//password 6
		return data;
		

	
	
	

}}




