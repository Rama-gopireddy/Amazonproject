package itestlisteners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(itestlisteners.Listners_class.class)
public class Testcase1 extends Listners_class {
	
	    @Test
	    public void logintotoamazon()
	   {
		//driver=new ChromeDriver ();
		driver.get("https://www.amazon.in/");
	    System.out.println(driver.getTitle());	
		
		driver.manage().window().maximize();
		
	    WebElement account=	driver.findElement(By.id("nav-link-accountList"));
	    
	   /* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	    Actions a1=new Actions(c);
        	a1.moveToElement(account).perform();
        	WebElement e1=c.findElement(By.className("nav-action-inner"));*/
		 account.click();
		 WebElement email=	driver.findElement(By.name("email"));
		 
		 email.sendKeys("ramagopireddy1@gmail.com");
		 
		 WebElement con=	driver.findElement(By.id("continue"));
			
			con.click();

		 WebElement password=	driver.findElement(By.id("ap_password"));
	                                                                                         	password.sendKeys("Bhavik143#");

		 WebElement signinbutton=	driver.findElement(By.id("signInSubmit"));
		 signinbutton.click();
		 
		 //Assert.assertTrue(false);
		 }
		 
		
		 
		
	}
	
	
	
	
	

