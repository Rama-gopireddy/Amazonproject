package Assignments;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);


	String name []=new String[2];
	name[0]="rama";
	name[1]="devi";
	System.out.println("enter the value 2 number");
	try
	{
		
	int age=  s1.nextInt();
	
	System.out.println("Exception handling");
	}
	catch(InputMismatchException a)
	
	{
		System.out.println("Exception handeld");
	}
	
	//System.out.println("enter the value 2 number");
/*	try
{
int name1=s1.nextInt();
System.out.println("print try value");

}

catch(InputMismatchException a)
{
	
	System.out.println("print catch value");
}*/
	
	
	
	}

}
