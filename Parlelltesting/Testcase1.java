package Parlelltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 extends launchquit{
	
	@Test
	public void login_amazon()
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.manage().window().maximize();


		
		WebElement e3=	driver.findElement(By.id("nav-link-accountList"));
		
		e3.click();
		
		
	    WebElement email=	driver.findElement(By.name("email"));
	 
	    email.sendKeys("ramagopireddy1@gmail.com");
	 
	    WebElement con=driver.findElement(By.id("continue"));
		
		con.click();

	    WebElement password=	driver.findElement(By.id("ap_password"));
	    password.sendKeys("Bhavik143#");
		
	}

}
