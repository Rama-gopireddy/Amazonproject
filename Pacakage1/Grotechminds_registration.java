package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds_registration {

	public static void main(String[] args) {
		
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		
	WebElement fname=	driver.findElement(By.id("fname"));
	
	fname.sendKeys("Rama");
	
WebElement lname=	driver.findElement(By.id("lname"));
	
	lname.sendKeys("gopireddy");
	
	
WebElement email=	driver.findElement(By.name("email"));
	
	email.sendKeys("Rama1@gmail.com");
	
	
	
WebElement passcode=	driver.findElement(By.name("password"));
	
	passcode.sendKeys("12345");
	
	
	
WebElement male=	driver.findElement(By.id("male"));
	
	male.click();
WebElement female=	driver.findElement(By.id("Female"));
	
	female.click();
	
	WebElement e1=driver.findElement(By.id("Skills"));

	Select s1=new Select(e1);

	s1.selectByVisibleText("Technical Skills");

	//s1.selectByIndex(1);
	//s1.selectByValue("search-alias=furniture");

	WebElement e2=driver.findElement(By.name("Country"));

	Select s2=new Select(e2);
	
	
	s2.selectByVisibleText("India");

//	e2.sendKeys("minds"+Keys.ENTER);
	
	

	
	
	
	
	
	
WebElement presentaddress=	driver.findElement(By.name("Present-Address"));
	
presentaddress.sendKeys("khaksj rd");


WebElement parminentaddress=	driver.findElement(By.name("Permanent-Address"));
	
parminentaddress.sendKeys("beachroad");
	
	
WebElement pincode=	driver.findElement(By.id("Pincode"));
	
pincode.sendKeys("098765");
	
	
	WebElement relegion=driver.findElement(By.name("Relegion"));

	Select s4=new Select(relegion);
	
	
	s4.selectByVisibleText("Hindu");
	
	WebElement relocate=	driver.findElement(By.name("relocate"));
	
	relocate.click();
	
	WebElement submit=driver.findElement(By.name("Submit"));
	
	submit.click();

	}

}
