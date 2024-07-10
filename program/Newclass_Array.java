package program;

import java.util.Arrays;
import java.util.Scanner;

public class Newclass_Array {

	public static void main(String[] args) {
	
		
		
		//Create a array of index position 3 of int datatype but value shoud from scanner class
		
		
	/*	int rollno[]=new int[3];
		
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			
			rollno[i]=s1.nextInt();
			
		}
		
		
		
		
		
		System.out.println(rollno[0]);

		System.out.println(rollno[1]);

		System.out.println(rollno[2]);
		
		System.out.println(Arrays.toString(rollno));*/
		//Assignment -double datatype
		
		
		
/*double decimal[]=new double[3];
		
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			
			decimal[i]=s1.nextDouble();
			
		}
		//System.out.println(decimal[0]);

		//System.out.println(decimal[1]);

		
		//System.out.println(decimal[2]);
		
		System.out.println(Arrays.toString(decimal));*/
		
		//boolean datatype
		// Note: Using boolean
		
/*boolean letter[]=new boolean[3];
		
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			
			letter[i]=s1.nextBoolean();
			
		}
		//System.out.println(letter[0]);

		//System.out.println(letter[1]);

		
		//System.out.println(letter[2]);
		
		System.out.println(Arrays.toString(letter));*/
		
int number[]=new int[3];
		
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.print("enter the value of index->"+1);
			number[i]=s1.nextInt();
			
		}
		System.out.println(Arrays.toString(number));

}}
