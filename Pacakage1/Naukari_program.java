package Pacakage1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_program {

	public static void main(String[] args) throws InterruptedException {
		//https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI_rfz_tmIiAMV46hmAh1dXDrTEAAYASAAEgKlj_D_BwE&gclsrc=aw.ds

		
	ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI_rfz_tmIiAMV46hmAh1dXDrTEAAYASAAEgKlj_D_BwE&gclsrc=aw.ds");
		d.manage().window().maximize();
		
		WebElement w1=d.findElement(By.className("google-text"));
		
		
	
		
				
			w1.click();
		
		Set<String> s1=	d.getWindowHandles();
			
		Iterator<String> i1	=s1.iterator();
		
		
		String parentid=i1.next();//parent windowid
			
			
		String childid=i1.next();	//anychild
		
		
		
		System.out.println(parentid);
		System.out.println(childid);
		
		
		d.switchTo().window(childid);
		
		Thread.sleep(5000);
		
		d.switchTo().window(parentid);
		
		
	}

}
