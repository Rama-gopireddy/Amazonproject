package program;

import java.util.Arrays;

public class countnumbers {

	public static void main(String[] args) {
	int countnum=0;
		
		String input="50cent";
		
		char c1[]=input.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<input.length();i++)
		{
			boolean b1=	Character.isDigit(c1[i]);
			
			//System.out.println(b1);
			
			
			if(b1==true)
			{
				
				countnum++;
			}
				}
		
		System.out.println(countnum);

	}

}
