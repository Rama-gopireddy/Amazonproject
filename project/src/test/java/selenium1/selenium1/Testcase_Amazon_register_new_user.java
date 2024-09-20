package selenium1.selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Testcase_Amazon_register_new_user {
	
	@Test
	public void registration()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Amazon_register_new_user rg=new Amazon_register_new_user(driver);
		 rg.un();
		 rg.mobilenumber();
		 rg.password();
		 rg.verifymobile();
		 
		 System.out.println(driver.getTitle());
		 
		Assert.assertEquals(driver.getTitle(), "Authentication required");
			
		 
		

}}
