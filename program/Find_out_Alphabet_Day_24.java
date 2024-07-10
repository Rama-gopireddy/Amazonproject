package program;

import java.util.Arrays;

public class Find_out_Alphabet_Day_24 {

	public static void main(String[] args) {
		
		int count_of_alpha=0;
		
		String input="50cent";
		
		char c1[]=input.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<input.length();i++)
		{
			boolean b1=	Character.isAlphabetic(c1[i]);
			
			//System.out.println(b1);
			
			
			if(b1==true)
			{
				
				count_of_alpha++;
			}
				}
		
		System.out.println(count_of_alpha);
	
	}

}
