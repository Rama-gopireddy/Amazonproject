package program;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("press 1 for launching chrome");
		
		System.out.println("press 2 for launching edge");
		
		System.out.println("press 3 for launching firefox");
Scanner s1=new Scanner(System.in);
		
		int value =s1.nextInt();
	
		switch(value)
		{
		case 1:
		
		
		System.out.println("Chrome browser");
		break;
		
		
	case 2:
		
		System.out.println("Edge browser");
		break;
		
	case 3:
		
		System.out.println("Firefox browser");
		
		default :
			
			System.out.println("sorry your selection is wrong");
		
		
		}
		
		
		
		

	}

}
