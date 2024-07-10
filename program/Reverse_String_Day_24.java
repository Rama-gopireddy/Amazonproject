package program;

import java.util.Arrays;

public class Reverse_String_Day_24 {

	public static void main(String[] args) {
	
	String input="mom"	;
	
	String output="";
	
	for(int i=input.length()-1;i>=0;i--)
	{
		
		char c1=input.charAt(i);
		
		output=output+c1;
		
		
		
	}
	
	System.out.println(output);
	
if(input.equals(output)) {

	System.out.println("This is Palindrome");
	
}
else
{
	
	System.out.println("This is not Palindrome");

}



}
		
		
		
		

	}


