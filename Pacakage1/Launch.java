package Pacakage1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		//driver.close();
		
	
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getWindowHandles());
		
		System.out.println(driver.getTitle());
		
		EdgeDriver e1=new EdgeDriver();
		
		e1.get("https://www.facebook.com");
		
//		driver.quit();
		
		//ctrl+shift0 for import(shortcut)
		
		
		
		
		
		
	}
	
	
	

}
