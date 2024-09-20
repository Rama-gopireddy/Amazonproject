package selenium1.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_register_new_user {
	
	
WebDriver driver;
	
	@FindBy(id="ap_customer_name")
	WebElement un;
	
	
	@FindBy(id="ap_phone_number")
	WebElement mobilenum;
	
	@FindBy(id="ap_password" )
	WebElement pass;
	
	@FindBy(id="continue" )
	WebElement verifynum;
	
	
	
	public void un()
	{
		un.sendKeys("devi");
		
	}
	
	public void mobilenumber()
	{
		mobilenum.sendKeys("8008563758");
		
	}
		
	public void password()
	{
		pass.sendKeys("ytrytre");
		
	}
	public void verifymobile()
	{
		 verifynum.click();;
		
	}
		
	
	
	
	
	public Amazon_register_new_user(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}


}