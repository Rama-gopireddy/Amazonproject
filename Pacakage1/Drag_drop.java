package Pacakage1;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver cd=new ChromeDriver();
		
		cd.get("https://grotechminds.com/drag-and-drop/");
		
		cd.manage().window().maximize();
		
	/*	WebElement e1=cd.findElement(By.id("container-6"));
		WebElement e2=cd.findElement(By.id("div2"));
		
		Actions a1= new Actions(cd);
		
		a1.dragAndDrop( e1, e2).perform();*/
		
		//1)drag and drop jason
		
		
		/*WebElement e3=cd.findElement(By.id("drag11"));
		WebElement e4=cd.findElement(By.id("div2"));
		
		Actions a2= new Actions(cd);
		
		a2.dragAndDrop( e3, e4).perform();*/
		
		
		//github and reverse
		

/*	WebElement e5=cd.findElement(By.id("drag5"));
		WebElement e6=cd.findElement(By.id("div2"));
		
		Actions a3= new Actions(cd);
		
		a3.dragAndDrop( e5, e6).perform();
		
		
		Thread.sleep(5000);
		
		
			
		WebElement e7=cd.findElement(By.id("div2"));
		WebElement e8=cd.findElement(By.id("container-4"));
		
		
		Actions a4= new Actions(cd);
		
		a4.dragAndDrop( e7, e8).perform();*/
		
		
		
		//Selenium drag and aDrop
		
		/*WebElement e9=cd.findElement(By.id("drag6"));
		WebElement e10=cd.findElement(By.id("div2"));
		
		
		Actions a5= new Actions(cd);
		
		a5.dragAndDrop( e9, e10).perform();*/
		
		
		//Cucumbar Drag and drop
		
		
		WebElement e11=cd.findElement(By.id("drag1"));
		WebElement e12=cd.findElement(By.id("div2"));
		
		
		Actions a6= new Actions(cd);
		
		a6.dragAndDrop( e11, e12).perform();

	}

}
