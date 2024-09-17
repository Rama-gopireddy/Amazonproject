package Pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganddropTestquestion {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver cd=new ChromeDriver();
		
		cd.get("https://grotechminds.com/drag-and-drop/");
		
		cd.manage().window().maximize();
		
		WebElement e1=cd.findElement(By.id("container-6"));
		WebElement e2=cd.findElement(By.id("div2"));
		
		Actions a1= new Actions(cd);
		Thread.sleep(5000);
		
		a1.dragAndDrop( e1, e2).perform();

	}

}
