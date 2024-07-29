package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Array_program {

	public static void main(String[] args) {
		
/*int a []=new int[4];
		
		a[0]= 20;
		a[1]=30;
	System.out.println(Arrays.toString(a));*/
		
		Scanner s1=new Scanner(System.in);
		
		/*In a array of 4 size store four values in it from human input and consider those 4 values are the 4 length of the rectangle.
		Please a logic to find out the area for the same[write the program in eclipse and copy paste the program here]*/
		int a []=new int[4];

		
		for(int i=0;i<4;i++)
		{
		
			a[i]=s1.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(a);

	}

}
