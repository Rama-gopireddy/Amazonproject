package Pacakage1;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DDT_class2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f1=new FileInputStream ("C:\\Users\\ramag\\Desktop\\java projects\\Seleniumbasics\\Rama'saumationexcel\\Rama.xlsx");
		
Workbook w1	=	WorkbookFactory.create(f1);
		
		
	
String username=w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
//String password=	NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(1).getNumericCellValue());
String password=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();



System.out.println(username);
System.out.println(password);


ChromeDriver c=new ChromeDriver ();
c.get("https://www.amazon.in");
WebElement e1=c.findElement(By.id("email"));

e1.sendKeys(username);

WebElement con=	c.findElement(By.id("continue-announce"));
	
	con.click();

WebElement password1=	c.findElement(By.name(password));
password1.sendKeys("rama");

WebElement signinbutton=	c.findElement(By.id("signInSubmit"));
signinbutton.click();




	}

}
