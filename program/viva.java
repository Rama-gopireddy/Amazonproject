package program;

import java.util.Scanner;

public class viva {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		String input="";
		
		System.out.println("enter name");
		
		String a= s.next();
		
		String output="";
		
		
		for(int i=input.length()-1;i>=0;i--)
			
		{
			
		char c	=input.charAt(i);
		
		output=output+c;
			
			
			
		}
			
			System.out.println(output);
		
		
		
		

	}

}
