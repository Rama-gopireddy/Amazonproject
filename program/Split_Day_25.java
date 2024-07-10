package program;

import java.util.Arrays;

public class Split_Day_25 {

	public static void main(String[] args) {
		String intro="My name is Rama";
		
		String[]a1=intro.split(" ");//Split methos of 1 para
		
		System.out.println(Arrays.toString(a1));
		
		
		
		
		String[]a2=intro.split("s  ");//Split method with 2 para
		
		System.out.println(Arrays.toString(a2));
		

	}

}
