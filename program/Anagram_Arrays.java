package program;

import java.util.Arrays;

public class Anagram_Arrays {

	public static void main(String[] args) {
	
		String s1="angle";
		String s2="angel";
	char[]c1=	s1.toCharArray();
	char[]c2=	s1.toCharArray();	
		
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		
	System.out.println(Arrays.toString(c1));
	
	Arrays.sort(c2);
	
	System.out.println(Arrays.toString(c2));
	
	
	boolean b1=(Arrays.equals(c1,c2));
	if(b1==true)
	{System.out.println("they are angram");
		}
	
	else
	{
		System.out.println("they are not angram");
		
	}
	
	}

}
