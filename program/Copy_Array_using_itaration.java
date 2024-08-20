package program;

import java.util.Arrays;

public class Copy_Array_using_itaration {

	

	public static void main(String[] args) {
		
		/*	int input[]=new int[3];
		
		
		input[0]=80;
		input[1]=70;
		input[2]=60;
		
		
		int output[]=new int[3];
	
		
		
		for(int i=0;i<=2;i++)
		
		{
			output[i]=input[i];
		}
System.out.println(Arrays.toString(input));


		
System.out.println(Arrays.toString(output));*/

		// reverse using with array
		
int input[]=new int[3];


input[0]=80;
input[1]=70;
input[2]=60;


int output[]=new int[3];
int j=0;

System.out.println(Arrays.toString(input));
for(int i=input.length-1;i>=0;i--)

{
	output[j]=input[i];
	j++;
	
	
}
		
System.out.println(Arrays.toString(output));
		
	
		
	}

}
