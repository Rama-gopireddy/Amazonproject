package Pacakage1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser.GetWindowForTargetResponse;
import org.openqa.selenium.io.FileHandler;

public class getWindow_handle {

	public static void main(String[] args) throws IOException {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		TakesScreenshot t1=   driver;
		
		File source=t1.getScreenshotAs(OutputType.FILE);
		
		String currenttime;
		File destination=new File("C:\\Users\\ramag\\Desktop\\java projects\\Seleniumbasics\\src\\Screenshots\\rama" + new getWindow_handle().getClass()+".png");
		
	
		FileHandler.copy(source, destination);

	}

}
