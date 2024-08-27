package Pacakage1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Selenium_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream f1=new FileInputStream ("C:\\Users\\ramag\\Desktop\\java projects\\Seleniumbasics\\Rama'saumationexcel\\Rama.xlsx");
		
Workbook w1	=	WorkbookFactory.create(f1);
		
		
		w1.getSheet("Login").getRow(1).getCell(0);
	
	

	}

}
