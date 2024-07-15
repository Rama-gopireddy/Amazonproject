package Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tryandcatch_Nestedufelse {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		try {
			
			System.out.println("Enter your mobile number");
		long mobilenumber= s.nextLong();
		System.out.println(" mobile number 123456");
		}
		catch(InputMismatchException a1)
		
		{
			System.out.println("Enter numaric value");
			Scanner s1=new Scanner(System.in);
			
			try {
				
				System.out.println("Enter your mobile number");
				long phonenumber= s1.nextLong();
				
				System.out.println("moblinuber 5678910");
				
			}
			catch( InputMismatchException a2)
			{
				System.out.println("Enter numaric value");
				Scanner s2=new Scanner(System.in);

				System.out.println("Enter mobile number");
long phonenumber= s2.nextLong();
				
				System.out.println("moblinuber 987654321");
				}
			
			
		}
		

	}

}
