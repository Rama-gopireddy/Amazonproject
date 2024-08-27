package Pacakage1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screeshot_math_random {

	public static void main(String[] args) throws IOException {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		TakesScreenshot t1=   driver;
		
		File f1=t1.getScreenshotAs(OutputType.FILE);
		
		File f2=new File("C:\\Users\\ramag\\Desktop\\java projects\\Seleniumbasics\\src\\Screenshots\\rama"+Math.random()+".png");
		
		FileHandler.copy(f1, f2);
		

	}

}
