package program;

import java.util.Scanner;

public class Assignment_Try_Catchwith_Scanner {

	public static void main(String[] args) {
		
		int a1=4;
		Scanner s1=new Scanner(System.in);
		try {
		 int number= s1.nextInt();
		 
		 System.out.println("Print Value");
		
		}
		
		catch("InputMismatchExceptionnumber")
		{
			
			System.out.println("Print Catch");
			
		}
		
	
		
		
		
		

	}

}
