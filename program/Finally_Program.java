package program;

import java.util.InputMismatchException;

public class Finally_Program {

	public static void main(String[] args) {
		
	try {	
	int a=1/1;
	
	System.out.println(a);
	}
	catch(ArithmeticException a1)
	
	{
		System.out.println("Exception handled in catch block1");
	}
catch(InputMismatchException a1)
	
	{
		System.out.println("Exception handled in catch block2");
	}
	finally 
	{
		System.out.println("Finally always will be there");
	}
	}

}
