package Pacakage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Google_banglore_autosuggtion {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("bangalore");

		Thread.sleep(5000);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		int count = e2.size();

		System.out.println(count);

		e2.get(5).click();

	}

}
