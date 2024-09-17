package Pacakage1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_selenium_method1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
		FileInputStream f1=new FileInputStream("C:\\Users\\ramag\\Desktop\\java projects\\Seleniumbasics\\Rama'saumationexcel\\Rama.xlsx");
	    Workbook w1=	WorkbookFactory.create(f1);
	    Sheet s1=   w1.getSheet("Login");
	    Row r1  = s1.getRow(1);
	    Cell c1      =r1.getCell(0);
	    String username      = c1.getStringCellValue();
	          
	          System.out.println(username);
	
	
		//password
	          
	          Sheet s2=   w1.getSheet("Login");
	  	       Row r2  = s2.getRow(1);
	  	       Cell c2      =r2.getCell(1);
	  	       String password      = c2.getStringCellValue();
	  	          
	  	          System.out.println(password);
	  	          
	  	       
	}

}
