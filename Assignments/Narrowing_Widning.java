package Assignments;

public class Narrowing_Widning {

	public static void main(String[] args) {
		
		//byte,sort,int,long,float,double
		//smaller to bigger-widning
		//bigger to smaller -narrowing
		// Converting  int into double- (widning)
		int a=10;
		
		
		double d1=a;
		System.out.println(d1);
		
		// converting double into  int
		
		double d=1.345678;
		
		
		int i2=(int) d;
		
		// Converting byte into int.
		
		byte b=127;
		
		int i= (int)b;
		System.out.println(i);
		
		
		// Convert int into byte.
		
		int c=1234567898;
		
	byte b1	=(byte)c;
		
	System.out.println(b1);
	
	
	//Convert double into float-narrowing
	
	double d2=54.87654328765432198;
	float f=(float)d2;
	System.out.println(f);
	

	}

}
