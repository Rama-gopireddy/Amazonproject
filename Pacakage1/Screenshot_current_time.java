package Pacakage1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_current_time {

	public static void main(String[] args) throws IOException {ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	
	Date d1=new Date();
	System.out.println(d1.getTime());//epoch time
	

	Date d2=new Date(d1.getTime());
	System.out.println("current time--->"+d2);
	
	
	TakesScreenshot t1=   driver;
	
	File f1=t1.getScreenshotAs(OutputType.FILE);
	
	
	File f2=new File("C:\\Users\\ramag\\Desktop\\java projects\\Seleniumbasics\\src\\Screenshots\\rama"+"current time--->"+d2+".png");
	
	FileHandler.copy(f1, f2);

	


	}

}
